package com.tampelin.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tampelini.model.Person;
import com.tampelini.services.PersonServices;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

	PersonServices service = new PersonServices();
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable(value = "id") String id) {
		
		
		return service.findById(id);
	}
	
	
}
