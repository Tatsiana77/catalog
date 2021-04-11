package com.tatchik.catalog.service;


import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.dto.PublisherDto;
import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Publisher;
import com.tatchik.catalog.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
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
    public List<PublisherDto> getAllPublisher() {
        List<Publisher> publishers = publisherRepository.getAllPublisher();
        return FromListEntityToListDto(publishers);
    }

    @Override
    public PublisherDto getPublisherByName(String name) {
        Publisher publisher = publisherRepository.getPublisherByName(name);
        return EntityToDto(publisher);
    }


    @Override
    @Transactional
    public List<PublisherDto> getAllPublisherWithBooks() {
        List<Publisher> publisher = publisherRepository.getAllPublisherWithJoin();
        return FromListEntityToListDto(publisher);
    }

    @Override
    @Transactional
    public PublisherDto getPublisherByPublisherAddress(String publisher_Address) {
        Publisher  publishers= publisherRepository.getPublisherByPublisherAddress(publisher_Address);
        return FromEntityToDto(publishers);
    }

    @Override
    public void saveEntity(PublisherDto publisherDto) {
        Publisher publisher = FromDtoToEntity(publisherDto);
        publisherRepository.save(publisher);
    }


    private List<PublisherDto> FromListEntityToListDto(List<Publisher> publishers) {
        List<PublisherDto> publisherDtos = new ArrayList<>();
        for (Publisher publisher : publishers) {
            publisherDtos.add(FromEntityToDto(publisher));
        }
        return publisherDtos;
    }

    private PublisherDto FromEntityToDto(Publisher publisher) {
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

    public Publisher FromDtoToEntity(PublisherDto publisherDto) {
        PublisherDto publisherDto1 = new PublisherDto();
        if (publisherDto1.getId() != null)
            publisherDto1.setName(publisherDto1.getName());
        publisherDto1.getBookDtoList(new ArrayList<>());
        return publisherDto1;
    }

    public PublisherDto EntityToDto(Publisher publisher) {
        PublisherDto publisherDto = new PublisherDto();
        publisherDto.setId(publisher.getId());
        publisherDto.setName(publisher.getName());
        publisherDto.setPublisherAddress(publisher.getPublisherAddress());
        publisherDto.setYearOfPub(publisher.getYearOfPub());
        return publisherDto;
    }

}
