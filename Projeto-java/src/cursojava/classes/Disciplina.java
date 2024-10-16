package cursojava.classes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/*Essa classe disciplina servir para todas as notas e materias*/

public class Disciplina {
    //Cada disciplina terá 4 notas durante o ano inteiro
	String nomeDisciplina;
	private double [] notaDisplina = new double[4];

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	

	public double[] getNotaDisplina() {
		return notaDisplina;
	}

	public void setNotaDisplina(double[] notaDisplina) {
		this.notaDisplina = notaDisplina;
	}
	
	public double getMediaNotas() {
		
		double somaTotal = 0;
	
		for (int pos = 0; pos < notaDisplina.length ; pos++) { 
		somaTotal += notaDisplina[pos]; }
		
		return somaTotal / 4;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notaDisplina);
		result = prime * result + Objects.hash(nomeDisciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(nomeDisciplina, other.nomeDisciplina) && Arrays.equals(notaDisplina, other.notaDisplina);
	}

	
	
	
	}


