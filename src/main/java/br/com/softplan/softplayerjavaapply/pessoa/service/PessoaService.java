package br.com.softplan.softplayerjavaapply.pessoa.service;

import br.com.softplan.softplayerjavaapply.pessoa.entity.Pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaService {

    List<Pessoa> consultarTodas();

    Optional<Pessoa> consultarPorId(final Long id);

    Pessoa cadastrar(final Pessoa pessoa);

    Pessoa atualizar(final Pessoa pessoa);

    Pessoa deletar(final Long id);

}
