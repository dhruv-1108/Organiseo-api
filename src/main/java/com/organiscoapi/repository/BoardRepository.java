package com.organiscoapi.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.Board;
public interface BoardRepository extends JpaRepository<Board, UUID> { }

// BOARD MEMBERS (composite key)
