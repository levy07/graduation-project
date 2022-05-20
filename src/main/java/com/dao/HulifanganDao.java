package com.dao;

import com.entity.HulifanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HulifanganVO;
import com.entity.view.HulifanganView;


/**
 * 护理方案
 * 
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface HulifanganDao extends BaseMapper<HulifanganEntity> {
	
	List<HulifanganVO> selectListVO(@Param("ew") Wrapper<HulifanganEntity> wrapper);
	
	HulifanganVO selectVO(@Param("ew") Wrapper<HulifanganEntity> wrapper);
	
	List<HulifanganView> selectListView(@Param("ew") Wrapper<HulifanganEntity> wrapper);

	List<HulifanganView> selectListView(Pagination page,@Param("ew") Wrapper<HulifanganEntity> wrapper);
	
	HulifanganView selectView(@Param("ew") Wrapper<HulifanganEntity> wrapper);
	
}
