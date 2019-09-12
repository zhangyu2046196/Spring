package com.youyuan.spring.tx.bean;

import java.io.Serializable;

/**
 * 书 库存
 * @author zhangyu
 * @date 2018-3-30 下午2:05:18
 */
public class BookStock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long guid;
	private String bookId;
	private Integer stock;
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
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "BookStock [guid=" + guid + ", bookId=" + bookId + ", stock="
				+ stock + "]";
	}
}
