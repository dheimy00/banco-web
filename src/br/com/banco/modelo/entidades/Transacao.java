
package br.com.banco.modelo.entidades;

import java.math.BigDecimal;
import java.util.Date;


public class Transacao extends EntidadeBanco {

    private Conta	     contaCredito;
    private Conta	     contaDebito;
    private Date	      data;
    private String	    descricao;
    private EnumTipoTransacao tipoTransacao;
    private BigDecimal	valor;
	public Conta getContaCredito() {
		return contaCredito;
	}
	public void setContaCredito(Conta contaCredito) {
		this.contaCredito = contaCredito;
	}
	public Conta getContaDebito() {
		return contaDebito;
	}
	public void setContaDebito(Conta contaDebito) {
		this.contaDebito = contaDebito;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public EnumTipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}
	public void setTipoTransacao(EnumTipoTransacao tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
