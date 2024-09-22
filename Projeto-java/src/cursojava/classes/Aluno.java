package cursojava.classes;

import java.util.List;

/*Clase filha de pessoa que extende de pessoa*/
public class Aluno extends Pessoa{

	private String DataMatricula;
	private String NomeEscola;
	private String SerieMatriculado;
	private String Disciplinas;
	
	
	public String getDataMatricula() {
		return DataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		DataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return NomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		NomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return SerieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		SerieMatriculado = serieMatriculado;
	}
	public void setDisciplinas(String disciplinas) {
		Disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas () {
		return disciplinas;
	}
	public Aluno (String nomePadrao) {
	nome = nomePadrao;	
}
	public Aluno (String nomePadrao, int idadepadrao) {
		nome = nomePadrao;
		idade = idadepadrao;
	}
	public void setNome () {
	this.nome = nome;
}
	public String getNome () {
		return nome;
	}
	
	public int getIdade () {
		return idade;
	}
	public void setidade (int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDatanascimento (String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public String toString() {
		return "Aluno [DataMatricula=" + DataMatricula + ", NomeEscola=" + NomeEscola + ", SerieMatriculado="
				+ SerieMatriculado + ", Disciplinas=" + Disciplinas + ", nome=" + nome + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	@Override /*Indentifica método sobreescrito*/
		public boolean pessoaMaiorIdade() {
			// TODO Auto-generated method stub
			return idade >= 21;
		}
	
	public String msgMaioridade () {
		return this.pessoaMaiorIdade() ? "Oba aluno é maior de idade!" : "Ixi vc é menor...";
	}
	
	public double salario () {
		return 1500.00;
	}
}




