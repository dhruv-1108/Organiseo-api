package com.organiscoapi.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {
    List<T> findAll();
    Optional<T> findById(ID id);
    T save(T dto);            // create
    T update(ID id, T dto);   // update
    void deleteById(ID id);
}


