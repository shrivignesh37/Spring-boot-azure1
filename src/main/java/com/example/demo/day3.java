package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/path")
@RestController
public class day3 {

	@GetMapping("/shri")
	public String Name()
	{
		return "hi shrivignesh ";
	}
}
