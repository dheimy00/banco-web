
package br.com.banco.modelo.entidades;

/**

 */
public abstract class EntidadeBanco implements Entidade {

    private Long identificador;

    @Override
    public Long getIdentificador() {

	return identificador;
    }

    public void setIdentificador(Long identificador) {

	this.identificador = identificador;
    }
    
}
