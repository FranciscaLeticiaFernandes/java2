package Cadastro;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Tela extends JFrame {
	JLabel nome = new JLabel ("nome");
	JTextField nome1 =new JTextField();
	JLabel endereço =new JLabel("endereço");
	JLabel cidade = new JLabel ("cidade");
	JLabel bairro = new JLabel("bairro");
	JLabel telefone = new JLabel("telefone");
	JLabel rg = new JLabel("rg");
	JTextField content =new JTextField();
	JLabel cep = new JLabel("cep");
	JLabel celular = new JLabel("celular");
	JLabel cpf =new JLabel("cpf");
	JLabel estado = new JLabel("estado");
	JRadioButton sexo = new JRadioButton("feminino");
	JRadioButton sexom= new JRadioButton("masculino");
	JButton salvar = new JButton("salvar");
	JButton imprimir = new JButton("Imprimir");
	
	
	
	
	
	
	    public Tela() {
	    	super("Tela De Cadastro");
	    	Container paine=this.getContentPane();
	    	paine.setLayout(null);
	    	
	    	
	    	this.setVisible(true);
	    	this.setSize(800, 600);
	    	this.setResizable(false);
	    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	
	    }
	    
    public static void main(String[]args) {
    	Tela tela=new Tela();
    }
}
