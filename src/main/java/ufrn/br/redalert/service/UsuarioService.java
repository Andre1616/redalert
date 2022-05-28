package ufrn.br.redalert.service;

import org.springframework.stereotype.Service;

import ufrn.br.redalert.model.Usuario;
import ufrn.br.redalert.repository.UsuarioRepository;

@Service
public class UsuarioService extends AbstractService<Usuario, UsuarioRepository>{
    public UsuarioService(UsuarioRepository repository) {
        super(repository);
    }
}  