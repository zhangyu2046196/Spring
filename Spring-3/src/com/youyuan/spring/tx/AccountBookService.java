package com.youyuan.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.youyuan.spring.tx.bean.Account;
import com.youyuan.spring.tx.bean.BookStock;
import com.youyuan.spring.tx.dao.AccountDao;
import com.youyuan.spring.tx.dao.BookDao;
import com.youyuan.spring.tx.dao.BookStockDao;
import com.youyuan.spring.tx.dao.execution.AccountException;
import com.youyuan.spring.tx.dao.execution.BookStockException;

@Service
public class AccountBookService {

	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private BookStockDao bookStockDao;
	
	@Autowired
	private AccountDao accountDao;
	
	/**
	 * 通过注解的方式声明事务
	 */
	@Transactional
	public void update(Long userId,String bookId){
		Integer price=bookDao.getPriceByBookId(bookId);
		
		BookStock bookStock=bookStockDao.getBookStockByBookId(bookId);
		if(bookStock!=null && bookStock.getStock()<1){
			throw new BookStockException("库存不足");
		}else{
			bookStockDao.updateBookStockByBookId(bookId);
		}

		Account account=accountDao.queryAccountByUserId(userId);
		if(account!=null && account.getBlance()<price){
			throw new AccountException("余额不足");
		}else{
			accountDao.updateAccountInfo(100L, price);
		}
	}
}
