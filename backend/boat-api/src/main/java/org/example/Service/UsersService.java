package org.example.Service;

import org.example.Models.UserModel;
import org.example.Repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    UsersRepo usersRepo;
    public void getUser(String username) {
        UserModel um = usersRepo.findByName(username);
        System.out.println("User model " + um.getUsername());
    }

}
