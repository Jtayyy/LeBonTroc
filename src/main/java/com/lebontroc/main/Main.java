package com.lebontroc.main;

import com.lebontroc.DTO.UserDto;
import com.lebontroc.DTO.UserMapper;
import com.lebontroc.models.Item;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import com.lebontroc.services.FavoritePostService;
import com.lebontroc.services.ItemService;
import com.lebontroc.services.PostService;
import com.lebontroc.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Main implements CommandLineRunner {
    private final UserService userService;
    private final ItemService itemService;
    private final PostService postService;
    private  final FavoritePostService favoritePostService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hello World");
//
//        List<User> users = userService.findAll();
//        System.out.println(users);
//        User newUser = new User(85, "Bernard", "Deau","BrDo", "345552", "BerBo@gmail.com", LocalDate.now(), "29 avenue de la République 75002 Paris", false, null);
//        UserDto newUserDto = UserMapper.toDto(newUser);
//        userService.register(newUserDto);
//        userService.update(newUserDto, 4);
//        userService.login("BerBo@gmail.com", "345552");
//        Item item = itemService.findById(1);
//        System.out.println(postService.findPostsByItemValue(item, 0.2f));
//
//        System.out.println(userService.findFavoritesByUserId(1));
//        System.out.println(userService.findFavoritesByUserId(3));
//
//
//        List<Item> list_item =  userService.findAllItemsFromUser(newUser.getId());
//        System.out.println(newUser);
//
//
//        Item item = itemService.findById(2);
//        List<Post> list_post = itemService.getPostsOfItem(item.getId());
//        System.out.println(list_post);
//        System.out.println(user);
//        userService.deleteById(3);
//
//        Item item_test = new Item();
//        item_test.setUser(user);
//        item_test.setName("PS5");
//        item_test.setImage("PS5_image");
//        item_test.setDescription("Console de gamerz");
//        item_test.setCondition("Pas ouf");
//        item_test.setType("Console de jeux");
//        itemService.save(item_test);
//        System.out.println(itemService.findById(0));
//        item_test = itemService.findById(4);
//        item_test.setCondition("Etat neuf");
//        itemService.save(item_test);
//        itemService.delete(itemService.findById(5));
//        itemService.deleteById(5);
//
//        List<Post> posts = postService.findAll();
//        System.out.println(posts);
//
//        Post post_test = new Post();
//        post_test.setItem(item_test);
//        post_test.setTitle("PS5 conte Switch");
//        post_test.setPublication(LocalDate.now());
//        post_test.setDescription("Enchange ma PS5 1To contre une Nitendo Switch Zelda special edition");
//        post_test.setAdresse(item_test.getUser().getAdresse());
//
//        postService.save(post_test);
//        post_test = postService.findById(1);
//        post_test.setTitle("PS5 contre saucisson");
//        postService.save(post_test);
//        postService.delete(postService.findById(2));
//
//        postService.findAll();
//        System.out.println(posts);
//        postService.delete(postService.findById(2));
//        postService.deleteById(3);
//        System.out.println(postService.findById(1).getTitle());
//        User claude = new User(null, "Claude", "Chabat", "alou", "alou@gmail.com", LocalDate.now(), "29 avenue de la République 75002 Paris", false, items);
//        UserDto claudeDto = UserMapper.toDto(claude);
//        userService.addUser(claudeDto);
//        claudeDto.setFirstname("Pierre");
//        userService.updateUser(claudeDto, 3);
//        System.out.println(userService.findById(3));

        //System.out.println(postService.findPostsByItemCondition("Neuf"));
    }
}