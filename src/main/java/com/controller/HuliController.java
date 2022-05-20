package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuliEntity;
import com.entity.view.HuliView;

import com.service.HuliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 护理
 * 后端接口
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
@RestController
@RequestMapping("/huli")
public class HuliController {
    @Autowired
    private HuliService huliService;

    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		HuliEntity user = huliService.selectOne(new EntityWrapper<HuliEntity>().eq("hulizhanghao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(user.getId(), username,"huli",  "护理" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody HuliEntity huli){
    	//ValidatorUtils.validateEntity(huli);
    	HuliEntity user = huliService.selectOne(new EntityWrapper<HuliEntity>().eq("hulizhanghao", huli.getHulizhanghao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		huli.setId(uId);
        huliService.insert(huli);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        HuliEntity user = huliService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	HuliEntity user = huliService.selectOne(new EntityWrapper<HuliEntity>().eq("hulizhanghao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
        user.setMima("123456");
        huliService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuliEntity huli,
		HttpServletRequest request){
        EntityWrapper<HuliEntity> ew = new EntityWrapper<HuliEntity>();
		PageUtils page = huliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huli), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuliEntity huli, 
		HttpServletRequest request){
        EntityWrapper<HuliEntity> ew = new EntityWrapper<HuliEntity>();
		PageUtils page = huliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huli), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuliEntity huli){
       	EntityWrapper<HuliEntity> ew = new EntityWrapper<HuliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huli, "huli")); 
        return R.ok().put("data", huliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuliEntity huli){
        EntityWrapper< HuliEntity> ew = new EntityWrapper< HuliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huli, "huli")); 
		HuliView huliView =  huliService.selectView(ew);
		return R.ok("查询护理成功").put("data", huliView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuliEntity huli = huliService.selectById(id);
        return R.ok().put("data", huli);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuliEntity huli = huliService.selectById(id);
        return R.ok().put("data", huli);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuliEntity huli, HttpServletRequest request){
    	huli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huli);
    	HuliEntity user = huliService.selectOne(new EntityWrapper<HuliEntity>().eq("hulizhanghao", huli.getHulizhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		huli.setId(new Date().getTime());
        huliService.insert(huli);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuliEntity huli, HttpServletRequest request){
    	huli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huli);
    	HuliEntity user = huliService.selectOne(new EntityWrapper<HuliEntity>().eq("hulizhanghao", huli.getHulizhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		huli.setId(new Date().getTime());
        huliService.insert(huli);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuliEntity huli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huli);
        huliService.updateById(huli);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huliService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HuliEntity> wrapper = new EntityWrapper<HuliEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = huliService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






}
