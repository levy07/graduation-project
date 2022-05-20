package com.dao;

import com.entity.HulijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HulijiluVO;
import com.entity.view.HulijiluView;


/**
 * 护理记录
 * 
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface HulijiluDao extends BaseMapper<HulijiluEntity> {
	
	List<HulijiluVO> selectListVO(@Param("ew") Wrapper<HulijiluEntity> wrapper);
	
	HulijiluVO selectVO(@Param("ew") Wrapper<HulijiluEntity> wrapper);
	
	List<HulijiluView> selectListView(@Param("ew") Wrapper<HulijiluEntity> wrapper);

	List<HulijiluView> selectListView(Pagination page,@Param("ew") Wrapper<HulijiluEntity> wrapper);
	
	HulijiluView selectView(@Param("ew") Wrapper<HulijiluEntity> wrapper);
	
}
