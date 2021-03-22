package com.tatchik.catalog.repository;

import com.tatchik.catalog.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

//    @Query("SELECT a FROM Author a left join fetch where a.id = :id ")
//    public List<Book> getBookByAuthor(@Param());

}
