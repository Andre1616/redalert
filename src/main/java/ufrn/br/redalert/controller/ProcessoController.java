package ufrn.br.redalert.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.redalert.model.Processo;
import ufrn.br.redalert.service.ProcessoService;


@RestController
@RequestMapping("/processos")
public class ProcessoController extends AbstractController<Processo, ProcessoService> {
    public ProcessoController(ProcessoService service){
        super(service);
    }
}