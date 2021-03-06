package br.com.concessionaria.model;

// Generated 11/07/2013 17:45:57 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pagamento generated by hbm2java
 */
@Entity
@Table(name = "pagamento", catalog = "concessionaria")
public class Pagamento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2565755517465061336L;
	private Integer idpagamento;
	private Funcionario funcionario;
	private Promocao promocao;
	private BigDecimal valor;
	private Date datalancamento;
	private Date datapagamento;
	private Set<Locacao> locacaos = new HashSet<Locacao>(0);
	private Set<Boleto> boletos = new HashSet<Boleto>(0);

	public Pagamento() {
	}

	public Pagamento(Funcionario funcionario, Promocao promocao,
			BigDecimal valor, Date datalancamento, Date datapagamento,
			Set<Locacao> locacaos, Set<Boleto> boletos) {
		this.funcionario = funcionario;
		this.promocao = promocao;
		this.valor = valor;
		this.datalancamento = datalancamento;
		this.datapagamento = datapagamento;
		this.locacaos = locacaos;
		this.boletos = boletos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idpagamento", unique = true, nullable = false)
	public Integer getIdpagamento() {
		return this.idpagamento;
	}

	public void setIdpagamento(Integer idpagamento) {
		this.idpagamento = idpagamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idfuncbaixa")
	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpromocao")
	public Promocao getPromocao() {
		return this.promocao;
	}

	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}

	@Column(name = "valor", precision = 15)
	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datalancamento", length = 10)
	public Date getDatalancamento() {
		return this.datalancamento;
	}

	public void setDatalancamento(Date datalancamento) {
		this.datalancamento = datalancamento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datapagamento", length = 10)
	public Date getDatapagamento() {
		return this.datapagamento;
	}

	public void setDatapagamento(Date datapagamento) {
		this.datapagamento = datapagamento;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pagamento")
	public Set<Locacao> getLocacaos() {
		return this.locacaos;
	}

	public void setLocacaos(Set<Locacao> locacaos) {
		this.locacaos = locacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pagamento")
	public Set<Boleto> getBoletos() {
		return this.boletos;
	}

	public void setBoletos(Set<Boleto> boletos) {
		this.boletos = boletos;
	}

}
