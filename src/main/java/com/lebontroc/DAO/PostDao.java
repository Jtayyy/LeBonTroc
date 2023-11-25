package com.lebontroc.DAO;

import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostDao extends JpaRepository<Post, Integer> {

    @Query("SELECT p FROM Post p WHERE LOWER(p.title) LIKE LOWER(:search)")
    List<Post> searchPost(String search);

    @Query("SELECT p FROM Post p JOIN p.object o WHERE o.value >= :minValue AND o.value <= :maxValue")
    List<Post> findPostsByObjectValue(int minValue, int maxValue);

}
