package org.example.Rest;

import org.example.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersRest {

    @Autowired
    UsersService usersService;

    @GetMapping("/user/{username}")
    public void getUser(@PathVariable String username){
        System.out.println("hello " + username);
        usersService.getUser(username);
    }

}
