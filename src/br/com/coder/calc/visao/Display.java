package br.com.coder.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.coder.calc.modelo.Memoria;
import br.com.coder.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
//jpanel é como um container - componente que agrupa outros componentes
public class Display extends JPanel implements MemoriaObservador {
	
	private final JLabel label; // texto que vai está dentro do display
	
	public Display() {
		Memoria.getInstacia().adicionarObservador(this);
		
		// Definindo cor existente
		//setBackground(Color.GREEN);
		
		// Definindo nova cor
		setBackground(new Color(46, 49, 50));
		
		label = new JLabel(Memoria.getInstacia().getTextoAtual());//definindo o texto do display
		label.setForeground(Color.WHITE);// definindo a cor do texto
		label.setFont(new Font("courier", Font.PLAIN, 30));//definindo fonte e tamanho do texto
		
		//gerenciador de layout
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));//definindo alinhamento do texto(horizontalmente, verticalmente(espacamento cima e baixo))
		
		
		add(label);//adc o texto
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}

}
