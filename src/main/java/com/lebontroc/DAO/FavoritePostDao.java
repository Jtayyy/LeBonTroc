package com.lebontroc.DAO;

import com.lebontroc.models.FavoritePost;
import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FavoritePostDao extends JpaRepository<FavoritePost, Integer> {
    @Query("SELECT fp.user FROM FavoritePost fp WHERE fp.post.id= :postId")
    List<User> findUsersWhoLikedPostByPostId(int postId);
    @Query("SELECT COUNT(fp) > 0 FROM FavoritePost fp WHERE fp.user = :user AND fp.post = :post")
    boolean existsByUserIdAndPostId(User user, Post post);
}
