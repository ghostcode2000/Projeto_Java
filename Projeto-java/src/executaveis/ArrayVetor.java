package executaveis;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		/* Criação do alunos */
		Aluno aluno = new Aluno();
		aluno.setNome("Natan moreira da silva");

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

		System.out.println("Nome do aluno = " + aluno.getNome());
		System.out.println("--------------Disciplina do aluno-------------");

		for (Disciplina disc : aluno.getDisciplina()) {

			System.out.println("Disciplina: " + disc.getNomeDisciplina());
			System.out.println("A notas da disciplina são: ");
			
			double notaMax = 0.0;
					
			for (int pos = 0; pos < disc.getNotaDisplina().length; pos++) {
				System.out.println("Nota " + pos + " é igual = " + disc.getNotaDisplina()[pos]);
			
				if (pos == 0) {
					notaMax = disc.getNotaDisplina()[pos];
				} else {
					if (disc.getNotaDisplina()[pos] > notaMax ) {
						notaMax = disc.getNotaDisplina()[pos];
					}
			
			}

		}
		System.out.println("A maior nota da Disciplina = "+ disciplina.getNotaDisplina() +"e de valor :"+ notaMax );
	
		System.out.println("");
		
		}
}
}