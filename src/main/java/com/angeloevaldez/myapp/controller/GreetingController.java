package com.angeloevaldez.myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angeloevaldez.myapp.pojo.Greet;

@RestController
public class GreetingController {
	@RequestMapping("/")
	Greet greet() {
		return new Greet("Hello World!");
	}
}
