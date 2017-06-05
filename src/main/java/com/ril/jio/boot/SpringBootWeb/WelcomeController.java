package com.ril.jio.boot.SpringBootWeb;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	private String message = "Hello World";
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		System.out.println("/");
		return "Hello";
	}
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("/test");
		return "Test";
	}
}
