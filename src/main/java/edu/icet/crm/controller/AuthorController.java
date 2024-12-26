package edu.icet.crm.controller;

import edu.icet.crm.dto.author.AuthorSaveDto;
import edu.icet.crm.dto.author.AuthorUpdateDto;
import edu.icet.crm.dto.author.AutorDto;
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
        String authorname = authorService.addAuthor(authorSaveDto);
        return "Added success...";

    }
    @GetMapping("/getAllAuthor")
    public List<AutorDto> getAllAuthor(){
       List<AutorDto> allAuthors= authorService.getAllAuthor();
       return allAuthors;
    }

    @PutMapping("/update")
    public String updateAuthor(@RequestBody AuthorUpdateDto authorUpdateDto){

        String authorname=authorService.updateAuthor(authorUpdateDto);
        return authorname;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable(value = "id")int id){

        String authorname=authorService.deleteAuthor(id);
        return "Author deleted";
    }
}
