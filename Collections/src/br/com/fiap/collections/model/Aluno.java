package br.com.fiap.collections.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private int rm;
	private int idade;
	private List<Double> nota = new ArrayList<>();

	public Aluno() {}
	
	public Aluno(String nome, int rm, int idade, List<Double> nota) {
		this.nome = nome;
		this.rm = rm;
		this.idade = idade;
		this.nota = nota;
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
		return nota;
	}

	public void setNota(List<Double> nota) {
		this.nota = nota;
	}

}
