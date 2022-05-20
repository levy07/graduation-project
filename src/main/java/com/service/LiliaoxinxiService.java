package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiliaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiliaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiliaoxinxiView;


/**
 * 理疗信息
 *
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface LiliaoxinxiService extends IService<LiliaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiliaoxinxiVO> selectListVO(Wrapper<LiliaoxinxiEntity> wrapper);
   	
   	LiliaoxinxiVO selectVO(@Param("ew") Wrapper<LiliaoxinxiEntity> wrapper);
   	
   	List<LiliaoxinxiView> selectListView(Wrapper<LiliaoxinxiEntity> wrapper);
   	
   	LiliaoxinxiView selectView(@Param("ew") Wrapper<LiliaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiliaoxinxiEntity> wrapper);
   	
}

