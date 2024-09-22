package executaveis;



import javax.swing.JOptionPane;

import curso.java.Classesauxiliares.FuncaoAtenticacao;
import cursojava.classes.Diretor;

public class PrimeirClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
				 
	
	
		
		
		if (new FuncaoAtenticacao (new Diretor(login, senha)).autenticar()) { /*Vou traavar o contrato para autorizar somente quem realmente tem o contrato 100% legitimo*/
			
		
		}else {
			JOptionPane.showMessageDialog(null,"Acesso não permitido");
		}
		
		}
		
	}


 