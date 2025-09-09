package com.organiscoapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.organiscoapi.service.CrudService;

@RestController
public abstract class AbstractCrudController<D, ID> {

    protected abstract CrudService<D, ID> getService();

    @GetMapping
    public List<D> getAll() {
        return getService().findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> getOne(@PathVariable ID id) {
        return getService().findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<D> create(@RequestBody D dto) {
        D created = getService().save(dto);
        return ResponseEntity.ok(created);
    }

    @SuppressWarnings("unchecked")
	@PutMapping("/{id}")
    public ResponseEntity<D> update(@PathVariable ID id, @RequestBody D dto) {
        return ((Optional<D>) getService().update(id, dto))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ID id) {
         getService().deleteById(id);
        
    }
}
