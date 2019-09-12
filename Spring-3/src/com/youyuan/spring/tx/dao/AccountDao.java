package com.youyuan.spring.tx.dao;

import com.youyuan.spring.tx.bean.Account;

public interface AccountDao {

	/**
	 * 更新用户账户信息
	 * @param userId
	 * @param price
	 */
	public void updateAccountInfo(Long userId,Integer price);
	
	/**
	 * 根据userId查询账户
	 * @param userId
	 * @return
	 */
	public Account queryAccountByUserId(Long userId);
	
}
