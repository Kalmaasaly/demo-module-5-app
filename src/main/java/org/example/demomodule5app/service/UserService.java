package org.example.demomodule5app.service;

import org.example.demomodule5app.entity.User;
import org.example.demomodule5app.repository.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import org.slf4j.Logger;

@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAllUsers() {
        log.info("Fetching all users");
        return repo.findAll();
    }

    public User save(User user) {
        log.debug("Saving user: {}", user.getName());
        return repo.save(user);
    }
}
