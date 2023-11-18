package com.lebontroc.controllers;

import com.lebontroc.DTO.UserDto;
import com.lebontroc.models.Object;
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
    public void loginUser (@RequestBody String email, @RequestBody String password) { userService.login(email, password);}
    @PostMapping("/{id}/update")
    public void updateUser(@RequestBody UserDto userDto, @PathVariable int id) { userService.update(userDto, id); }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) { userService.deleteById(id); }
    @GetMapping("/{id}/objects")
    public List<Object> getObjectsOfUser(@PathVariable int id) { return userService.getObjectsOfUser(id); }

}
