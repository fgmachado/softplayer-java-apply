package br.com.softplan.softplayerjavaapply.pessoa.entity;

import br.com.softplan.softplayerjavaapply.pessoa.enums.Sexo;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private Sexo sexo;

    private String email;

    private Date nascimento;

    private String naturalidade;

    private String nacionalidade;

    private String cpf;

    private Date cadastro;

    private Date atualizacao;

}
