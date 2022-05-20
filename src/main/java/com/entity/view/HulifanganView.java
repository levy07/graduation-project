package com.entity.view;

import com.entity.HulifanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 护理方案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
@TableName("hulifangan")
public class HulifanganView  extends HulifanganEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HulifanganView(){
	}
 
 	public HulifanganView(HulifanganEntity hulifanganEntity){
 	try {
			BeanUtils.copyProperties(this, hulifanganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
