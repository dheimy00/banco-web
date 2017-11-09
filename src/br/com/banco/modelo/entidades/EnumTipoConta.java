
package br.com.banco.modelo.entidades;

/**
 */
public enum EnumTipoConta {
    
    CONTA_PESSOAL("Conta Pessoal"), 
    CONTA_ESPECIAL("Conta Especial");

    private String valor;

    /**
     * Contrutor resposável por iniciar o objeto.
     */
    private EnumTipoConta(String valor) {

	this.valor = valor;
    }

    public String getValor() {

	return valor;
    }
}
