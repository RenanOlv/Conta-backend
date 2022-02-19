package com.renan.conta.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fatura")
public class Fatura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Banco;
	private Integer Divida;
	private Integer Situacao;
	private Date Data;

	public Fatura() {
	}

	public Fatura(Integer id, String banco, Integer divida, Integer situacao, Date data) {
		super();
		this.id = id;
		this.Banco = banco;
		this.Divida = divida;
		this.Situacao = situacao;
		this.Data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public Integer getDivida() {
		return Divida;
	}

	public void setDivida(Integer divida) {
		Divida = divida;
	}

	public Integer getSituacao() {
		return Situacao;
	}

	public void setSituacao(Integer situacao) {
		Situacao = situacao;
	}

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fatura other = (Fatura) obj;
		return Objects.equals(id, other.id);
	}
}
