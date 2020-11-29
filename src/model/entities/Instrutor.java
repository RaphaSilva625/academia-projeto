package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Instrutor implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer idInstrutor;
	private String titulo;
	private Boolean statusInstrutor;
	private Date dataAdmissao;
	private Date dataDemissao;
	private float salario;
	
	private Pessoa pessoa;

	public Instrutor() {
	}
	
	public Instrutor(Integer idInstrutor, String titulo, Boolean statusInstrutor, Date dataAdmissao, Date dataDemissao,
			float salario, Pessoa pessoa) {
		super();
		this.idInstrutor = idInstrutor;
		this.titulo = titulo;
		this.statusInstrutor = statusInstrutor;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.salario = salario;
		this.pessoa = pessoa;
	}

	public Integer getIdInstrutor() {
		return idInstrutor;
	}

	public void setIdInstrutor(Integer idInstrutor) {
		this.idInstrutor = idInstrutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Boolean getStatusInstrutor() {
		return statusInstrutor;
	}

	public void setStatusInstrutor(Boolean statusInstrutor) {
		this.statusInstrutor = statusInstrutor;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idInstrutor == null) ? 0 : idInstrutor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instrutor other = (Instrutor) obj;
		if (idInstrutor == null) {
			if (other.idInstrutor != null)
				return false;
		} else if (!idInstrutor.equals(other.idInstrutor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Instrutor [idInstrutor=" + idInstrutor + ", titulo=" + titulo + ", statusInstrutor=" + statusInstrutor
				+ ", dataAdmissao=" + dataAdmissao + ", dataDemissao=" + dataDemissao + ", salario=" + salario
				+ ", pessoa=" + pessoa + "]";
	}
}
