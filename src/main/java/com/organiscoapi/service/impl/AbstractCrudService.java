package com.organiscoapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.organiscoapi.service.CrudService;

public abstract class AbstractCrudService<E, D, ID> implements CrudService<D, ID> {

    @Autowired
    protected ModelMapper modelMapper;

    protected abstract JpaRepository<E, ID> getRepository();
    protected abstract Class<E> getEntityClass();
    protected abstract Class<D> getDtoClass();

    @Override
    public List<D> findAll() {
        return getRepository().findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, getDtoClass()))
                .toList();
    }

    @Override
    public Optional<D> findById(ID id) {
        return getRepository().findById(id)
                .map(entity -> modelMapper.map(entity, getDtoClass()));
    }

    @Override
    public D save(D dto) {
        E entity = modelMapper.map(dto, getEntityClass());
        E saved = getRepository().save(entity);
        return modelMapper.map(saved, getDtoClass());
    }

    @Override
    public D update(ID id, D dto) {
        return getRepository().findById(id)
                .map(existing -> {
                    modelMapper.map(dto, existing); // map DTO onto existing entity
                    E updated = getRepository().save(existing);
                    return modelMapper.map(updated, getDtoClass());
                })
                .orElseThrow(() -> new RuntimeException("Entity not found with id: " + id));
    }

    @Override
    public void deleteById(ID id) {
        getRepository().deleteById(id);
    }
}
