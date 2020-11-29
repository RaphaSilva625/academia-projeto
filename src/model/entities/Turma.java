package model.entities;

import java.util.Date;

public class Turma {

	private Integer idTurma;
	private Integer qtdAluno;
	private String horario;
	private Date dataInicial;
	private Date dataFinal;
	private String tipoTurma;
	private Integer statusTurma;
	
	private Atividade atividade;
	private Instrutor instrutor;
	private Aluno aluno;
	
	public Turma() {
	}

	public Turma(Integer idTurma, Integer qtdAluno, String horario, Date dataInicial, Date dataFinal, String tipoTurma,
			Integer statusTurma, Atividade atividade, Instrutor instrutor, Aluno aluno) {
		this.idTurma = idTurma;
		this.qtdAluno = qtdAluno;
		this.horario = horario;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.tipoTurma = tipoTurma;
		this.statusTurma = statusTurma;
		this.atividade = atividade;
		this.instrutor = instrutor;
		this.aluno = aluno;
	}

	public Integer getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}

	public Integer getQtdAluno() {
		return qtdAluno;
	}

	public void setQtdAluno(Integer qtdAluno) {
		this.qtdAluno = qtdAluno;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
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

	public String getTipoTurma() {
		return tipoTurma;
	}

	public void setTipoTurma(String tipoTurma) {
		this.tipoTurma = tipoTurma;
	}

	public Integer getStatusTurma() {
		return statusTurma;
	}

	public void setStatusTurma(Integer statusTurma) {
		this.statusTurma = statusTurma;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTurma == null) ? 0 : idTurma.hashCode());
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
		Turma other = (Turma) obj;
		if (idTurma == null) {
			if (other.idTurma != null)
				return false;
		} else if (!idTurma.equals(other.idTurma))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Turma [idTurma=" + idTurma + ", qtdAluno=" + qtdAluno + ", horario=" + horario + ", dataInicial="
				+ dataInicial + ", dataFinal=" + dataFinal + ", tipoTurma=" + tipoTurma + ", statusTurma=" + statusTurma
				+ ", atividade=" + atividade + ", instrutor=" + instrutor + ", aluno=" + aluno + "]";
	}
}
