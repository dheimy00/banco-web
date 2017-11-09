package br.com.banco.exceptions;

public class NegocioException extends Exception{

	private static final long serialVersionUID = -7957145485852083705L;

	
	public NegocioException(String mensagem) {
		super(mensagem);
	}
	
}
