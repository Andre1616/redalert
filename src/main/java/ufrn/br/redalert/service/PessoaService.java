package ufrn.br.redalert.service;

import org.springframework.stereotype.Service;

import ufrn.br.redalert.model.Pessoa;
import ufrn.br.redalert.repository.PessoaRepository;

@Service
public class PessoaService extends AbstractService<Pessoa, PessoaRepository>{
    public PessoaService(PessoaRepository repository) {
        super(repository);
    }
}   

    