package com.spicedemo.api_test_demo.service;

import com.spicedemo.api_test_demo.dto.PersonDataDto;
import com.spicedemo.api_test_demo.entity.Person;

import java.util.List;

public interface IPersonService {
    List<Person> getPersonDataAll();
    Person getPersonDataById(int personId);
    Person createPersonData(PersonDataDto personDataDto);
}

