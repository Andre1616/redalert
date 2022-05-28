package ufrn.br.redalert.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.redalert.model.Secao;
import ufrn.br.redalert.service.SecaoService;

@RestController
@RequestMapping("/secoes")
public class SecaoController extends AbstractController<Secao, SecaoService> {
    public SecaoController(SecaoService service){
        super(service);
    }
}