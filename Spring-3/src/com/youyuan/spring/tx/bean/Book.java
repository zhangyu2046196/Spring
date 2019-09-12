package com.youyuan.spring.tx.bean;

import java.io.Serializable;

/**
 * 书 实体
 * @author zhangyu
 * @date 2018-3-30 下午2:01:26
 */
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long guid;
	private String bookId;
	private String bookName;
	private Integer price;
	public Long getGuid() {
		return guid;
	}
	public void setGuid(Long guid) {
		this.guid = guid;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [guid=" + guid + ", bookId=" + bookId + ", bookName="
				+ bookName + ", price=" + price + "]";
	}
}
