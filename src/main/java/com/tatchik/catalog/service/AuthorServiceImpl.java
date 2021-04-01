package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    @Transactional
    public List<AuthorDto> getAllAuthor() {
        List<Author> authors = authorRepository.getAllAuthor();
        return convertFromListEntityToListDto(authors);
    }

    @Override
    public List<AuthorDto> getAllAuthorWithBooks() {
        List<Author> authors = authorRepository.getAllAuthorWithJoin();
        return convertFromListEntityToListDto(authors);
    }

    @Override
    public AuthorDto getAuthorByName(String name) {
        Author author = authorRepository.getAuthorByName(name);
        return convertFromEntityToDto(author);
    }


    @Override
    public void saveEntity(AuthorDto authorDto) {
        Author author = convertFromDtoToEntity(authorDto);
        authorRepository.save(author);
    }

    @Override
    public AuthorDto getAuthorById(Integer idAuthor) {
        return convertFromEntityToDto(authorRepository.findById(idAuthor).get());
    }


    private List<AuthorDto> convertFromListEntityToListDto(List<Author> author) {
        List<AuthorDto> authorDtos = new ArrayList<>();
        for (Author authors : author) {
            authorDtos.add(convertFromEntityToDto(authors));
        }

        return authorDtos;
    }

    private AuthorDto convertFromEntityToDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setName(author.getName());

        List<BookDto> bookDtos = new ArrayList<>();

        for (Book book : author.getBook()) {
            BookDto bookDto = new BookDto();
            bookDto.setId(book.getId());
            bookDto.setName(book.getName());
            bookDtos.add(bookDto);


        }
        authorDto.setBookDto(bookDtos);
        return authorDto;
    }

    private Author convertFromDtoToEntity(AuthorDto authorDto) {
        Author author = new Author();
        if (authorDto.getId() != null)
            author.setId(authorDto.getId());
        author.setName(authorDto.getName());
        author.setBook(new ArrayList<>());
        return author;
    }

    private AuthorDto convertFromEntityAuthorToDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setName(author.getName());
        authorDto.setBookDto(new ArrayList<>());
        return authorDto;
    }


}
