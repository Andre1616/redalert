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

import ufrn.br.redalert.model.Usuario;
import ufrn.br.redalert.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    UsuarioService service;

    public UsuarioController(UsuarioService service){
        this.service = service;
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id){
        return service
        .findById(id)   
        .map(usuario -> {
            return ResponseEntity.ok(usuario);
        }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Usuario> listAll(){
        return service.listAll();
    }

    @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody Usuario u){
        return ResponseEntity.status(201).body(service.insert(u));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Usuario> update(@RequestBody Usuario u, @PathVariable Long id){
        return service
            .findById(id)
            .map(usuario -> {
                service.update(u);
                return ResponseEntity.ok().body(u);
        }).orElse(ResponseEntity.notFound().build());

    }

    
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return service
            .findById(id)
            .map(usuario -> {
                service.delete(id);
                return ResponseEntity.ok().build();
            }).orElse(ResponseEntity.notFound().build());
    }
}
