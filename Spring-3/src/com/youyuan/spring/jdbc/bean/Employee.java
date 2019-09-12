package com.youyuan.spring.jdbc.bean;

import java.io.Serializable;

/**
 * 测试jdbcTempalate实体
 * @author zhangyu
 * @date 2018-3-29 下午11:03:37
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long guid;
	private String userName;
	private String gender;
	private String email;
	private Long deptId;
	public Employee(){
		
	}
	
	public Employee(String userName, String gender, String email, Long deptId) {
		super();
		this.userName = userName;
		this.gender = gender;
		this.email = email;
		this.deptId = deptId;
	}

	public Long getGuid() {
		return guid;
	}
	public void setGuid(Long guid) {
		this.guid = guid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Employee [guid=" + guid + ", userName=" + userName
				+ ", gender=" + gender + ", email=" + email + ", deptId="
				+ deptId + "]";
	}
}
