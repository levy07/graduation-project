package com.dao;

import com.entity.XinlizixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinlizixunVO;
import com.entity.view.XinlizixunView;


/**
 * 心理咨询
 * 
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface XinlizixunDao extends BaseMapper<XinlizixunEntity> {
	
	List<XinlizixunVO> selectListVO(@Param("ew") Wrapper<XinlizixunEntity> wrapper);
	
	XinlizixunVO selectVO(@Param("ew") Wrapper<XinlizixunEntity> wrapper);
	
	List<XinlizixunView> selectListView(@Param("ew") Wrapper<XinlizixunEntity> wrapper);

	List<XinlizixunView> selectListView(Pagination page,@Param("ew") Wrapper<XinlizixunEntity> wrapper);
	
	XinlizixunView selectView(@Param("ew") Wrapper<XinlizixunEntity> wrapper);
	
}
