package com.organiscoapi.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.BoardMember;
import com.organiscoapi.entity.BoardMemberId;
public interface BoardMemberRepository extends JpaRepository<BoardMember, BoardMemberId> { }

// LISTS
