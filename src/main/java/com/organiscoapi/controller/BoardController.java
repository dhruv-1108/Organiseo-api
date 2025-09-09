package com.organiscoapi.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organiscoapi.payload.BoardDTO;
import com.organiscoapi.service.BoardService;
import com.organiscoapi.service.CrudService;

@RestController
@RequestMapping("/api/boards")
public class BoardController extends AbstractCrudController<BoardDTO, UUID> {
    @Autowired private CrudService<BoardDTO, UUID> service;
    @Override protected CrudService<BoardDTO, UUID> getService() { return service; }
}