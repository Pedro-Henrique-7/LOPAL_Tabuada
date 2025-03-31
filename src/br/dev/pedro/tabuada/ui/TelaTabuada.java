package br.dev.pedro.tabuada.ui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {
	
	public void criarTela() {
		JFrame tela = new JFrame();
		
		// def tamamanho da tela com o objeto dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(400, 800);
		
		tela.setSize(tamanho);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("TABUADA");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);;
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Valor do Multiplicando: ");
		labelMultiplicando.setBounds(50, 40, 150, 30);
		
		
		//criar um jftxtfield
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(202, 40, 60, 30);
		
		tela.getContentPane().add(txtMultiplicando);
		
		tela.getContentPane().add(labelMultiplicando);
	}
}