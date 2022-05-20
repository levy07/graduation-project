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


import com.dao.HuliDao;
import com.entity.HuliEntity;
import com.service.HuliService;
import com.entity.vo.HuliVO;
import com.entity.view.HuliView;

@Service("huliService")
public class HuliServiceImpl extends ServiceImpl<HuliDao, HuliEntity> implements HuliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuliEntity> page = this.selectPage(
                new Query<HuliEntity>(params).getPage(),
                new EntityWrapper<HuliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuliEntity> wrapper) {
		  Page<HuliView> page =new Query<HuliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuliVO> selectListVO(Wrapper<HuliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuliVO selectVO(Wrapper<HuliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuliView> selectListView(Wrapper<HuliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuliView selectView(Wrapper<HuliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
