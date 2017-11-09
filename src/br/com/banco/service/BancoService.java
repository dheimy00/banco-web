package br.com.banco.service;

import br.com.banco.arquitetura.service.ServiceImpl;
import br.com.banco.exceptions.NegocioException;
import br.com.banco.modelo.entidades.Banco;
import br.com.banco.persistencia.BancoDAO;

public class BancoService extends ServiceImpl<Banco, BancoDAO>{
	
	@Override
	public void validarSalvar(Banco entidade) throws NegocioException {
		
		if(entidade == null || entidade.getNumero() == null){
			
			throw new NegocioException("O numero nao pode ser vazio");
		}else if(entidade == null || entidade.getNome() == null || entidade.getNome().isEmpty()) {
			
			throw new NegocioException("O nome nao pode ser vazio");
		}
	}

}
