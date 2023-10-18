package com.lebontroc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;
    private String pseudo;
    private String email;
    private LocalDate birthdate;
    private String adresse;
    private boolean admin;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Object> objects;
    // private float note;

    private User(Builder builder) {
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.pseudo = builder.pseudo;
        this.email = builder.email;
        this.birthdate = builder.birthdate;
        this.adresse = builder.adresse;
        this.admin = builder.admin;
        this.objects = builder.objects;
    }
    public User() {
    }

    public static class Builder {
        private Integer id;
        private String firstname;
        private String lastname;
        private String pseudo;
        private String email;
        private LocalDate birthdate;
        private String adresse;
        private boolean admin;
        private List<Object> objects;

        public Builder id (Integer id) {
            this.id = id;
            return this;
        }

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }
        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }
        public Builder pseudo(String pseudo) {
            this.pseudo = pseudo;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder birthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }
        public Builder objects(List<Object> objects) {
            this.objects = objects;
            return this;
        }
        public Builder adresse(String adresse) {
            this.adresse = adresse;
            return this;
        }
        public Builder admin(boolean admin) {
            this.admin = admin;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}