package executaveis;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class Executa {


	public static void main(String[] args) {
	
		
		Aluno aluno = new Aluno (null);
		aluno.setNome("Nata moreira = treinamento");
		aluno.setNomeEscola("JDev treinamentos");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("512515151");
		diretor.setIdade(50);
		diretor.setNome("Ruan");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Adimistração");
		secretario.setNumeroCpf("0514643222");
		secretario.setIdade(18);
		secretario.setNome("MAURICIO");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade()+ " - " +aluno.msgMaioridade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario Aluno é = "+ aluno.salario());
		System.out.println("Salario Diretor é = "+diretor.salario());
		System.out.println("Salario Secretario é ="+secretario.salario());
		
		teste(aluno);
		teste(secretario);
		teste(diretor);
		
	}
	public static void teste (Pessoa pessoa) {
		System.out.println("Essa pessoa é demais " +pessoa.getNome()+" e o salario é de = "+ pessoa.salario());
	}
}
