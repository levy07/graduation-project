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


import com.dao.LiliaoxinxiDao;
import com.entity.LiliaoxinxiEntity;
import com.service.LiliaoxinxiService;
import com.entity.vo.LiliaoxinxiVO;
import com.entity.view.LiliaoxinxiView;

@Service("liliaoxinxiService")
public class LiliaoxinxiServiceImpl extends ServiceImpl<LiliaoxinxiDao, LiliaoxinxiEntity> implements LiliaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiliaoxinxiEntity> page = this.selectPage(
                new Query<LiliaoxinxiEntity>(params).getPage(),
                new EntityWrapper<LiliaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiliaoxinxiEntity> wrapper) {
		  Page<LiliaoxinxiView> page =new Query<LiliaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiliaoxinxiVO> selectListVO(Wrapper<LiliaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiliaoxinxiVO selectVO(Wrapper<LiliaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiliaoxinxiView> selectListView(Wrapper<LiliaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiliaoxinxiView selectView(Wrapper<LiliaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
