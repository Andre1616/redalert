package ufrn.br.redalert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufrn.br.redalert.model.Magistrado;

public interface MagistradoRepository extends JpaRepository<Magistrado, Long>{
    
}
