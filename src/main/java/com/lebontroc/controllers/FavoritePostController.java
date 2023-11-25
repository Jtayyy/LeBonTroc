package com.lebontroc.controllers;

import com.lebontroc.models.FavoritePost;
import com.lebontroc.models.User;
import com.lebontroc.services.FavoritePostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("favorite-posts")
@RestController
@RequiredArgsConstructor

public class FavoritePostController {

        private final FavoritePostService favoritePostService;

        @GetMapping("/{id}")
        public FavoritePost getFavoritePostById(@PathVariable int id) { return favoritePostService.findById(id); }
        @GetMapping("{id}/liked-users")
        public List<User> getUsersWhoLikedPostByPostId(@PathVariable int id) {return favoritePostService.findUsersWhoLikedPostByPostId(id); }
        @PostMapping("")
        public void addFavoritePost (@RequestBody FavoritePost favoritePost) { favoritePostService.add(favoritePost); }
        @DeleteMapping("/{id}")
        public void deleteFavoritePost (@PathVariable int id) { favoritePostService.deleteById(id); }
    }
