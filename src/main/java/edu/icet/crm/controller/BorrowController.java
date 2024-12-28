package edu.icet.crm.controller;

import edu.icet.crm.dto.author.AuthorDto;
import edu.icet.crm.dto.author.AuthorSaveDto;
import edu.icet.crm.dto.author.AuthorUpdateDto;
import edu.icet.crm.dto.borrow.BorrowDto;
import edu.icet.crm.dto.borrow.BorrowSaveDto;
import edu.icet.crm.service.AuthorService;
import edu.icet.crm.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/borrow")
public class BorrowController {
    @Autowired
    private BorrowService borrowService;

    @PostMapping("/save")
    public String saveBorrow(@RequestBody BorrowSaveDto borrowSaveDto){
        borrowService.addBorrow(borrowSaveDto);
        return "Borrow success...";

    }

    @GetMapping("/getAllBorrows")
    public List<BorrowDto> getAllBorrows(){
        return borrowService.getAllBorrows();
    }


}