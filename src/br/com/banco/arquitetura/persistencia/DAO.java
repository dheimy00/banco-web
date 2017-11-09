package br.com.banco.arquitetura.persistencia;

import java.util.List;

import br.com.banco.modelo.entidades.Entidade;

public interface DAO<E extends Entidade> {

	void salvar(E entidade);

	void alterar(E entidade);

	List<E> consultar(E entidade);

	E obter(Long id);

	void excluir(E entidade);
}
