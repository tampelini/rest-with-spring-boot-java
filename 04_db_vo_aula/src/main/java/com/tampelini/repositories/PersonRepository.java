package com.tampelini.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tampelini.model.Person;
//import com.tampleini.data.vo.v1.PersonVO;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
