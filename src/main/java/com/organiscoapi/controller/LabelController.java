//package com.organiscoapi.controller;
//
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.organiscoapi.payload.LabelDTO;
//import com.organiscoapi.service.CrudService;
//import com.organiscoapi.service.LabelService;
//
//@RestController
//@RequestMapping("/api/labels")
//public class LabelController extends AbstractCrudController<LabelDTO, UUID> {
//    @Autowired private CrudService<LabelDTO, UUID> service;
//    @Override protected CrudService<LabelDTO, UUID> getService() { return service; }
//}