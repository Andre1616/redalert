package ufrn.br.redalert.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


import ufrn.br.redalert.model.AbstractEntity;
import ufrn.br.redalert.service.AbstractService;

public class AbstractController <E extends AbstractEntity, S extends AbstractService> implements GenericController<E> {
    protected final S service;

    public AbstractController(S service) {
        this.service = service;
    }
    

    @Override
    @GetMapping
    public List<E> findAll() {
        return service.findAll();
    }

    @Override
    @PostMapping
    public E create(@RequestBody E entity) {
        return (E) service.create(entity);
    }

    @Override
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<E> findById(@PathVariable Long id) {
        return (ResponseEntity<E>) service.findById(id)
                .map(record -> ResponseEntity.ok().body( (E) record))
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    @PutMapping(value = "/{id}")
    public ResponseEntity<E> update(@PathVariable Long id, @RequestBody E entity) {

        return (ResponseEntity<E>) service.update(id, entity)
                .map( record ->ResponseEntity.ok().body((E) record ))
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (service.delete(id)){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
