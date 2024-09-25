package executaveis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import curso.java.Classesauxiliares.FuncaoAtenticacao;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;

public class PrimeirClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			String login = JOptionPane.showInputDialog("Informe o login:");
			String senha = JOptionPane.showInputDialog("Informe a senha:");

			if (new FuncaoAtenticacao(new Diretor(login, senha))
					.autenticar()) { /*
										 * Vou traavar o contrato para autorizar somente quem realmente tem o contrato
										 * 100% legitimo
			
										 */
				Aluno aluno1 = new Aluno();
					
			String nome =JOptionPane.showInputDialog("Qual o nome do aluno?");
				
			for (int pos =1; pos <=4 ; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+pos+"?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina"+pos+"?");
			
				Disciplina disciplina = new  Disciplina();
				disciplina.nomeDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
			
				aluno1.getDisciplina().add(disciplina);
			
			}
	
				
			    aluno1.setNome();

System.out.println(aluno1);//Descrição do objeto na memoria
System.out.println("Média do aluno =" + aluno1.getMediaNota() );
System.out.println("Resultado = " + aluno1.getAlunoAprovado2());			    
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}
			/* aqui */
		} catch (Exception e) {
e.printStackTrace();
		
		}

	}
}
/**/
