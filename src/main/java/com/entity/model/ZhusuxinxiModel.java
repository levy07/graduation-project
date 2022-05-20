package com.entity.model;

import com.entity.ZhusuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 住宿信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public class ZhusuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房号
	 */
	
	private String fanghao;
		
	/**
	 * 床号
	 */
	
	private String chuanghao;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 护理账号
	 */
	
	private String hulizhanghao;
		
	/**
	 * 护理姓名
	 */
	
	private String hulixingming;
				
	
	/**
	 * 设置：房号
	 */
	 
	public void setFanghao(String fanghao) {
		this.fanghao = fanghao;
	}
	
	/**
	 * 获取：房号
	 */
	public String getFanghao() {
		return fanghao;
	}
				
	
	/**
	 * 设置：床号
	 */
	 
	public void setChuanghao(String chuanghao) {
		this.chuanghao = chuanghao;
	}
	
	/**
	 * 获取：床号
	 */
	public String getChuanghao() {
		return chuanghao;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：护理账号
	 */
	 
	public void setHulizhanghao(String hulizhanghao) {
		this.hulizhanghao = hulizhanghao;
	}
	
	/**
	 * 获取：护理账号
	 */
	public String getHulizhanghao() {
		return hulizhanghao;
	}
				
	
	/**
	 * 设置：护理姓名
	 */
	 
	public void setHulixingming(String hulixingming) {
		this.hulixingming = hulixingming;
	}
	
	/**
	 * 获取：护理姓名
	 */
	public String getHulixingming() {
		return hulixingming;
	}
			
}
