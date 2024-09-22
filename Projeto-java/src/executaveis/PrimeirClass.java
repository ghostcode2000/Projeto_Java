package executaveis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.interfaces.Permitir_acesso;

public class PrimeirClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
	
		if (new Secretario().autenticar(login,senha)) { /*Se true a cesso se false n acessa*/
			
		
		}else {
			JOptionPane.showMessageDialog(null,"Acesso não permitido");
		}
		
		}
		
	}


 