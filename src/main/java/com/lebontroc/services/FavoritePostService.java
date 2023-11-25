package com.lebontroc.services;

import com.lebontroc.DAO.FavoritePostDao;
import com.lebontroc.DAO.UserDao;
import com.lebontroc.models.FavoritePost;
import com.lebontroc.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.security.PublicKey;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FavoritePostService {

    private final FavoritePostDao favoritePostDao;
    public FavoritePost findById(int id) {
        return favoritePostDao.findById(id).orElseThrow(() -> new RuntimeException("FavoritePost not found for id: " + id));
    }
    public void add(FavoritePost favoritePost){
        if (!favoritePostDao.existsByUserIdAndPostId(favoritePost.getUser(),favoritePost.getPost())) {
            favoritePostDao.save(favoritePost);}
    }

    public void deleteById(int id) {
        if (favoritePostDao.existsById(id)) {
            favoritePostDao.deleteById(id);
        } else {
            throw new RuntimeException("FavoritePost not found for id: " + id);
        }
    }
    public List<User> findUsersWhoLikedPostByPostId(int id) {
        return favoritePostDao.findUsersWhoLikedPostByPostId(id);
    }

}
