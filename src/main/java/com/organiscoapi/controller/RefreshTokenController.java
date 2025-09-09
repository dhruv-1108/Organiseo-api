//package com.organiscoapi.controller;
//
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.organiscoapi.payload.RefreshTokenDTO;
//import com.organiscoapi.service.CrudService;
//import com.organiscoapi.service.RefreshTokenService;
//
//@RestController
//@RequestMapping("/api/refresh-tokens")
//public class RefreshTokenController extends AbstractCrudController<RefreshTokenDTO, UUID> {
//    @Autowired private CrudService<RefreshTokenDTO, UUID> service;
//    @Override protected CrudService<RefreshTokenDTO, UUID> getService() { return service; }
//}