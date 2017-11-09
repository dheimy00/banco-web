package br.com.banco.view.tela;

import javax.swing.JOptionPane;

import br.com.banco.controller.AgenciaController;
import br.com.banco.modelo.entidades.Agencia;

public class AgenciaTesteTela {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome da agencia");
		
		Agencia agencia = new Agencia();
		
		agencia.setNome(nome);
		
		AgenciaController controller = new AgenciaController();
		
		controller.salvar(agencia);
		
		JOptionPane.showMessageDialog(null, controller.getMensagem());	
		
		
	}
	
}
