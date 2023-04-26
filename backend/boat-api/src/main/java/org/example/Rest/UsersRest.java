package org.example.Rest;

import org.example.Models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Users {

    @GetMapping("/user/{username}")
    public void getUser(@PathVariable String username){
        System.out.println("hello " + username);
    }

}
