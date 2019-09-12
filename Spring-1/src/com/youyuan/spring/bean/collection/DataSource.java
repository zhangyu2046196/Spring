package com.youyuan.spring.bean.collection;

import java.io.Serializable;

public class DataSource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String dbName;
	private String driver;
	private String url;
	private String userName;
	private String passWord;
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "DataSource [dbName=" + dbName + ", driver=" + driver + ", url="
				+ url + ", userName=" + userName + ", passWord=" + passWord
				+ "]";
	}
}
