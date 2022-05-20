package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinlizixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinlizixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinlizixunView;


/**
 * 心理咨询
 *
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface XinlizixunService extends IService<XinlizixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinlizixunVO> selectListVO(Wrapper<XinlizixunEntity> wrapper);
   	
   	XinlizixunVO selectVO(@Param("ew") Wrapper<XinlizixunEntity> wrapper);
   	
   	List<XinlizixunView> selectListView(Wrapper<XinlizixunEntity> wrapper);
   	
   	XinlizixunView selectView(@Param("ew") Wrapper<XinlizixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinlizixunEntity> wrapper);
   	
}

