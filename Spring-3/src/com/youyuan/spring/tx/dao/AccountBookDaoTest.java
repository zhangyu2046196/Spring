package com.youyuan.spring.tx.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.youyuan.spring.tx.bean.Account;
import com.youyuan.spring.tx.bean.BookStock;

public class AccountBookDaoTest {
	
	private static ApplicationContext ctx=null;
	
	private static AccountDao accountDao=null;
	
	private static BookDao bookDao=null;
	
	private static BookStockDao bookStockDao=null;
	
	static{
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		accountDao=(AccountDao) ctx.getBean("accountDao");
		bookDao=(BookDao) ctx.getBean("bookDao");
		bookStockDao=(BookStockDao) ctx.getBean("bookStockDao");
	}

	@Test
	public void testBookDao(){
		Integer price=bookDao.getPriceByBookId("1001");
		System.out.println("price:"+price);
	}
	
	@Test
	public void testBookStock(){
		bookStockDao.updateBookStockByBookId("1001");
	}
	
	@Test
	public void testAccount(){
		accountDao.updateAccountInfo(100L, 35);
	}
	
	@Test
	public void testQueryBookStock(){
		BookStock bookStock=bookStockDao.getBookStockByBookId("1001");
		System.out.println(bookStock);
	}
	
	@Test
	public void testQueryAccount(){
		Account account=accountDao.queryAccountByUserId(100L);
		System.out.println(account);
	}

}
