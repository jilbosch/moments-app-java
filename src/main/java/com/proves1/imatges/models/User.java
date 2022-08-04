package com.proves1.imatges.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.proves1.imatges.models.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;

    private String email;
    @JsonIgnore
    private String password;

    private String img;

    public User(String name) {
        this.username = name;
    }

    @ManyToMany
    private Set<Role> roles;


    public User(long id, String name) {
        this.username = name;
        this.id = id;
    }

    public User(String username, String email, String encode) {
        this.username = username;
        this.email = email;
        this.password = encode;
    }

}
