package com.youyuan.spring.bean.properties;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class PropertiesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-properties.xml");
		DataSource datasource=(DataSource) ctx.getBean("datasource");
		System.out.println("datasource"+datasource);
	}

}
