package com.youyuan.spring.bean.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * 通过FactoryBean方式配置bean,需要实现FactoryBean接口,接口泛型指定是哪个bean的工厂
 * @author zhangyu
 * @date 2018-3-26 下午5:59:52
 */
public class CarBeanFactory implements FactoryBean<Car> {
	
	private String carName;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	/**
	 * 返回获取的bean
	 */
	public Car getObject() throws Exception {
		return new Car(carName, 390000, 260);
	}

	/**
	 * 返回bean的类型
	 */
	public Class<Car> getObjectType() {
		
		return null;
	}

	/**
	 * 判断bean是否是单例
	 */
	public boolean isSingleton() {

		return false;
	}

}
