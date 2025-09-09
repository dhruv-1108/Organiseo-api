package com.organiscoapi.service.impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.organiscoapi.entity.User;
import com.organiscoapi.payload.UserDTO;
import com.organiscoapi.repository.UserRepository;
import com.organiscoapi.service.UserService;

@Service
public class UserServiceImpl extends AbstractCrudService<User, UserDTO, UUID> implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    protected JpaRepository<User, UUID> getRepository() {
        return repo;
    }

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    protected Class<UserDTO> getDtoClass() {
        return UserDTO.class;
    }

    @Override
    public Optional<UserDTO> findByEmailOrUsername(String login) {
        return repo.findByEmailOrUsername(login, login)
                   .map(user -> modelMapper.map(user, UserDTO.class));
    }
}
