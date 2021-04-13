package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.CustomerDto;
import com.tatchik.catalog.dto.PublisherDto;

import java.util.List;

public interface PublisherService {

    public List<PublisherDto> getAllPublisher();

    public List<PublisherDto> getAllPublisherWithBooks();

    public void saveEntity(PublisherDto publisherDto);

    public  PublisherDto getPublisherWithBookById(Integer idPublisher);

    public  PublisherDto getBookByPublisher(Integer idPublisher);

    public PublisherDto getPublisherById(Integer idPublisher);





}
