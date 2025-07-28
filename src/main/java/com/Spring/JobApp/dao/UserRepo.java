package com.Spring.JobApp.dao;

import com.Spring.JobApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);

}
