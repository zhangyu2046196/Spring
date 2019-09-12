package com.youyuan.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.youyuan.spring.bean.autowire.Car;

public class ScopeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-scope.xml");
		Car car1=(Car) ctx.getBean("car");
		Car car2=(Car) ctx.getBean("car");
		
		System.out.println(car1==car2);
	}

}
