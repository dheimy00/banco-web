package br.com.banco.enumerator;

public enum EnumAcao {

	SALVAR("Salvar"), CONSULTAR("Consultar");

	private String descricao;

	private EnumAcao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
