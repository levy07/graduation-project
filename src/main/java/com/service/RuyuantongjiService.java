package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuyuantongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuyuantongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuyuantongjiView;


/**
 * 入院统计
 *
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface RuyuantongjiService extends IService<RuyuantongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuyuantongjiVO> selectListVO(Wrapper<RuyuantongjiEntity> wrapper);
   	
   	RuyuantongjiVO selectVO(@Param("ew") Wrapper<RuyuantongjiEntity> wrapper);
   	
   	List<RuyuantongjiView> selectListView(Wrapper<RuyuantongjiEntity> wrapper);
   	
   	RuyuantongjiView selectView(@Param("ew") Wrapper<RuyuantongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuyuantongjiEntity> wrapper);
   	
}

