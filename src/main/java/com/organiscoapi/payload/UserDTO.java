package com.organiscoapi.payload;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.organiscoapi.entity.Board;
import com.organiscoapi.entity.BoardMember;
import com.organiscoapi.entity.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
	 private UUID id;

	   
	    private String username;

	    
	    private String email;

	
	    private String passwordHash;

	    private String fullName;

	
	    private Boolean isActive = true;


	    private Boolean isVerified = false;

	
	    private Instant createdAt;

	
	    private Instant updatedAt;

	    private Instant lastLoginAt;


	    private Set<Role> roles = new HashSet<>();

	
	    private Set<BoardMember> boards = new HashSet<>();
}
