package com.tatchik.catalog.service;


import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.dto.PublisherDto;
import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Publisher;
import com.tatchik.catalog.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class PublisherServiceImpl implements PublisherService {


    private PublisherRepository publisherRepository;

    @Autowired
    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }
    @Override
    @Transactional
    public Set<PublisherDto> getAllPublisher() {
        Set<Publisher> publisherSet = publisherRepository.getAllPublisher();
        return convertFromSetEntityToSetDto(publisherSet);
    }

    @Override
    public PublisherDto getPublisherByName(String name) {
        Publisher publisher = publisherRepository.getPublisherByName(name);
        return convertFromEntityToDto(publisher);
    }


    @Override
    @Transactional
    public Set<PublisherDto> getAllPublisherWithBooks() {
        Set<Publisher> publisherSet = publisherRepository.getAllPublisherWithJoin();
        return convertFromSetEntityToSetWithBookDto(publisherSet);
    }

    @Override
    public PublisherDto getPublisherByPublisherAddress( String publisher_Address) {
        Publisher publisher = publisherRepository.getPublisherByPublisherAddress(publisher_Address);
        return convertFromEntityToDto(publisher);
    }

    @Override
    public void saveEntity(PublisherDto publisherDto) {
        Publisher publisher = convertFromDtoToEntity(publisherDto);
        publisherRepository.save(publisher);
    }



    private Set<PublisherDto> convertFromSetEntityToSetDto(Set<Publisher> publishers) {
        Set<PublisherDto> publisherDtos = new HashSet<>();
        for (Publisher publisher : publishers) {
            publisherDtos.add(convertFromEntityToDto(publisher));
        }
        return publisherDtos;
    }

    private PublisherDto convertFromEntityToDto(Publisher publisher) {
        PublisherDto publisherDto = new PublisherDto();
        publisherDto.setId(publisher.getId());
        publisherDto.setName(publisher.getName());
        publisherDto.setPublisherAddress(publisher.getPublisher_Address());

        Set<BookDto> bookDtos = new HashSet<>();
        if(publisher.getBook()!=null) {
            for (Book book : publisher.getBook()) {
                BookDto bookDto = new BookDto();
                bookDto.setId(book.getId());
                bookDto.setName(book.getName());
                bookDtos.add(bookDto);
            }
        }
        publisherDto.setBookDtoSet(bookDtos);
        return publisherDto;
    }



    private Set<PublisherDto> convertFromSetEntityToSetWithBookDto(Set<Publisher> publishers) {
        Set<PublisherDto> publisherDtos = new HashSet<>();
        for (Publisher publisher : publishers) {
            publisherDtos.add(convertFromEntityWithBookToDto(publisher));
        }
        return publisherDtos;
    }

    private PublisherDto convertFromEntityWithBookToDto(Publisher publisher) {
        PublisherDto publisherDto = new PublisherDto();
        publisherDto.setId(publisher.getId());
        publisherDto.setName(publisher.getName());

        Set<BookDto> bookDtos = new HashSet<>();
        if(publisher.getBook()!=null) {
            for (Book book : publisher.getBook()) {
                BookDto bookDto = new BookDto();
                bookDto.setId(book.getId());
                bookDto.setName(book.getName());
                bookDtos.add(bookDto);
            }
        }
        publisherDto.setBookDtoSet(bookDtos);
        return publisherDto;
    }

    public Publisher convertFromDtoToEntity(PublisherDto publisherDto){
      PublisherDto publisherDto1 = new PublisherDto();
        if (publisherDto1.getId() != null)
            publisherDto1.setName(publisherDto1.getName());
       publisherDto1.setBookDtoSet(new HashSet<>());
        return publisherDto1;
    }

}
