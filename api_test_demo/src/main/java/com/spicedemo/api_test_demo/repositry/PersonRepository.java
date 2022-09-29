package com.spicedemo.api_test_demo.repositry;

import com.spicedemo.api_test_demo.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
}
