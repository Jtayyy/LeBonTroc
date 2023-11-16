package com.lebontroc.controllers;

import com.lebontroc.models.Post;
import com.lebontroc.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("posts")
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    @GetMapping("")
    public Iterable<Post> getAllPost() { return postService.findAll(); }
    @GetMapping("/{id}")
    public Post getPostById(@PathVariable int id) { return postService.findById(id); }
    @PostMapping("")
    public void addPost (@RequestBody Post post) { postService.add(post);}
    @PostMapping("/{id}")
    public void updatePost(@RequestBody Post post, @PathVariable int id) { postService.update(post, id); }
    @DeleteMapping("/{id}")
    public void deletePost (@PathVariable int id) { postService.deleteById(id); }
}
