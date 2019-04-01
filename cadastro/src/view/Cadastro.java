package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Cadastro extends JFrame{
	
	JLabel Nome = new JLabel("Nome");
	JLabel Endereco = new JLabel("Endereço");
	JLabel Cidade = new JLabel("Cidade");
	JLabel Bairro = new JLabel("Bairro");
	JLabel Telefone = new JLabel("Telefone");
	JLabel RG = new JLabel("RG");
	JLabel sexo = new JLabel("SEXO");
	JLabel CEP = new JLabel("CEP");
	JLabel Est = new JLabel("Estado");
	JLabel Cel = new JLabel("Celular");
	JLabel CPF = new JLabel("CPF");
	
	//Radios
	
	JRadioButton mas = new JRadioButton("Masculino");
	JRadioButton fem = new JRadioButton("Femenino");;
	
	
	
	
	//Box
	
	JComboBox<String> Estado = new JComboBox<String>();
	
	
	
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
		tel.setBounds(100, 180, 200, 20);
		
		
		paine.add(RG);
		RG.setBounds(20, 220, 200, 20);
		paine.add(rg);
		rg.setBounds(100, 220, 200, 20);
		
		// coluna do lado
		
		
		// radio
		paine.add(sexo);
		sexo.setBounds(400, 20, 240,20);
		
		paine.add(mas);
		mas.setBounds(450, 20, 100,20);
		paine.add(fem);
		fem.setBounds(600,20,100,20);
		
		// fim
		
		paine.add(Est);
		Est.setBounds(400, 60, 50, 20);
		paine.add(Estado);
		Estado.setBounds(450, 60, 50, 20);
		
		// adicionando estados
		
		Estado.addItem("AC");
		Estado.addItem("AL");
		Estado.addItem("AP");
		Estado.addItem("AM");
		Estado.addItem("BA");
		Estado.addItem("CE");
		Estado.addItem("DF");
		Estado.addItem("ES");
		Estado.addItem("GO");
		Estado.addItem("MA");
		Estado.addItem("MT");
		Estado.addItem("MS");
		Estado.addItem("MG");
		Estado.addItem("PA");
		Estado.addItem("PB");
		Estado.addItem("PR");
		Estado.addItem("PE");
		Estado.addItem("PI");
		Estado.addItem("RJ");
		Estado.addItem("RN");
		Estado.addItem("RS");
		Estado.addItem("RO");
		Estado.addItem("RR");
		Estado.addItem("SC");
		Estado.addItem("SP");
		Estado.addItem("SE");
		Estado.addItem("TO");
		
		// fim
		
		paine.add(CEP);
		CEP.setBounds(400, 100, 50, 20);
		paine.add(cep);
		cep.setBounds(450, 100, 200, 20);
		
		paine.add(Cel);
		Cel.setBounds(400, 140, 50, 20);
		paine.add(cel);
		cel.setBounds(450, 140, 200, 20);
		
		paine.add(CPF);
		CPF.setBounds(400, 180, 50, 20);
		paine.add(cpf);
		cpf.setBounds(450, 180, 200, 20);
		
		
		paine.add(Salvar);
		Salvar.setBounds(200, 270, 100, 20);

		paine.add(Imprimir);
		Imprimir.setBounds(400, 270, 100, 20);
		
				
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(800,350);
		
	}
	
	public static void main(String[] args) {
		Cadastro tela = new Cadastro();
		
		
	}

}