//package com.example.library2023oxiri.controller;
//
//import com.example.library2023oxiri.model.Book;
//import com.example.library2023oxiri.service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/book")
//public class BookController {
//    @Autowired
//    private BookService bookService;
//
//    @PostMapping
//    public String create(@RequestBody Book book){
//        boolean b = bookService.create(book);
//        if (b){
//            return "add book";
//        }
//        return "not found add book";
//    }
//
//    @GetMapping
//    public List<Book> reads(){
//        List<Book> reads = bookService.reads();
//        return reads;
//    }
//
//    @GetMapping("/{id}")
//    public Book read(@PathVariable Integer id){
//        Book read = bookService.read(id);
//        return read;
//    }
//
//    @PutMapping("/{id}")
//    public String edit(@PathVariable Integer id,@RequestBody Book book){
//        boolean edit = bookService.edit(id, book);
//        if (edit){
//            return "edit book";
//        }
//        return "not found edit book";
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable Integer id){
//        boolean delete = bookService.delete(id);
//        if (delete){
//            return "delete book";
//        }
//        return "not found deleted book";
//    }
//
//}
