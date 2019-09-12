package com.youyuan.spring.bean.cycle;

import java.io.Serializable;

public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String carName;
	private double price;
	private int maxSpeed;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
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
		return "Car [carName=" + carName + ", price=" + price + ", maxSpeed="
				+ maxSpeed + "]";
	}
	
	public void init(){
		System.out.println("Car 的初始化方法......");
	}
	
	public void destory(){
		System.out.println("Car 的销毁方法......");
	}
}
