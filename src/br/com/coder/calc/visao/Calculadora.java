package br.com.coder.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public Calculadora() {
		
		organizarLayout();
		
		// Iniciar a aplicacao abrindo uma tela, porem muito pequena. precisa definir tamanho da tela tb
		setVisible(true); 	
		
		// Definir tamanho da tela(altura e largura).
		setSize(232, 322);
		
		// Herda de jframe. Para fechar a tela com o comando X
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Abrir app sempre no centro da tela
		setLocationRelativeTo(null);
	}
	
	private void organizarLayout() {
		
		//organiza layout em norte, sul, leste, oeste, e centro
		setLayout(new BorderLayout()); 
		
		Display display = new Display();
		
		// só funciona se o borderlayout estiver inicializado
		add(display, BorderLayout.NORTH);//adc aquele display na direcao norte
		//add(display, BorderLayout.WEST); oeste
		//add(display, BorderLayout.EAST); leste
		//add(display, BorderLayout.SOUTH); sul
		
		//definir o tamanho do display
		display.setPreferredSize(new Dimension(233, 60));//colocando a nova dimenção
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);// centro
		
		
	}

	public static void main(String[] args) {
		
		new Calculadora();
		
	}
}
