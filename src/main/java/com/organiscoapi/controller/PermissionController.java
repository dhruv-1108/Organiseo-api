//package com.organiscoapi.controller;
//
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.organiscoapi.payload.PermissionDTO;
//import com.organiscoapi.service.CrudService;
//import com.organiscoapi.service.PermissionService;
//
//@RestController
//@RequestMapping("/api/permissions")
//public class PermissionController extends AbstractCrudController<PermissionDTO, UUID> {
//    @Autowired private CrudService<PermissionDTO, UUID> service;
//    @Override protected CrudService<PermissionDTO, UUID> getService() { return service; }
//}