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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class Propietario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Idpropietario;

    @Column(name = "numImoveis", nullable = false)
    private int numImoveis;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPessoa")
    private Pessoa pessoa;
    
    
    @OneToMany(fetch =  FetchType.LAZY, mappedBy = "Propietario")
    private List<Imovel> imovels;

    public Integer getIdpropietario() {
        return Idpropietario;
    }

    public void setIdpropietario(Integer Idpropietario) {
        this.Idpropietario = Idpropietario;
    }

    public int getNumImoveis() {
        return numImoveis;
    }

    public void setNumImoveis(int numImoveis) {
        this.numImoveis = numImoveis;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Imovel> getImovels() {
        return imovels;
    }

    public void setImovels(List<Imovel> imovels) {
        this.imovels = imovels;
    }
    
    
    
}
