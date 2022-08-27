package br.com.fiap.collections.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.collections.dao.AlunoDao;
import br.com.fiap.collections.model.Aluno;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AlunoDao dao = new AlunoDao();

		int continuar;
		do {
			System.out.println("Digite o rm: ");
			int rm = sc.nextInt();
			System.out.println("Digite o nome: ");
			String nome = sc.next() + sc.nextLine();
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.println("Digite a nota 1 : ");
			double nota1 = sc.nextDouble();
			System.out.println("Digite o nota 2: ");
			double nota2 = sc.nextDouble();
			
			List<Double> notas = Arrays.asList(new Double[] {nota1, nota2});
			
			Aluno aluno = new Aluno(nome, rm, idade, notas);
			
			
			dao.cadastar(aluno);
			System.out.println("Deseja cadastar mais um aluno? 0 = não // 1 = sim");
			continuar = sc.nextInt();

		} while(continuar == 1);
		
		System.out.println("Total de alunos " + dao.listar().size());
		System.out.println("A média de notas é: " + dao.calcularMediaGeral());
		System.out.println("A maior idade é: " + dao.retornarMaiorIdade());
		System.out.println("A menor idade é: " + dao.retornarMenorIdade());
		System.out.println("A média das idades é: " + dao.calcularIdadeMedia());

		sc.close();

	}
}
