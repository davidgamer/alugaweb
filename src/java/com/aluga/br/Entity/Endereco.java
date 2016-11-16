package com.aluga.br.Entity;



import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name ="endereco")

public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEndereco;
    @Column(name = "cidade", length = 80, nullable = false)
    private String cidade;
    @Column(name = "bairro", length = 80, nullable = false)
    private String bairro;
    @Column(name = "numero", nullable = false)
    private Integer numero;
    @Column(name = "cep", nullable = false)
    private Integer cep;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Iduf",nullable = false)
    private UnidadeFederativa uf;

    
         @ManyToOne(fetch = FetchType.LAZY)
         @JoinColumn(name = "IdImovel",nullable = false)
         private Imovel imovel;
         
         
         @ManyToOne(fetch = FetchType.LAZY)
         @JoinColumn(name = "IdPessoa",nullable = false)
         private Pessoa pessoa;

    public Integer getIdEndereco() {
        return IdEndereco;
    }

    public void setIdEndereco(Integer IdEndereco) {
        this.IdEndereco = IdEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
  
  
    
    
    
}
