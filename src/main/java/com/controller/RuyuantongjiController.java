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

import com.entity.RuyuantongjiEntity;
import com.entity.view.RuyuantongjiView;

import com.service.RuyuantongjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 入院统计
 * 后端接口
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
@RestController
@RequestMapping("/ruyuantongji")
public class RuyuantongjiController {
    @Autowired
    private RuyuantongjiService ruyuantongjiService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RuyuantongjiEntity ruyuantongji,
                @RequestParam(required = false) Double ruyuanrenshustart,
                @RequestParam(required = false) Double ruyuanrenshuend,
		HttpServletRequest request){
        EntityWrapper<RuyuantongjiEntity> ew = new EntityWrapper<RuyuantongjiEntity>();
                if(ruyuanrenshustart!=null) ew.ge("ruyuanrenshu", ruyuanrenshustart);
                if(ruyuanrenshuend!=null) ew.le("ruyuanrenshu", ruyuanrenshuend);
		PageUtils page = ruyuantongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruyuantongji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RuyuantongjiEntity ruyuantongji, 
                @RequestParam(required = false) Double ruyuanrenshustart,
                @RequestParam(required = false) Double ruyuanrenshuend,
		HttpServletRequest request){
        EntityWrapper<RuyuantongjiEntity> ew = new EntityWrapper<RuyuantongjiEntity>();
                if(ruyuanrenshustart!=null) ew.ge("ruyuanrenshu", ruyuanrenshustart);
                if(ruyuanrenshuend!=null) ew.le("ruyuanrenshu", ruyuanrenshuend);
		PageUtils page = ruyuantongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruyuantongji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RuyuantongjiEntity ruyuantongji){
       	EntityWrapper<RuyuantongjiEntity> ew = new EntityWrapper<RuyuantongjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ruyuantongji, "ruyuantongji")); 
        return R.ok().put("data", ruyuantongjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RuyuantongjiEntity ruyuantongji){
        EntityWrapper< RuyuantongjiEntity> ew = new EntityWrapper< RuyuantongjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ruyuantongji, "ruyuantongji")); 
		RuyuantongjiView ruyuantongjiView =  ruyuantongjiService.selectView(ew);
		return R.ok("查询入院统计成功").put("data", ruyuantongjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RuyuantongjiEntity ruyuantongji = ruyuantongjiService.selectById(id);
        return R.ok().put("data", ruyuantongji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RuyuantongjiEntity ruyuantongji = ruyuantongjiService.selectById(id);
        return R.ok().put("data", ruyuantongji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RuyuantongjiEntity ruyuantongji, HttpServletRequest request){
    	ruyuantongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ruyuantongji);
        ruyuantongjiService.insert(ruyuantongji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RuyuantongjiEntity ruyuantongji, HttpServletRequest request){
    	ruyuantongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ruyuantongji);
        ruyuantongjiService.insert(ruyuantongji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RuyuantongjiEntity ruyuantongji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ruyuantongji);
        ruyuantongjiService.updateById(ruyuantongji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ruyuantongjiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<RuyuantongjiEntity> wrapper = new EntityWrapper<RuyuantongjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = ruyuantongjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






}
