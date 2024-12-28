package edu.icet.crm.service;

import edu.icet.crm.dto.borrow.BorrowDto;
import edu.icet.crm.dto.borrow.BorrowSaveDto;

import java.util.List;

public interface BorrowService {
    void addBorrow(BorrowSaveDto borrowSaveDto);

    List<BorrowDto> getAllBorrows();
}
