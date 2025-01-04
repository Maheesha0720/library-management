package edu.icet.crm.service;

import edu.icet.crm.dto.borrow.BorrowDto;
import edu.icet.crm.dto.borrow.BorrowSaveDto;
import edu.icet.crm.dto.borrow.BorrowUpdateDto;

import java.util.List;

public interface BorrowService {
    void addBorrow(BorrowSaveDto borrowSaveDto);

    List<BorrowDto> getAllBorrows();

    String updateBorrowStatus(BorrowUpdateDto borrowUpdateDto);
}
