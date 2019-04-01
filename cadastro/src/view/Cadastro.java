
package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class Cadastro extends JFrame{

		
	JLabel Nome = new JLabel("Nome");
	JLabel Endereco = new JLabel("Endereço");
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
	JRadioButton =new JRadioButton();
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
		
		
		paine.add(Nome);
		Nome.setBounds(20, 20, 40, 20);
		paine.add(nome);
		nome.setBounds(100, 20, 200, 20);
		
		paine.add(Endereco);
		Endereco.setBounds(20, 60, 80, 20);
		paine.add(endereco);
		endereco.setBounds(100, 60, 200, 20);
		
		paine.add(Cidade);
		Cidade.setBounds(20, 100, 80, 20);
		paine.add(cidade);
		cidade.setBounds(100, 100, 200, 20);
		
		paine.add(Bairro);
		Bairro.setBounds(20, 140, 120, 20);
		paine.add(bairro);
		bairro.setBounds(100, 140, 200, 20);
		
		paine.add(Telefone);
		Telefone.setBounds(20, 180, 160, 20);
		paine.add(tel);
		tel.setBounds(100,180,200,20);
		
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(800,400);
		
	}
	
	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
		
		
	}

}
