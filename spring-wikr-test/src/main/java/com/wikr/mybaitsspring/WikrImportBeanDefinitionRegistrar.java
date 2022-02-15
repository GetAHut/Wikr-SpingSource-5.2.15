package com.wikr.mybaitsspring;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Map;

/**
 * @Author: xyt
 * @Date: 2022/2/15 12:44
 * @version: 1.0.0
 */
public class WikrImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry,
										BeanNameGenerator importBeanNameGenerator) {
		// Meta- 获取自定义注解的path
		Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(WikrMapperScan.class.getName());
		String path = (String) annotationAttributes.get("value");
		System.out.println(path);
		Object annotationClass = annotationAttributes.get("annotationClass");
		System.out.println(annotationClass);
		// Meta- 扫描
		WikrBeanDefinitionScanner scanner = new WikrBeanDefinitionScanner(registry);
		// Meta- spring默认扫描 @Component注解
		// Meta- 取消限制 扫描所有 全部放行。
		scanner.addIncludeFilter(new TypeFilter() {
			@Override
			public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
				return true;
			}
		});

		scanner.doScan(path);

	}

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		ImportBeanDefinitionRegistrar.super.registerBeanDefinitions(importingClassMetadata, registry);
	}
}
