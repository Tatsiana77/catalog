package com.tatchik.catalog;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.entity.Author;

import com.tatchik.catalog.repository.AuthorRepository;

import com.tatchik.catalog.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CatalogApplication implements CommandLineRunner {

    @Autowired
    private AuthorService authorService;

    public static void main(String[] args) {
        SpringApplication.run(CatalogApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<AuthorDto> authors = authorService.getAllAuthorWithJoin();
        for (AuthorDto author : authors) {
            System.out.println(author);
        }

        authorService.saveEntity(new AuthorDto("Антон Павлович Чехов"));

        System.out.println("------------------------------------------------------");
        authors = authorService.getAllAuthorWithJoin();
        for (AuthorDto author : authors) {
            System.out.println(author);
        }

    }
}
