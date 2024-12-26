package edu.icet.crm.repository;

import edu.icet.crm.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author , Integer> {
}
