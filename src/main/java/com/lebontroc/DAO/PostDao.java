package com.lebontroc.DAO;

import com.lebontroc.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostDao extends JpaRepository<Post, Integer> {

    @Query("SELECT p FROM Post p WHERE LOWER(p.title) LIKE LOWER(:search)")
    List<Post> searchPost(String search);

    @Query("SELECT p FROM Post p JOIN p.item i WHERE i.value >= :minValue AND i.value <= :maxValue")
    List<Post> findPostsByItemValue(int minValue, int maxValue);

    @Query("SELECT p FROM Post p JOIN p.item i WHERE i.type = :type")
    List<Post> findPostByItemType(String type);

    @Query("SELECT p FROM Post p JOIN p.item i WHERE i.condition = :condition")
    List<Post> findPostByItemCondition(String condition);
}
