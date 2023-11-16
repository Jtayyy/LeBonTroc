package com.lebontroc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "objects")
@Getter
@Setter
@NoArgsConstructor
public class Object {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String name;
    private String image;
    private String description;
    private String condition;
    private String type;
    @OneToMany(mappedBy = "object")
    @JsonIgnore
    private List<Post> posts;

}