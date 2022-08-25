package br.com.fiap.collections.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.fiap.collections.model.Aluno;

/***
 * Classe respons�vel por cadastrar, lista um Aluno
 * @author L�via Keller
 *
 */

public class AlunoDao {
	private List<Aluno> lista = new ArrayList<>();
	
	public void cadastar(Aluno aluno) {
		lista.add(aluno);
	}
	
	public List<Aluno> listar() {
		return lista;
	}
	
	public double retornarMedia() {
		return 0;
	}
}
