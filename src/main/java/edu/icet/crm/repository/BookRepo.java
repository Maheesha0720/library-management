package edu.icet.crm.repository;

import edu.icet.crm.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo  extends JpaRepository<Book, Integer> {
}
