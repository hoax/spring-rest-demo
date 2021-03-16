package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot! @" + LocalDateTime.now() +"\n";
	}
	
}
