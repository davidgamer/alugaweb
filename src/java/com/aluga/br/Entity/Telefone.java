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
        
        
        

  
	

	
}
