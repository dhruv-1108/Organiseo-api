package com.organiscoapi.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organiscoapi.payload.RoleDTO;
import com.organiscoapi.service.CrudService;
import com.organiscoapi.service.RoleService;

@RestController
@RequestMapping("/api/roles")
public class RoleController extends AbstractCrudController<RoleDTO, UUID> {
    @Autowired private RoleService service;
    @Override protected CrudService<RoleDTO, UUID> getService() { return service; }
}