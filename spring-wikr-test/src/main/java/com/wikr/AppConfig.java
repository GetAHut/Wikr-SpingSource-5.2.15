package com.wikr;

import com.wikr.aop.User;
import com.wikr.entities.WikrService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.wikr")
public class AppConfig {

	/**
	 * Spring自带的属性注入方式， （已经过时。）
	 * @return
	 */
	@Bean(autowire = Autowire.BY_TYPE)
	public WikrService wikrService(){
		return new WikrService();
	}

//	@Bean(autowireCandidate = true)
//	public User user(){
//		return new User();
//	}
}
