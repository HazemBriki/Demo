package com.devoteam.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	// http://localhost:8081/greetings
	@ResponseBody
	@GetMapping("greetings")
	public String getCoachs() {
		return "Hello World";
	}

}
