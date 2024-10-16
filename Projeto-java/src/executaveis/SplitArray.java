package executaveis;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String texto = "Natan,curso java,80,70,90,89";
		
		String[] valoresArray = texto.split(",");
		
		System.out.println("nome: "+valoresArray[0]);
		System.out.println("curso: "+valoresArray[1]);
		System.out.println("nota 1: "+valoresArray[2]);
		System.out.println("nota 2: "+valoresArray[3]);
		System.out.println("nota 3: "+valoresArray[4]);
		System.out.println("nota 4: "+valoresArray[5]);
		
		/* Convertendo um Array em uma lista */
		List<String> List = Arrays.asList(valoresArray);
		
		for (String valoString : List) {
			System.out.println(valoString);
		}
		
		/*Convertet uma lista para Array*/
		String[] conversaoArray = List.toArray(new String[6]);
		
		for (int pos = 0; pos < conversaoArray.length;pos++) {
			System.out.println( conversaoArray[pos]);
		}
	}

}
