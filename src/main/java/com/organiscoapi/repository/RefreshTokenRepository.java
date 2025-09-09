package com.organiscoapi.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.RefreshToken;
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, UUID> { }