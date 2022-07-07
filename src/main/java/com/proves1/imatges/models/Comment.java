package com.proves1.imatges.models;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id",nullable = false)
    private Long id;
    private String  comment;

    @ManyToOne
    @JoinColumn(name = "moment_id")
    private Moment moment;



}
