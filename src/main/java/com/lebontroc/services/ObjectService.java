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
        return objectDao.findById(id).orElseThrow(RuntimeException::new);
    }
    public void delete(Object object) {
        objectDao.delete(object);
    }

    @Transactional
    public void addObject(Object object) {
        try{
            objectDao.save(object);
        } catch (Exception e){
            throw new RuntimeException("Error while creating the object");
        }
    }

    @Transactional
    public void updateObject(Object object){
        objectDao.findById(object.getId())
                .orElseThrow(() -> new NoSuchElementException("Object doesn't exist"));
        try{
            objectDao.save(object);
        } catch (Exception e){
            throw new RuntimeException("Error while updating the object");
        }
    }
}
