package com.organiscoapi.service;

import java.util.Optional;
import java.util.UUID;

import com.organiscoapi.payload.UserDTO;

public interface UserService extends CrudService<UserDTO, UUID> {

	Optional<UserDTO> findByEmailOrUsername(String login); }
