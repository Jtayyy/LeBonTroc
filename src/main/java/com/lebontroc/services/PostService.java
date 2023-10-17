package com.lebontroc.services;

import com.lebontroc.DAO.PostDao;
import com.lebontroc.models.Post;
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
    public Post findById(int id) {
        return postDao.findById(id).orElseThrow(RuntimeException::new);
    }
    public void delete(Post post) {
        postDao.delete(post);
    }
    public void save(Post post) {
        postDao.save(post);
    }
}