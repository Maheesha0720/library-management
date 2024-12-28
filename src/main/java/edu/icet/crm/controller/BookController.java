package edu.icet.crm.controller;

import edu.icet.crm.dto.book.BookDto;
import edu.icet.crm.dto.book.BookSaveDto;
import edu.icet.crm.dto.book.BookUpdateDto;
import edu.icet.crm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public String saveBook(@RequestBody BookSaveDto bookSaveDto){
        bookService.addBook(bookSaveDto);
        return "Added success...";

    }
    @GetMapping("/getAllBooks")
    public List<BookDto> getAllBooks(){
        return bookService.getAllBook();
    }

    @PutMapping("/update")
    public String updateBook(@RequestBody BookUpdateDto bookUpdateDto){

        return bookService.updateBook(bookUpdateDto);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable(value = "id")int id){

       bookService.deleteBook(id);
        return "Book deleted";
    }
}
