package com.example.library2023oxiri.service;

import com.example.library2023oxiri.extion.AppExtion;
import com.example.library2023oxiri.model.Book;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BookServiceResponse {

    private   final List<Book>books=new LinkedList<>();

    public BookServiceResponse() {
        Book book=new Book();
        book.setId(1);
        book.setTitle("ali");
        book.setAuthor("Ozod");
        book.setPublishYear("Yolgon");
        books.add(book);


        Book book1=new Book();
        book1.setId(2);
        book1.setTitle("vali");
        book1.setAuthor("Salim");
        book1.setPublishYear("Rost");
        books.add(book1);


        Book book2=new Book();
        book2.setId(3);
        book2.setTitle("Nazar");
        book2.setAuthor("Rahim");
        book2.setPublishYear("Buladi");
        books.add(book2);
    }

    public List<Book> reads() {
        return books;
    }

    public Book get(Integer id) {
        for (Book book:books){
            if (book.getId().equals(id)){
                return book;
            }
        }
        throw new AppExtion("topilmadi");
    }

    public List<Book> getName(String name) {
        List<Book>bookList=new LinkedList<>();
        for (Book book:books){
            if (book.getAuthor().toLowerCase().contains(name.toLowerCase())){
                bookList.add(book);
            }
        }
        return bookList;
    }

    public boolean create(Book book) {
        boolean add = books.add(book);
        return add;
    }

    public String edit(Integer id, Book book) {
       for (Book book1:books){
           if (book1.getId().equals(id)){
               book1.setPublishYear(book.getPublishYear());
               book1.setTitle(book.getTitle());
               book1.setAuthor(book.getAuthor());
               return "edit book";
           }
       }
       return "not found edit book";
    }

    public String deleted(Integer id) {
        for (Book book:books){
            if (book.getId().equals(id)){
                books.remove(book);
                return "deleted book";
            }
        }
        return "not found deleted book";
    }

    public List<Book> serache(String name) {
        List<Book>bookList=new LinkedList<>();
        for (Book book:books){
            if (book.getAuthor().toLowerCase().contains(name.toLowerCase())){
                bookList.add(book);
            }
        }
        return bookList;
    }
}
