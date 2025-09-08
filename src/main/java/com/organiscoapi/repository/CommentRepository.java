package com.organiscoapi.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.Comment;
public interface CommentRepository extends JpaRepository<Comment, UUID> { }

// ATTACHMENTS
