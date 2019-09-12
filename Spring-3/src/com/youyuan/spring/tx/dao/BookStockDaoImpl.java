package com.youyuan.spring.tx.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.youyuan.spring.tx.bean.BookStock;

@Repository("bookStockDao")
public class BookStockDaoImpl implements BookStockDao {
	
	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public void updateBookStockByBookId(String bookId) {
		String sql="update BOOK_STOCK set STOCK=STOCK-1 where BOOK_ID=?";
		jdbcTemplate.update(sql, bookId);
	}

	@Override
	public BookStock getBookStockByBookId(String bookId) {
		String sql="select * from BOOK_STOCK where BOOK_ID=?";
		RowMapper<BookStock> rowMapper=new BeanPropertyRowMapper<BookStock>(BookStock.class);
		return jdbcTemplate.queryForObject(sql, rowMapper, bookId);
	}

}
