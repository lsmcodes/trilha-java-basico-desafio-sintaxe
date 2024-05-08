package io.github.lsmcodes.contabancaria.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {

        private Integer numero;
        private String agencia;
        private String nomeCliente;
        private Double saldo;

}