package com.aluga.br.Entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity

public class SituacaoImovel implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdSituacao;
	
	@Column(name = "situacao", nullable = false, length = 100)
	private String situacao;

    public Integer getIdSituacao() {
        return IdSituacao;
    }

    public void setIdSituacao(Integer IdSituacao) {
        this.IdSituacao = IdSituacao;
    }
	
	
	

}
