//package com.example.library2023oxiri.controller;
//
//import com.example.library2023oxiri.model.Student;
//import com.example.library2023oxiri.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/student")
//public class StudentController {
//    @Autowired
//    private StudentService studentService;
//    //get
//    @PostMapping
//    public String creted(@RequestBody Student student){
//        boolean b = studentService.create(student);
//        if (b){
//            return "Add student";
//        }
//        return "not add";
//    }
//        ////////////////
//    @GetMapping
//    public List<Student> reads(){
//        List<Student> reads = studentService.reads();
//        return reads;
//    }
//
//    //////////////////////
//    @GetMapping("/{id}")
//    public Student read(@PathVariable Integer id){
//        Student read = studentService.read(id);
//        return read;
//    }
//   ////////////
//    @PutMapping("/{id}")
//    public String edit(@PathVariable Integer id,@RequestBody Student student){
//        boolean edit = studentService.edit(id, student);
//        if (edit){
//            return "edit Student";
//        }
//        return "not found edit Student";
//    }
//
//    //////////////
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable Integer id){
//        boolean delete = studentService.delete(id);
//        if (delete){
//            return "student delete";
//        }
//        return "not found delete student";
//    }
//}
