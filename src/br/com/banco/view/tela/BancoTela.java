package br.com.banco.view.tela;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.banco.controller.BancoController;
import br.com.banco.modelo.entidades.Banco;
import java.awt.Choice;
import javax.swing.JSeparator;

public class BancoTela extends JFrame {

	private JPanel contentPane;
	private JTextField txtMumero;
	private JTextField txtNome;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BancoTela frame = new BancoTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BancoTela() {
		setTitle("Cadastrar Banco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Numero:");
		lblNome.setBounds(27, 37, 89, 14);
		contentPane.add(lblNome);
		
		txtMumero = new JTextField();
		txtMumero.setBounds(126, 34, 315, 20);
		contentPane.add(txtMumero);
		txtMumero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(27, 85, 89, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(126, 82, 315, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				salvarBanco();
			
			}

		});
		btnSalvar.setBounds(229, 142, 89, 23);
		contentPane.add(btnSalvar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 129, 522, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(545, 177, -534, 20);
		contentPane.add(separator_1);
	}
	
	private void salvarBanco() {
		
		Banco banco  = new Banco();
		
		banco.setNome(txtNome.getText());
		banco.setNumero(Integer.parseInt(txtMumero.getText()));
		
		BancoController controller = new BancoController();
		
		boolean salvou = controller.salvar(banco);
		
		if(salvou){
			
			txtNome.setText(null);
			
			txtMumero.setText(null);
		}
		
		JOptionPane.showMessageDialog(this, controller.getMensagem());
		
	}
}
