package com.dao;

import com.entity.HuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuliVO;
import com.entity.view.HuliView;


/**
 * 护理
 * 
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface HuliDao extends BaseMapper<HuliEntity> {
	
	List<HuliVO> selectListVO(@Param("ew") Wrapper<HuliEntity> wrapper);
	
	HuliVO selectVO(@Param("ew") Wrapper<HuliEntity> wrapper);
	
	List<HuliView> selectListView(@Param("ew") Wrapper<HuliEntity> wrapper);

	List<HuliView> selectListView(Pagination page,@Param("ew") Wrapper<HuliEntity> wrapper);
	
	HuliView selectView(@Param("ew") Wrapper<HuliEntity> wrapper);
	
}
