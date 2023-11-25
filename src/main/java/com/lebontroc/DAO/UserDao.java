package com.lebontroc.DAO;

import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

    @Query("SELECT u.objects FROM User u WHERE u.id= :userId")
    List<Object> findAllObjectsFromUser(int userId);

    @Query("SELECT u FROM User u WHERE u.email= :userEmail")
    Optional<User> findUserByEmail(String userEmail);

    @Query("SELECT u.favorites FROM User u WHERE u.id = :userId")
    List<Post> findFavoritesByUserId(int userId);

    @Query("SELECT DISTINCT p FROM Post p JOIN FETCH p.object o WHERE o.user.id = :userId")
    List<Post> findPostsByUserId(int userId);

    @Query("SELECT u FROM User u WHERE LOWER(u.pseudo) LIKE LOWER(:search)")
    List<User> searchUser(String search);
}