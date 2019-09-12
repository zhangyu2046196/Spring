package com.youyuan.spring.bean.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		Car car2=(Car) ctx.getBean("car2");
		System.out.println(car2);
		
		Car car3=(Car) ctx.getBean("car3");
		System.out.println(car3);
	}

}
