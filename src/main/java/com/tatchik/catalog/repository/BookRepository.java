package com.tatchik.catalog.repository;

import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query("SELECT b FROM Book b ")
    public List<Book> getAllBook();


    @Query("SELECT DISTINCT b FROM Book b  WHERE b.name = :name")
    public Book  getBookByName(@Param("name") String name);


    @Query ("SELECT DISTINCT b FROM Book  b LEFT JOIN FETCH b.author")
    public List<Book> getAllBookWithAuthor();

    @Query("SELECT DISTINCT b FROM Book b LEFT JOIN FETCH b.publisher")
    public List<Book> getAllBookWithJoin();

    @Query("SELECT DISTINCT b FROM Book b LEFT JOIN FETCH b.order")
    public List<Book> getAllBookWithOrders();


}
