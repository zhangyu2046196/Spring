package com.youyuan.spring.aop.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;

/**
 * 基于xml方式配置spring aop 切面优先级
 * @author zhangyu
 * @date 2018-3-29 下午4:22:12
 */
public class AspectAopOrder {

	public void beforeMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> paramList=Arrays.asList(joinPoint.getArgs());
		System.out.println("切面优先级"+methodName+"方法验证切面优先级  paramList"+paramList);
	}
}
