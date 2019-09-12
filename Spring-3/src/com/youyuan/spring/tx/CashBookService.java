package com.youyuan.spring.tx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.youyuan.spring.tx.dao.execution.AccountException;

/**
 * 测试事务的传播行为
 * @author zhangyu
 * @date 2018-3-30 下午5:07:03
 */
@Service
public class CashBookService {
	
	@Autowired
	private AccountBookService accountBookService;
	
	/**
	 * 测试事务的传播行为,事务传播行为用Propagation中的常量标记
	 * 事务的传播行为:一个标记事务的方法调用另外一个标记事务的方法就存在事务的传播行为问题,默认使用一个事务
	 * 事务传播行为分为七类:
	 * 		Propagation.REQUIRES:默认的事务行为,使用原事务,原方法里面的操作都在一个事务里面
	 * 		Propagation.REQUIRES_NEW:使用一个新事务原事务被挂起,在调用另外的事务方法时创建一个新事务,被调用的方法里面的操作都在一个事务
	 * 事务的隔离级别,共五种   默认isolation=READ_COMMITTED(读已提交的)
	 * noRollbackFor:事务不回滚,指定遇到某个类时不回滚
	 * timeout:事务的执行时间单位秒,超过此时间事务回滚
	 * @param userId
	 * @param bookIdList
	 */
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.READ_COMMITTED,noRollbackFor=AccountException.class,timeout=2)
	public void update(Long userId,List<String> bookIdList){
		for(String bookId:bookIdList){
			accountBookService.update(userId,bookId);
		}
	}

}
