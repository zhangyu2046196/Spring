package com.youyuan.spring.bean;

import java.io.Serializable;

/**
 * 实体
 * @author zhangyu
 * @date 2018-3-22 下午1:40:13
 */
public class Car implements Serializable {
	private String name;
	private double price;
	private int maxSpeed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", maxSpeed="
				+ maxSpeed + "]";
	}
}
