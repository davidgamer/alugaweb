package com.aluga.br.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity

public class Comodo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdComodo;

    @Column(name = "descricao", nullable = false, length = 100)
    private String descricao;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Comodo")
    private List<Imovel> imovels;

    public Integer getIdComodo() {
        return IdComodo;
    }

    public void setIdComodo(Integer IdComodo) {
        this.IdComodo = IdComodo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Imovel> getImovels() {
        return imovels;
    }

    public void setImovels(List<Imovel> imovels) {
        this.imovels = imovels;
    }

}
