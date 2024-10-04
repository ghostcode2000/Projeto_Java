package executaveis;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		/* Criação do alunos */
		Aluno aluno = new Aluno();
		aluno.setNome(" Natan moreira da silva");

		// Criação da disciplina
		Disciplina disciplina = new Disciplina();
		
		disciplina.setNomeDisciplina("Curso Java");
		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		disciplina.setNotaDisplina(notas);
		aluno.getDisciplina().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		
		disciplina2.setNomeDisciplina("Logica de programação");
		double[] notasLogica = { 8.0, 9.7, 7.7, 6.8 };
		disciplina2.setNotaDisplina(notasLogica);
		aluno.getDisciplina().add(disciplina2);

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex fernando");

		// Criação da disciplina
		Disciplina disciplina3 = new Disciplina();
		
		disciplina3.setNomeDisciplina("Curso Java");
		double[] notas2 = { 8.8, 9.7, 7.6, 6.8 };
		disciplina3.setNotaDisplina(notas2);
		aluno2.getDisciplina().add(disciplina);

		Disciplina disciplina4 = new Disciplina();
		
		disciplina4.setNomeDisciplina("Logica de programação");
		double[] notasLogica2 = { 8.0, 9.7, 7.7, 6.8 };
		disciplina4.setNotaDisplina(notasLogica2);
		aluno2.getDisciplina().add(disciplina4);

		//------------------------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno [2];
	
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for (int pos = 0; pos < arrayAlunos.length; pos ++) {
			System.out.println("Nome do aluno é:"+ arrayAlunos[pos].getNome());
			
			for (Disciplina d : arrayAlunos[pos].getDisciplina()) {
				System.out.println("Nome da disciplina é: "+d.getNomeDisciplina());
				
				for (int posnota = 0;posnota < d.getNotaDisplina().length;posnota++) {
					System.out.println("A nota número :" +posnota+" é igual = "+d.getNotaDisplina()[posnota]);
				}
			}
		}
		
		}
}
