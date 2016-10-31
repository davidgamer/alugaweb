package com.aluga.br.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity

public class EntradaCaixa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdentradaCaixa;

    @Column(name = "valor", nullable = false)
    private float valor;
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;

    public Integer getIdentradaCaixa() {
        return IdentradaCaixa;
    }

    public void setIdentradaCaixa(Integer IdentradaCaixa) {
        this.IdentradaCaixa = IdentradaCaixa;
    }

}
