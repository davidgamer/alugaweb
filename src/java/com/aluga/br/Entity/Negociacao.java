package com.aluga.br.Entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Entity
public class Negociacao implements Serializable{


	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdNegocio;
	
    @Column(name = "valorTotla", nullable = false)
	private float valorTotal;
	
    @Temporal(TemporalType.DATE)
	private Date dataRealizacao;

  
	
	
	
	

}
