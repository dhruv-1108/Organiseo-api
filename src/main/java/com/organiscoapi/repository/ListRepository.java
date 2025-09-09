package com.organiscoapi.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.ListEntity;
public interface ListRepository extends JpaRepository<ListEntity, UUID> { }

// TASKS
