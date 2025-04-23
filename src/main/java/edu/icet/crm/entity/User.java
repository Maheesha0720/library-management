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
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String email;

    @OneToMany(mappedBy ="user")
    @JsonIgnore
    private Set<Borrow> borrows;
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
