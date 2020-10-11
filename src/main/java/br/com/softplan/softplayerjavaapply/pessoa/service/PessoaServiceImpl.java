package br.com.softplan.softplayerjavaapply.pessoa.service;

import br.com.softplan.softplayerjavaapply.core.exception.BusinessException;
import br.com.softplan.softplayerjavaapply.pessoa.entity.Pessoa;
import br.com.softplan.softplayerjavaapply.pessoa.repository.PessoaRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_ACCEPTABLE;

@Service
@RequiredArgsConstructor
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository repository;

    @Override
    public List<Pessoa> consultarTodas() {
        return repository.findAll();
    }

    @Override
    public Optional<Pessoa> consultarPorId(@NonNull final Long id) {
        return repository.findById(id);
    }

    @Override
    public Pessoa cadastrar(@NonNull final Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @Override
    public Pessoa atualizar(@NonNull final Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @Override
    public Pessoa deletar(@NonNull final Long id) {
        final Optional<Pessoa> pessoa = consultarPorId(id);
        repository.delete(pessoa.orElseThrow(() -> new BusinessException("Pessoa não encontrada", NOT_ACCEPTABLE)));
        return pessoa.get();
    }

}
