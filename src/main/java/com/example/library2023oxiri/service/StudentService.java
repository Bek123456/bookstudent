package com.example.library2023oxiri.service;

import com.example.library2023oxiri.model.Student;
import com.example.library2023oxiri.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentService {

    public boolean create(Student student) {
           student.setId(StudentRepository.studentList.size()+1);
           student.setCreatedDate(LocalDateTime.now());
           StudentRepository.studentList.add(student);
           return true;
    }

    public List<Student> reads() {
        List<Student> studentList = StudentRepository.studentList;
        return studentList;
    }

    public Student read(Integer id) {
        for (Student student:StudentRepository.studentList){
             if (student.getId().equals(id)){
                 return student;
             }
        }
        return new Student();
    }

    public boolean edit(Integer id, Student student) {
        for (Student student1:StudentRepository.studentList){
            if (student1.getId().equals(id)){
                student1.setName(student.getName());
                student1.setPhone(student.getPhone());
                student1.setSurname(student.getSurname());
                return true;
            }
        }
        return false;
    }

    public boolean delete(Integer id) {
        for (Student student:StudentRepository.studentList){
            if (student.getId().equals(id)){
                StudentRepository.studentList.remove(student);
                return true;
            }
        }
        return false;
    }
}
