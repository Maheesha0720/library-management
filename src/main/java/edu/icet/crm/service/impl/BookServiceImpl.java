package edu.icet.crm.service.impl;

import edu.icet.crm.dto.book.BookDto;
import edu.icet.crm.dto.book.BookSaveDto;
import edu.icet.crm.dto.book.BookUpdateDto;
import edu.icet.crm.entity.Book;
import edu.icet.crm.repository.AuthorRepo;
import edu.icet.crm.repository.BookRepo;
import edu.icet.crm.repository.PubliblisherRepo;
import edu.icet.crm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private AuthorRepo authorRepo;
    @Autowired
    private PubliblisherRepo publiblisherRepo;
    @Autowired
    private BookRepo bookRepo;

    @Override
    public String addBook(BookSaveDto bookSaveDto) {
        Book book = new Book(
                bookSaveDto.getBookTitle(),
                authorRepo.getById(bookSaveDto.getAuthorId()),
                publiblisherRepo.getById(bookSaveDto.getPublisherId())
        );
        bookRepo.save(book);
        return book.getBookTitle();
    }
    @Override
    public List<BookDto> getAllBook() {
        List<Book> bookDtos=bookRepo.findAll();
        List<BookDto> bookDtoList=new ArrayList<>();

        for (Book book:bookDtos){
            bookDtoList.add(new BookDto(
                    book.getBookId(),
                    book.getBookTitle(),
                    book.getAuthor(),
                    book.getPublisher()

            ));

        }
        return bookDtoList;
    }

    @Override
    public String updateBook(BookUpdateDto bookUpdateDto) {
        if (bookRepo.existsById(bookUpdateDto.getBookId())) {

            Book book = bookRepo.getById(bookUpdateDto.getBookId());
            book.setBookTitle(bookUpdateDto.getBookTitle());
            book.setAuthor(authorRepo.getById(bookUpdateDto.getAuthorId()));
            book.setPublisher(publiblisherRepo.getById(bookUpdateDto.getPublisherId()));
            bookRepo.save(book);
            return book.getBookTitle();
        }else {
            System.out.println("Book ID not exist...!!");
        }
        return null;
    }

    @Override
    public String deleteBook(int id) {
        if (bookRepo.existsById(id)){
            bookRepo.deleteById(id);
        }else{
            System.out.println("record not found..");
        }
        return null;
    }
}
