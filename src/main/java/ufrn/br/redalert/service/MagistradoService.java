package ufrn.br.redalert.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ufrn.br.redalert.model.Magistrado;
import ufrn.br.redalert.repository.MagistradoRepository;

@Service
public class MagistradoService {
    
    MagistradoRepository repository;

    public MagistradoService(MagistradoRepository repository){
        this.repository =repository;
    }

    public Magistrado insert(Magistrado m){
        return repository.save(m);
    }
    
    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<Magistrado> listAll(){
        return repository.findAll();
    }

    public Optional<Magistrado> findById(Long id){
        return repository.findById(id);     
    }

    public Magistrado update(Magistrado m){
        return repository.saveAndFlush(m);
    }
}
