package com.pelinh.bookstore;

import com.pelinh.bookstore.entities.Book;
import com.pelinh.bookstore.dao.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Arrays;


@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

    //CommandLineRunner size bir Run methodu verir ve bu sayede oluşturduğunuz ürünleri database kısmına direk eklenir
    //halde yer alır. Yani main methodu çalıştığı anda database kısmında listenizde çalışır.

    private final BookRepository bookRepository;


    public BookstoreApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }


    @Override
    public void run(String... args) {
        Book book1 = Book.builder()
                .name("İyi Hissetmek")
                .author("DrDavid Burns")
                .price(59.90)
                .stock(10)
                .build();

        Book book2 = Book.builder()
                .name("Vazgeçebilmek")
                .author("Guy Finley")
                .price(33.65)
                .stock(25)
                .build();

        Book book3 = Book.builder()
                .name("Atomik Alışkanlıklar")
                .author("James Clear")
                .price(34.99)
                .stock(15)
                .build();

        bookRepository.saveAll(Arrays.asList(book1, book2, book3));
    }
}
