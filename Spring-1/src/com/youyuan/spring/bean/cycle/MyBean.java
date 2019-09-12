package com.youyuan.spring.bean.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean的后置处理器
 * @author zhangyu
 * @date 2018-3-26 下午3:57:50
 */
public class MyBean implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		if(beanName.endsWith("car")){
			Car car=(Car) bean;
			car.setCarName("大众");
		}
		System.out.println("bean的后置处理器"+bean);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("bean的前置处理器"+bean);
		return bean;
	}

}
