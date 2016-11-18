package com.aluga.br.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity

public class Imovel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdImovel;

    @Column(name = "valor", nullable = false)
    private float valor;

    @Column(name = "area", nullable = false)
    private float area;

    @Column(name = "areaconstruida", nullable = false)
    private float areaConstruida;

    @Column(name = "numComodos", nullable = true)
    private Integer numComodos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Imovel")
    private List<Negociacao> negociacaos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCategoria", nullable = false)
    private CategoriaImovel categoriaImovel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdSituacao",nullable = false)
    private SituacaoImovel situacaoImovel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Idpropietario", nullable = false)
    private Propietario propietario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdComodo", nullable = false)
    private Comodo comodo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Imovel")
    private List<Endereco> enderecos;

    public SituacaoImovel getSituacaoImovel() {
        return situacaoImovel;
    }

    public void setSituacaoImovel(SituacaoImovel situacaoImovel) {
        this.situacaoImovel = situacaoImovel;
    }

   

    public Integer getIdImovel() {
        return IdImovel;
    }

    public void setIdImovel(Integer IdImovel) {
        this.IdImovel = IdImovel;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public Integer getNumComodos() {
        return numComodos;
    }

    public void setNumComodos(Integer numComodos) {
        this.numComodos = numComodos;
    }

    public List<Negociacao> getNegociacaos() {
        return negociacaos;
    }

    public void setNegociacaos(List<Negociacao> negociacaos) {
        this.negociacaos = negociacaos;
    }

    public CategoriaImovel getCategoriaImovel() {
        return categoriaImovel;
    }

    public void setCategoriaImovel(CategoriaImovel categoriaImovel) {
        this.categoriaImovel = categoriaImovel;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Comodo getComodo() {
        return comodo;
    }

    public void setComodo(Comodo comodo) {
        this.comodo = comodo;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
