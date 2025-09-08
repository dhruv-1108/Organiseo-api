package com.organiscoapi.payload;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.organiscoapi.entity.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RefreshTokenDTO {

	private UUID id;

	private String name;

	private String description;

	private Set<Role> roles = new HashSet<>();
}
