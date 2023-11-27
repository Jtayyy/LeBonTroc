package com.lebontroc.services;

import com.lebontroc.DAO.ItemDao;
import com.lebontroc.models.Item;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ItemService {

    private final ItemDao itemDao;

    public List<Item> findAll() {
        return itemDao.findAll();
    }
    public Item findById(int id) {
        return itemDao.findById(id).orElseThrow(() -> new RuntimeException("Item not found for id: " + id));
    }
    public void add(Item item){
        itemDao.save(item); }

    public void update(Item updatedItem, int id) {
        Item existingItem = itemDao.findById(id).orElseThrow(() -> new RuntimeException("Item not found for id: " + id));

        existingItem.setUser(updatedItem.getUser());
        existingItem.setName(updatedItem.getName());
        existingItem.setImage(updatedItem.getImage());
        existingItem.setDescription(updatedItem.getDescription());
        existingItem.setCondition(updatedItem.getCondition());
        existingItem.setType(updatedItem.getType());

        itemDao.save(existingItem);
    }
    public void deleteById(int id) {
        if (itemDao.existsById(id)) {
            itemDao.deleteById(id);
        } else {
            throw new RuntimeException("Item not found for id: " + id);
        }
    }

    public List<Post> getPostsOfItem(int id){ return itemDao.getAllPostsFromItem(id); }

    public List<Item> searchItem(String search){ return itemDao.searchItem(search); }

    public int findValueProposition(String search) {
        List<Item> items= itemDao.searchItem(search);
        if (items.isEmpty()) { return 0; }
        int recommendedvalue = 0;
        for (Item item : items) {
            recommendedvalue += item.getValue();
        }
        recommendedvalue = recommendedvalue/items.size();
        return recommendedvalue;
    }
    public User findUserByItemId(int id){
        User user = itemDao.findUserByItemId(id).orElseThrow(() -> new RuntimeException("User not found for Item: " + id));
        return user;
    }

}
