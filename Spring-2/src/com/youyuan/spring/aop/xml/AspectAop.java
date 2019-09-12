package com.youyuan.spring.aop.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 基于xml方式配置一个切面
 * @author zhangyu
 * @date 2018-3-28 下午3:30:30
 */
public class AspectAop {
	
	
	/**
	 * 前置通知
	 * @param joinPoint
	 */
	public void beforeMethod(JoinPoint joinPoint){//JoinPoint获取切面的信息封装对象
		Signature signature=joinPoint.getSignature();//切面对象
		String methodName=signature.getName();//方法名
		List<Object> argsList=Arrays.asList(joinPoint.getArgs());//请求参数
		System.out.println(methodName+"方法的前置通知,参数"+argsList);
	}
	
	/**
	 * 后置通知
	 * @param joinPoint
	 */
	public void afterMethod(JoinPoint joinPoint){//JoinPoint切面的代理对象
		String methodName=joinPoint.getSignature().getName();//获取目标方法名
		List<Object> paramList=Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+"方法的后置通知,参数"+paramList);
	}
	
	/**
	 * 返回通知
	 * @param joinPoint
	 * @param result
	 */
	public void afterReturningMethod(JoinPoint joinPoint,Object result){
		String methodName=joinPoint.getSignature().getName();
		List<Object> paramList=Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+"方法的返回通知,参数"+paramList+"目标方法执行的返回结果"+result);
	}
	
	/**
	 * 异常通知
	 * @param joinPoint
	 * @param e
	 */
	public void afterThrowingMethod(JoinPoint joinPoint,Object e){
		String methodName=joinPoint.getSignature().getName();
		List<Object> paramList=Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+"方法的异常通知,paramList"+paramList+",异常"+e);	
	}
	
	/**
	 * 异常通知
	 * @param joinPoint
	 */
/*	public void aroundMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> paramList=Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+"的环绕通知,paramList"+paramList);
	}*/
}
