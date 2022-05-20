package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HulifanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HulifanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HulifanganView;


/**
 * 护理方案
 *
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public interface HulifanganService extends IService<HulifanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HulifanganVO> selectListVO(Wrapper<HulifanganEntity> wrapper);
   	
   	HulifanganVO selectVO(@Param("ew") Wrapper<HulifanganEntity> wrapper);
   	
   	List<HulifanganView> selectListView(Wrapper<HulifanganEntity> wrapper);
   	
   	HulifanganView selectView(@Param("ew") Wrapper<HulifanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HulifanganEntity> wrapper);
   	
}

