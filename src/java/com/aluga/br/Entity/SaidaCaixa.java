package com.aluga.br.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "saida")
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

    
    
    
}
