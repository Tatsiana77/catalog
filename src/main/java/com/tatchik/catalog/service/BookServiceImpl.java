package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.dto.OrdersDto;
import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Orders;
import com.tatchik.catalog.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;


    public BookServiceImpl(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }


    @Override
    public List<BookDto> getAllBook() {
        return convertFromListToDtoList(bookRepository.getAllBook());
    }

    @Override
    public List<BookDto> getAllBookWithJoin() {
        return convertFromListBookEntityToListDto(bookRepository.getAllBookWithJoin());
    }

    @Override
    public List<BookDto> getAllBookWithOrders() {
        return convertFromListBookEntityToListDto(bookRepository.getAllBookWithOrders());
    }

    @Override
    public BookDto getBookByName(String name) {
        return null;
    }

    @Override
    public void saveEntity(BookDto bookDto) {
        Book book = convertFromBookDtoToEntityDto(bookDto);
        bookRepository.save(book);

    }


    private List<BookDto> convertFromListToDtoList(List<Book> book) {
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book books : book) {
            bookDtos.add(convertFromEntityBookToDto(books));
        }

        return bookDtos;
    }

    private BookDto convertFromEntityBookToDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());
        bookDto.setAuthor(new Author());
        bookDto.setOrdersDto(new ArrayList<>());
        return bookDto;

    }

    private List<BookDto> convertFromListBookEntityToListDto(List<Book> book) {
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book books : book) {
            bookDtos.add(convertFromBookEntityToDto(books));
        }

        return bookDtos;
    }

    private BookDto convertFromBookEntityToDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());

        List<OrdersDto> ordersDtos = new ArrayList<>();

        for (Orders orders : book.getOrder()) {
            OrdersDto ordersDto = new OrdersDto();
            ordersDto.setId(orders.getId());
            ordersDto.setCountOrders(orders.getCountOrders());
            ordersDto.setDateOfOrder(orders.getDateOfOrder());
            ordersDtos.add(ordersDto);


        }
        bookDto.setOrdersDto(ordersDtos);
        return bookDto;
    }

    private Book convertFromBookDtoToEntityDto(BookDto bookDto) {
        Book book = new Book();
        if (bookDto.getId() != null) {
            book.setId(bookDto.getId());
        }

        book.setName(bookDto.getName());
        return book;
    }

    private Book convertBookDtoToEntity(BookDto bookDto) {
        Book book = new Book();
        if (bookDto.getId() != null) {
            book.setId(bookDto.getId());
        }
        book.setName(bookDto.getName());
        List<Orders> orders = new ArrayList<>();
        for (OrdersDto ordersDto : bookDto.getOrdersDto()) {
            orders.add(convertBookDtoToBookEntity(ordersDto, book));


        }
        book.setOrder(orders);
        return book;
    }

    private Orders convertBookDtoToBookEntity(OrdersDto ordersDto, Book book) {
        Orders orders = new Orders();
        if (ordersDto.getId() != null) {
            orders.setId(ordersDto.getId());
        }

        orders.setBook(book);
        orders.setCountOrders(ordersDto.getCountOrders());
        orders.setDateOfOrder(orders.getDateOfOrder());
        return orders;
    }


}



