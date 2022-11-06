package src;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Testando {

	private JFrame frame;
	private JTextField resultado;
	private JButton variavelC;
	private JButton porcentagem;
	private JButton apagar;
	private JButton numeroUm;
	private JButton numero5;
	private JButton numeroDois;
	private JButton numero3;
	private JButton numero4;
	private JButton numero6;
	private JButton numero7;
	private JButton numero8;
	private JButton adicao;
	private JButton igual;
	private JButton subtracao;
	private JButton numero9;
	private JButton numero0;
	private JButton divisao;
	private JButton multiplicacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testando window = new Testando();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Testando() {
		initialize();
	}
	
	
	 double valor1,valor2;
	 String sinal;
	 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		

		resultado = new JTextField();
		resultado.setToolTipText("");
		resultado.setBackground(new Color(192, 192, 192));
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 45));
		resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		resultado.setBounds(10, 11, 414, 71);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
	    
	    
	
		
		JButton ac = new JButton("AC");
		ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		ac.setBounds(20, 93, 68, 36);
		frame.getContentPane().add(ac);
		
		JButton ac_1 = new JButton("CE");
		ac_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText("");
				
			}
		});
		ac_1.setBounds(98, 93, 68, 36);
		frame.getContentPane().add(ac_1);
		
		variavelC = new JButton("C");
		variavelC.setBounds(183, 93, 68, 36);
		frame.getContentPane().add(variavelC);
		
		 porcentagem = new JButton("%");
		 porcentagem.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		valor1 = Double.parseDouble(resultado.getText());
		 		resultado.setText("");
	 		    sinal = "porcentagem";
		 	}
		 });
		porcentagem.setBounds(268, 93, 68, 36);
		frame.getContentPane().add(porcentagem);
		
		apagar = new JButton("<");
		apagar.setBackground(new Color(64, 128, 128));
		apagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ " ");
			
				
			}
		});
		apagar.setBounds(365, 93, 59, 36);
		frame.getContentPane().add(apagar);
		
		numeroUm = new JButton("1");
		numeroUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ "1");
			}
		});
		numeroUm.setBounds(20, 142, 68, 36);
		frame.getContentPane().add(numeroUm);
		
		
		numero5 = new JButton("5");
		numero5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ "5" );
			}
		});
		numero5.setBounds(20, 186, 68, 36);
		frame.getContentPane().add(numero5);
		
		numeroDois = new JButton("2");
		numeroDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ "2" );
			}
		});
	
		numeroDois.setBounds(98, 140, 68, 36);
		frame.getContentPane().add(numeroDois);
		
		numero3 = new JButton("3");
		numero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ "3" );
				
			}
		});
		numero3.setBounds(183, 140, 68, 36);
		frame.getContentPane().add(numero3);
		
		numero4 = new JButton("4");
		numero4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ "4");
			}
		});
		numero4.setBounds(268, 140, 68, 36);
		frame.getContentPane().add(numero4);
		
		numero6 = new JButton("6");
		numero6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ "6" );
			}
		});
		numero6.setBounds(98, 186, 68, 36);
		frame.getContentPane().add(numero6);
		
		numero7 = new JButton("7");
		numero7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ "7" );
			}
		});
		numero7.setBounds(183, 186, 68, 36);
		frame.getContentPane().add(numero7);
		
		numero8 = new JButton("8");
		numero8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ "8" );
			}
		});
		numero8.setBounds(268, 186, 68, 36);
		frame.getContentPane().add(numero8);
		
		adicao = new JButton("+");
		adicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(resultado.getText());
				resultado.setText("");
				sinal = "soma";
				
				
			}
		});
		adicao.setBounds(365, 140, 59, 36);
		frame.getContentPane().add(adicao);
		
		igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(resultado.getText());
				if (sinal == "soma") {
					
					resultado.setText(String.valueOf(valor1+valor2));
					
					
				}else if (sinal == "menos") {
					
					resultado.setText(String.valueOf(valor1-valor2));
					
					
				}else if (sinal == "divisao") {
					
					resultado.setText(String.valueOf(valor1/valor2));
					
					
				}else if (sinal == "multiplicacao") {
					
					resultado.setText(String.valueOf(valor1*valor2));
					
					
				}else if (sinal == "porcentagem") {
					
					resultado.setText(String.valueOf(valor1/100*(valor2)));
					
					
				}
					
				
			}
		});
		igual.setBounds(183, 225, 68, 36);
		frame.getContentPane().add(igual);
		
		subtracao = new JButton("-");
		subtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(resultado.getText());
				resultado.setText("");
				sinal = "menos";
				
				
			}
		});
		subtracao.setBounds(365, 186, 58, 36);
		frame.getContentPane().add(subtracao);
		
		 numero9 = new JButton("9");
		numero9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ "9");
				
				
			}
		});
		numero9.setBounds(20, 225, 68, 36);
		frame.getContentPane().add(numero9);
		
		numero0 = new JButton("0");
		numero0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+ "0");
			}
		});
		numero0.setBounds(98, 225, 68, 36);
		frame.getContentPane().add(numero0);
		
		divisao = new JButton("/");
		divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(resultado.getText());
				resultado.setText("");
				sinal = "divisao";
			
			}
		});
		divisao.setBounds(365, 225, 59, 36);
		frame.getContentPane().add(divisao);
		
		multiplicacao = new JButton("X");
		multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(resultado.getText());
				resultado.setText("");
				sinal = "multiplicacao";
				
				
				
			}
		});
		multiplicacao.setBounds(268, 225, 68, 36);
		frame.getContentPane().add(multiplicacao);
	    
	 
		
	}
}
