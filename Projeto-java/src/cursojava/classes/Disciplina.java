package cursojava.classes;

import java.util.Objects;

/*Essa classe disciplina servir para todas as notas e materias*/

public class Disciplina {

	String nomeDisciplina;
	double notaDisplina;

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public double getNotaDisplina() {
		return notaDisplina;
	}

	public void setNotaDisplina(double notaDisplina) {
		this.notaDisplina = notaDisplina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeDisciplina, notaDisplina);
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
		return Objects.equals(nomeDisciplina, other.nomeDisciplina)
				&& Double.doubleToLongBits(notaDisplina) == Double.doubleToLongBits(other.notaDisplina);
	}

	@Override
	public String toString() {
		return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", notaDisplina=" + notaDisplina + "]";
	}

}
