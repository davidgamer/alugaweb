package com.aluga.br.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCliente;

    @Column(name = "intencao", nullable = false, length = 80)
    private String intencao;

     @Column(name = "nomeTitular", nullable = false, length = 80)
    private String nomeTitular;

     
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
        private List<Telefone> telefones;
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
        private List<Negociacao> negociacoes;

    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getIntencao() {
        return intencao;
    }

    public void setIntencao(String intencao) {
        this.intencao = intencao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Negociacao> getNegociacoes() {
        return negociacoes;
    }

    public void setNegociacoes(List<Negociacao> negociacoes) {
        this.negociacoes = negociacoes;
    }
        
        
     

}
