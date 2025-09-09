//package com.organiscoapi.controller;
//
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.organiscoapi.payload.SessionDTO;
//import com.organiscoapi.service.CrudService;
//import com.organiscoapi.service.SessionService;
//
//@RestController
//@RequestMapping("/api/sessions")
//public class SessionController extends AbstractCrudController<SessionDTO, UUID> {
//    @Autowired private CrudService<SessionDTO, UUID> service;
//    @Override protected CrudService<SessionDTO, UUID> getService() { return service; }
//}