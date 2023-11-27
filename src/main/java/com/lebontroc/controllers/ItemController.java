package com.lebontroc.controllers;

import com.lebontroc.models.Item;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import com.lebontroc.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("items")
@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;
    @GetMapping("")
    public Iterable<Item> getAllItem() {
        return itemService.findAll();
    }
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) { return itemService.findById(id); }
    @PostMapping("")
    public void addItem (@RequestBody Item item) { itemService.add(item);}
    @PostMapping("/{id}")
    public void updateItem(@RequestBody Item item, @PathVariable int id) { itemService.update(item, id);}
    @DeleteMapping("/{id}")
    public void deleteItem (@PathVariable int id) { itemService.deleteById(id); }
    @GetMapping("/{id}/posts")
    public List<Post> getPostsOfItem(@PathVariable int id) { return itemService.getPostsOfItem(id); }
    @GetMapping("/search/{search}")
    public List<Item> searchItem(@PathVariable String search) { return itemService.searchItem(search); }

    @GetMapping("/{search}/value-recommendation")
    public int getValueProposition(@PathVariable String search) { return itemService.findValueProposition(search); }
    @GetMapping("/{id}/user")
    public User getUserByItemId(@PathVariable int id) { return itemService.findUserByItemId(id); }
}
