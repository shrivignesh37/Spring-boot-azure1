package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
	
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, })
@Configuration
public class NallanameApplication {
	
	public static void main(String[] args) {
	    SpringApplication.run(NallanameApplication.class, args);
	}
}
