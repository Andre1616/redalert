package ufrn.br.redalert.service;

import org.springframework.stereotype.Service;
import ufrn.br.redalert.model.Processo;
import ufrn.br.redalert.repository.ProcessoRepository;


@Service
public class ProcessoService extends AbstractService<Processo, ProcessoRepository>{
    public ProcessoService(ProcessoRepository repository) {
        super(repository);
    }
}  