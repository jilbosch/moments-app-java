package com.proves1.imatges.models;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="Moments")
@NoArgsConstructor
@AllArgsConstructor
public class Moment {
    private String title;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany (mappedBy = "moment")
    private List<Comment> comments = new ArrayList<>();

    private String img_Url;

    private String descripcion;


    }