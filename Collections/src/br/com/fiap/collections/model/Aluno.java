package br.com.fiap.collections.model;

import java.util.List;

public class Aluno {
	
	private String nome;
	private int rm;
	private int idade;
	private List<Double> notas;

	public Aluno() {}
	
	public Aluno(String nome, int rm, int idade, List<Double> notas) {
		this.nome = nome;
		this.rm = rm;
		this.idade = idade;
		this.notas = notas;
	}
	
	public double retornarmedia() {
		double soma = 0;
		for (double nota: notas) {
			soma += nota;
		}
		double media = soma / notas.size();
		return media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Double> getNota() {
		return notas;
	}

	public void setNota(List<Double> notas) {
		this.notas = notas;
	}

}
