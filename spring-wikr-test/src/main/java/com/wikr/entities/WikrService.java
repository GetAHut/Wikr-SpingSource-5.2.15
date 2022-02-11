package com.wikr.entities;

import com.wikr.aop.User;

/**
 * @Author: xyt
 * @Date: 2022/2/11 12:11
 * @version: 1.0.0
 */
public class WikrService {

	private User user;

	public void test(){
		System.out.println("test");
	}

	/*
	 * 在AppClass中 设置@Bean。
	 *
	 * 实例中两个set方法。 一个属性 不包括默认属性 class
	 *  在属性自动注入中会扫出两个set方法， 解析出两个属性值。
	 *  1. user
	 *  2. user1123
	 */

	public void setUser(User user) {
		this.user = user;
		System.out.println(" user ");
	}

	public void setUser1123(User user){
		System.out.println(" user1123 ");
	}
}
