package com.organiscoapi.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.Label;
public interface LabelRepository extends JpaRepository<Label, UUID> { }

// COMMENTS
