package ufrn.br.redalert.service;

import org.springframework.stereotype.Service;

import ufrn.br.redalert.model.Problema;
import ufrn.br.redalert.repository.ProblemaRepository;

@Service
public class ProblemaService extends AbstractService<Problema, ProblemaRepository>{
    public ProblemaService(ProblemaRepository repository) {
        super(repository);
    }
} 