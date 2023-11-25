package com.lebontroc.services;

import com.lebontroc.DAO.ObjectDao;
import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
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
    public Object findById(int id) {
        return objectDao.findById(id).orElseThrow(() -> new RuntimeException("Object not found for id: " + id));
    }
    public void add(Object object){objectDao.save(object); }

    public void update(Object updatedObject, int id) {
        Object existingObject = objectDao.findById(id).orElseThrow(() -> new RuntimeException("Object not found for id: " + id));

        existingObject.setUser(updatedObject.getUser());
        existingObject.setName(updatedObject.getName());
        existingObject.setImage(updatedObject.getImage());
        existingObject.setDescription(updatedObject.getDescription());
        existingObject.setCondition(updatedObject.getCondition());
        existingObject.setType(updatedObject.getType());

        objectDao.save(existingObject);
    }
    public void deleteById(int id) {
        if (objectDao.existsById(id)) {
            objectDao.deleteById(id);
        } else {
            throw new RuntimeException("Object not found for id: " + id);
        }
    }

    public List<Post> getPostsOfObject(int id){ return objectDao.getAllPostsFromObject(id); }

    public List<Object> searchObject(String search){ return objectDao.searchObject(search); }

    public int findValueProposition(String search) {
        List<Object> objects= objectDao.searchObject(search);
        if (objects.isEmpty()) { return 0; }
        int recommendedvalue = 0;
        for (Object object : objects) {
            recommendedvalue += object.getValue();
        }
        recommendedvalue = recommendedvalue/objects.size();
        return recommendedvalue;
    }
}
