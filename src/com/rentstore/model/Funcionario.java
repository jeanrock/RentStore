package com.rentstore.model;

// Generated 11/07/2013 17:45:57 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Funcionario generated by hbm2java
 */
@Entity
@Table(name = "funcionario", catalog = "concessionaria")
public class Funcionario implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4512615942280916102L;
	private Integer idfuncionario;
	
	
	private Pessoafisica pessoafisica;
	private String senha;
	private String usuario;
	private Set<Setor> setores = new HashSet<Setor>(0);

	public Funcionario() {
		this.pessoafisica = new Pessoafisica();
	}

	public Funcionario(Pessoafisica pessoafisica) {
		this.pessoafisica = pessoafisica;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idfuncionario", unique = true, nullable = false)
	public Integer getIdfuncionario() {
		return this.idfuncionario;
	}

	public void setIdfuncionario(Integer idfuncionario) {
		this.idfuncionario = idfuncionario;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name = "idpessoafisica", nullable = false)
	public Pessoafisica getPessoafisica() {
		return this.pessoafisica;
	}

	public void setPessoafisica(Pessoafisica pessoafisica) {
		this.pessoafisica = pessoafisica;
	}

	@Column(name = "senha", length = 50)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Column(name = "usuario", length = 50)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "funcionariosetor", catalog = "concessionaria", joinColumns = { @JoinColumn(name = "idfuncionario", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "idsetor", nullable = false, updatable = false) })
	public Set<Setor> getSetores() {
		return this.setores;
	}

	public void setSetores(Set<Setor> setores) {
		this.setores = setores;
	}

}