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
 * 入住信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-12-20 12:42:11
 */
@TableName("ruzhuxinxi")
public class RuzhuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RuzhuxinxiEntity() {
		
	}
	
	public RuzhuxinxiEntity(T t) {
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
	 * 入住编号
	 */
					
	private String ruzhubianhao;
	
	/**
	 * 房号
	 */
					
	private String fanghao;
	
	/**
	 * 床号
	 */
					
	private String chuanghao;
	
	/**
	 * 紧急联系人
	 */
					
	private String jinjilianxiren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 联系人关系
	 */
					
	private String lianxirenguanxi;
	
	/**
	 * 作息规律
	 */
					
	private String zuoxiguilv;
	
	/**
	 * 饮食习惯
	 */
					
	private String yinshixiguan;
	
	/**
	 * 生活喜好
	 */
					
	private String shenghuoxihao;
	
	/**
	 * 入住时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date ruzhushijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
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
	 * 设置：入住编号
	 */
	public void setRuzhubianhao(String ruzhubianhao) {
		this.ruzhubianhao = ruzhubianhao;
	}
	/**
	 * 获取：入住编号
	 */
	public String getRuzhubianhao() {
		return ruzhubianhao;
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
	 * 设置：紧急联系人
	 */
	public void setJinjilianxiren(String jinjilianxiren) {
		this.jinjilianxiren = jinjilianxiren;
	}
	/**
	 * 获取：紧急联系人
	 */
	public String getJinjilianxiren() {
		return jinjilianxiren;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：联系人关系
	 */
	public void setLianxirenguanxi(String lianxirenguanxi) {
		this.lianxirenguanxi = lianxirenguanxi;
	}
	/**
	 * 获取：联系人关系
	 */
	public String getLianxirenguanxi() {
		return lianxirenguanxi;
	}
	/**
	 * 设置：作息规律
	 */
	public void setZuoxiguilv(String zuoxiguilv) {
		this.zuoxiguilv = zuoxiguilv;
	}
	/**
	 * 获取：作息规律
	 */
	public String getZuoxiguilv() {
		return zuoxiguilv;
	}
	/**
	 * 设置：饮食习惯
	 */
	public void setYinshixiguan(String yinshixiguan) {
		this.yinshixiguan = yinshixiguan;
	}
	/**
	 * 获取：饮食习惯
	 */
	public String getYinshixiguan() {
		return yinshixiguan;
	}
	/**
	 * 设置：生活喜好
	 */
	public void setShenghuoxihao(String shenghuoxihao) {
		this.shenghuoxihao = shenghuoxihao;
	}
	/**
	 * 获取：生活喜好
	 */
	public String getShenghuoxihao() {
		return shenghuoxihao;
	}
	/**
	 * 设置：入住时间
	 */
	public void setRuzhushijian(Date ruzhushijian) {
		this.ruzhushijian = ruzhushijian;
	}
	/**
	 * 获取：入住时间
	 */
	public Date getRuzhushijian() {
		return ruzhushijian;
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
