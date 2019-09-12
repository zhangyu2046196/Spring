package com.youyuan.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过静态工厂方法配置bean,就是调用一个静态类的静态方法,返回bean的实例对象
 * @author zhangyu
 * @date 2018-3-26 下午5:22:01
 */
public class StaticCarFactory {
	
	private static Map<String, Car> carMap=new HashMap<String, Car>();
	
	static{
		carMap.put("baoma", new Car("宝马", 420000, 230));
		carMap.put("bieke", new Car("别克", 300000, 220));	
	}
	
	/**
	 * 静态方法获取bean实例
	 * @param carName
	 * @return
	 */
	public static Car getCar(String carName){
		return carMap.get(carName);
	}

}
