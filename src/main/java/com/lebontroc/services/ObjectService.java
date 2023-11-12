package com.lebontroc.services;

import com.lebontroc.DAO.ObjectDao;
import com.lebontroc.DTO.UserDto;
import com.lebontroc.DTO.UserMapper;
import com.lebontroc.models.Object;
import com.lebontroc.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class ObjectService {

    private final ObjectDao objectDao;

    public List<Object> findAll() {
        return objectDao.findAll();
    }
    public Object findById(int id) {
        return objectDao.findById(id).orElseThrow(() -> new RuntimeException("Object not found for id: " + id));
    }
    public void save(Object object){objectDao.save(object); }
    public void delete(Object object) {
        objectDao.delete(object);
    }
    public void deleteById(int id) {
        if (objectDao.existsById(id)) {
            objectDao.deleteById(id);
        } else {
            throw new RuntimeException("Object not found for id: " + id);
        }
    }
}
