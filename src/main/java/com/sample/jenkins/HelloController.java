package com.sample.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Jenkins";
	}

}
