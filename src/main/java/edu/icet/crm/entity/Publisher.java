package edu.icet.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int publisherId;
    private String publisherName;

    @OneToMany(mappedBy = "publisher")
    @JsonIgnore
    private Set<Book> books;
    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}
