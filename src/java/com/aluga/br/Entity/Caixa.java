package com.aluga.br.Entity;



import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "caixa")
public class Caixa implements Serializable{

	
	private static final long serialVersionUID = 1L;
        
	
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdCaixa;
	
        @Temporal(TemporalType.DATE)
	private Date dataCaixa;
        
        @OneToMany(fetch = FetchType.LAZY , mappedBy = "saida")
        private List<SaidaCaixa> saidas;
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "entrada")
        private List<EntradaCaixa> entradas;
        
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionario")
        private List<Funcionario> funcionarios;
        
	
	
	
	
	
	
	

}
