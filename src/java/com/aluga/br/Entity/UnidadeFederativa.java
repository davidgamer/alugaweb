package com.aluga.br.Entity;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="uf")

public class UnidadeFederativa  implements Serializable{


	private static final long serialVersionUID = 1L;
	
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer Iduf;
	
        
        @Column(name =  "nomeEstado", length = 40)
	private String nomeEstado;
        
     @OneToMany(fetch = FetchType.LAZY,mappedBy = "endereco")
        private List<Endereco> enderecos;   
   

	
	
	
	
}
