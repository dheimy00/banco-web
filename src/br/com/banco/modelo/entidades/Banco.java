package br.com.banco.modelo.entidades;

import java.util.Collection;


public class Banco extends EntidadeBanco {

	private Integer numero;

	private String nome;

	private Collection<Agencia> agencias;


	public Integer getNumero() {

		return numero;
	}


	public void setNumero(Integer numero) {

		this.numero = numero;
	}


	public String getNome() {

		return nome;
	}


	public void setNome(String nome) {

		this.nome = nome;
	}


	public Collection<Agencia> getAgencias() {

		return agencias;
	}


	public void setAgencias(Collection<Agencia> agencias) {

		this.agencias = agencias;
	}



}
