package com.demo.test.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * helloworld springboot
 * @author gwl
 * @data 2018年5月8日
 */
@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello,world!";
	}
}
