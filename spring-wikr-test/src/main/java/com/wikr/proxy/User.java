package com.wikr.proxy;

import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.PreDestroy;

/**
 * @Author: xyt
 * @Date: 2022/2/15 18:38
 * @version: 1.0.0
 */
public class User {

	public void test(){
//		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		System.out.println("test");
	}
}
