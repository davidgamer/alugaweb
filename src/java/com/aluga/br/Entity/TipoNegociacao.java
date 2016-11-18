package com.aluga.br.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;



@Entity

public class TipoNegociacao implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdTipoNegociacao;
	
	@Column(name = "descricaoTipo", nullable = false, length = 100)
	private String descricaoTipo;
        
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "TipoNegociacao")
        private List<Negociacao> negociacaos;

    public Integer getIdTipoNegociacao() {
        return IdTipoNegociacao;
    }

    public void setIdTipoNegociacao(Integer IdTipoNegociacao) {
        this.IdTipoNegociacao = IdTipoNegociacao;
    }

    public String getDescricaoTipo() {
        return descricaoTipo;
    }

    public void setDescricaoTipo(String descricaoTipo) {
        this.descricaoTipo = descricaoTipo;
    }

    public List<Negociacao> getNegociacaos() {
        return negociacaos;
    }

    public void setNegociacaos(List<Negociacao> negociacaos) {
        this.negociacaos = negociacaos;
    }

   
	
	
	
	

}
