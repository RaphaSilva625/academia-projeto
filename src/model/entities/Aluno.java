package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer matricula;
	private Date dataMatricula;
	private float altura;
	private float peso;
	private Boolean statusAluno;
	
	private Pessoa pessoa;
	private Pacote pacote;
	
	public Aluno() {
	}

	public Aluno(Integer matricula, Date dataMatricula, float altura, float peso, Boolean statusAluno,
			Pessoa pessoa, Pacote pacote) {
		super();
		this.matricula = matricula;
		this.dataMatricula = dataMatricula;
		this.altura = altura;
		this.peso = peso;
		this.statusAluno = statusAluno;
		this.pessoa = pessoa;
		this.pacote = pacote;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Boolean getStatusAluno() {
		return statusAluno;
	}

	public void setStatusAluno(Boolean statusAluno) {
		this.statusAluno = statusAluno;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pacote getPacote() {
		return pacote;
	}

	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", altura=" + altura + ", peso="
				+ peso + ", statusAluno=" + statusAluno + ", pessoa=" + pessoa + ", pacote=" + pacote + "]";
	}
}
