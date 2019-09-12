package com.youyuan.spring.tx.dao;

public interface BookDao {
	
	/**
	 * 根据书号获取单价
	 * @param bookId
	 * @return
	 */
	public Integer getPriceByBookId(String bookId);
	
}
