package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String cpf;
	private String nome;
	private Date date;
	private String rg;
	private String senha;
	private Boolean responsavel;
	private Integer codigo;
	
	private Endereco endereco;
	private Telefone telefone;
	
	public Pessoa() {
	}
	
	public Pessoa(String cpf, String nome, Date date, String rg, String senha, Boolean responsavel, Integer codigo, Endereco endereco, Telefone telefone) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.date = date;
		this.rg = rg;
		this.senha = senha;
		this.responsavel = responsavel;
		this.codigo = codigo;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Boolean responsavel) {
		this.responsavel = responsavel;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", date=" + date + ", rg=" + rg + ", senha=" + senha
				+ ", responsavel=" + responsavel + ", codigo=" + codigo + ", endereco=" + endereco + ", telefone="
				+ telefone + "]";
	}
}
