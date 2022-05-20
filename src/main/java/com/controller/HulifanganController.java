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

import com.entity.HulifanganEntity;
import com.entity.view.HulifanganView;

import com.service.HulifanganService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 护理方案
 * 后端接口
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
@RestController
@RequestMapping("/hulifangan")
public class HulifanganController {
    @Autowired
    private HulifanganService hulifanganService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HulifanganEntity hulifangan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			hulifangan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huli")) {
			hulifangan.setHulizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HulifanganEntity> ew = new EntityWrapper<HulifanganEntity>();
		PageUtils page = hulifanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hulifangan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HulifanganEntity hulifangan, 
		HttpServletRequest request){
        EntityWrapper<HulifanganEntity> ew = new EntityWrapper<HulifanganEntity>();
		PageUtils page = hulifanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hulifangan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HulifanganEntity hulifangan){
       	EntityWrapper<HulifanganEntity> ew = new EntityWrapper<HulifanganEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hulifangan, "hulifangan")); 
        return R.ok().put("data", hulifanganService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HulifanganEntity hulifangan){
        EntityWrapper< HulifanganEntity> ew = new EntityWrapper< HulifanganEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hulifangan, "hulifangan")); 
		HulifanganView hulifanganView =  hulifanganService.selectView(ew);
		return R.ok("查询护理方案成功").put("data", hulifanganView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HulifanganEntity hulifangan = hulifanganService.selectById(id);
        return R.ok().put("data", hulifangan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HulifanganEntity hulifangan = hulifanganService.selectById(id);
        return R.ok().put("data", hulifangan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HulifanganEntity hulifangan, HttpServletRequest request){
    	hulifangan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hulifangan);
        hulifanganService.insert(hulifangan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HulifanganEntity hulifangan, HttpServletRequest request){
    	hulifangan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hulifangan);
        hulifanganService.insert(hulifangan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HulifanganEntity hulifangan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hulifangan);
        hulifanganService.updateById(hulifangan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hulifanganService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HulifanganEntity> wrapper = new EntityWrapper<HulifanganEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huli")) {
			wrapper.eq("hulizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = hulifanganService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






}
