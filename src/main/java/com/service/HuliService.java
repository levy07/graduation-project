package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuliView;


/**
 * 护理
 *
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface HuliService extends IService<HuliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuliVO> selectListVO(Wrapper<HuliEntity> wrapper);
   	
   	HuliVO selectVO(@Param("ew") Wrapper<HuliEntity> wrapper);
   	
   	List<HuliView> selectListView(Wrapper<HuliEntity> wrapper);
   	
   	HuliView selectView(@Param("ew") Wrapper<HuliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuliEntity> wrapper);
   	
}

