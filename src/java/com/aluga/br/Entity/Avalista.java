package com.aluga.br.Entity;



import com.aluga.br.Entity.Pessoa;
import java.io.Serializable;

import javax.persistence.*;


public class Avalista implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Idavalista", nullable = false)
	private Integer Idavalista;
	
	
	@Column(name = "viabilidade", nullable = false, length = 100)
	private String viablidade;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	private Pessoa pessoa;

}
