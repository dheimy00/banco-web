package br.com.banco.modelo.entidades;

import java.util.Collection;

public class Agencia extends EntidadeBanco {

    private String nome;
    private Banco banco;
    private Collection<Conta> contas;

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Banco getBanco() {

        return banco;
    }

    public void setBanco(Banco banco) {

        this.banco = banco;
    }

    public Collection<Conta> getContas() {

        return contas;
    }

    public void setContas(Collection<Conta> contas) {

        this.contas = contas;
    }
}
