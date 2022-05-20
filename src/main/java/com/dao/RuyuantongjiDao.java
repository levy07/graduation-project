package com.dao;

import com.entity.RuyuantongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuyuantongjiVO;
import com.entity.view.RuyuantongjiView;


/**
 * 入院统计
 * 
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface RuyuantongjiDao extends BaseMapper<RuyuantongjiEntity> {
	
	List<RuyuantongjiVO> selectListVO(@Param("ew") Wrapper<RuyuantongjiEntity> wrapper);
	
	RuyuantongjiVO selectVO(@Param("ew") Wrapper<RuyuantongjiEntity> wrapper);
	
	List<RuyuantongjiView> selectListView(@Param("ew") Wrapper<RuyuantongjiEntity> wrapper);

	List<RuyuantongjiView> selectListView(Pagination page,@Param("ew") Wrapper<RuyuantongjiEntity> wrapper);
	
	RuyuantongjiView selectView(@Param("ew") Wrapper<RuyuantongjiEntity> wrapper);
	
}
