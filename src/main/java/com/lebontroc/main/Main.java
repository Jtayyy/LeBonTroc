package com.lebontroc.main;

import com.lebontroc.DTO.UserDto;
import com.lebontroc.DTO.UserMapper;
import com.lebontroc.models.FavoritePost;
import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import com.lebontroc.services.FavoritePostService;
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
    private  final FavoritePostService favoritePostService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hello World");

        //List<User> users = userService.findAll();
        //System.out.println(users);
//        User newUser = new User(null, "Bernard", "Deau","BrDo", "345552", "BerBo@gmail.com", LocalDate.now(), "29 avenue de la République 75002 Paris", false, null, null, null);
//        UserDto newUserDto = UserMapper.toDto(newUser);
//        userService.register(newUserDto);
//        userService.update(newUserDto, 4);
//        userService.login("BerBo@gmail.com", "345552");
//        Object object = objectService.findById(1);
//        System.out.println(postService.findPostsByObjectValue(object, 0.2f));
//
//        System.out.println(userService.findFavoritesByUserId(1));
//        System.out.println(userService.findFavoritesByUserId(3));


//        List<Object> list_object =  userService.getObjectsOfUser(user.getId());
//        System.out.println(user);


//        Object object = objectService.findById(2);
//        List<Post> list_post = objectService.getPostsOfObject(object.getId());
//        System.out.println(list_post);
//        System.out.println(user);
//        userService.deleteById(3);

//        Object object_test = new Object();
//        object_test.setUser(user);
//        object_test.setName("PS5");
//        object_test.setImage("PS5_image");
//        object_test.setDescription("Console de gamerz");
//        object_test.setCondition("Pas ouf");
//        object_test.setType("Console de jeux");
//        objectService.save(object_test);
//        System.out.println(objectService.findById(0));
//        object_test = objectService.findById(4);
//        object_test.setCondition("Etat neuf");
//        objectService.save(object_test);
//        objectService.delete(objectService.findById(5));
//        objectService.deleteById(5);

//        List<Post> posts = postService.findAll();
//        System.out.println(posts);
//
//        Post post_test = new Post();
//        post_test.setObject(object_test);
//        post_test.setTitle("PS5 conte Switch");
//        post_test.setPublication(LocalDate.now());
//        post_test.setDescription("Enchange ma PS5 1To contre une Nitendo Switch Zelda special edition");
//        post_test.setAdresse(object_test.getUser().getAdresse());
//
//        postService.save(post_test);
//        post_test = postService.findById(1);
//        post_test.setTitle("PS5 contre saucisson");
//        postService.save(post_test);
//        postService.delete(postService.findById(2));

//        postService.findAll();
//        System.out.println(posts);
//        postService.delete(postService.findById(2));
//        postService.deleteById(3);
//        System.out.println(postService.findById(1).getTitle());
//        User claude = new User(null, "Claude", "Chabat", "alou", "alou@gmail.com", LocalDate.now(), "29 avenue de la République 75002 Paris", false, objects);
//        UserDto claudeDto = UserMapper.toDto(claude);
//        userService.addUser(claudeDto);
//        claudeDto.setFirstname("Pierre");
//        userService.updateUser(claudeDto, 3);
//        System.out.println(userService.findById(3));

        System.out.println(postService.findPostsByObjectCondition("usage"));
    }
}