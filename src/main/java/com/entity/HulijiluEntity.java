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
 * 护理记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
@TableName("hulijilu")
public class HulijiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HulijiluEntity() {
		
	}
	
	public HulijiluEntity(T t) {
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
	 * 记录编号
	 */
					
	private String jilubianhao;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 饮食
	 */
					
	private String yinshi;
	
	/**
	 * 药方
	 */
					
	private String yaofang;
	
	/**
	 * 身体状况
	 */
					
	private String shentizhuangkuang;
	
	/**
	 * 护理详情
	 */
					
	private String hulixiangqing;
	
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
	 * 设置：记录编号
	 */
	public void setJilubianhao(String jilubianhao) {
		this.jilubianhao = jilubianhao;
	}
	/**
	 * 获取：记录编号
	 */
	public String getJilubianhao() {
		return jilubianhao;
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
	 * 设置：身体状况
	 */
	public void setShentizhuangkuang(String shentizhuangkuang) {
		this.shentizhuangkuang = shentizhuangkuang;
	}
	/**
	 * 获取：身体状况
	 */
	public String getShentizhuangkuang() {
		return shentizhuangkuang;
	}
	/**
	 * 设置：护理详情
	 */
	public void setHulixiangqing(String hulixiangqing) {
		this.hulixiangqing = hulixiangqing;
	}
	/**
	 * 获取：护理详情
	 */
	public String getHulixiangqing() {
		return hulixiangqing;
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
