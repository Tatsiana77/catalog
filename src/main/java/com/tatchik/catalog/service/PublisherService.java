package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.PublisherDto;

import java.util.List;

public interface PublisherService {

    public List<PublisherDto> getAllPublisher();

    public PublisherDto getPublisherByName(String name);


    public List<PublisherDto> getAllPublisherWithBooks();

    public PublisherDto  getPublisherByPublisherAddress(String publisher_Address);

    public void saveEntity(PublisherDto publisherDto);



}
