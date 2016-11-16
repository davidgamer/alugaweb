package com.aluga.br.Entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdTelefone;
    
        @Column(name ="numero", nullable = false)
	private  Integer numero; 
        
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "IdPessoa",nullable = false)
        private Pessoa pessoa;
        
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "IdCliente",nullable = false)
        private Cliente cliente;

    public Integer getIdTelefone() {
        return IdTelefone;
    }

    public void setIdTelefone(Integer IdTelefone) {
        this.IdTelefone = IdTelefone;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
        
        
        

  
	

	
}
