package com.youyuan.spring.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Integer getPriceByBookId(String bookId) {
		String sql="select PRICE from BOOK where BOOK_ID=?";
		return jdbcTemplate.queryForInt(sql, bookId);
	}

}
