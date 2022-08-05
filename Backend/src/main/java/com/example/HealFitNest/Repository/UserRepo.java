package com.example.HealFitNest.Repository;

import com.example.HealFitNest.Model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends MongoRepository<Users,String> {
    //    Users findByname(String name);
    Users findByEmail(String email);
}