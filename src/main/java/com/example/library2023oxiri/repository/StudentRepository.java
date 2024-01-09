package com.example.library2023oxiri.repository;

import com.example.library2023oxiri.model.Student;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class StudentRepository {
    public static List<Student>studentList=new LinkedList<>();


}
