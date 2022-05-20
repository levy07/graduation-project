package com.entity.view;

import com.entity.TijiantongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体检统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
@TableName("tijiantongji")
public class TijiantongjiView  extends TijiantongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TijiantongjiView(){
	}
 
 	public TijiantongjiView(TijiantongjiEntity tijiantongjiEntity){
 	try {
			BeanUtils.copyProperties(this, tijiantongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
