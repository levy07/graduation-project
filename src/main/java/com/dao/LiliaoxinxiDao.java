package com.dao;

import com.entity.LiliaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiliaoxinxiVO;
import com.entity.view.LiliaoxinxiView;


/**
 * 理疗信息
 * 
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface LiliaoxinxiDao extends BaseMapper<LiliaoxinxiEntity> {
	
	List<LiliaoxinxiVO> selectListVO(@Param("ew") Wrapper<LiliaoxinxiEntity> wrapper);
	
	LiliaoxinxiVO selectVO(@Param("ew") Wrapper<LiliaoxinxiEntity> wrapper);
	
	List<LiliaoxinxiView> selectListView(@Param("ew") Wrapper<LiliaoxinxiEntity> wrapper);

	List<LiliaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LiliaoxinxiEntity> wrapper);
	
	LiliaoxinxiView selectView(@Param("ew") Wrapper<LiliaoxinxiEntity> wrapper);
	
}
