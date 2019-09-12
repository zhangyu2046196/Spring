package com.youyuan.spring.tx;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountBookTest {
	
	private static ApplicationContext ctx=null;
	
	private static AccountBookService accountBookService=null;
	
	private static CashBookService cashBookService=null;
	
	static{
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		accountBookService=(AccountBookService) ctx.getBean("accountBookService");
		cashBookService=(CashBookService) ctx.getBean("cashBookService");
	}

	@Test
	public void bookAccount(){
		accountBookService.update(100L,"1001");
	}
	
	@Test
	public void testTransactionPropagation(){
		cashBookService.update(100L, Arrays.asList("1001","1002"));
	}

}
