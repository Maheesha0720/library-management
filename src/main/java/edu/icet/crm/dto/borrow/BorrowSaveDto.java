package edu.icet.crm.dto.borrow;

import edu.icet.crm.entity.Book;
import edu.icet.crm.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class BorrowSaveDto {
    private int bookId;
    private int userId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
}
