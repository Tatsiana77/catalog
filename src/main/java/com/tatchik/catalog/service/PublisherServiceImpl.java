package com.tatchik.catalog.service;


import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.dto.OrdersDto;
import com.tatchik.catalog.dto.PublisherDto;
import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Orders;
import com.tatchik.catalog.entity.Publisher;
import com.tatchik.catalog.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {


    private PublisherRepository publisherRepository;

    @Autowired
    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<PublisherDto> getAllPublisher() {
        List<Publisher> publishers = publisherRepository.getAllPublisher();
        return convertFromPublisherListEntityToDtoList(publishers);
    }


    @Override
    @Transactional
    public List<PublisherDto> getAllPublisherWithBooks() {
        List<Publisher> publisher = publisherRepository.getAllPublisherWithBooks();
        return FromCustomerListEntityToDtoList(publisher);
    }

    @Override
    public void saveEntity(PublisherDto publisherDto) {
        Publisher publisher = convertFromPublisherDtoToEntity(publisherDto);
        publisherRepository.save(publisher);
    }

    @Override
    public PublisherDto getPublisherWithBookById(Integer idPublisher) {
        return  convertFromEntityPublisherToDto(publisherRepository.getPublisherWithBookById(idPublisher)) ;
    }

    @Override
    public PublisherDto getBookByPublisher(Integer idPublisher) {
        return convertFromEntityPublisherToDto(publisherRepository.getPublisherWithBookById(idPublisher)) ;
    }

    @Override
    public PublisherDto getPublisherById(Integer idPublisher) {
        return  convertFromEntityPublisherToDto(publisherRepository.findById(idPublisher).get()) ;
    }


    private List<PublisherDto> convertFromPublisherListEntityToDtoList(List<Publisher> publisher) {
        List<PublisherDto> publisherDtos = new ArrayList<>();
        for (Publisher publishers : publisher) {
            publisherDtos.add(convertFromEntityPublisherToDto(publishers));
        }

        return publisherDtos;
    }

    private PublisherDto convertFromEntityPublisherToDto(Publisher publisher) {
        PublisherDto publisherDto = new PublisherDto();
        publisherDto.setId(publisher.getId());
        publisherDto.setName(publisher.getName());
        publisherDto.setPublisher_Address(publisher.getPublisher_Address());
        publisherDto.setYearOfPub(publisher.getYearOfPub());
        publisherDto.setBookDtoList(new ArrayList<>());
        return publisherDto;
    }


    private List<PublisherDto> FromCustomerListEntityToDtoList(List<Publisher> publisher) {
        List<PublisherDto> publisherDtos = new ArrayList<>();
        for (Publisher publishers : publisher) {
            publisherDtos.add(FromEntityPublisherToDto(publishers));
        }

        return publisherDtos;
    }

    private PublisherDto FromEntityPublisherToDto(Publisher publisher) {
        PublisherDto publisherDto = new PublisherDto();
        publisherDto.setId(publisher.getId());
        publisherDto.setName(publisher.getName());
        publisherDto.setPublisher_Address(publisher.getPublisher_Address());
        publisherDto.setYearOfPub(publisher.getYearOfPub());


        List<BookDto> bookDtos = new ArrayList<>();
        for (Book book : publisher.getBooks()) {
            BookDto bookDto = new BookDto();
            bookDto.setId(book.getId());
            bookDto.setName(book.getName());
            bookDtos.add(bookDto);
        }
       publisherDto.setBookDtoList(bookDtos);
        return publisherDto;
    }

    private Publisher convertFromPublisherDtoToEntity(PublisherDto publisherDto) {
       Publisher publisher = new Publisher();
        if (publisherDto.getId() != null) {
            publisher.setId(publisherDto.getId());
        }
        publisher.setName(publisherDto.getName());
        publisher.setPublisher_Address(publisherDto.getPublisher_Address());
        publisher.setYearOfPub(publisherDto.getYearOfPub());
        publisher.setBooks(new ArrayList<>());

        return publisher;
    }

}
