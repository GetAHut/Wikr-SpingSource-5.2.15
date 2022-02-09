package com.wikr.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wikr")
public class Wikr {

	private String name;

	@Autowired
	private Abby abby;
}
