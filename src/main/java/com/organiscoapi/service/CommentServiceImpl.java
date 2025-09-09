package com.organiscoapi.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.organiscoapi.entity.Comment;
import com.organiscoapi.payload.CommentDTO;
import com.organiscoapi.repository.CommentRepository;
import com.organiscoapi.service.impl.AbstractCrudService;

@Service
public class CommentServiceImpl extends AbstractCrudService<Comment, CommentDTO, UUID> implements CommentService {
    @Autowired private CommentRepository repo;

    @Override protected JpaRepository<Comment, UUID> getRepository() { return repo; }
    @Override protected Class<Comment> getEntityClass() { return Comment.class; }
    @Override protected Class<CommentDTO> getDtoClass() { return CommentDTO.class; }
	@Override
	public List<CommentDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<CommentDTO> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	@Override
	public CommentDTO save(CommentDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CommentDTO update(UUID id, CommentDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
//	@Override
//	public boolean deleteById(UUID id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
}