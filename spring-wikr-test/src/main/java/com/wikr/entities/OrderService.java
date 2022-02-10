package com.wikr.entities;

import org.springframework.stereotype.Component;

/**
 * @Author: xyt
 * @Date: 2022/2/9 11:04
 * @version: 1.0.0
 */
@Component
public class OrderService {

	private UserService userService;

	/**
	 *  spring 构建bean 如果有多个构造方法， 会使用默认的无参构造器
	 *  如果只有一个 则用其， 若有多个构造器且没有无参构造器 则会报错。
	 */
	public OrderService(){
		System.out.println("1");
	}

	public OrderService(UserService userService){
		this.userService = userService;
		System.out.println("2");
	}

	public OrderService(UserService userService, UserService userService1){
		this.userService = userService;
		System.out.println("2");
	}

}
