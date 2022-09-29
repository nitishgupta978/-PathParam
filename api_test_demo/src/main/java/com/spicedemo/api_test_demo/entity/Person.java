package com.spicedemo.api_test_demo.entity;

import com.spicedemo.api_test_demo.dto.PersonDataDto;
import com.spicedemo.api_test_demo.dto.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "person_details")
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private int userId;
    private String name;
    private String number;

    public Person(PersonDataDto responseDto) {
        this.userId = responseDto.userId;
        this.name =responseDto. name;
        this.number =responseDto. number;
    }
}
