package com.wikr;

import com.wikr.entities.UserService;
import com.wikr.entities.WikrService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
public interface AppInterface {


	/**
	 * 这也可以成为一个Bean
	 * @return
	 */
//	@Bean
	default UserService userService(){
		return new UserService();
	}

}
