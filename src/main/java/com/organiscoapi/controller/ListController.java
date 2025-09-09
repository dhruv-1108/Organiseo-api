//package com.organiscoapi.controller;
//
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.organiscoapi.payload.ListEntityDTO;
//import com.organiscoapi.service.CrudService;
//import com.organiscoapi.service.ListService;
//
//@RestController
//@RequestMapping("/api/lists")
//public class ListController extends AbstractCrudController<ListEntityDTO, UUID> {
//    @Autowired private CrudService<ListEntityDTO, UUID> service;
//    @Override protected CrudService<ListEntityDTO, UUID> getService() { return service; }
//}