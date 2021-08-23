package br.com.coder.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
//tem que extender de jbutton para por os botoes 
public class Botao extends JButton {
	
	public Botao(String texto, Color cor) {
		
		setText(texto);//definindo o texto do botao
		setFont(new Font("courier", Font.PLAIN, 25));//definindo fonte e tamanho do texto do botao
		setOpaque(true);
		setBackground(cor);//definindo a cor do botao
		setForeground(Color.WHITE);//definindo a cor do texto do botao
		setBorder(BorderFactory.createLineBorder(Color.BLACK));//definindo a cor da borda do botao
	}

}
