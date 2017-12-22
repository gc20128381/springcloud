package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;

@RestController
@EnableAutoConfiguration
public class Example {

	@Value("${name}")
	public String username;
	
	@RequestMapping
	String home(){
		return username;
	}
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Example.class);
	    app.setBannerMode(Banner.Mode.OFF);
	    app.run(args);
		// SpringApplication.run(Example.class, args);
	}
}
