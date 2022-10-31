package com.tampelini.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.tampelini.model.Person;

import ch.qos.logback.classic.joran.action.LoggerAction;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	
	private Person mockPerson() {
		
		Person person = new Person();
		person.setId(1L);
		person.setFirstName("Leonardo");
		person.setLastName("Tampelini");
		person.setAddress("Rua");
		person.setGender("Male");
		
		return person;
	}
	
	
	public Person findById(String id) {
		
		logger.info("Finding one person");
		
		return mockPerson();
	}
	
	
		
}
