package com.lebontroc.main;

import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import com.lebontroc.services.ObjectService;
import com.lebontroc.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class LebontrocApplication {
	public static void main(String[] args) {

		SpringApplication.run(LebontrocApplication.class, args);
		ApplicationContext context = SpringApplication.run(LebontrocApplication.class, args);
		UserService userService = context.getBean(UserService.class);
//		UserService objectService = context.getBean(UserService.class);
//		UserService postService = context.getBean(UserService.class);
//
		List<User> users = userService.findAll();
//		for (User user : users) {
//			System.out.println(user.getId() + " - " + user.getFirstname());
//		}
//		List<Object> objects = objectService.findAll();
//		for (Object object : objects) {
//			System.out.println(object.getId() + " - " + object.getFirstname());
//		}
//		List<Post> posts = postService.findAll();
//		for (Post post : posts) {
//			System.out.println(post.getId() + " - " + post.getFirstname());
//		}
//
	}
}
