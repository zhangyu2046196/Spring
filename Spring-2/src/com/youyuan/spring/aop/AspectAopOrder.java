package com.youyuan.spring.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 切面级别(@Order(1), 值越小优先级越高)
 * 切面优先级有@Order()标识,括号里面的值越小优先级高
 * @author zhangyu
 * @date 2018-3-28 下午10:55:47
 */
@Order(1)
@Aspect
@Component
public class AspectAopOrder {

	@Before("execution(* com.youyuan.spring.aop.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> paramList=Arrays.asList(joinPoint.getArgs());
		System.out.println("切面优先级"+methodName+"方法验证切面优先级  paramList"+paramList);
	}
}
