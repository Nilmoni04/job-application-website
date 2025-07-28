package com.Spring.JobApp.service;

import com.Spring.JobApp.dao.UserRepo;
import com.Spring.JobApp.model.User;
import com.Spring.JobApp.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);
        if(user == null) {
            System.out.println("Error 404");
            throw new UsernameNotFoundException("Error 404");
        }
        return new UserPrincipal(user);
    }
}
