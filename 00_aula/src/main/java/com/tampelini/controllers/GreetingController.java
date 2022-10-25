package com.tampelini.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tampelini.model.Greeting;

@RestController
public class GreetingController {

	private static final String template = " : Hellow, %s";
	private final AtomicLong counter = new AtomicLong(); 
	
	@RequestMapping("/greeting")	
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "somebody	") String name) {
	
		return new Greeting(String.format(template, name), counter.incrementAndGet());
	}
	
}
