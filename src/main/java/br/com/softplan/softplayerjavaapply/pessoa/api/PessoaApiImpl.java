package br.com.softplan.softplayerjavaapply.pessoa.api;

import br.com.softplan.softplayerjavaapply.pessoa.entity.Pessoa;
import br.com.softplan.softplayerjavaapply.pessoa.service.PessoaService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PessoaApiImpl implements PessoaApi {

    private final PessoaService service;

    @Override
    public List<Pessoa> consultarTodas() {
        return service.consultarTodas();
    }

    @Override
    public Pessoa cadastrar(@NonNull final Pessoa pessoa) {
        return service.cadastrar(pessoa);
    }

    @Override
    public Pessoa atualizar(@NonNull final Pessoa pessoa) {
        return service.atualizar(pessoa);
    }

    @Override
    public Pessoa deletar(@NonNull final Long id) {
        return service.deletar(id);
    }

}
