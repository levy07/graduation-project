package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 理疗信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
@TableName("liliaoxinxi")
public class LiliaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LiliaoxinxiEntity() {
		
	}
	
	public LiliaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 理疗编号
	 */
					
	private String liliaobianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：理疗编号
	 */
	public void setLiliaobianhao(String liliaobianhao) {
		this.liliaobianhao = liliaobianhao;
	}
	/**
	 * 获取：理疗编号
	 */
	public String getLiliaobianhao() {
		return liliaobianhao;
	}
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
