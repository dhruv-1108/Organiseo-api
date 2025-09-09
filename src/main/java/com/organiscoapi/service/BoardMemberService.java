package com.organiscoapi.service;

import java.util.List;
import java.util.UUID;

import com.organiscoapi.entity.BoardMemberId;
import com.organiscoapi.payload.BoardMemberDTO;

public interface BoardMemberService extends CrudService<BoardMemberDTO, BoardMemberId> {
    List<BoardMemberDTO> findByBoardId(UUID boardId);
    List<BoardMemberDTO> findByUserId(UUID userId);
}