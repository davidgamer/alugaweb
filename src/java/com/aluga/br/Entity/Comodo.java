package com.aluga.br.Entity;

import java.io.Serializable;
import javax.persistence.*;
@Entity

public class Comodo implements Serializable {
	
	
	
	
	private static final long serialVersionUID = 1L;
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdComodo;
	
	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;

    public Integer getIdComodo() {
        return IdComodo;
    }

    public void setIdComodo(Integer IdComodo) {
        this.IdComodo = IdComodo;
    }

}
