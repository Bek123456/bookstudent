package com.example.library2023oxiri.repository;

import com.example.library2023oxiri.model.Book;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class BookRepository {
    public static List<Book>bookList=new LinkedList<>();
}
