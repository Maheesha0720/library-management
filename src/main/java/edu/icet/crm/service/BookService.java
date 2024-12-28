package edu.icet.crm.service;

import edu.icet.crm.dto.book.BookDto;
import edu.icet.crm.dto.book.BookSaveDto;
import edu.icet.crm.dto.book.BookUpdateDto;

import java.util.List;

public interface BookService {
    String addBook(BookSaveDto bookSaveDto);

    List<BookDto> getAllBook();

    String updateBook(BookUpdateDto bookUpdateDto);

    String deleteBook(int id);
}
