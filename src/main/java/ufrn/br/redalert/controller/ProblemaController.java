package ufrn.br.redalert.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.redalert.model.Problema;
import ufrn.br.redalert.service.ProblemaService;


@RestController
@RequestMapping("problemas")
public class ProblemaController extends AbstractController<Problema, ProblemaService> {
    public ProblemaController(ProblemaService service){
        super(service);
    }
}