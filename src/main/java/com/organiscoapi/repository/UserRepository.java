package com.organiscoapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    // find user by email OR username
    Optional<User> findByEmailOrUsername(String email, String username);
    
    Optional<User> findByEmail(String email);

   

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
