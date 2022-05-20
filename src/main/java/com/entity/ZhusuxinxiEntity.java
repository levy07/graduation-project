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
 * 住宿信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
@TableName("zhusuxinxi")
public class ZhusuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhusuxinxiEntity() {
		
	}
	
	public ZhusuxinxiEntity(T t) {
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
	 * 住宿编号
	 */
					
	private String zhusubianhao;
	
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
	 * 设置：住宿编号
	 */
	public void setZhusubianhao(String zhusubianhao) {
		this.zhusubianhao = zhusubianhao;
	}
	/**
	 * 获取：住宿编号
	 */
	public String getZhusubianhao() {
		return zhusubianhao;
	}
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
