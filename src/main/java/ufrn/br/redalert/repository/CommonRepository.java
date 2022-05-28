package ufrn.br.redalert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufrn.br.redalert.model.AbstractEntity;

public interface CommonRepository <E extends AbstractEntity> extends JpaRepository<E, Long> {
    
}
