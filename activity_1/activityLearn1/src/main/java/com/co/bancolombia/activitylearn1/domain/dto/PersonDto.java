package com.co.bancolombia.activitylearn1.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {

    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private int age;
    private String starSign;


}
