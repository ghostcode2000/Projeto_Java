package curso.java.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{

	private JPanel jpanel = new JPanel (new GridBagLayout()); // Painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time thread 1");
	private JTextField	mostratempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time thread 2");
	private JTextField	mostratempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	public TelaTimeThread() {  //Executa o que tiver dentro no momentoda ebertura ou execução
	
	setTitle ("minha tela de time com thread");
	setSize(new Dimension(240, 240));	
	setLocationRelativeTo(null);
	setResizable(false);
	//Primeira parte concluida
	
	
	GridBagConstraints gridBagConstraints = new GridBagConstraints();// Controlador de posicionamento de componentes
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 0;
	gridBagConstraints.gridwidth = 2; 
	gridBagConstraints.insets = new Insets(5,10,5,5);
	gridBagConstraints.anchor = GridBagConstraints.WEST;
	
	descricaoHora.setPreferredSize(new Dimension(200,25));
	jpanel.add(descricaoHora, gridBagConstraints);
	
	mostratempo.setPreferredSize(new Dimension(200,25));
	gridBagConstraints.gridy ++;
	mostratempo.setEditable(false);
	jpanel.add(mostratempo, gridBagConstraints);
	
	descricaoHora2.setPreferredSize(new Dimension(200,25));
	gridBagConstraints.gridy ++;
	jpanel.add(descricaoHora2, gridBagConstraints);
	
	mostratempo2.setPreferredSize(new Dimension(200,25));
	gridBagConstraints.gridy ++;
	mostratempo2.setEditable(false);
	jpanel.add(mostratempo2,gridBagConstraints);
	
	//****************************************************
	
	gridBagConstraints.gridwidth = 1;
	
	jButton.setPreferredSize(new Dimension(92, 25));
	gridBagConstraints.gridy ++;
	jpanel.add(jButton, gridBagConstraints);
	
	jButton2.setPreferredSize(new Dimension(92, 25));
	gridBagConstraints.gridx ++;
	jpanel.add(jButton2, gridBagConstraints);
	
	add(jpanel, BorderLayout.WEST);
	/*Sempre será o ultimo comando*/
	setVisible(true);//Torna a tela visivel para o usuário
	}
		
}
