
import com.aluga.br.Entity.Pessoa;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name ="funcionario")
public class Funcionario implements Serializable {

	
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "Idfuncionaro", updatable = false, insertable = false, nullable = false)
	private Integer Idfuncionaro;
	
	@Column(name = "salario", nullable = false)
	private Double salario;
	
	@Column(name = "comissao", nullable = false)
	private Double comissao;

	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	private Pessoa pessoa;
	
	
	
}
