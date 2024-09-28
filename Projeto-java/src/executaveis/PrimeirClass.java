package executaveis;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.Classesauxiliares.FuncaoAtenticacao;
import curso.java.execao.Execao_ProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;

public class PrimeirClass {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
		lerArquivo();
			
			String login = JOptionPane.showInputDialog("Informe o login:");
			String senha = JOptionPane.showInputDialog("Informe a senha:");

			if (new FuncaoAtenticacao(new Diretor(login, senha))
					.autenticar()) { /*
										 * Vou traavar o contrato para autorizar somente quem realmente tem o contrato
										 * 100% legitimo
			
						
										 */
				
			List<Aluno> alunos = new ArrayList<Aluno>() ;
			
			//é uma lista que dentro dela temos uma chave que indentifica uma sequencia de valores também
			HashMap<String,List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			
			for (int qtd = 1; qtd <= 1; qtd++) {
				
				Aluno aluno1 = new Aluno();
			
			alunos.add(aluno1);
				
			String nome =JOptionPane.showInputDialog("Qual o nome do aluno?");
			aluno1.setNome(nome);
			String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
			aluno1.setidade(Integer.valueOf(idade));
					
			for (int pos =1; pos <=2 ; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+pos+"?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina"+pos+"?");
			
				Disciplina disciplina = new  Disciplina();
				disciplina.setNomeDisciplina(nomeDisciplina);
				disciplina.setNotaDisplina(Double.valueOf(notaDisciplina));
			
				aluno1.getDisciplina().add(disciplina);
			
			}
	
				
			

			    System.out.println(aluno1.getNome());//Descrição do objeto na memoria
			    System.out.println("Média do aluno = " + aluno1.getMediaNota() );
			    System.out.println("Resultado = " + aluno1.getAlunoAprovado2());		
			}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}
			/* aqui */

	
		}catch (NumberFormatException e) { //Captura so numberformatexeption
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace(); /*Imprime erro no consele Java*/
			
			/*Mensagem do erro ou causa*/
			System.out.println("Mensagem: " +e.getMessage());
		for (int pos= 0; pos < e.getStackTrace().length; pos++) {
			
			saida.append("\n Classe de erro : "+e.getStackTrace()[pos].getClassName());
			saida.append("\n Classe de erro : "+e.getStackTrace()[pos].getMethodName());
			saida.append("\n Classe de erro : "+e.getStackTrace()[pos].getLineNumber());
			saida.append("\n Class: "+e.getClass().getName());
		}
			
			
			JOptionPane.showInternalMessageDialog(null, "Erro de conversão de numero" + saida.toString());
		} catch (NullPointerException e) {//Captura so NullPointerException
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Oppa um null pointer exeption"+ e.getClass());
		}catch (Execao_ProcessarNota e) { /*captura todas a exceções n previstas*/
			e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Erro da execao customizada: " +e.getClass().getName());
		
		} finally { /*Sempre é executado ocorrendo erros ou não porque*/
			//Finally sempre é usado quando precisa exercutar um processo acontecendo erro ou não.
			JOptionPane.showMessageDialog(null, "Obrigado por aprender java comigo");
		}
	
		}
	public static void lerArquivo () throws Execao_ProcessarNota  {
try {
		File fil = new File("c:lines.txt");
		Scanner scanner = new Scanner(fil);
}catch (FileNotFoundException e) {
	throw new  Execao_ProcessarNota(e.getMessage());
}		

		}
	}
	

