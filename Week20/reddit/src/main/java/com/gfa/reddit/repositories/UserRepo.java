package com.gfa.reddit.repositories;

import com.gfa.reddit.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findByUsernameAndPassword(String username, String password);
    User findByIsLogged(boolean isLogged);
    User findUserByIsLogged(boolean loggedUser);
}
