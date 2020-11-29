package application;

import java.util.Date;

import model.entities.Aluno;
import model.entities.Endereco;
import model.entities.Pacote;
import model.entities.Pessoa;
import model.entities.Telefone;

public class Program {

	public static void main(String[] args) {
		
		Endereco end1 = new Endereco(1, "Rua 1", 870, "lol", "Pina", "Recife", "PE");
		
		Telefone tel1 = new Telefone(1, 999999999);
		
		Pessoa p1 = new Pessoa("1234", "Rapha", new Date(), "456456", "123156", true, 1, end1, tel1 );
		
		Pacote pac1 = new Pacote(1, 75.0f, "Prata", "abc", new Date(), new Date());
		
		Aluno aluno = new Aluno(12, new Date(), 1.75f, 85.0f, true, p1, pac1);
		
		System.out.println(aluno);
	}
}
