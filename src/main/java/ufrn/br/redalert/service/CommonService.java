package ufrn.br.redalert.service;

import java.util.List;
import java.util.Optional;
import ufrn.br.redalert.model.AbstractEntity;

public interface CommonService <E extends AbstractEntity> {
    
    List<E> findAll();
    E create(E entity);
    Optional<E> findById(Long id);
    Optional<E> update(Long id, E entity);
    Boolean delete(Long id);
    
}
