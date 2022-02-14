package com.wikr;

import com.wikr.aop.User;
import com.wikr.beanFactoryPostProcessor.WikrBeanFactoryPostProcessor;
import com.wikr.entities.OrderService;
import com.wikr.entities.UserService;
import com.wikr.entities.Wikr;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContextApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//		Wikr wikr = (Wikr) context.getBean("wikr");
//		OrderService bean = context.getBean(OrderService.class);
//		System.out.println(wikr);
//		context.register(AppConfig.class);
		// Meta- 手动给context设置自定义的beanFactoryPostProcessor
//		context.addBeanFactoryPostProcessor(new WikrBeanFactoryPostProcessor());
		User bean = context.getBean(User.class);
		bean.test();
		// 获取beanDefinition
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition()
				.getBeanDefinition();
		beanDefinition.setBeanClass(User.class);
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(new Object());
		beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(1, new Object());
		// 注册beanDefinition
		context.registerBeanDefinition("user", beanDefinition);
//
//		// Meta- 容器销毁方法。
//		context.close();

		UserService userService = (UserService) context.getBean("userService");
		OrderService orderService = (OrderService) context.getBean("orderService");
		userService.test();
		orderService.test();

	}
}
