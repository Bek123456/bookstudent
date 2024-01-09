package com.example.library2023oxiri.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class Student {
    private Integer id;
    private String name;
    private String surname;
    private String phone;
    private LocalDateTime createdDate;
}
