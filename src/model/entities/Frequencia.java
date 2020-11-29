package model.entities;

import java.util.Date;

public class Frequencia {
	
	private String idFrequencia;
	private Date dataFalta;
	private String motivo;
	private Integer codAlunoTurma;
	
	public Frequencia() {
	}
	
	public Frequencia(String idFrequencia, Date dataFalta, String motivo, Integer codAlunoTurma) {
		this.idFrequencia = idFrequencia;
		this.dataFalta = dataFalta;
		this.motivo = motivo;
		this.codAlunoTurma = codAlunoTurma;
	}

	public String getIdFrequencia() {
		return idFrequencia;
	}

	public void setIdFrequencia(String idFrequencia) {
		this.idFrequencia = idFrequencia;
	}

	public Date getDataFalta() {
		return dataFalta;
	}

	public void setDataFalta(Date dataFalta) {
		this.dataFalta = dataFalta;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Integer getCodAlunoTurma() {
		return codAlunoTurma;
	}

	public void setCodAlunoTurma(Integer codAlunoTurma) {
		this.codAlunoTurma = codAlunoTurma;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFrequencia == null) ? 0 : idFrequencia.hashCode());
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
		Frequencia other = (Frequencia) obj;
		if (idFrequencia == null) {
			if (other.idFrequencia != null)
				return false;
		} else if (!idFrequencia.equals(other.idFrequencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Frequencia [idFrequencia=" + idFrequencia + ", dataFalta=" + dataFalta + ", motivo=" + motivo
				+ ", codAlunoTurma=" + codAlunoTurma + "]";
	}
}
