package com.lebontroc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "pseudo")
    private String pseudo;
    @Column(name = "email")
    private String email;
    @Column(name = "birthdate")
    private LocalDate birthday;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "admin")
    private boolean admin;
    // private float note;
}