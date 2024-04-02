package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day4 {
		@GetMapping("/day4")
		public String Name1()
		{
			return "hi shrivignesh ";
		}
	}
