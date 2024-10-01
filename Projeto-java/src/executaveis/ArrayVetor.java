package executaveis;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
	//Array pode ser de todos os tipos de dados e objetos também	
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
		
		//Array sempre deve ter a qunatidde de posições definidas
		double [] notas = new double[Integer.parseInt(posicoes)];
		
		/*Atribuir valor nas posições do arrays*/
	
		
	for (int pos = 0 ;pos < notas.length ; pos++) {
		System.out.println("Nota "+ (pos +1 )+" é = " + notas[pos]);
	}
		
	}
	
}
