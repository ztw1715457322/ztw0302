package com.ztw.entity;

import java.math.BigDecimal;
/*
 * 编写一个Goods类，共有ID，商品名称，商品价格，
 * 已售百分比，共4个属性。其中价格需要为BigDecimal类型
 * ，如果不是则扣4分。
 * */
public class Goods {
	private String id;//iD属性
	private String name;//名称属性
	private BigDecimal price;//价格属性
	private String bfb;//百分比属性
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getBfb() {
		return bfb;
	}
	public void setBfb(String bfb) {
		this.bfb = bfb;
	}
}
