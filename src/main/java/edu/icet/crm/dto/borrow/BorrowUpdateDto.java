package edu.icet.crm.dto.borrow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BorrowUpdateDto {
    private  int id;
    private String status;

}
