package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TijiantongjiDao;
import com.entity.TijiantongjiEntity;
import com.service.TijiantongjiService;
import com.entity.vo.TijiantongjiVO;
import com.entity.view.TijiantongjiView;

@Service("tijiantongjiService")
public class TijiantongjiServiceImpl extends ServiceImpl<TijiantongjiDao, TijiantongjiEntity> implements TijiantongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijiantongjiEntity> page = this.selectPage(
                new Query<TijiantongjiEntity>(params).getPage(),
                new EntityWrapper<TijiantongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijiantongjiEntity> wrapper) {
		  Page<TijiantongjiView> page =new Query<TijiantongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TijiantongjiVO> selectListVO(Wrapper<TijiantongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijiantongjiVO selectVO(Wrapper<TijiantongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijiantongjiView> selectListView(Wrapper<TijiantongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijiantongjiView selectView(Wrapper<TijiantongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
