package com.example.library2023oxiri.service;

import com.example.library2023oxiri.extion.AppExtion;
import com.example.library2023oxiri.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Service
public class StudentServiceRes {
    private final List<Student>studentList=new LinkedList<>();
    public StudentServiceRes() {
        Student student=new Student();
        student.setId(studentList.size()+1);
        student.setPhone("789456");
        student.setSurname("Salim");
        student.setName("Vali");
        student.setCreatedDate(LocalDateTime.now());
        studentList.add(student);

        Student student1=new Student();
        student1.setId(studentList.size()+1);
        student1.setPhone("78");
        student1.setSurname("Salima");
        student1.setName("Vali1");
        student1.setCreatedDate(LocalDateTime.now());
        studentList.add(student1);
    }

    public List<Student> reads() {
         return studentList;
    }

    public Student get(Integer id) {
       for (Student student:studentList){
           if (student.getId().equals(id)){
               return student;
           }
       }
       throw new AppExtion("topilmadi");
    }

    public String create(Student student) {
        boolean add = studentList.add(student);
        if (add){
            return "Add Student";
        }
        return "not found add student";
    }

    public String edit(Integer id, Student student) {
        for (Student student1:studentList){
            if (student1.getId().equals(id)){
                student1.setSurname(student.getSurname());
                student1.setName(student.getName());
                student1.setPhone(student.getPhone());
                return "edit Student";
            }
        }
      return "not found edit student";
    }
}
