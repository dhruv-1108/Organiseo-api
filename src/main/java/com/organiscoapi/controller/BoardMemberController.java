//package com.organiscoapi.controller;
//
//import java.util.List;
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.organiscoapi.entity.BoardMemberId;
//import com.organiscoapi.payload.BoardMemberDTO;
//import com.organiscoapi.service.BoardMemberService;
//
//@RestController
//@RequestMapping("/api/board-members")
//public class BoardMemberController {
//
//	@org.springframework.beans.factory.annotation.Autowired(required=true) private BoardMemberService service;
//
//    @GetMapping
//    public List<BoardMemberDTO> getAll() { return service.findAll(); }
//
//    @GetMapping("/{boardId}/{userId}")
//    public ResponseEntity<BoardMemberDTO> getOne(@PathVariable UUID boardId, @PathVariable UUID userId) {
//        return service.findById(new BoardMemberId(boardId, userId))
//                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public ResponseEntity<BoardMemberDTO> create(@RequestBody BoardMemberDTO dto) {
//        return ResponseEntity.ok(service.save(dto));
//    }
//
////    @PutMapping("/{boardId}/{userId}")
////    public ResponseEntity<BoardMemberDTO> update(@PathVariable UUID boardId, @PathVariable UUID userId,
////                                                 @RequestBody BoardMemberDTO dto) {
////        return service.update(new BoardMemberId(boardId, userId), dto.getId())
////                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
////    }
//
////    @DeleteMapping("/{boardId}/{userId}")
////    public ResponseEntity<Void> delete(@PathVariable UUID boardId, @PathVariable UUID userId) {
////        boolean removed = service.delete(new BoardMemberId(boardId, userId));
////        return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
////    }
//}
