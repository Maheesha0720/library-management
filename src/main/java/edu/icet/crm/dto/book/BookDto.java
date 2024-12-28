package edu.icet.crm.dto.book;

import edu.icet.crm.entity.Author;
import edu.icet.crm.entity.Publisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDto {
    private int bookId;
    private String bookTitle;
    private Author author;
    private Publisher publisher;
}
