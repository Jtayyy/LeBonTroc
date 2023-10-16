package com.lebontroc.DAO;

import com.lebontroc.models.Object;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectDao extends JpaRepository<Object, Integer> {
}
