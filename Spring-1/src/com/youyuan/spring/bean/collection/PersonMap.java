package com.youyuan.spring.bean.collection;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class PersonMap implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private int age;
	private int sex;
	private String address;
	private Map<String, Car> mapCar;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Map<String, Car> getMapCar() {
		return mapCar;
	}
	public void setMapCar(Map<String, Car> mapCar) {
		this.mapCar = mapCar;
	}
	@Override
	public String toString() {
		return "PersonMap [userName=" + userName + ", age=" + age + ", sex="
				+ sex + ", address=" + address + ", mapCar=" + mapCar + "]";
	}
	
}
