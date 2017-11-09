package br.com.banco.view.arquitetura;

import java.lang.reflect.Type;
import java.util.List;

import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import br.com.banco.arquitetura.service.Service;
import br.com.banco.exceptions.NegocioException;
import br.com.banco.modelo.entidades.Entidade;

public class Controller<E extends Entidade, S extends Service<E>> {

	private S service;

	private String mensagem;

	public boolean salvar(E entidade) {

		try {
			getService().salvar(entidade);

			mensagem = "Operação realizada com sucesso";

			return true;

		} catch (NegocioException e) {

			mensagem = e.getMessage();

			return false;

		}

	}

	public boolean alterar(E entidade) {

		try {
			getService().alterar(entidade);

			mensagem = "Operação realziada com sucesso";

			return true;

		} catch (NegocioException e) {

			mensagem = e.getMessage();

			return false;

		}
	}

	public List<E> consultar(E entidade) {

		return getService().consultar(entidade);
	}

	public E obter(Long id) {

		return getService().obter(id);
	}

	public boolean excluir(E entidade) {

		try {
			getService().excluir(entidade);

			mensagem = "Operação realziada com sucesso";

			return true;

		} catch (NegocioException e) {

			mensagem = e.getMessage();

			return false;

		}

	}

	public S getService() {

		if (service == null) {

			try {
				service = getServiceClass().newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return service;
	}

	@SuppressWarnings({ "unchecked" })
	private Class<S> getServiceClass() {

		final Type type[] = ((ParameterizedTypeImpl) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments();

		return ((Class<S>) type[1]);
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setService(S service) {
		this.service = service;
	}

}
