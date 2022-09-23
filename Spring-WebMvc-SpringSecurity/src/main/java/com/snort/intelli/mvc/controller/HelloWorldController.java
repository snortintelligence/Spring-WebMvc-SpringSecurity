package com.snort.intelli.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "hello-world"; //returning web page
	}
	
	@ResponseBody
	@GetMapping("/greeting")
	public String textMessage() {
		return "Hi there!"; //returning text body
	}
	
	@ResponseBody
	@GetMapping("/bye")
	public String byeMssage() {
		return "See you later!"; //returning text body
	}
	
	
	
}
