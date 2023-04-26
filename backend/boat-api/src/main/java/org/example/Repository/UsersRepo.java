package org.example.Repository;

import org.example.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<UserModel, Integer> {

    public UserModel findByName(String username);

}
