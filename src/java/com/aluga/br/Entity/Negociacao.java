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

    public Integer getIdNegocio() {
        return IdNegocio;
    }

    public void setIdNegocio(Integer IdNegocio) {
        this.IdNegocio = IdNegocio;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoNegociacao getTipoNegociacao() {
        return tipoNegociacao;
    }

    public void setTipoNegociacao(TipoNegociacao tipoNegociacao) {
        this.tipoNegociacao = tipoNegociacao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    

    
    
    
}
