package com.youyuan.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectAopTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AspectSpring aspectSpring=(AspectSpring) ctx.getBean("aspectSpring");
		int result=aspectSpring.add(2, 3);
		System.out.println(result);
		
		result=aspectSpring.sub(8, 2);
		System.out.println(result);
		
		result=aspectSpring.take(3, 6);
		System.out.println(result);
		
		result=aspectSpring.div(10, 2);
		System.out.println(result);
	}
}
