package com.aluga.br.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="categoriaimovel")

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

    
    @OneToMany(fetch =  FetchType.LAZY, mappedBy = "imovel")
    private List<Imovel> imovels;
}
