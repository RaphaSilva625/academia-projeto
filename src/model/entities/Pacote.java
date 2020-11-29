package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Pacote implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer idPacote;
	private float valor;
	private String tipoPacote;
	private String descricao;
	private Date dataInicial;
	private Date dataFinal;
	
	public Pacote() {
	}
	
	public Pacote(Integer idPacote, float valor, String tipoPacote, String descricao, Date dataInicial,
			Date dataFinal) {
		super();
		this.idPacote = idPacote;
		this.valor = valor;
		this.tipoPacote = tipoPacote;
		this.descricao = descricao;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public Integer getIdPacote() {
		return idPacote;
	}

	public void setIdPacote(Integer idPacote) {
		this.idPacote = idPacote;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getTipoPacote() {
		return tipoPacote;
	}

	public void setTipoPacote(String tipoPacote) {
		this.tipoPacote = tipoPacote;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPacote == null) ? 0 : idPacote.hashCode());
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
		Pacote other = (Pacote) obj;
		if (idPacote == null) {
			if (other.idPacote != null)
				return false;
		} else if (!idPacote.equals(other.idPacote))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pacote [idPacote=" + idPacote + ", valor=" + valor + ", tipoPacote=" + tipoPacote + ", descricao="
				+ descricao + ", dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + "]";
	}
}
