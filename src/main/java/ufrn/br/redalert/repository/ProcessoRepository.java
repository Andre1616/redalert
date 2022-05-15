package ufrn.br.redalert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufrn.br.redalert.model.Processo;

public interface ProcessoRepository extends JpaRepository<Processo, Long>{
    
}
