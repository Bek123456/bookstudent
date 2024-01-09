package com.example.library2023oxiri.controller;

import com.example.library2023oxiri.extion.AppExtion;
import com.example.library2023oxiri.model.Student;
import com.example.library2023oxiri.service.StudentServiceRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControllerRes {
    @Autowired
    private StudentServiceRes studentServiceRes;


    @GetMapping
    public ResponseEntity<?>reads(){
        List<Student> reads = studentServiceRes.reads();
        return ResponseEntity.ok(reads);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?>get(@PathVariable Integer id){
        Student student = studentServiceRes.get(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<?>create(@RequestBody Student student){
        String s = studentServiceRes.create(student);
        return ResponseEntity.ok(s);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?>edit(@PathVariable Integer id,@RequestBody Student student){
        String edit = studentServiceRes.edit(id, student);
        return ResponseEntity.ok(edit);
    }
    @DeleteMapping("/{id}")
}
