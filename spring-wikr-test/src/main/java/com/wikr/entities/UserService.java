package com.wikr.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: xyt
 * @Date: 2022/2/9 11:04
 * @version: 1.0.0
 */
@Component
public class UserService {

	@Autowired
	private OrderService orderService;

}
