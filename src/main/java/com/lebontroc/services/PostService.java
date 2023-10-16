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

    public Iterable<Post> findAll() {
        return postDao.findAll();
    }
}
