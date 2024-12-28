package edu.icet.crm.dto.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BookSaveDto {

    private String bookTitle;

    private int authorId;

    private int publisherId;
}
