package com.aluga.br.Entity;

import java.io.Serializable;
import javax.persistence.*;



@Entity

public class TipoNegociacao implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdTipoNegociacao;
	
	
	private String descricaoTipo;

    public Integer getIdTipoNegociacao() {
        return IdTipoNegociacao;
    }

    public void setIdTipoNegociacao(Integer IdTipoNegociacao) {
        this.IdTipoNegociacao = IdTipoNegociacao;
    }
	
	
	
	

}
