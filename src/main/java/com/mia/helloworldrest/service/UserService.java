package com.mia.helloworldrest.service;

import com.mia.helloworldrest.model.User;
import com.mia.helloworldrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Mono<User> get(int id){
        return repository.findById(id);
    }

    public Mono<User> create(User user){
        return repository.save(user);
    }
}
