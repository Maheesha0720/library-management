package edu.icet.crm.service;

import edu.icet.crm.dto.author.AuthorSaveDto;
import edu.icet.crm.dto.author.AuthorUpdateDto;
import edu.icet.crm.dto.author.AuthorDto;

import java.util.List;

public interface AuthorService {

    String addAuthor(AuthorSaveDto authorSaveDto);

    List<AuthorDto> getAllAuthor();

    String updateAuthor(AuthorUpdateDto authorUpdateDto);

    String deleteAuthor(int id);
}
