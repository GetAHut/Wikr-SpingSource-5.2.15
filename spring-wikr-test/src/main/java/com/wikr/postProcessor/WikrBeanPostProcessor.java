package com.wikr.postProcessor;

import com.wikr.entities.OrderService;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @Author: xyt
 * @Date: 2022/2/11 14:25
 * @version: 1.0.0
 */
public class WikrBeanPostProcessor implements MergedBeanDefinitionPostProcessor {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		if ("user".equals(beanName)){
			// Meta- 此处的orderService 会覆盖bean中加了@Autowired的属性OrderService
			OrderService orderService = new OrderService();
			beanDefinition.getPropertyValues().addPropertyValue("orderService", orderService);
		}
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
	}
}
