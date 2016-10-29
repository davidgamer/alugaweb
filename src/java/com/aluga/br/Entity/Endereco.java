package com.aluga.br.Entity;



import java.io.Serializable;
import javax.persistence.*;

@Entity

public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEndereco;
    @Column(name = "cidade", length = 80, nullable = false)
    private String cidade;
    @Column(name = "bairro", length = 80, nullable = false)
    private String bairro;
    @Column(name = "numero", nullable = false)
    private Integer numero;
    @Column(name = "cep", nullable = false)
    private Integer cep;

    public Integer getIdEndereco() {
        return IdEndereco;
    }

    public void setIdEndereco(Integer IdEndereco) {
        this.IdEndereco = IdEndereco;
    }

}
