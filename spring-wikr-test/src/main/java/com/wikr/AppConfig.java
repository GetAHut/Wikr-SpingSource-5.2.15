package com.wikr;

import com.wikr.aop.User;
import com.wikr.entities.WikrService;
import com.wikr.mybaitsspring.WikrMapperScan;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
// Meta- 开启AOP  通过@Import注册了一个BeanPostProcessor
@EnableAspectJAutoProxy
//@ComponentScan("com.wikr")
//@EnableAsync
@WikrMapperScan("com.wikr.mapper")
@EnableTransactionManagement
public class AppConfig  {

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
