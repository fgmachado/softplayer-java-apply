package br.com.softplan.softplayerjavaapply.pessoa.repository;

import br.com.softplan.softplayerjavaapply.pessoa.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
