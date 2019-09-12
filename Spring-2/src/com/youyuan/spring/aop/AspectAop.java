package com.youyuan.spring.aop;

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
 * 定义一个切面(@Aspect),切面类交由ioc容器管理(@Component)
 * @author zhangyu
 * @date 2018-3-28 下午3:30:30
 */
@Aspect
@Component
public class AspectAop {
	
	/**
	 * 切入点表达式(execution)重用
	 * 需要定义一个方法,方法体不需要编写代码
	 * 使用@Pointcut注解标记为切入点表达式方法
	 * 使用时通过全类名+切入点表达式方法名,如:@Before("com.youyuan.spring.aop.AspectAop.publicExecution()")
	 */
	@Pointcut("execution(* com.youyuan.spring.aop.*.*(..))")
	public void publicExecution(){
		
	}
	
	/**
	 * 标记为前置通知方法(@Before),execution用来表达指定切面影响的目标方法
	 * 在目标方法执行前执行
	 * @param joinPoint
	 */
	@Before("com.youyuan.spring.aop.AspectAop.publicExecution()")
	public void beforeMethod(JoinPoint joinPoint){//JoinPoint获取切面的信息封装对象
		Signature signature=joinPoint.getSignature();//切面对象
		String methodName=signature.getName();//方法名
		List<Object> argsList=Arrays.asList(joinPoint.getArgs());//请求参数
		System.out.println(methodName+"方法的前置通知,参数"+argsList);
	}
	
	/**
	 * 标记为后置通知方法(@After),execution用来表达指定切面影响的目标方法
	 * 在目标方法执行后执行(无论是否发生异常都会执行,类似于finally代码内容)
	 * @param joinPoint
	 */
	@After("com.youyuan.spring.aop.AspectAop.publicExecution()")
	public void afterMethod(JoinPoint joinPoint){//JoinPoint切面的代理对象
		String methodName=joinPoint.getSignature().getName();//获取目标方法名
		List<Object> paramList=Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+"方法的后置通知,参数"+paramList);
	}
	
	/**
	 * 标记为返回通知(@AfterReturning),execution用来表达影响的目标方法
	 * 返回通知可以拿到目标方法执行的返回结果
	 * value:代表execution表达式 表示影响的目标方法
	 * returning:返回结果赋值的变量名
	 * @param joinPoint
	 */
	@AfterReturning(value="execution(* com.youyuan.spring.aop.*.*(..))",returning="result")
	public void afterReturningMethod(JoinPoint joinPoint,Object result){
		String methodName=joinPoint.getSignature().getName();
		List<Object> paramList=Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+"方法的返回通知,参数"+paramList+"目标方法执行的返回结果"+result);
	}
	
	/**
	 * 标记异常通知(@AfterThrowing),execution表达式用于影响执行的目标方法
	 * 只有目标方法执行过程中出现异常才会执行
	 * @param joinPoint
	 */
	@AfterThrowing(value="execution(* com.youyuan.spring.aop.*.*(..))",throwing="e")
	public void afterThrowingMethod(JoinPoint joinPoint,Object e){
		String methodName=joinPoint.getSignature().getName();
		List<Object> paramList=Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+"方法的异常通知,paramList"+paramList+",异常"+e);	
	}
	
	/**
	 * 标记环绕通知(@Around),包含前置通知、后置通知、返回通知、异常通知
	 * @param joinPoint
	 *//*
	@Around("execution(* com.youyuan.spring.aop.*.*(..))")
	public void aroundMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> paramList=Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+"的环绕通知,paramList"+paramList);
	}*/
}
