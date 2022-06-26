package com.pelinh.bookstore.service;

import com.pelinh.bookstore.entities.Book;
import com.pelinh.bookstore.dao.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
