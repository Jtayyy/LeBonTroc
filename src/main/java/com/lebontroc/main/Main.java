package com.lebontroc.main;

import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import com.lebontroc.services.ObjectService;
import com.lebontroc.services.PostService;
import com.lebontroc.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Main implements CommandLineRunner {
    private final UserService userService;
    private final ObjectService objectService;
    private final PostService postService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("FindMe");

        Iterable<User> users = userService.findAll();
        System.out.println(users);

        Iterable<Object> objects = objectService.findAll();
        System.out.println(objects);
        Iterable<Post> posts = postService.findAll();
        System.out.println(posts);

    }
}