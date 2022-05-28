package ufrn.br.redalert.service;

import org.springframework.stereotype.Service;

import ufrn.br.redalert.model.Secao;
import ufrn.br.redalert.repository.SecaoRepository;

@Service
public class SecaoService extends AbstractService<Secao, SecaoRepository>{
    public SecaoService(SecaoRepository repository) {
        super(repository);
    }
}  