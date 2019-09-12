package com.youyuan.spring.tx.dao;

import com.youyuan.spring.tx.bean.BookStock;

public interface BookStockDao {
	
	/**
	 * 根据书号更新书的库存
	 * @param bookId
	 */
	public void updateBookStockByBookId(String bookId);
	
	/**
	 * 根据书号获取书实体
	 * @param bookId
	 * @return
	 */
	public BookStock getBookStockByBookId(String bookId);
	
}
