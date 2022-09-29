package com.spicedemo.api_test_demo.controller;

import com.spicedemo.api_test_demo.dto.PersonDataDto;
import com.spicedemo.api_test_demo.dto.ResponseDto;
import com.spicedemo.api_test_demo.entity.Person;
import com.spicedemo.api_test_demo.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("spice")
public class PersonController {
    @Autowired
    private IPersonService service;
    @GetMapping("/get/{Id}")
    public ResponseEntity<ResponseDto>getPersonDataById (@PathVariable ("Id") int personId, @PathParam("value")String value){
        Person persondata = null;
        System.out.println("gfzhfz "+value);
        persondata= service.getPersonDataById(personId);
        ResponseDto responseDTO = new ResponseDto("Get call for addId Successful!",persondata);
        return new ResponseEntity<ResponseDto>(responseDTO,HttpStatus.OK);
        /**
         * Method:Using @GetMapping("/get/{addId}") to get the by particular addId data
         * return: only addId data
         * using service layer
         */
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseDto> getPersonData(){
        List<Person> personDataList=null;
        personDataList=service.getPersonDataAll();
        ResponseDto responseDto = new ResponseDto("Get Call Successful ",personDataList);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDto>createPersonData( @RequestBody PersonDataDto personDataDto){
        log.debug("Person Dto ",personDataDto.toString());
        Person personData=null;
        personData=service.createPersonData(personDataDto);
        ResponseDto responseDto= new ResponseDto("Create Person Data Successfully !",personData);
        return new ResponseEntity<>(responseDto,HttpStatus.OK);

    }
}
