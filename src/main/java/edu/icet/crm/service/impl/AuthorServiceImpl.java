package edu.icet.crm.service.impl;

import edu.icet.crm.dto.author.AuthorSaveDto;
import edu.icet.crm.dto.author.AuthorUpdateDto;
import edu.icet.crm.dto.author.AutorDto;
import edu.icet.crm.entity.Author;
import edu.icet.crm.repository.AuthorRepo;
import edu.icet.crm.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public String addAuthor(AuthorSaveDto authorSaveDto) {
      Author author=new Author(
            authorSaveDto.getAuthorName()
      );
      authorRepo.save(author);
        return author.getAuthorName();
    }

    @Override
    public List<AutorDto> getAllAuthor() {

        List<Author> getAuthors=authorRepo.findAll();
        List<AutorDto> autorDtoList=new ArrayList<>();

        for (Author author:getAuthors){
            AutorDto autorDto=new AutorDto(
                    author.getAuthorId(),
                    author.getAuthorName()
            );
            autorDtoList.add(autorDto);
        }
        return autorDtoList;
    }

    @Override
    public String updateAuthor(AuthorUpdateDto authorUpdateDto) {

        if (authorRepo.existsById(authorUpdateDto.getAuthorId())) {

            Author author = authorRepo.getById(authorUpdateDto.getAuthorId());
            author.setAuthorName(authorUpdateDto.getAuthorName());
            authorRepo.save(author);
            return author.getAuthorName();
        }else {
            System.out.println("Author ID not exist...!!");
        }
        return null;
    }

    @Override
    public String deleteAuthor(int id) {
        if (authorRepo.existsById(id)){
            authorRepo.deleteById(id);
        }else{
            System.out.println("record not found..");
        }
        return null;
    }
}
