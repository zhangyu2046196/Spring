package com.youyuan.spring.bean.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person=(Person) ctx.getBean("newPerson");
		System.out.println("person"+person);
		
		PersonMap personMap=(PersonMap) ctx.getBean("personMap");
		System.out.println("personMap"+personMap);
		
		PersonProperties personProperties=(PersonProperties) ctx.getBean("personProperties");
		System.out.println("personProperties"+personProperties);
		
		Person newPerson1=(Person) ctx.getBean("newPerson1");
		System.out.println("newPerson1"+newPerson1);
		
		Person newPerson2=(Person) ctx.getBean("newPerson2");
		System.out.println("newPerson2"+newPerson2);
	}
}
