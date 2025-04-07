package br.dev.pedro.tabuada.ui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {
	
	private JLabel labelMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel labelMinMultiplicador;
	private JTextField txtMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField txtMaxMultiplicador;
	private JButton btnCalcular;
	private JButton btnLimpar;
	private JLabel labelResultado;
	private JScrollPane scrollTabuada;
	private JList<String> listaTabuada;
	public void criarTela() {
		
		
		JFrame tela = new JFrame();
		
		// def tamamanho da tela com o objeto dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(335, 700);
		
		
		tela.setSize(tamanho);
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("TABUADA");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);;
		tela.setResizable(false);
		
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Valor do Multiplicando: ");
		labelMultiplicando.setBounds(50, 40, 160, 30);
		
		
		//criar um jftxtfield
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(210, 40, 60, 30);
		
		//label e txt do min
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo multiplicador");
		labelMinMultiplicador.setBounds(50, 80, 150, 30);
		txtMinMultiplicador = new JTextField();
		txtMinMultiplicador.setBounds(210, 80, 60, 30);
		
		
		//label e txt do max
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Maximo Multiplicador");
		labelMaxMultiplicador.setBounds(50, 120, 150, 30);
		txtMaxMultiplicador = new JTextField();
		txtMaxMultiplicador.setBounds(210, 120, 60, 30);
		
		
		//botões
		btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(50, 160, 105, 30);
		
		btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(165, 160, 105, 30);
		
		
		//label do resultado
		
		labelResultado = new JLabel();
		labelResultado.setText("Resultado");
		labelResultado.setBounds(50, 200, 200, 30);
		
		
		//criando painel de rolagem para lista
		

		//lista
		
		String cidades[]={"Jandira", "VITORIA DA CONQUISTA", "Itapevi", "Barueri", "Carapicuiba", "Osasco"};
		listaTabuada = new JList<String>();
		listaTabuada.setListData(cidades);
		
		scrollTabuada = new JScrollPane(listaTabuada);
		scrollTabuada.setBounds(50, 240, 220, 380);
		

		//scrollTabuada.add(listaTabuada);
		
		
		
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMinMultiplicador);
		tela.getContentPane().add(txtMinMultiplicador);
		tela.getContentPane().add(labelMaxMultiplicador);
		tela.getContentPane().add(txtMaxMultiplicador);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(scrollTabuada);
		
		tela.setVisible(true);
	}
	
}