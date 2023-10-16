package com.lebontroc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "objects")
@Getter
@Setter
public class Object {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String name;
    private String image;
    private String desc;
    private String condition;
    private String type;

}