package com.youyuan.spring.bean;

public class HelloWorld {

	private String userName;
	private int age;
	
	public HelloWorld(){
		
	}

	public HelloWorld(String userName, int age) {
		super();
		this.userName = userName;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "HelloWorld [userName=" + userName + ", age=" + age + "]";
	}

	public void helloWorld(){
		System.out.println("name:"+userName);
	}
}
