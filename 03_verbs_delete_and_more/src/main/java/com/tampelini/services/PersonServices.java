package com.tampelini.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.tampelini.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List<Person>	 findAll() {
		List<Person> persons = new ArrayList<>();
		
		for(int i=0; i<8; i++) {
			Person person = mokPerson(i);
			persons.add(person);
		}
		
		return persons;
	}
	
	private Person mokPerson(int i) {
		
		logger.info("MOCK Finding all people!");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName(i + " Person");
		person.setLastName("Name");
		person.setGender("Male");
		person.setAddress("Some Adress");
		
		return person;
	}
	
	
	public Person create(Person person) {
		logger.info("Creating one person!");
		// here we will access the database		
		return person;
	}

	public Person update(Person person) {
		logger.info("Updating one person!");
		// here we will access the database
		return person;
	}
	
	public Person findById(String id) {
		logger.info("Finding one person!");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Leonardo");
		person.setLastName("Tampelini");
		person.setGender("Male");
		person.setAddress("Rua Voluntários da Pátria, Cascavel-Pr");
		
		return person;
	}

	public void delete(String id) {
		logger.info("Deleting one person");
	}
	
}
