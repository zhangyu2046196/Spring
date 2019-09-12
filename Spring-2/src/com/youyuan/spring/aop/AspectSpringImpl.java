package com.youyuan.spring.aop;

import org.springframework.stereotype.Component;

/**
 * 测试spring aop接口
 * @author zhangyu
 * @date 2018-3-28 下午3:08:25
 */
@Component("aspectSpring")
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
