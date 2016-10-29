

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.*;


@Entity	
public class SaidaCaixa implements Serializable{

	
private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer IdsaidaCaixa;

    @Column(name = "valor", nullable = false)
	private float valor;
	
    @Temporal(TemporalType.DATE)
	private Date dataEntrada;

    public Integer getIdsaidaCaixa() {
        return IdsaidaCaixa;
    }

    public void setIdsaidaCaixa(Integer IdsaidaCaixa) {
        this.IdsaidaCaixa = IdsaidaCaixa;
    }
}
