package com.wikr.entities;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: xyt
 * @Date: 2022/2/9 11:04
 * @version: 1.0.0
 */
@Component
@Scope("prototype")
public class UserService {

	@Autowired
	private OrderService orderService;

	public void test(){
//		Object o = AopContext.currentProxy();
		System.out.println(orderService);
	}

}
