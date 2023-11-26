package com.lebontroc.DAO;

import com.lebontroc.models.Item;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

    @Query("SELECT u.items FROM User u WHERE u.id= :userId")
    List<Item> findAllItemsFromUser(int userId);

    @Query("SELECT u FROM User u WHERE u.email= :userEmail")
    Optional<User> findUserByEmail(String userEmail);

    @Query("SELECT u.favorites FROM User u WHERE u.id = :userId")
    List<Post> findFavoritesByUserId(int userId);

    @Query("SELECT DISTINCT p FROM Post p JOIN FETCH p.item i WHERE i.user.id = :userId")
    List<Post> findPostsByUserId(int userId);

    @Query("SELECT DISTINCT p FROM Post p JOIN FETCH p.item i JOIN FETCH i.user u WHERE u.id = :userId AND p.id IN (SELECT fp.post.id FROM FavoritePost fp)")
    List<Post> findPostsLikedByOtherByUserId(int userId);

    @Query("SELECT u FROM User u WHERE LOWER(u.pseudo) LIKE LOWER(:search)")
    List<User> searchUser(String search);
}