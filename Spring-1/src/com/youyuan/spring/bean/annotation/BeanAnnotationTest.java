package com.youyuan.spring.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.youyuan.spring.bean.annotation.component.UserComponnet;
import com.youyuan.spring.bean.annotation.controller.UserController;
import com.youyuan.spring.bean.annotation.repository.UserRepository;
import com.youyuan.spring.bean.annotation.service.UserService;

public class BeanAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-anotation.xml");
		UserComponnet userComponent=(UserComponnet) ctx.getBean("userComponnet");
		System.out.println(userComponent);
		
		UserRepository userRepository=(UserRepository) ctx.getBean("userRepository");
		System.out.println(userRepository);
		
		UserService userService=(UserService) ctx.getBean("userService");
		System.out.println(userService);
		
		UserController userController=(UserController) ctx.getBean("userController");
		System.out.println(userController);
	}
	
}
