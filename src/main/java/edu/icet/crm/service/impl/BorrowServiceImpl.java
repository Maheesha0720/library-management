package edu.icet.crm.service.impl;

import edu.icet.crm.dto.book.BookDto;
import edu.icet.crm.dto.borrow.BorrowDto;
import edu.icet.crm.dto.borrow.BorrowSaveDto;
import edu.icet.crm.entity.Book;
import edu.icet.crm.entity.Borrow;
import edu.icet.crm.repository.BookRepo;
import edu.icet.crm.repository.BorrowRepo;
import edu.icet.crm.repository.UserRepo;
import edu.icet.crm.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private BorrowRepo borrowRepo;
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private UserRepo userRepo;
    @Override
    public void addBorrow(BorrowSaveDto borrowSaveDto) {

        borrowRepo.save(new Borrow(
                bookRepo.getById(borrowSaveDto.getBookId()),
                userRepo.getById(borrowSaveDto.getUserId()),
                borrowSaveDto.getBorrowDate(),
                borrowSaveDto.getReturnDate()
        ));

    }

    @Override
    public List<BorrowDto> getAllBorrows() {
        List<Borrow> borrows=borrowRepo.findAll();
        List<BorrowDto> borrowDtoList=new ArrayList<>();

        for (Borrow borrow:borrows){
            borrowDtoList.add(new BorrowDto(
                    borrow.getId(),
                    borrow.getBook(),
                    borrow.getUser(),
                    borrow.getBorrowDate(),
                    borrow.getReturnDate()

            ));

        }
        return borrowDtoList;
    }
}
