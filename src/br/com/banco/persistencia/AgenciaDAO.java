package br.com.banco.persistencia;

import java.util.List;

import br.com.banco.arquitetura.persistencia.DAO;
import br.com.banco.modelo.entidades.Agencia;

public class AgenciaDAO implements DAO<Agencia>{

	@Override
	public void salvar(Agencia entidade) {
		System.out.println("Salvando "+ entidade.getNome());
	}

	@Override
	public void alterar(Agencia entidade) {
		
	}

	@Override
	public List<Agencia> consultar(Agencia entidade) {
		return null;
	}

	@Override
	public Agencia obter(Long id) {
		return null;
	}

	@Override
	public void excluir(Agencia entidade) {
		
	}

}
