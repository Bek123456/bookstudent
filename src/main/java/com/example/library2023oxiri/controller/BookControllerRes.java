package com.example.library2023oxiri.controller;

import com.example.library2023oxiri.model.Book;
import com.example.library2023oxiri.service.BookServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookControllerRes {
    @Autowired
    private BookServiceResponse bookServiceResponse;
    @GetMapping
    public ResponseEntity<List<Book>>reads(){
        List<Book> reads = bookServiceResponse.reads();
        return ResponseEntity.ok(reads);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?>get(@PathVariable Integer id){
        Book book = bookServiceResponse.get(id);
        return ResponseEntity.ok(book);
    }
   @PostMapping
    public ResponseEntity<?>create(@RequestBody Book book){
        return ResponseEntity.ok(bookServiceResponse.create(book));
   }
   @PutMapping("/{id}")
    public ResponseEntity<?>edit(@PathVariable Integer id,@RequestBody Book book){
       String edit= bookServiceResponse.edit(id,book);
       return ResponseEntity.ok(edit);
   }
   @DeleteMapping("/{id}")
    public ResponseEntity<?>deleted(@PathVariable Integer id){
       String delete=bookServiceResponse.deleted(id);
       return ResponseEntity.ok(delete);
   }

   ///filter
    @GetMapping("/searche")
    public ResponseEntity<?>getName(@RequestParam(value = "name") String name){
        List<Book> name1 = bookServiceResponse.getName(name);
        return ResponseEntity.ok(name1);
    }

    @GetMapping("/searche/{name}")
    public ResponseEntity<?>searce(@PathVariable String name){
        List<Book> serache = bookServiceResponse.serache(name);
        return ResponseEntity.ok(serache);
    }


}
