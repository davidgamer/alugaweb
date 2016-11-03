package com.aluga.br.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "negociacao")
public class Negociacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdNegocio;

    @Column(name = "valorTotla", nullable = false)
    private float valorTotal;

    @Temporal(TemporalType.DATE)
    private Date dataRealizacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCliente", nullable = false)
    private Cliente cliente;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdTipoNegociacao", nullable = false)
    private TipoNegociacao tipoNegociacao;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Idfuncionaro", nullable = false)
    private Funcionario funcionario;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdImovel", nullable = false)
    private Imovel imovel;
    

}
