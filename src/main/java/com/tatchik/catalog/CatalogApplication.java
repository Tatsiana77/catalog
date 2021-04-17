package com.tatchik.catalog;
import com.tatchik.catalog.dto.PublisherDto;
import com.tatchik.catalog.repository.AuthorRepository;
import com.tatchik.catalog.service.AuthorService;
import com.tatchik.catalog.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Set;

@SpringBootApplication
public class CatalogApplication  {


    public static void main(String[] args) { SpringApplication.run(CatalogApplication.class, args);

    }

}

