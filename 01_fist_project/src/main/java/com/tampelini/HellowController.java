package com.tampelini;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

	
	@RequestMapping("/hellow")
	public String helloWord(@RequestParam(value ="name", defaultValue = "'nobody") String name) {
		return "Hellow Word " + name + "!";
	}
	
	@GetMapping("/person")
	public Person helloPerson(@RequestParam(value ="name", defaultValue = "'nobody") String name) {
		Person aux = new Person();
		
		//aux.setName(name);
		//aux.setAge(null);
		
		return aux;
	}
	
}
