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


import com.dao.HulifanganDao;
import com.entity.HulifanganEntity;
import com.service.HulifanganService;
import com.entity.vo.HulifanganVO;
import com.entity.view.HulifanganView;

@Service("hulifanganService")
public class HulifanganServiceImpl extends ServiceImpl<HulifanganDao, HulifanganEntity> implements HulifanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HulifanganEntity> page = this.selectPage(
                new Query<HulifanganEntity>(params).getPage(),
                new EntityWrapper<HulifanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HulifanganEntity> wrapper) {
		  Page<HulifanganView> page =new Query<HulifanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HulifanganVO> selectListVO(Wrapper<HulifanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HulifanganVO selectVO(Wrapper<HulifanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HulifanganView> selectListView(Wrapper<HulifanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HulifanganView selectView(Wrapper<HulifanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
