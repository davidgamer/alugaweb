package com.aluga.br.Entity;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.*;

@Entity

public class SaidaCaixa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdsaidaCaixa;

    @Column(name = "valor", nullable = false)
    private float valor;

    @Temporal(TemporalType.DATE)
    private Date dataEntrada;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCaixa", nullable = false)
    private Caixa caixa;

    public Integer getIdsaidaCaixa() {
        return IdsaidaCaixa;
    }

    public void setIdsaidaCaixa(Integer IdsaidaCaixa) {
        this.IdsaidaCaixa = IdsaidaCaixa;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
    
    
    

    
    
    
}
