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
public interface ItemDao extends JpaRepository<Item, Integer> {

    @Query("SELECT i.posts FROM Item i WHERE i.id= :itemId")
    List<Post> getAllPostsFromItem(int itemId);

    @Query("SELECT i FROM Item i WHERE LOWER(i.name) LIKE LOWER(:search) OR LOWER(i.description) LIKE LOWER(:search)")
    List<Item> searchItem(String search);

    @Query("SELECT i.user FROM Item i WHERE i.id = :itemId")
    Optional<User> findUserByItemId(int itemId);

}
