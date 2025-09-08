package com.organiscoapi.payload;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import com.organiscoapi.entity.Permission;
import com.organiscoapi.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO {

	private UUID id;

	private String name;

	private String description;

	private Set<User> users = new HashSet<>();

	private Set<Permission> permissions = new HashSet<>();
}
