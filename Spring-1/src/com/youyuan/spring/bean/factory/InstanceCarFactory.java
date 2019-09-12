package com.youyuan.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法配置bean,调用实例工厂的方法获取bean实例
 * @author zhangyu
 * @date 2018-3-26 下午5:33:19
 */
public class InstanceCarFactory {
	
	private Map<String, Car> carMap=new HashMap<String, Car>();
	
	public InstanceCarFactory(){
		carMap.put("baoma", new Car("宝马", 420000, 230));
		carMap.put("bieke", new Car("别克", 300000, 220));
	}
	
	public Car getCar(String carName){
		return carMap.get(carName);
	}

}
