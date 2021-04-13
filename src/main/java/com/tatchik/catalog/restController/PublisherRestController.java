package com.tatchik.catalog.restController;

import com.tatchik.catalog.dto.PublisherDto;
import com.tatchik.catalog.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublisherRestController {

    private PublisherService publisherService;

    @Autowired
    public PublisherRestController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping("api/publishers")
    public List<PublisherDto> getAllPublisher() {
        return publisherService.getAllPublisher();
    }

    @GetMapping("api/publisherWithBook")
    public List<PublisherDto> getAllPublisherWithBook() {
        return publisherService.getAllPublisherWithBooks();

    }



}
