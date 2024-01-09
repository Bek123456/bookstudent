package com.example.library2023oxiri.service;

import com.example.library2023oxiri.model.Book;
import com.example.library2023oxiri.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public boolean create(Book book) {
        book.setId(BookRepository.bookList.size()+1);
        boolean add = BookRepository.bookList.add(book);
        return true;
    }

    public List<Book> reads() {
        return BookRepository.bookList;
    }

    public Book read(Integer id) {
        for (Book book : BookRepository.bookList) {
            if (book.getId().equals(id)){
               return book;
            }
        }
       return new Book();
    }

    public boolean edit(Integer id, Book book) {
        List<Book> bookList = BookRepository.bookList;
        for (Book book1:bookList){
            if (book1.getId().equals(id)){
                book1.setAuthor(book.getAuthor());
                book1.setTitle(book.getTitle());
                book1.setPublishYear(book.getPublishYear());
                return true;
            }
        }
        return false;
    }

    public boolean delete(Integer id) {
        for (Book book : BookRepository.bookList) {
            if (book.getId().equals(id)){
                BookRepository.bookList.remove(book);
                return true;
            }
        }
      return false;
    }
}
