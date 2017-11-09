package br.com.banco.view.tela;

import javax.swing.JOptionPane;

import br.com.banco.controller.BancoController;
import br.com.banco.modelo.entidades.Banco;

public class BancoTesteTela {

	public static void main(String[] args) {

		BancoController controller = new BancoController();

		String numero = JOptionPane.showInputDialog("Informe o numero do banco");

		String nome = JOptionPane.showInputDialog("Informe o nome do banco");

		Banco banco = new Banco();

		banco.setNumero(Integer.parseInt(numero));
		
		banco.setNome(nome);

		controller.salvar(banco);

		JOptionPane.showMessageDialog(null, controller.getMensagem());
		
		//controller.consultar(banco);
	}

}
