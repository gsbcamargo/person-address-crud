package com.wipro.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.crud.models.Person;

public interface PersonRepository extends JpaRepository<Person, String> {



}
