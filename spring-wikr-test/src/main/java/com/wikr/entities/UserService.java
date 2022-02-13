package com.wikr.entities;

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
		System.out.println(orderService);
	}

}
