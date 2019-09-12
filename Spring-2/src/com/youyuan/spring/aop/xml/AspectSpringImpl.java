package com.youyuan.spring.aop.xml;


/**
 * 基于xml方式测试spring  aop
 * @author zhangyu
 * @date 2018-3-29 下午4:21:43
 */
public class AspectSpringImpl implements AspectSpring {

	/**
	 * 加运算
	 */
	public int add(int i, int j) {
		return i+j;
	}

	/**
	 * 减运算
	 */
	public int sub(int i, int j) {
		return i-j;
	}

	/**
	 * 乘运算
	 */
	public int take(int i, int j) {
		return i*j;
	}

	/**
	 * 除运算
	 */
	public int div(int i, int j) {
		return i/j;
	}

}
