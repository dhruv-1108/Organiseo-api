package com.organiscoapi.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.organiscoapi.entity.Attachment;
import com.organiscoapi.payload.AttachmentDTO;
import com.organiscoapi.repository.AttachmentRepository;
import com.organiscoapi.service.AttachmentService;

@Service
public class AttachmentServiceImpl extends AbstractCrudService<Attachment, AttachmentDTO, UUID> implements AttachmentService {
    @Autowired private AttachmentRepository repo;

    @Override protected JpaRepository<Attachment, UUID> getRepository() { return repo; }
    @Override protected Class<Attachment> getEntityClass() { return Attachment.class; }
    @Override protected Class<AttachmentDTO> getDtoClass() { return AttachmentDTO.class; }
}