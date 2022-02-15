package com.wikr.proxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: xyt
 * @Date: 2022/2/15 18:38
 * @version: 1.0.0
 */
public class CglibProxyTest {

	public static void main(String[] args) {
		User target = new User();

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(User.class);
		enhancer.setCallbacks(new Callback[]{new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("before");
				// Meta- target为被代理对象  o则是cglib生成的代理对象UserProxy
				// Meta- cglib是以继承关系实现  target是o的父类
				// Meta- invoke这个传入的对象是被代理对象。 传入o 会死循环。
//				Object result = methodProxy.invoke(target, objects);

				// Meta- invokeSuper 传入的是代理对象UserProxy， 去调用父类的方法
				Object result = methodProxy.invokeSuper(o, objects);
				System.out.println("after");
				return result;
			}
		}});

		User user = (User) enhancer.create();
		user.test();
	}
}
