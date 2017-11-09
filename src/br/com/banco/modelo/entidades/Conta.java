
package br.com.banco.modelo.entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 */
public class Conta extends EntidadeBanco {

    private Agencia	          agencia;
    private Date		  dataAbertura;
    private Integer	          numero;
    private BigDecimal	          saldo;
    private EnumTipoConta	  tipoConta;
    private Cliente	          titular;
    private Collection<Transacao> transacoes;
    
    /**
     * Método responsável por
     * silvanio
     */
    public void extrato() {

	System.out.println("Conta :"+numero);
	
	for(Transacao transacao : transacoes){
	    
	    System.out.println(transacao.getDescricao());
	}
	
	System.out.println("Saldo: "+ saldo);
	
    }
    
    /**
     * Contrutor resposável por iniciar o objeto.
     */
    public Conta() {
	
	saldo = new BigDecimal(0);
	
	transacoes = new ArrayList<Transacao>();

    }

    public Agencia getAgencia() {

	return agencia;
    }

    public void setAgencia(Agencia agencia) {

	this.agencia = agencia;
    }

    public Date getDataAbertura() {

	return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {

	this.dataAbertura = dataAbertura;
    }

    public Integer getNumero() {

	return numero;
    }

    public void setNumero(Integer numero) {

	this.numero = numero;
    }

    public BigDecimal getSaldo() {

	return saldo;
    }

    public void setSaldo(BigDecimal saldo) {

	this.saldo = saldo;
    }

    public EnumTipoConta getTipoConta() {

	return tipoConta;
    }

    public void setTipoConta(EnumTipoConta tipoConta) {

	this.tipoConta = tipoConta;
    }

    public Cliente getTitular() {

	return titular;
    }

    public void setTitular(Cliente titular) {

	this.titular = titular;
    }

    public Collection<Transacao> getTransacoes() {

	return transacoes;
    }

    public void setTransacoes(Collection<Transacao> transacoes) {

	this.transacoes = transacoes;
    }

}
