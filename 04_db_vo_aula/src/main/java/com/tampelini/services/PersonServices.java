package com.tampelini.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tampelini.exceptions.ResourceNotFoundException;
import com.tampelini.mapper.PersonMapper;
import com.tampelini.model.Person;
import com.tampelini.repositories.PersonRepository;
import com.tampleini.data.vo.v1.PersonVO;

@Service
public class PersonServices {
	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	@Autowired
	PersonMapper mapper;

	public List<PersonVO> findAll() {
		logger.info("Finding all people!");
		
		return mapper.convertEntityToVo(repository.findAll());
	}

	public PersonVO findById(Long id) {
		logger.info("Finding one person!");
		return mapper.convertEntityToVo(repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!")));
	}
	
	public PersonVO create(PersonVO person) {

		logger.info("Creating one person!");
		
		return mapper.convertEntityToVo(repository.save(mapper.convertVoToEntity(person)));
	}
	
	public PersonVO update(PersonVO person) {
		
		logger.info("Updating one person!");
		
		var entity = repository.findById(person.getId())
			.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		return mapper.convertEntityToVo(repository.save(mapper.convertVoToEntity(person)));
	}
	
	public void delete(Long id) {
		
		logger.info("Deleting one person!");
		
		Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		repository.delete(entity);
	}
}

