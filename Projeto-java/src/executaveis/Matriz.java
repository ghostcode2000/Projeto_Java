package executaveis;

public class Matriz {
 public static void main(String[] args) {
//Isso é uma matriz	    cria uma posição com tre valores dentro dela
	int notas[][]  = new int[2][3];
	 
	notas[0][0] = 80;
	notas[0][1] = 90;
	notas[0][2] = 70;
	// Uma matriz é um Array com outro Array dentro dele.
	// o primeiro [] representa o elemento e o []replesenta os valores guardados neles.
	// uma matriz é parecida com uma tabela de Exel.que é divida em linhas e coluna.
	
	notas[1][0] = 40;
	notas[1][1] = 60;
	notas[1][2] = 50;
	
	System.out.println(notas); 
	/*Percorre as linhas*/
	for (int poslinha = 0; poslinha < notas.length; poslinha ++) {
		System.out.println("==============================================");
		/*Para cada linha percorrer as colunas ARRAY*/
		for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++ ) {
			System.out.println("Valor da matriz " + notas[poslinha][poscoluna]);
		}
	}
	
 	}
}
