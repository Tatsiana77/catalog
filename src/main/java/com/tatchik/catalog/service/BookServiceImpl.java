package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.dto.PublisherDto;
import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Publisher;
import com.tatchik.catalog.repository.BookRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;


    public BookServiceImpl(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    @Override
    @Transactional
    public List<BookDto> getAllBook() {
        List<Book> bookList = bookRepository.getAllBook();
        return convertFromListEntityToListDto(bookList);
    }

    @Override
    public BookDto getAllBookWithAuthor() {
       Book book = bookRepository.getAllBookWithAuthor();
        return convertFromEntityToDto(book);
    }

    @Override
    public Set<BookDto> getAllBookWithPublisher() {
        Set<Book> books = bookRepository.getAllBookWithJoin();
        return convertFromSetEntityToSetDto(books);
    }


    @Override
    public BookDto getBookByName(String name) {
        Book book = bookRepository.getBookByName(name);
        return convertFromEntityToDto(book);
    }

    @Override
    public void saveEntity(BookDto bookDto) {
        Book book = convertFromDtoToEntity(bookDto);
        bookRepository.save(book);

    }


    public List<BookDto> convertFromListEntityToListDto(List<Book> books) {
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book book : books) {
            bookDtos.add(convertFromEntityToDto(book));
        }

        return bookDtos;
    }


    private Set<BookDto> convertFromSetEntityToSetDto(Set<Book> bookSet) {
        Set<BookDto> bookDtos = new HashSet<>();
        for (Book books : bookSet) {
            bookDtos.add(convertFromEntityToDto(books));
        }
        return bookDtos;
    }
    public BookDto convertFromEntityToDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());
        return bookDto;
    }


    public Book convertFromDtoToEntity(BookDto bookDto) {
        BookDto bookDto1 = new BookDto();
        if (bookDto1.getId() != null)
        bookDto1.setName(bookDto1.getName());
        bookDto1.setPublisherSet(new HashSet<>());

        return bookDto1;
    }

}
