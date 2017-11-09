package br.com.banco.arquitetura.service;

import java.lang.reflect.Type;
import java.util.List;

import br.com.banco.arquitetura.persistencia.DAO;
import br.com.banco.exceptions.NegocioException;
import br.com.banco.modelo.entidades.Entidade;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

public class ServiceImpl<E extends Entidade, D extends DAO<E>> implements
		Service<E> {

	private D dao;

	@Override
	public void salvar(E entidade) throws NegocioException {

		validarSalvar(entidade);

		getDao().salvar(entidade);
	}

	public void validarSalvar(E entidade) throws NegocioException {
	}

	@Override
	public void alterar(E entidade) throws NegocioException {

		validarAlterar(entidade);

		getDao().alterar(entidade);

	}

	public void validarAlterar(E entidade) throws NegocioException {

	}

	@Override
	public List<E> consultar(E entidade) {
		return getDao().consultar(entidade);
	}

	@Override
	public E obter(Long id) {
		return getDao().obter(id);
	}

	@Override
	public void excluir(E entidade) throws NegocioException {

		validarExcluir(entidade);

		getDao().excluir(entidade);
	}

	public void validarExcluir(E entidade) throws NegocioException {

	}

	public D getDao() {

		if (dao == null) {

			try {
				dao = getDAOClass().newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dao;
	}

	@SuppressWarnings({ "unchecked" })
	private Class<D> getDAOClass() {

		final Type type[] = ((ParameterizedTypeImpl) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments();

		return ((Class<D>) type[1]);
	}

}
