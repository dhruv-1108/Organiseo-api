package com.organiscoapi.payload;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.organiscoapi.entity.Permission;
import com.organiscoapi.entity.RefreshToken;
import com.organiscoapi.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SessionDTO {
	private UUID id;

	private User user;

	private String ipAddress;
	private String userAgent;

	private OffsetDateTime createdAt;

	private OffsetDateTime lastSeenAt;

	private Boolean isActive = true;

	private List<RefreshToken> refreshTokens = new ArrayList<>();
}
