package com.organiscoapi.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organiscoapi.payload.CommentDTO;
import com.organiscoapi.service.CommentService;
import com.organiscoapi.service.CrudService;

@RestController
@RequestMapping("/api/comments")
public class CommentController extends AbstractCrudController<CommentDTO, UUID> {
    @Autowired private CrudService<CommentDTO, UUID> service;
    @Override protected CrudService<CommentDTO, UUID> getService() { return service; }
}