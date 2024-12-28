package edu.icet.crm.controller;

import edu.icet.crm.dto.author.AuthorSaveDto;
import edu.icet.crm.dto.author.AuthorUpdateDto;
import edu.icet.crm.dto.author.AuthorDto;
import edu.icet.crm.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/save")
    public String saveAuthor(@RequestBody AuthorSaveDto authorSaveDto){
        authorService.addAuthor(authorSaveDto);
        return "Added success...";

    }
    @GetMapping("/getAllAuthor")
    public List<AuthorDto> getAllAuthor(){
        return authorService.getAllAuthor();
    }

    @PutMapping("/update")
    public String updateAuthor(@RequestBody AuthorUpdateDto authorUpdateDto){

        return authorService.updateAuthor(authorUpdateDto);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable(value = "id")int id){

       authorService.deleteAuthor(id);
        return "Author deleted";
    }
}
