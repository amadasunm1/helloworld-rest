package com.mia.helloworldrest.controller;

import com.mia.helloworldrest.model.User;
import com.mia.helloworldrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    private final UserService userService;

    @Autowired
    public HelloWorldController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Mono<String> get(){
        return Mono.just("Hello World!");
    }

    @GetMapping("/{id}")
    public Mono<String> get(@PathVariable int id){
        return userService.get(id).map(this::helloWorld).defaultIfEmpty("Hello World!");
    }

    @PostMapping
    public Mono<User> post(@RequestBody User request){
        return userService.create(request);
    }

    private String helloWorld(User user){
        return "Hello " + user.getFirstName()  + " " + user.getLastName();
    }
}
