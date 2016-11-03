package com.aluga.br.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;



@Entity
@Table(name = "tiponegociacao")
public class TipoNegociacao implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdTipoNegociacao;
	
	@Column(name = "descricaoTipo", nullable = false, length = 100)
	private String descricaoTipo;
        
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "tiponegociacao")
        private List<Negociacao> negociacaos;

   
	
	
	
	

}
