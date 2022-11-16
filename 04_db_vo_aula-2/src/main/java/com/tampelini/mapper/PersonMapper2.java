package com.tampelini.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tampelini.data.vo.v2.PersonVO2;
import com.tampelini.model.Person;

@Service
public class PersonMapper2 {

	
	public PersonVO2 convertEntityToVO(Person person) {
		
		PersonVO2 vo = new PersonVO2();
		
		vo.setId(person.getId());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setAddress(person.getAddress());
		vo.setGender(person.getGender());
		
		
		return vo;
	}
	
	public List<PersonVO2> convertEntityToVO(List<Person> person) {
		
		List<PersonVO2> personsVOs = new ArrayList<>();
		
		for(Person p : person) {
			PersonVO2 vo = new PersonVO2();
			
			vo.setId(p.getId());
			vo.setFirstName(p.getFirstName());
			vo.setLastName(p.getLastName());
			vo.setAddress(p.getAddress());
			vo.setGender(p.getGender());
			
			personsVOs.add(vo);
		}
		
		return personsVOs;
	}
	
	public Person convertVoToEntity(PersonVO2  vo) {
		
		Person person = new Person();
		
		person.setId(vo.getId());
		person.setFirstName(vo.getFirstName());
		person.setLastName(vo.getLastName());
		person.setAddress(vo.getAddress());
		person.setGender(vo.getGender());
		
		return person;
	}	
}
