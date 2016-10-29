package com.aluga.br.Entity;




import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdPessoa",nullable=false)
	private Integer IdPessoa;
	
	@Column(name="Nome",nullable=false,length = 80)
	private String Nome;
	
	@Column(name="CPF",nullable=false)
	private Integer Cpf;
	
	
	

	public Integer getIdPessoa() {
		return IdPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		IdPessoa = idPessoa;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Integer getCpf() {
		return Cpf;
	}

	public void setCpf(Integer cpf) {
		Cpf = cpf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa",cascade = CascadeType.ALL)
	private Usuario usuario;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa",cascade = CascadeType.ALL)
	private Avalista avalista;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa",cascade = CascadeType.ALL)
	private Funcionario funcionario;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa",cascade = CascadeType.ALL)
	private Propietario propietario;
	
	
	
	

}
