package com.organiscoapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.Task;

public interface TaskRepository extends JpaRepository<Task, UUID> { }

// LABELS
