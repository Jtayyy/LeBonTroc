package com.lebontroc.controllers;

import com.lebontroc.DTO.UserDto;
import com.lebontroc.models.Item;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import com.lebontroc.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("users")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("")
    public Iterable<User> getAllUser() {
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) { return userService.findById(id); }
    @PostMapping("/register")
    public void registerNewUser(@RequestBody UserDto userDto) { userService.register(userDto);}
    @PostMapping("/login")
    public User loginUser (@RequestBody UserDto userDto) { return userService.login(userDto.getEmail(), userDto.getPassword());}
    @PostMapping("/{id}/update")
    public void updateUser(@RequestBody UserDto userDto, @PathVariable int id) { userService.update(userDto, id); }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) { userService.deleteById(id); }
    @GetMapping("/{id}/items")
    public List<Item> getItemsOfUser(@PathVariable int id) { return userService.findAllItemsFromUser(id); }
    @GetMapping("/{id}/posts")
    public List<Post> getPostsOfUser(@PathVariable int id) { return userService.findPostsByUserId(id); }
    @GetMapping("/{id}/liked-posts")
    public List<Post> getPostsLikedByOtherByUserId(@PathVariable int id) { return userService.findPostsLikedByOtherByUserId(id); }
    @GetMapping("/{id}/favorites")
    public List<Post> getFavoritesByUserId(@PathVariable int id) { return userService.findFavoritesByUserId(id); }
    @GetMapping("/search/{search}")
    public List<User> searchUser(@PathVariable String search) { return userService.searchUser(search); }

}
