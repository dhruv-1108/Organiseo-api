package com.organiscoapi.payload;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import com.organiscoapi.entity.Board;
import com.organiscoapi.entity.Role;


public class UserDTO {
	private UUID id;

	private String username;

	private String email;

	private String passwordHash;

	private String fullName;

	private Boolean isActive = true;

	private Boolean isVerified = false;

	private OffsetDateTime createdAt;

	private OffsetDateTime updatedAt;

	private OffsetDateTime lastLoginAt;

	private Set<Role> roles = new HashSet<>();

	private Set<Board> boards = new HashSet<>();
}
