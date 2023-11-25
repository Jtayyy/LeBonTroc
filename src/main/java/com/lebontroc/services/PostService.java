package com.lebontroc.services;

import com.lebontroc.DAO.PostDao;
import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PostService {
    private final PostDao postDao;

    public List<Post> findAll() {
        return postDao.findAll();
    }
    public Post findById(int id) {return postDao.findById(id).orElseThrow(() -> new RuntimeException("Post not found for id: " + id));}
    public void add(Post post) {postDao.save(post); }
    public void update(Post updatedPost, int id) {
        Post existingPost = postDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found for id: " + id));

        existingPost.setObject(updatedPost.getObject());
        existingPost.setTitle(updatedPost.getTitle());
        existingPost.setPublication(updatedPost.getPublication());
        existingPost.setDescription(updatedPost.getDescription());
        existingPost.setAddress(updatedPost.getAddress());

        postDao.save(existingPost);
    }

    public void deleteById(int id) {
        if (postDao.existsById(id)) {
            postDao.deleteById(id);
        } else {
            throw new RuntimeException("Post not found for id: " + id);
        }
    }

    public User findUserByPostId(int id){
        Post post = findById(id);
        Object object = post.getObject();
        return object.getUser();
    }
    public List<Post> searchPost(String search){ return postDao.searchPost(search); }
}