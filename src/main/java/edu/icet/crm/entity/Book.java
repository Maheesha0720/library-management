package edu.icet.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data


@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    @Column(nullable = false)
    private String bookTitle;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonIgnoreProperties("book")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    @JsonIgnoreProperties("book")
    private Publisher publisher;

    @OneToMany(mappedBy ="book")
    @JsonIgnore
    private Set<Borrow> borrows;

    public Book(String bookTitle, Author author, Publisher publisher) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }
}
