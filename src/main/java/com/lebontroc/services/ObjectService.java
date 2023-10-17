package com.lebontroc.services;

import com.lebontroc.DAO.ObjectDao;
import com.lebontroc.models.Object;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ObjectService {

    private final ObjectDao objectDao;

    public List<Object> findAll() {
        return objectDao.findAll();
    }
}
