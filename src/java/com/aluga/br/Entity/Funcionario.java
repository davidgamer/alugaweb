package com.aluga.br.Entity;

import com.aluga.br.Entity.Pessoa;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity

public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Idfuncionaro;

    @Column(name = "salario", nullable = false)
    private Double salario;

    @Column(name = "comissao", nullable = false)
    private Double comissao;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPessoa")
    private Pessoa pessoa;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Funcionario")
    private List<Negociacao> negociacaos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCaixa", nullable = false)
    private Caixa caixa;

    public Integer getIdfuncionaro() {
        return Idfuncionaro;
    }

    public void setIdfuncionaro(Integer Idfuncionaro) {
        this.Idfuncionaro = Idfuncionaro;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Negociacao> getNegociacaos() {
        return negociacaos;
    }

    public void setNegociacaos(List<Negociacao> negociacaos) {
        this.negociacaos = negociacaos;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
    

}
