package com.aluga.br.Entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity

public class CategoriaImovel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCategoria;

    @Column(name = "descricao", nullable = false, length = 100)
    private String descricao;

    public Integer getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(Integer IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

}
