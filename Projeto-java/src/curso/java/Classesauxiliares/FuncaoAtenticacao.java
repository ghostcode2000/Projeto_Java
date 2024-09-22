package curso.java.Classesauxiliares;

import cursojava.interfaces.Permitir_acesso;

/*Realmente e somente receber alguem que tem o contrato da interface de permitir acesso e chamar o autenticar*/
public class FuncaoAtenticacao {

	private Permitir_acesso permitiracesso;
	
	public boolean autenticar () {
		return permitiracesso.autenticar();	
		}
	
	public FuncaoAtenticacao (Permitir_acesso acesso) {
		this.permitiracesso = acesso;
	}
	
	
}
