package br.com.coder.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.coder.calc.modelo.Memoria;

@SuppressWarnings("serial")
//jpanel é como um container - componente que agrupa outros componentes
public class Teclado extends JPanel implements ActionListener {
	
	private final Color cor_cinza_escuro = new Color(68, 68, 68);
	private final Color cor_cinza_claro = new Color(99, 99, 99);
	private final Color cor_laranja = new Color(242, 163, 60);
	
	public Teclado() {
		
		// Definir a cor
		//setBackground(Color.RED);
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		//setLayout(new GridLayout(5, 4));//definindo layout simples com a quantidade de linhas e colunas do teclado
		
		setLayout(layout);
		
		c.weightx = 1;//completar a largura
		c.weighty = 1;//completar tamanho
		c.fill = GridBagConstraints.BOTH;//preencher botao
		
		//linha 1
		c.gridwidth = 2;//botao preenche 3 espacos(horizontal)
		//c.gridheight = 3 botao preenche 3 espacos(vertical)
		adicionarBotao("AC", cor_cinza_escuro, c, 0, 0);
		c.gridwidth = 1;//botao volta a preencher 1 espaco
		adicionarBotao("±", cor_cinza_escuro, c, 0, 2);

		adicionarBotao("/", cor_laranja, c, 0, 3);
		
		//linha 2
		adicionarBotao("7", cor_cinza_claro, c, 1, 0);
		adicionarBotao("8", cor_cinza_claro, c, 1, 1);
		adicionarBotao("9", cor_cinza_claro, c, 1, 2);
		adicionarBotao("*", cor_laranja, c, 1, 3);
		
		//linha 3
		adicionarBotao("4", cor_cinza_claro, c, 2, 0);
		adicionarBotao("5", cor_cinza_claro, c, 2, 1);
		adicionarBotao("6", cor_cinza_claro, c, 2, 2);
		adicionarBotao("-", cor_laranja, c, 2, 3);
		
		//linha 4
		adicionarBotao("1", cor_cinza_claro, c, 3, 0);
		adicionarBotao("2", cor_cinza_claro, c, 3, 1);
		adicionarBotao("3", cor_cinza_claro, c, 3, 2);
		adicionarBotao("+", cor_laranja, c, 3, 3);
		
		//linha 5
		c.gridwidth = 2; 
		adicionarBotao("0", cor_cinza_escuro, c, 4, 0);
		c.gridwidth = 1;
		adicionarBotao(",", cor_cinza_escuro, c, 4, 2);
		adicionarBotao("=", cor_laranja, c, 4, 3);
		
		
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int y, int x) {
		
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstacia().processarComando(botao.getText());			
		}
		
	}

}
