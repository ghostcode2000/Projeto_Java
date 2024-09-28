package curso.java.execao;

public class Execao_ProcessarNota extends Exception{

	public Execao_ProcessarNota(String erro) {
		super("Erro no processamento do arquivo do processar as notas do aluno " + erro);
	}
	
	
}
