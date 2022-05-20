package com.entity.model;

import com.entity.LiliaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 理疗信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public class LiliaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 体检结果
	 */
	
	private String tijianjieguo;
		
	/**
	 * 理疗方案
	 */
	
	private String liliaofangan;
		
	/**
	 * 理疗时间
	 */
	
	private String liliaoshijian;
		
	/**
	 * 理疗项目
	 */
	
	private String liliaoxiangmu;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 医生账号
	 */
	
	private String yishengzhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
				
	
	/**
	 * 设置：体检结果
	 */
	 
	public void setTijianjieguo(String tijianjieguo) {
		this.tijianjieguo = tijianjieguo;
	}
	
	/**
	 * 获取：体检结果
	 */
	public String getTijianjieguo() {
		return tijianjieguo;
	}
				
	
	/**
	 * 设置：理疗方案
	 */
	 
	public void setLiliaofangan(String liliaofangan) {
		this.liliaofangan = liliaofangan;
	}
	
	/**
	 * 获取：理疗方案
	 */
	public String getLiliaofangan() {
		return liliaofangan;
	}
				
	
	/**
	 * 设置：理疗时间
	 */
	 
	public void setLiliaoshijian(String liliaoshijian) {
		this.liliaoshijian = liliaoshijian;
	}
	
	/**
	 * 获取：理疗时间
	 */
	public String getLiliaoshijian() {
		return liliaoshijian;
	}
				
	
	/**
	 * 设置：理疗项目
	 */
	 
	public void setLiliaoxiangmu(String liliaoxiangmu) {
		this.liliaoxiangmu = liliaoxiangmu;
	}
	
	/**
	 * 获取：理疗项目
	 */
	public String getLiliaoxiangmu() {
		return liliaoxiangmu;
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
	 * 设置：医生账号
	 */
	 
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：职位
	 */
	 
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
			
}
