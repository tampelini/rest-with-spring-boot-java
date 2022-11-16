package com.tampelini.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tampelini.data.vo.v1.PersonVO;
import com.tampelini.model.Person;

@Service
public class PersonMapper {

	
	public PersonVO convertEntityToVO(Person person) {
		
		PersonVO vo = new PersonVO();
		
		vo.setId(person.getId());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setAddress(person.getAddress());
		vo.setGender(person.getGender());
		
		
		return vo;
	}
	
	public List<PersonVO> convertEntityToVO(List<Person> person) {
		
		List<PersonVO> personsVOs = new ArrayList<>();
		
		for(Person p : person) {
			PersonVO vo = new PersonVO();
			
			vo.setId(p.getId());
			vo.setFirstName(p.getFirstName());
			vo.setLastName(p.getLastName());
			vo.setAddress(p.getAddress());
			vo.setGender(p.getGender());
			
			personsVOs.add(vo);
		}
		
		return personsVOs;
	}
	
	public Person convertVoToEntity(PersonVO  vo) {
		
		Person person = new Person();
		
		person.setId(vo.getId());
		person.setFirstName(vo.getFirstName());
		person.setLastName(vo.getLastName());
		person.setAddress(vo.getAddress());
		person.setGender(vo.getGender());
		
		return person;
	}	
}
