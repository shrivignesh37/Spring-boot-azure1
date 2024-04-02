package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String hello()
	{
		return "hi shri hi how are u hhhhh";
	}
	@GetMapping("/home")
	public String Homepage()
	{
		return "Homepage";
	}
	@GetMapping("/add")
	public int add()
	{
		int a=5;
		int b=10;
//		int c=a+b;
		return a+b;
	}
	@GetMapping("/add1/{a1}/{b1}")
	public int add1(@PathVariable int a1, @PathVariable int b1)
	{
		return a1*b1;
	}
	
}
