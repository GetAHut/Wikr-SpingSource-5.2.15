package com.wikr;

import com.wikr.entities.Wikr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContextApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Wikr wikr = (Wikr) context.getBean("wikr");
		System.out.println(wikr);


	}
}
