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


import com.dao.RuyuantongjiDao;
import com.entity.RuyuantongjiEntity;
import com.service.RuyuantongjiService;
import com.entity.vo.RuyuantongjiVO;
import com.entity.view.RuyuantongjiView;

@Service("ruyuantongjiService")
public class RuyuantongjiServiceImpl extends ServiceImpl<RuyuantongjiDao, RuyuantongjiEntity> implements RuyuantongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuyuantongjiEntity> page = this.selectPage(
                new Query<RuyuantongjiEntity>(params).getPage(),
                new EntityWrapper<RuyuantongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuyuantongjiEntity> wrapper) {
		  Page<RuyuantongjiView> page =new Query<RuyuantongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuyuantongjiVO> selectListVO(Wrapper<RuyuantongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuyuantongjiVO selectVO(Wrapper<RuyuantongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuyuantongjiView> selectListView(Wrapper<RuyuantongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuyuantongjiView selectView(Wrapper<RuyuantongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
