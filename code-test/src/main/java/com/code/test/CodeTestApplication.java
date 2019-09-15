package com.code.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.code.test")
public class CodeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeTestApplication.class, args);
	}

}
