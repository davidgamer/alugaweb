package com.aluga.br.Entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity

public class UnidadeFederativa  implements Serializable{


	private static final long serialVersionUID = 1L;
	
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer UF;
	
        
        @Column(name =  "nomeEstado", length = 40)
	private String nomeEstado;

   

	
	
	
	
}
