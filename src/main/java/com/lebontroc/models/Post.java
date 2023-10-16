package com.lebontroc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "posts")
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "object_id")
    private Object object;
    @Column(name = "title")
    private String title;
    @Column(name = "publication")
    private LocalDate publication;
    @Column(name = "description")
    private String desc;
    @Column(name = "adresse")
    private String adresse;
}