package com.organiscoapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> { }

// SESSIONS
