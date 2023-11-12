package com.lebontroc.main;

import com.lebontroc.DTO.UserDto;
import com.lebontroc.DTO.UserMapper;
import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import com.lebontroc.services.ObjectService;
import com.lebontroc.services.PostService;
import com.lebontroc.services.UserService;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Main implements CommandLineRunner {
    private final UserService userService;
    private final ObjectService objectService;
    private final PostService postService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hello World");

        //List<User> users = userService.findAll();
        //System.out.println(users);
        User user = userService.findAll().get(0);
        System.out.println(user);
        List<Object> objects = objectService.findAll();
        System.out.println(objects);
        Object objectps = objectService.findAll().get(3);
        objectService.delete(objectps);

        System.out.println(objectService.findAll());
//        List<Post> posts = postService.findAll();
//        System.out.println(posts);
//
//        System.out.println(postService.findById(1).getTitle());
//
//        User claude = new User(null, "Claude", "Chabat", "alou", "alou@gmail.com", LocalDate.now(), "29 avenue de la République 75002 Paris", false, objects);
//        UserDto claudeDto = UserMapper.toDto(claude);
//        userService.addUser(claudeDto);
//        claudeDto.setFirstname("Pierre");
//        userService.updateUser(claudeDto, 3);
//        System.out.println(userService.findById(3));
    }
}