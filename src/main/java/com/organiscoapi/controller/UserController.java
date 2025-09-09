package com.organiscoapi.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organiscoapi.payload.UserDTO;
import com.organiscoapi.service.CrudService;
import com.organiscoapi.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController extends AbstractCrudController<UserDTO, UUID> {
    @Autowired private UserService service;
    @Override protected CrudService<UserDTO, UUID> getService() { return service; }
}