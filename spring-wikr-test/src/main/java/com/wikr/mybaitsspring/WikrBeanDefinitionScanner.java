package com.wikr.mybaitsspring;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

import java.util.Set;

/**
 * @Author: xyt
 * @Date: 2022/2/15 17:46
 * @version: 1.0.0
 */
public class WikrBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

	public WikrBeanDefinitionScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	@Override
	protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
		// Meta- 先调用父类扫描方法
		Set<BeanDefinitionHolder> beanDefinitionHolders = super.doScan(basePackages);

		for (BeanDefinitionHolder holder : beanDefinitionHolders) {
			BeanDefinition beanDefinition = holder.getBeanDefinition();
			// Meta- 设置构造器参数值
			beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClassName());
			// Meta- 设置beanDefinition class类型为FactoryBean
//			beanDefinition.setBeanClassName(WikrFactoryBean.class.getName());
		}

		return beanDefinitionHolders;
	}

	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		// Meta- 这里只需要扫描是接口的
		return beanDefinition.getMetadata().isInterface();
	}
}
