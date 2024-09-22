package cursojava.interfaces;

/*Essa interface sera nosso contrato de autenticação*/
public interface Permitir_acesso {
	

	public boolean autenticar (String login, String senha);
}
