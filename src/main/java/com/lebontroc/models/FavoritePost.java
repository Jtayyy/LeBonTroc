package com.lebontroc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "favorite_posts")
@Getter
@Setter
@NoArgsConstructor
public class FavoritePost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
