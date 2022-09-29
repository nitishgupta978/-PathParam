package com.spicedemo.api_test_demo.service;

import com.spicedemo.api_test_demo.dto.PersonDataDto;
import com.spicedemo.api_test_demo.entity.Person;
import com.spicedemo.api_test_demo.repositry.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PersonService implements IPersonService {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public List<Person> getPersonDataAll() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonDataById(int personId) {
        return personRepository.findById(personId).get();
    }

    @Override
    public Person createPersonData(PersonDataDto personDataDto) {
        Person perData= null;
        perData= new Person(personDataDto);
        log.debug("personData "+perData.toString());
        return personRepository.save(perData);
    }
}
