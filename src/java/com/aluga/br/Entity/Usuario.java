package com.aluga.br.Entity;

import com.aluga.br.Entity.Pessoa;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Idusuario", updatable = false, insertable = false, nullable = false)
	private Integer Idusuario;

	@Column(name = "login", nullable = false, length = 50)
	private String login;
	@Column(name = "senha", nullable = false, length = 50)
	private String senha;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	private Pessoa pessoa;

}
