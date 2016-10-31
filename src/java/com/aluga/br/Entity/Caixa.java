package com.aluga.br.Entity;



import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Entity
public class Caixa implements Serializable{

	
	private static final long serialVersionUID = 1L;
        
	
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdCaixa;
	
        @Temporal(TemporalType.DATE)
	private Date dataCaixa;
	
	
	
	
	
	
	

}
