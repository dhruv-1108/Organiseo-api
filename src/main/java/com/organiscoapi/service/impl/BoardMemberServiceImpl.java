//package com.organiscoapi.service.impl;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.organiscoapi.entity.BoardMemberId;
//import com.organiscoapi.payload.BoardMemberDTO;
//import com.organiscoapi.repository.BoardMemberRepository;
//import com.organiscoapi.service.BoardMemberService;
//
//@Service
//public class BoardMemberServiceImpl implements BoardMemberService {
//
//    @Autowired private BoardMemberRepository repo;
//    @Autowired private ModelMapper modelMapper;
//
//    @Override
//    public List<BoardMemberDTO> findAll() {
//        return repo.findAll().stream()
//                .map(e -> modelMapper.map(e, BoardMemberDTO.class))
//                .toList();
//    }
//
//    @Override
//    public Optional<BoardMemberDTO> findById(BoardMemberId id) {
//        return repo.findById(id).map(e -> modelMapper.map(e, BoardMemberDTO.class));
//    }
//
//    @Override
//    public BoardMemberDTO create(BoardMemberDTO dto) {
//        BoardMember entity = modelMapper.map(dto, BoardMember.class);
//        entity.setId(new BoardMemberId(dto.getBoardId(), dto.getUserId()));
//        return modelMapper.map(repo.save(entity), BoardMemberDTO.class);
//    }
//
//    @Override
//    public Optional<BoardMemberDTO> update(BoardMemberId id, BoardMemberDTO dto) {
//        return repo.findById(id).map(existing -> {
//            // Only updatable field here is 'role'
//            existing.setRole(dto.getRole());
//            return modelMapper.map(repo.save(existing), BoardMemberDTO.class);
//        });
//    }
//
//    @Override
//    public boolean delete(BoardMemberId id) {
//        if (!repo.existsById(id)) return false;
//        repo.deleteById(id);
//        return true;
//    }
//
//    @Override
//    public List<BoardMemberDTO> findByBoardId(UUID boardId) {
//        return repo.findByBoard(new Board(boardId)) // or custom query in repo
//                .stream().map(e -> modelMapper.map(e, BoardMemberDTO.class)).toList();
//    }
//
//    @Override
//    public List<BoardMemberDTO> findByUserId(UUID userId) {
//        return repo.findByUser(new User(userId))
//                .stream().map(e -> modelMapper.map(e, BoardMemberDTO.class)).toList();
//    }
//
//	@Override
//	public Optional<BoardMemberDTO> findById(BoardMemberId id) {
//		// TODO Auto-generated method stub
//		return Optional.empty();
//	}
//
//	@Override
//	public BoardMemberDTO save(BoardMemberDTO dto) {
//		// TODO Auto-generated method stub
//		return null;
//	}
////
////	@Override
////	public BoardMemberDTO update1(BoardMemberId id, BoardMemberDTO dto) {
////		// TODO Auto-generated method stub
////		return null;
////	}
//
//	@Override
//	public void deleteById(BoardMemberId id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<BoardMemberDTO> findByBoardId(UUID boardId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<BoardMemberDTO> findByUserId(UUID userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}