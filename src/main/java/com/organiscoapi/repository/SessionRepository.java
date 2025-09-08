package com.organiscoapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.Session;

public interface SessionRepository extends JpaRepository<Session, UUID> { }

// REFRESH TOKENS
