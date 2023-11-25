package com.lebontroc.DAO;

import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObjectDao extends JpaRepository<Object, Integer> {

    @Query("SELECT o.posts FROM Object o WHERE o.id= :objectId")
    List<Post> getAllPostsFromObject(int objectId);

    @Query("SELECT o FROM Object o WHERE LOWER(o.name) LIKE LOWER(:search) OR LOWER(o.description) LIKE LOWER(:search)")
    List<Object> searchObject(String search);

}
