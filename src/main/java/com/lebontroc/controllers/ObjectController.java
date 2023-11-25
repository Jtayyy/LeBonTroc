package com.lebontroc.controllers;

import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import com.lebontroc.services.ObjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("objects")
@RestController
@RequiredArgsConstructor
public class ObjectController {
    private final ObjectService objectService;
    @GetMapping("")
    public Iterable<Object> getAllObject() {
        return objectService.findAll();
    }
    @GetMapping("/{id}")
    public Object getObjectById(@PathVariable int id) { return objectService.findById(id); }
    @PostMapping("")
    public void addObject (@RequestBody Object object) { objectService.add(object);}
    @PostMapping("/{id}")
    public void updateObject(@RequestBody Object object, @PathVariable int id) { objectService.update(object, id);}
    @DeleteMapping("/{id}")
    public void deleteObject (@PathVariable int id) { objectService.deleteById(id); }
    @GetMapping("/{id}/posts")
    public List<Post> getPostsOfObject(@PathVariable int id) { return objectService.getPostsOfObject(id); }
    @GetMapping("/search/{search}")
    public List<Object> searchObject(@PathVariable String search) { return objectService.searchObject(search); }
}