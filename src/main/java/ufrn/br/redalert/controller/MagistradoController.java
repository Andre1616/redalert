package ufrn.br.redalert.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufrn.br.redalert.model.Magistrado;
import ufrn.br.redalert.service.MagistradoService;

@RestController
@RequestMapping("/magistrados")
public class MagistradoController {
    
    MagistradoService service;

    public MagistradoController(MagistradoService service){
        this.service = service;
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Magistrado> findById(@PathVariable Long id){
        return service
        .findById(id)   
        .map(magistrado -> {
            return ResponseEntity.ok(magistrado);
        }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Magistrado> listAll(){
        return service.listAll();
    }

    @PostMapping
    public ResponseEntity<Magistrado> insert(@RequestBody Magistrado m){
        return ResponseEntity.status(201).body(service.insert(m));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Magistrado> update(@RequestBody Magistrado m, @PathVariable Long id){
        return service
            .findById(id)
            .map(magistrado -> {
                service.update(m);
                return ResponseEntity.ok().body(m);
        }).orElse(ResponseEntity.notFound().build());

    }

    
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return service
            .findById(id)
            .map(magistrado -> {
                service.delete(id);
                return ResponseEntity.ok().build();
            }).orElse(ResponseEntity.notFound().build());
    }
}
