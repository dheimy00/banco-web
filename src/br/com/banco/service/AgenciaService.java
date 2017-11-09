package br.com.banco.service;

import br.com.banco.arquitetura.service.ServiceImpl;
import br.com.banco.exceptions.NegocioException;
import br.com.banco.modelo.entidades.Agencia;
import br.com.banco.persistencia.AgenciaDAO;

public class AgenciaService extends ServiceImpl<Agencia, AgenciaDAO>{

	
	@Override
	public void validarSalvar(Agencia entidade) throws NegocioException {
		
		if(entidade == null || entidade.getNome().isEmpty()){
			
			throw new NegocioException("Campo(s) obrigatórios() não informado(s)");
		}
	}
	
}
