package com.entity.vo;

import com.entity.HulifanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 护理方案
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
public class HulifanganVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 护理方案
	 */
	
	private String hulifangan;
		
	/**
	 * 饮食
	 */
	
	private String yinshi;
		
	/**
	 * 药方
	 */
	
	private String yaofang;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 护理账号
	 */
	
	private String hulizhanghao;
		
	/**
	 * 护理姓名
	 */
	
	private String hulixingming;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
				
	
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
	 * 设置：护理方案
	 */
	 
	public void setHulifangan(String hulifangan) {
		this.hulifangan = hulifangan;
	}
	
	/**
	 * 获取：护理方案
	 */
	public String getHulifangan() {
		return hulifangan;
	}
				
	
	/**
	 * 设置：饮食
	 */
	 
	public void setYinshi(String yinshi) {
		this.yinshi = yinshi;
	}
	
	/**
	 * 获取：饮食
	 */
	public String getYinshi() {
		return yinshi;
	}
				
	
	/**
	 * 设置：药方
	 */
	 
	public void setYaofang(String yaofang) {
		this.yaofang = yaofang;
	}
	
	/**
	 * 获取：药方
	 */
	public String getYaofang() {
		return yaofang;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
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
