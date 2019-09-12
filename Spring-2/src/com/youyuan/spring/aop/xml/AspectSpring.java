package com.youyuan.spring.aop.xml;

public interface AspectSpring {
	
	/**
	 * 加运算
	 * @param i
	 * @param j
	 * @return
	 */
	public int add(int i,int j);
	
	/**
	 * 减运算
	 * @param i
	 * @param j
	 * @return
	 */
	public int sub(int i,int j);
	
	/**
	 * 乘运算
	 * @param i
	 * @param j
	 * @return
	 */
	public int take(int i,int j);
	
	/**
	 * 除运算
	 * @param i
	 * @param j
	 * @return
	 */
	public int div(int i,int j);

}
