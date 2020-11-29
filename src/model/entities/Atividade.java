package model.entities;

import java.io.Serializable;

public class Atividade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer idAtividade;
	private String descricao;
	private Boolean status;
	
	public Atividade(Integer idAtividade, String descricao, Boolean status) {
		this.idAtividade = idAtividade;
		this.descricao = descricao;
		this.status = status;
	}
	
	public Integer getIdAtividade() {
		return idAtividade;
	}
	public void setIdAtividade(Integer idAtividade) {
		this.idAtividade = idAtividade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAtividade == null) ? 0 : idAtividade.hashCode());
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
		Atividade other = (Atividade) obj;
		if (idAtividade == null) {
			if (other.idAtividade != null)
				return false;
		} else if (!idAtividade.equals(other.idAtividade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Atividade [idAtividade=" + idAtividade + ", descricao=" + descricao + ", status=" + status + "]";
	}
}
