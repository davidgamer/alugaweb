package com.aluga.br.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCliente;

    @Column(name = "intencao", nullable = false, length = 80)
    private String intencao;

     @Column(name = "nomeTitular", nullable = false, length = 80)
    private String nomeTitular;

     
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "telefone")
        private List<Telefone> telefones;
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "negociacao")
        private List<Negociacao> negociacoes;
     

}
