package com.tatchik.catalog.repository;

import com.tatchik.catalog.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Query("SELECT a FROM Author  a")
    public List<Author> getAllAuthor();

    @Query("SELECT DISTINCT a FROM Author a LEFT JOIN FETCH a.book ")
    public List<Author> getAllAuthorWithJoin();

    @Query("SELECT DISTINCT a FROM Author a WHERE a.name = :name")
    public Author getAuthorByName(@Param("name") String name);


}

