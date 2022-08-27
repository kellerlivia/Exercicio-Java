package br.com.fiap.collections.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.fiap.collections.model.Aluno;

/***
 * Classe responsável por cadastrar, lista um Aluno
 * @author Lívia Keller
 *
 */

public class AlunoDao {
	private List<Aluno> lista = new ArrayList<>();
	
	public void cadastar(Aluno aluno) {
		lista.add(aluno);
	}
	
	// fazer
	public List<Aluno> listaAprovados() {
		return lista;
	}
	
	//fazer
	public List<Aluno> listaMaioresQue30() {
		return lista;
	}
	
	//fazer
	public void removerMediaBaixa () {
		return ;
	}
	
	public List<Aluno> listar() {
		return lista;
	}
	
	public double calcularMediaGeral() {
		double soma = 0.0;
		for (Aluno aluno: lista) {
			soma += aluno.retornarmedia();
		}
		double media = soma / lista.size();
		return media;
	}
	
	public int calcularIdadeMedia() {
		int soma = 0;
		for (Aluno aluno: lista) {
			soma += aluno.getIdade();
		}
		int media = soma / lista.size();
		return media;
	}
	
	public int retornarMaiorIdade() {
		if (lista.isEmpty()) {
			return 0;
		}
		int maior = lista.get(0).getIdade();
		
		for(int i = 1; i < lista.size(); i++) {
			if (lista.get(i).getIdade() > maior) {
				maior = lista.get(i).getIdade();
			}
		} return maior;
	}
	
	public int retornarMenorIdade() {
		int menor = lista.get(0).getIdade();
		
		for(int i = 1; i < lista.size(); i++) {
			if (lista.get(i).getIdade() < menor) {
				menor = lista.get(i).getIdade();
			}
		} return menor;
	} 
	
}
