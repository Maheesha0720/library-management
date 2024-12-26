package edu.icet.crm.service;

import edu.icet.crm.dto.author.AuthorSaveDto;
import edu.icet.crm.dto.author.AuthorUpdateDto;
import edu.icet.crm.dto.author.AutorDto;

import java.util.List;

public interface AuthorService {

    String addAuthor(AuthorSaveDto authorSaveDto);

    List<AutorDto> getAllAuthor();

    String updateAuthor(AuthorUpdateDto authorUpdateDto);

    String deleteAuthor(int id);
}
