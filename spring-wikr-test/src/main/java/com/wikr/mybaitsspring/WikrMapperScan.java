package com.wikr.mybaitsspring;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: xyt
 * @Date: 2022/2/15 12:47
 * @version: 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(WikrImportBeanDefinitionRegistrar.class)
public @interface WikrMapperScan {

	String value();
}
