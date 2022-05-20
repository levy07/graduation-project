package com.dao;

import com.entity.TijiantongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijiantongjiVO;
import com.entity.view.TijiantongjiView;


/**
 * 体检统计
 * 
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface TijiantongjiDao extends BaseMapper<TijiantongjiEntity> {
	
	List<TijiantongjiVO> selectListVO(@Param("ew") Wrapper<TijiantongjiEntity> wrapper);
	
	TijiantongjiVO selectVO(@Param("ew") Wrapper<TijiantongjiEntity> wrapper);
	
	List<TijiantongjiView> selectListView(@Param("ew") Wrapper<TijiantongjiEntity> wrapper);

	List<TijiantongjiView> selectListView(Pagination page,@Param("ew") Wrapper<TijiantongjiEntity> wrapper);
	
	TijiantongjiView selectView(@Param("ew") Wrapper<TijiantongjiEntity> wrapper);
	
}
