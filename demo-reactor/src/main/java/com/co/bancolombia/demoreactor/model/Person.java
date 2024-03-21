package com.co.bancolombia.demoreactor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private int age;
    private String starSign;
}
