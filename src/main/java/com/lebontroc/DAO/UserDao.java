package com.lebontroc.DAO;

import com.lebontroc.models.Object;
import com.lebontroc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

    @Query("SELECT u.objects FROM User u WHERE u.id= :userId")
    List<Object> getAllObjectsFromUser(int userId);
}