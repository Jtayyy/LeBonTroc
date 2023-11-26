package com.lebontroc.DAO;

import com.lebontroc.models.Item;
import com.lebontroc.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {

    @Query("SELECT i.posts FROM Item i WHERE i.id= :itemId")
    List<Post> getAllPostsFromItem(int itemId);

    @Query("SELECT i FROM Item i WHERE LOWER(i.name) LIKE LOWER(:search) OR LOWER(i.description) LIKE LOWER(:search)")
    List<Item> searchItem(String search);

}
