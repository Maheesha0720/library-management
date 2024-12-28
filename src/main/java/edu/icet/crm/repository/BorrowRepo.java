package edu.icet.crm.repository;

import edu.icet.crm.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepo extends JpaRepository<Borrow,Integer> {
}
