package ufrn.br.redalert.controller;

import ufrn.br.redalert.model.AbstractEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GenericController<E extends AbstractEntity>{

    List<E> findAll();
    E create(E entity);
    ResponseEntity<E> findById(Long id);
    ResponseEntity<E> update(Long id, E entity);
    ResponseEntity<?> delete(Long id);
    
}
