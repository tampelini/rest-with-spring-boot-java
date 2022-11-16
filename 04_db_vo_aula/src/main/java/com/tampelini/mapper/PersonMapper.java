package com.tampelini.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tampelini.model.Person;
import com.tampleini.data.vo.v1.PersonVO;

@Service
public class PersonMapper {
	
	public PersonVO convertEntityToVo(Person person) {
		PersonVO vo = new PersonVO();
		vo.setId(person.getId());
		vo.setAddress(person.getAddress());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setGender(person.getGender());
		
		return vo;
	}
	
	public  List<PersonVO>  convertEntityToVo(List<Person> persons) {
		
		List<PersonVO> personsVO = new ArrayList<>();
		
		for(Person p : persons) {
			PersonVO vo = new PersonVO();
			vo.setId(p.getId());
			vo.setAddress(p.getAddress());
			vo.setFirstName(p.getFirstName());
			vo.setLastName(p.getLastName());
			vo.setGender(p.getGender());
		
			personsVO.add(vo);
		}
		
		return personsVO;
	}
	
	public Person convertVoToEntity(PersonVO vo) {
		
		Person person = new Person();
		person.setId(vo.getId());
		person.setAddress(vo.getAddress());
		person.setFirstName(vo.getFirstName());
		person.setLastName(vo.getLastName());
		person.setGender(vo.getGender());
		
		return person;
	}
}


