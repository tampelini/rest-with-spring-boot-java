package com.tampelini.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tampelini.model.Person;

@Repository
public interface PersonRepositorie extends JpaRepository<Person, Long>{}
