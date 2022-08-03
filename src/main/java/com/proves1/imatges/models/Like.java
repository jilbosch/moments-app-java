package com.proves1.imatges.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "likes")

public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


}

