package com.tampelini;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "someone") String name) {
		
		return counter.incrementAndGet() + ": Hellow, " + name + "!";	
	}
	
}
