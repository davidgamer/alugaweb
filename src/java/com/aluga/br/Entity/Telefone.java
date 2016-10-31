package com.aluga.br.Entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity

public class Telefone implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdTelefone;
	
	private  Integer numero; 

    public Integer getIdTelefone() {
        return IdTelefone;
    }

    public void setIdTelefone(Integer IdTelefone) {
        this.IdTelefone = IdTelefone;
    }
	
	

	
}
