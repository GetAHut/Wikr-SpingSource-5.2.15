package com.wikr.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: xyt
 * @Date: 2022/2/14 17:49
 * @version: 1.0.0
 */
@Component
public class WikrBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// Meta- 可以用来注册beanDefinition
		// Meta- 这个方法先执行
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		// Meta- 可以用来修改beanDefinition
		// Meta- 在上个方法后执行。
	}
}
