package com.aluga.br.Entity;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity


public class UnidadeFederativa  implements Serializable{


	private static final long serialVersionUID = 1L;
	
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer Iduf;
	
        
        @Column(name =  "nomeEstado", length = 40)
	private String nomeEstado;
        
     @OneToMany(fetch = FetchType.LAZY,mappedBy = "UnidadeFederativa")
        private List<Endereco> enderecos;   

    public Integer getIduf() {
        return Iduf;
    }

    public void setIduf(Integer Iduf) {
        this.Iduf = Iduf;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
   

	
	
	
	
}
