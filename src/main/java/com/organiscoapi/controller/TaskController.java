//package com.organiscoapi.controller;
//
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.organiscoapi.payload.TaskDTO;
//import com.organiscoapi.service.CrudService;
//import com.organiscoapi.service.TaskService;
//
//@RestController
//@RequestMapping("/api/tasks")
//public class TaskController extends AbstractCrudController<TaskDTO, UUID> {
//    @Autowired private CrudService<TaskDTO, UUID> service;
//    @Override protected CrudService<TaskDTO, UUID> getService() { return service; }
//}