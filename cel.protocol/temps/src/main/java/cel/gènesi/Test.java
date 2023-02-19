package cel.gènesi;

import cel.Anyell;

public class Test {

	public static void main(String[] args) {
		Hipercub hipercub = new Hipercub("Déu", 'A', (int) 'A');
		hipercub.establirValor('B', (int) 'B');
		hipercub.establirValor('C', (int) 'C');
		hipercub.establirValor('D', (int) 'D');
		hipercub.establirValor('E', (int) 'E');
		hipercub.establirValor('F', (int) 'F');
		hipercub.establirValor('G', (int) 'G');
		
//		Hipercadena hipercadena = new Hipercadena("Mare de Déu", (int) 'Z', 'Z');
//		hipercadena.establirValor((int) 'Z', 'Z');
//		hipercadena.establirValor((int) 'Z', 'Z');
//		hipercadena.establirValor((int) 'Z', 'Z');
//		hipercadena.establirValor((int) 'Z', 'Z');
//		hipercadena.establirValor((int) 'Z', 'Z');
//		hipercadena.establirValor((int) 'Z', 'Z');
		
//		hipercub.comparador().compara(hipercub, hipercadena);
		
		Genomapa genomapa = new Genomapa("Déu", hipercub, (Hipercadena) hipercub.obtenirFill());
		genomapa.execute(genomapa);
		
//		
//		genomapa.compareTo(genomapa.obtenirFill());
//
//		System.out.println(genomapa.comparador().font());
	}
}