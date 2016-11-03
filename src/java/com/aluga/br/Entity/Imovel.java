package com.aluga.br.Entity;

import java.io.Serializable;
import java.util.List;
import javax.faces.view.StateManagementStrategy;
import javax.persistence.*;

@Entity
@Table(name = "imovel")
public class Imovel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdImovel;

	@Column(name = "valor", nullable = false)
	private float valor;
        
	@Column(name = "area", nullable = false)
	private float area;
        
	@Column(name = "areaconstruida", nullable = false)
	private float areaConstruida;
        
        
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "negociacao")
        private List<Negociacao> negociacaos;

}
