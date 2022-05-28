package ufrn.br.redalert.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufrn.br.redalert.model.Pessoa;
import ufrn.br.redalert.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController extends AbstractController<Pessoa, PessoaService> {
    public PessoaController(PessoaService service){
        super(service);
    }
}