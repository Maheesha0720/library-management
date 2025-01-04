package edu.icet.crm.dto.borrow;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.icet.crm.entity.Book;
import edu.icet.crm.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class BorrowDto {
    private int id;
    private String status;
    private Book book;
    private User user;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate borrowDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate returnDate;
}
