package com.example.demoTest.model;

import lombok.*;


@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    @NonNull
    private String email;
    private Integer age;
}
