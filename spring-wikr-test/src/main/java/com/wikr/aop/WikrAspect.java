package com.wikr.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: xyt
 * @Date: 2022/2/9 16:45
 * @version: 1.0.0
 */
@Component
@Aspect
public class WikrAspect {

	@Before("execution(public void com.wikr.aop.User.test())")
	public void aspect(JoinPoint joinPoint){
		System.out.println("aspect called!");
	}
}
