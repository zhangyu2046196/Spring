package com.youyuan.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1、创建spring的ioc容器对象
		//      ApplicationContext：是一个接口,实现类如下
		//		  ClassPathXmlApplication:通过类路径下加载配置文件
		//        FileSystemApplication:通过系统文件加载配置文件
				
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、创建bean对象
		//  可以通过id名创建bean也可以通过类名创建
		HelloWorld hw=(HelloWorld) ctx.getBean("helloWorld");//通过id属性创建bean对象
		
		//3、执行方法
		hw.helloWorld();
		System.out.println(hw.toString());
		
		HelloWorld hw2=(HelloWorld) ctx.getBean("helloWorld2");
		System.out.println(hw2.toString());
		
		Car car=(Car) ctx.getBean("car");
		System.out.println("car"+car.toString());
		
		Person person=(Person) ctx.getBean("person2");
		System.out.println("person"+person.toString());
	}

}
