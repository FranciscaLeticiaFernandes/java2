
package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastro extends JFrame{
	
	JLabel Nome = new JLabel("Nome");
	JLabel Endereco = new JLabel("Endereco");
	JLabel Cidade = new JLabel("Cidade");
	JLabel Bairro = new JLabel("Bairro");
	JLabel Telefone = new JLabel("Telefone");
	JLabel RG = new JLabel("RG");
	//JLabel sexo
	JLabel CEP = new JLabel("CEP");
	//Estado
	JLabel Cel = new JLabel("Celular");
	JLabel CPF = new JLabel("CPF");
	
	//Radios
	
	//Sexo
	
	
	//Box
	
	// EStado
	
	
	//Botões
	JButton Salvar = new JButton("Salvar");
	JButton Imprimir = new JButton("Imprimir");
	
	//Linhas
	JTextField nome = new JTextField();
	JTextField endereco = new JTextField();
	JTextField cidade = new JTextField();
	JTextField bairro = new JTextField();
	JTextField tel = new JTextField();
	JTextField rg = new JTextField();
	JTextField cep = new JTextField();
	JTextField cel = new JTextField();
	JTextField cpf = new JTextField();
	
	public Cadastro() {
		
		Container paine = this.getContentPane();
		
		
		
		
		
		
		
		
		
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(600,400);
		
	}
	
	public static void main(String[] args) {
		Cadastro tela = new Cadastro();
		
		
	}

}
