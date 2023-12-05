package com.ednaldojunior.apiRest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ednaldojunior.apiRest.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {

}