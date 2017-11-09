package br.com.banco.arquitetura.service;

import java.util.List;

import br.com.banco.exceptions.NegocioException;
import br.com.banco.modelo.entidades.Entidade;

public interface Service<E extends Entidade> {

	void salvar(E entidade) throws NegocioException;

	void alterar(E entidade) throws NegocioException;

	List<E> consultar(E entidade);

	E obter(Long id);

	void excluir(E entidade) throws NegocioException;
	
}
