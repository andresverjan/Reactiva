package com.co.bancolombia.activitylearn1.domain.collections;

import lombok.Data;

@Data
public class Person {

    private final String id;
    private final String firstName;
    private final String lastName;
    private final String phone;
    private final int age;
    private final String starSign;
}
