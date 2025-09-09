package com.organiscoapi.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.organiscoapi.entity.Board;
import com.organiscoapi.payload.BoardDTO;
import com.organiscoapi.repository.BoardRepository;
import com.organiscoapi.service.BoardService;

@Service
public class BoardServiceImpl extends AbstractCrudService<Board, BoardDTO, UUID> implements BoardService {
    @Autowired private BoardRepository repo;

    @Override protected JpaRepository<Board, UUID> getRepository() { return repo; }
    @Override protected Class<Board> getEntityClass() { return Board.class; }
    @Override protected Class<BoardDTO> getDtoClass() { return BoardDTO.class; }
}