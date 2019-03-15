package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Calculadora extends JFrame{ //extends serve pra acessar coisas de outras classes,neste caso jframe
	
	JLabel Exibir = new JLabel("Exibir");
	JLabel Editar = new JLabel("Editar");
	JLabel Ajuda = new JLabel ("Ajuda");
	JTextField result = new JTextField();
	
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnP = new JButton("M+");
	JButton btnM = new JButton("M-");
	JButton btnBackspace = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisOuMenos = new JButton("+/-");
	JButton btnRQuad = new JButton(" v");
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnD = new JButton("/");
	JButton btnPorcento = new JButton("%");
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnV = new JButton("*");
	JButton btnUmX = new JButton("1/x");
	JButton btnUm = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnSubtrair = new JButton("-");	
	JButton btnZero = new JButton("0");
	JButton btnVirgula = new JButton(",");
	JButton btnSomar = new JButton("+");
	JButton btnEqual = new JButton("=");
	
    																				
	Funcoes mat = new Funcoes();
	String sinal = null;
	double valor1 = 0, valor2 = 0;
	
	public Calculadora() {
		super ("Calculadora");//super é o titulo que aoarece na janela
		Container paine = this.getContentPane(); //container cria a janela,paine pode ter qualquer nome
		
		paine.setLayout(null);
		
		
		//Menu	
		Exibir.setBounds(10, 10, 100, 20);
		paine.add(Exibir);
		
		Editar.setBounds(50, 10, 100, 20);
		paine.add(Editar);
		
		Ajuda.setBounds(90, 10, 100, 20);
		paine.add(Ajuda);
		
		paine.add(result);
		result.setBounds(10, 45, 273, 50);
		
		
		//Botões
		paine.add(btnMC);
		btnMC.setBounds(10,100,52,30);
		
		paine.add(btnMR);
		btnMR.setBounds(65,100,52,30);
		
		paine.add(btnMS);
		btnMS.setBounds(120,100,52,30);
		
		paine.add(btnP);
		btnP.setBounds(175,100,52,30);
		
		paine.add(btnM);
		btnM.setBounds(230,100,52,30);
		
		paine.add(btnBackspace);
		btnBackspace.setBounds(10,140,52,30);
		
		paine.add(btnCE);
		btnCE.setBounds(65,140,52,30);
		
		paine.add(btnC);
		btnC.setBounds(120,140,52,30);
		
		paine.add(btnMaisOuMenos);
		btnMaisOuMenos.setBounds(175,140,52,30);
		
		paine.add(btnRQuad);
		btnRQuad.setBounds(230,140,52,30);
		
		paine.add(btnSete);
		btnSete.setBounds(10,180,52,30);
	    btnSete.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (result.getText().equals("0")) {
	    			result.setText("7");
	    		}else {
	    			result.setText(result.getText()+"7");
	    		}
	    	}
	    });
		
		paine.add(btnOito);
		btnOito.setBounds(65,180,52,30);
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (result.getText().equals("0")) {
					 result.setText("8");
				}else {
					 result.setText(result.getText()+"8");
				}
			}
		});
		
		
		
		paine.add(btnNove);
		btnNove.setBounds(120,180,52,30);
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")) {
					result.setText("9");
				}else {
					result.setText(result.getText()+"9");
				}
			}
		});
		
		paine.add(btnD);
		btnD.setBounds(175,180,52,30);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1=Double.parseDouble(result.getText());
				sinal="divisao";
				result.setText("0");
			}
		});
		
		paine.add(btnPorcento);
		btnPorcento.setBounds(230,180,52,30);
		
		paine.add(btnQuatro);
		btnQuatro.setBounds(10,220,52,30);
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")) {
					result.setText("4");
				}else {
					result.setText(result.getText()+"4");
				}
				
			}
		});
		
		paine.add(btnCinco);
		btnCinco.setBounds(65,220,52,30);
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 if(result.getText().equals("0")) {
				result.setText("5");
			}else {
				result.setText(result.getText()+"5");
			}
			
			}
		});
		
		paine.add(btnSeis);
		btnSeis.setBounds(120,220,52,30);
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				if (result.getText().equals("0")) {
					result.setText("6");
			}else {
				result.setText(result.getText()+"6");
			}
			}	
		});
		
		paine.add(btnV);
		btnV.setBounds(175,220,52,30);
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1=Double.parseDouble(result.getText());
				sinal="multiplicacao";
				result.setText("0");
			}
		});
		
		paine.add(btnUmX);
		btnUmX.setBounds(230,220,52,30);
		
		paine.add(btnUm);
		btnUm.setBounds(10,260,52,30);
		
		
		paine.add(btnDois);
		btnDois.setBounds(65,260,52,30);
		
		paine.add(btnTres);
		btnTres.setBounds(120,260,52,30);
		
		paine.add(btnSubtrair);
		btnSubtrair.setBounds(175,260,52,30);
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1=  Double.parseDouble(result.getText());
				sinal="subtracao";
				result.setText("0");
			}
		});
		
		paine.add(btnZero);
		btnZero.setBounds(10,300,104,30);
		
		paine.add(btnVirgula);
		btnVirgula.setBounds(120,300,52,30);
		
		paine.add(btnSomar);
		btnSomar.setBounds(175,300,52,30);
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1=Double.parseDouble(result.getText());
				sinal="soma";
				result.setText("0");
				
			}
		});
		
		paine.add(btnEqual);
		btnEqual.setBounds(230,260,52,70);
		
		//funçoes
	btnEqual.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			valor2= Double.parseDouble(result.getText());
			if(sinal.equals("soma")) {
				result.setText(mat.soma(valor1, valor2)+"");
			}
			else if(sinal.equals("subtracao")) {
				result.setText(mat.subtracao(valor1, valor2)+"");
			}
			else if(sinal.equals("multiplicacao")) {
				 result.setText(mat.multiplicacao(valor1,valor2)+"");
			}
			else if(sinal.equals("divisao")) {
				result.setText(mat.divisao(valor1, valor2)+"");
			}
			
			
		}
	});
			
		
		this.setSize(300,500);
		this.setVisible(true);//define se a tela é visivel ou nao
		this.setResizable(false);//serve para definir se o usuario pode ou nao mudar o tamanho da janela
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//permite que o usuario feche a janela clicando no x da janela
		//this. serve para acessar os metodos ou atributos de outras classes,neste caso jframe
	}

	public static void main(String[] args) {
    Calculadora calculadora = new Calculadora ();//criar um objeto da classse,a primeira palavra é a classe e a segunda pode ser qualquer coisa, = new é pra criar uma coisa nova,depois vc repete o nome da classe e abre e fecha paranteses
	}

}


