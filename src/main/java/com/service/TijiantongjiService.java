package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijiantongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijiantongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijiantongjiView;


/**
 * 体检统计
 *
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface TijiantongjiService extends IService<TijiantongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijiantongjiVO> selectListVO(Wrapper<TijiantongjiEntity> wrapper);
   	
   	TijiantongjiVO selectVO(@Param("ew") Wrapper<TijiantongjiEntity> wrapper);
   	
   	List<TijiantongjiView> selectListView(Wrapper<TijiantongjiEntity> wrapper);
   	
   	TijiantongjiView selectView(@Param("ew") Wrapper<TijiantongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijiantongjiEntity> wrapper);
   	
}

