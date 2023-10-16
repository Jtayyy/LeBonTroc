package com.lebontroc.main;

import com.lebontroc.models.User;
import com.lebontroc.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Main implements CommandLineRunner {
    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {

        //User jean = new User(0, "Jean", "Merdelemonde", "jeanmerde", "jeanmerde@gmail.com", LocalDate.now(), "Ici même", true);
        //System.out.println(jean);

        System.out.println("FindMe");

        List<User> users = userService.findAll();
        System.out.println(users);
    }
}