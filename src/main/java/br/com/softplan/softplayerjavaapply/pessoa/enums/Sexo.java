package br.com.softplan.softplayerjavaapply.pessoa.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sexo {

    FEMININO("Feminino"),
    MASCULINO("Masculino"),
    NAO_INFORMADO("N�o Informado");

    private String value;

}
