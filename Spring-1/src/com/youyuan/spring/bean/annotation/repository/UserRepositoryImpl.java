package com.youyuan.spring.bean.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * spring的bean注解  repository 用于标注持久层
 * @author zhangyu
 * @date 2018-3-26 下午9:28:16
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

}
