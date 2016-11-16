package com.aluga.br.Entity;



import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "caixa")
public class Caixa implements Serializable{

	
	private static final long serialVersionUID = 1L;
        
	
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdCaixa;
	
        @Temporal(TemporalType.DATE)
	private Date dataCaixa;
        
        @OneToMany(fetch = FetchType.LAZY , mappedBy = "saida")
        private List<SaidaCaixa> saidas;
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "entrada")
        private List<EntradaCaixa> entradas;
        
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionario")
        private List<Funcionario> funcionarios;

    public Integer getIdCaixa() {
        return IdCaixa;
    }

    public void setIdCaixa(Integer IdCaixa) {
        this.IdCaixa = IdCaixa;
    }

    public Date getDataCaixa() {
        return dataCaixa;
    }

    public void setDataCaixa(Date dataCaixa) {
        this.dataCaixa = dataCaixa;
    }

    public List<SaidaCaixa> getSaidas() {
        return saidas;
    }

    public void setSaidas(List<SaidaCaixa> saidas) {
        this.saidas = saidas;
    }

    public List<EntradaCaixa> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<EntradaCaixa> entradas) {
        this.entradas = entradas;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
        
	
	
	
	
	
	
	

}
