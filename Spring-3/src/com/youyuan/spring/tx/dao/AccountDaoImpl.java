package com.youyuan.spring.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.youyuan.spring.tx.bean.Account;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void updateAccountInfo(Long userId, Integer price) {
		String sql="update ACCOUNT set BLANCE=BLANCE-? where USER_ID=?";
		jdbcTemplate.update(sql, price,userId);
	}

	@Override
	public Account queryAccountByUserId(Long userId) {
		String sql="select * from ACCOUNT where USER_ID=?";
		RowMapper<Account> rowMapper=new BeanPropertyRowMapper<>(Account.class);
		return jdbcTemplate.queryForObject(sql, rowMapper, userId);
	}

}
