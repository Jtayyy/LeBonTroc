package com.lebontroc.controllers;

import com.lebontroc.models.Post;
import com.lebontroc.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("posts")
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    @GetMapping("")
    public Iterable<Post> getAllPost() {
        return postService.findAll();
    }
}
