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
import ufrn.br.redalert.model.Processo;
import ufrn.br.redalert.service.ProcessoService;


@RestController
@RequestMapping("/api/processos")
public class ProcessoController {
    
    ProcessoService service;

    public ProcessoController(ProcessoService service){
        this.service = service;
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Processo> findById(@PathVariable Long id){
        return service
        .findById(id)   
        .map(processo -> {
            return ResponseEntity.ok(processo);
        }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Processo> listAll(){
        return service.listAll();
    }

    @PostMapping
    public ResponseEntity<Processo> insert(@RequestBody Processo p){
        return ResponseEntity.status(201).body(service.insert(p));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Processo> update(@RequestBody Processo p, @PathVariable Long id){
        return service
            .findById(id)
            .map(processo -> {
                service.update(p);
                return ResponseEntity.ok().body(p);
        }).orElse(ResponseEntity.notFound().build());

    }

    
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return service
            .findById(id)
            .map(processo -> {
                service.delete(id);
                return ResponseEntity.ok().build();
            }).orElse(ResponseEntity.notFound().build());
    }
}
