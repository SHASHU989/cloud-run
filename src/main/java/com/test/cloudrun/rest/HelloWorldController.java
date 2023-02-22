package com.test.cloudrun.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

	@GetMapping("say-hello")
	public String sayHello()
	{
		return "Welcome to coud run..........";
	}
	
}
