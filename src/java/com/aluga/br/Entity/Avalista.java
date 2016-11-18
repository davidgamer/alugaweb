package com.aluga.br.Entity;



import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Avalista implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Idavalista;
	
	
	@Column(name = "viabilidade", nullable = false, length = 100)
	private String viablidade;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	private Pessoa pessoa;

    public Integer getIdavalista() {
        return Idavalista;
    }

    public void setIdavalista(Integer Idavalista) {
        this.Idavalista = Idavalista;
    }

    public String getViablidade() {
        return viablidade;
    }

    public void setViablidade(String viablidade) {
        this.viablidade = viablidade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

        
}
