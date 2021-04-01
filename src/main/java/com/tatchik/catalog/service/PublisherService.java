package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.PublisherDto;

import java.util.Set;

public interface PublisherService {

    public Set<PublisherDto> getAllPublisher();

    public PublisherDto getPublisherByName(String name);


    public Set<PublisherDto> getAllPublisherWithBooks();

    public PublisherDto getPublisherByPublisherAddress(String publisher_Address);

    public void saveEntity(PublisherDto publisherDto);
}
