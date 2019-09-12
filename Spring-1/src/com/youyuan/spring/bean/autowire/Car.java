package com.youyuan.spring.bean.autowire;

import java.io.Serializable;

public class Car implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String carName;
	private double price;
	private int maxSpeed;
	
	public Car(){
		System.out.println("Car init ......");
	}
	
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
}
