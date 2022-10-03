package com.tampelini.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tampelini.exceptions.ResourceNotFoundException;
import com.tampelini.model.Person;
import com.tampelini.repositories.PersonRepositorie;


/*
 * serve para que o SpringBoot encare essa clase como um tipo objeto que será 
 * injetado em runtime em outras classes de nossa aplicação.
 * Na prática isso significa que ao invés de fazer um new quando precisar instanciar um objeto
 * o processo de instanciação será controlado pelo springboot
 */
@Service
public class PersonServices {

	private Logger logger  = Logger.getLogger(PersonServices.	class.getName());
	
	
	@Autowired
	PersonRepositorie repository;
	
	public List<Person> findAll() {
		logger.info("Finding all peaple!");
		return repository.findAll() ;
	}
	
	
	public Person create(Person person) {
		logger.info("Creating one person!");
		return repository.save(person);
	}
	
	public Person update(Person person) {
		logger.info("Updating one person!");
		
		var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));
		
		entity.setFirstName(person.getFirstName());
		entity.setGender(person.getGender());
		entity.setLastName(person.getLastName());
		entity.setAdress(person.getAdress());
		
		return entity;
	}

	public void delete(Long id) {
		logger.info("Delete one person!");
	
		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));
		
		repository.delete(entity);
	}

	public Person findById(Long Id) {
		logger.info("Finding one person!");		
		
		/*
		// codigo temporario de apoio
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Leonardo");
		person.setGender("Male");
		person.setLastName("Tampelini");
		person.setAdress("Toledo-Pr");
		
		return person;
		*/
		
		return repository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));
	}
	
	
}
