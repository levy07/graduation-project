package com.entity.model;

import com.entity.RuyuantongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 入院统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public class RuyuantongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 统计时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjishijian;
		
	/**
	 * 入院人数
	 */
	
	private Integer ruyuanrenshu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：统计时间
	 */
	 
	public void setTongjishijian(Date tongjishijian) {
		this.tongjishijian = tongjishijian;
	}
	
	/**
	 * 获取：统计时间
	 */
	public Date getTongjishijian() {
		return tongjishijian;
	}
				
	
	/**
	 * 设置：入院人数
	 */
	 
	public void setRuyuanrenshu(Integer ruyuanrenshu) {
		this.ruyuanrenshu = ruyuanrenshu;
	}
	
	/**
	 * 获取：入院人数
	 */
	public Integer getRuyuanrenshu() {
		return ruyuanrenshu;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
