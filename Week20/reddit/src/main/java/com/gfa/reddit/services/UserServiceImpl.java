package com.gfa.reddit.services;

import com.gfa.reddit.models.User;
import com.gfa.reddit.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public User findNameAndPassword(String username, String password) {
        return userRepo.findByUsernameAndPassword(username, password);
    }

    @Override
    public void setIsLogged(String username) {
        if (checkIfAnyActiveUser()) {
            User activeUser = userRepo.findUserByIsLogged(true);
            activeUser.getId();
            activeUser.setIsLogged(false);
            save(activeUser);
            User newlyLoggedUser = userRepo.findByUsername(username);
        }
    }

    public boolean checkIfAnyActiveUser() {
        User loggedUser = userRepo.findUserByIsLogged(true);
        if (loggedUser != null) {
            return true;
        }
        return false;
    }

}
