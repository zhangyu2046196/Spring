package com.youyuan.spring.bean.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.youyuan.spring.bean.autowire.Address;
import com.youyuan.spring.bean.autowire.Person;

public class RelationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-relation.xml");
		Address address=(Address) ctx.getBean("address");
		System.out.println("address"+address);
		
		Address address2=(Address) ctx.getBean("address2");
		System.out.println("address2"+address2);
		
		Person person=(Person) ctx.getBean("person");
		System.out.println("person"+person);
	}

}
