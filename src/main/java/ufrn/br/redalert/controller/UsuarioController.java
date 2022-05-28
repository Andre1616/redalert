package ufrn.br.redalert.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufrn.br.redalert.model.Usuario;
import ufrn.br.redalert.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends AbstractController<Usuario, UsuarioService> {
    public UsuarioController(UsuarioService service){
        super(service);
    }
}