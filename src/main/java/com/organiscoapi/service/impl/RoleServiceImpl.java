package com.organiscoapi.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.organiscoapi.entity.Role;
import com.organiscoapi.payload.RoleDTO;
import com.organiscoapi.repository.RoleRepository;
import com.organiscoapi.service.RoleService;

@Service
public class RoleServiceImpl extends AbstractCrudService<Role, RoleDTO, UUID> implements RoleService {
    @Autowired private RoleRepository repo;

    @Override protected JpaRepository<Role, UUID> getRepository() { return repo; }
    @Override protected Class<Role> getEntityClass() { return Role.class; }
    @Override protected Class<RoleDTO> getDtoClass() { return RoleDTO.class; }
}