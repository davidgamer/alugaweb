package com.aluga.br.Entity;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="cliente")
public class Cliente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	private Integer IdCliente;
	
	private Integer intencao;
	
	private String nomeTitular;
	
	
	

}
