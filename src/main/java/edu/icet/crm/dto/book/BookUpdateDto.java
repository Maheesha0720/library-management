package edu.icet.crm.dto.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookUpdateDto {
    private int bookId;
    private String bookTitle;
    private int authorId;
    private int publisherId;
}
