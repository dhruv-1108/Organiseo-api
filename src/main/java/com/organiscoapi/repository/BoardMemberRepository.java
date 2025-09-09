package com.organiscoapi.repository;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organiscoapi.entity.Board;
import com.organiscoapi.entity.BoardMember;
import com.organiscoapi.entity.BoardMemberId;
import com.organiscoapi.entity.User;
public interface BoardMemberRepository extends JpaRepository<BoardMember, BoardMemberId> {
	
	 List<BoardMember> findByBoard(Board board);
	    List<BoardMember> findByUser(User user);
}

// LISTS
