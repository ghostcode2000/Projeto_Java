package cursojava.classes;

/*Classe Mãe ou Super Classe */
public abstract class Pessoa {

	protected String nome;
	protected  int idade;
	protected  String dataNascimento;
	protected  String registroGeral;
	protected  String numeroCpf;
	protected  String nomeMae;
	protected  String nomePai;
	
	/*Método abstrato é que fica na classe pai é obrigatório para classes filhas*/
	public abstract double salario();
	
	public  String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	/*Retorna true caso seja 18 anos pra cima*/
	public boolean pessoaMaiorIdade () {
		return idade >= 18;
	}
	
}
