package executaveis;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import curso.java.Classesauxiliares.FuncaoAtenticacao;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;

public class PrimeirClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
				 

		
		if (new FuncaoAtenticacao (new Diretor(login, senha)).autenticar()) { /*Vou traavar o contrato para autorizar somente quem realmente tem o contrato 100% legitimo*/
			
			List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		}else {
			JOptionPane.showMessageDialog(null,"Acesso não permitido");
		}
		/*aqui*/
		}catch(Exception e) {
			
			StringBuilder saida = new StringBuilder()
;			
			e.printStackTrace();/*Imprime erro no console Java*/
			
			for (int pos = 0; pos <= e.getStackTrace().length; pos++) {
				
				saida.append("\n Classe de erro: " +e.getStackTrace()[pos].getClassName() );
				saida.append("\n Método de erro: " +e.getStackTrace()[pos].getMethodName() );
				saida.append("\n linha de erro: " +e.getStackTrace()[pos].getLineNumber() );
				saida.append("\n Class: " +e.getClass().getName());
			}	
				
			
			JOptionPane.showConfirmDialog(null, "Erro ao processar notas" + saida.toString()); 
		} catch (NullPointerException e) {
			JOptionPane.showConfirmDialog(null, "Opaa um null pointer exeption : " + e.getClass());
		}
		
			 
		}
}
		/**/
		
	


 