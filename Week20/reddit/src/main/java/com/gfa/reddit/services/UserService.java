package com.gfa.reddit.services;

import com.gfa.reddit.models.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    void save(User user);
    List<User> findAll();
    User findNameAndPassword(String username, String password);
    void setIsLogged(String username);

}
