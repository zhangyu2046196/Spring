package com.youyuan.spring.tx.bean;

import java.io.Serializable;

/**
 * 用户 账户
 * @author zhangyu
 * @date 2018-3-30 下午2:03:59
 */
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long guid;
	private Long userId;
	private String userName;
	private Integer blance;
	public Long getGuid() {
		return guid;
	}
	public void setGuid(Long guid) {
		this.guid = guid;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getBlance() {
		return blance;
	}
	public void setBlance(Integer blance) {
		this.blance = blance;
	}
	@Override
	public String toString() {
		return "Account [guid=" + guid + ", userId=" + userId + ", userName="
				+ userName + ", blance=" + blance + "]";
	}
}
