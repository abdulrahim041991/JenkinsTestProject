package com.example.JenkinsTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value = "/SayHello" , method = RequestMethod.GET)
	public String SayHello() {
		return "Hello Jenkins 3";
	}
}
