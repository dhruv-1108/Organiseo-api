package com.organiscoapi.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organiscoapi.payload.AttachmentDTO;
import com.organiscoapi.service.CrudService;

@RestController
@RequestMapping("/api/attachments")
public class AttachmentController extends AbstractCrudController<AttachmentDTO, UUID> {
    @Autowired protected CrudService<AttachmentDTO, UUID> service;
    @Override protected CrudService<AttachmentDTO, UUID> getService() { return service; }
}