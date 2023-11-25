package com.lebontroc.controllers;

import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import com.lebontroc.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/{id}/user")
    public User getUserByPostId(@PathVariable int id) { return postService.findUserByPostId(id); }
    @GetMapping("/{delta}/posts")
    public List<Post> updatePost(@RequestBody Object object, @PathVariable float delta) { return postService.findPostsByObjectValue(object, delta); }
    @PostMapping("")
    public void addPost (@RequestBody Post post) { postService.add(post);}
    @PostMapping("/{id}")
    public void updatePost(@RequestBody Post post, @PathVariable int id) { postService.update(post, id); }
    @DeleteMapping("/{id}")
    public void deletePost (@PathVariable int id) { postService.deleteById(id); }
    @GetMapping("/search/{search}")
    public List<Post> searchPost(@PathVariable String search) { return postService.searchPost(search); }
    @GetMapping("/type/{type}")
    public Iterable<Post> getPostsByObjectType(@PathVariable String type) { return postService.findPostsByObjectType(type); }
    @GetMapping("/condition/{condition}")
    public Iterable<Post> getPostsByObjectCondition(@PathVariable String condition) { return postService.findPostsByObjectCondition(condition); }
}
