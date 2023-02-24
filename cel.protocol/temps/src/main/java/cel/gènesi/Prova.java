package cel.gènesi;

import cel.Paritat;

public class Prova {

	public static void main(String[] args) {
		int dilatació = 1;
		Hipercub hipercub1 = new Hipercub(Paritat.XX, 'A', (int) 'A'*dilatació);
		hipercub1.establirValor('B', (int) 'B'*dilatació);
		hipercub1.establirValor('C', (int) 'C'*dilatació);
		hipercub1.establirValor('D', (int) 'D'*dilatació);
		hipercub1.establirValor('E', (int) 'E'*dilatació);
		hipercub1.establirValor('F', (int) 'F'*dilatació);
		hipercub1.establirValor('G', (int) 'G'*dilatació);
		hipercub1.establirValor('H', (int) 'H'*dilatació);
		hipercub1.establirValor('I', (int) 'I'*dilatació);
		hipercub1.establirValor('J', (int) 'J'*dilatació);
		hipercub1.establirValor('K', (int) 'K'*dilatació);
		hipercub1.establirValor('L', (int) 'L'*dilatació);
		hipercub1.establirValor('M', (int) 'M'*dilatació);
		hipercub1.establirValor('N', (int) 'N'*dilatació);
		hipercub1.establirValor('O', (int) 'O'*dilatació);
		hipercub1.establirValor('P', (int) 'P'*dilatació);
		hipercub1.establirValor('Q', (int) 'Q'*dilatació);
		hipercub1.establirValor('R', (int) 'R'*dilatació);
		hipercub1.establirValor('S', (int) 'S'*dilatació);
		hipercub1.establirValor('T', (int) 'T'*dilatació);
		hipercub1.establirValor('U', (int) 'U'*dilatació);
		hipercub1.establirValor('V', (int) 'V'*dilatació);
		hipercub1.establirValor('W', (int) 'W'*dilatació);
		hipercub1.establirValor('X', (int) 'X'*dilatació);
		hipercub1.establirValor('Y', (int) 'Y'*dilatació);
		hipercub1.establirValor('Z', (int) 'Z'*dilatació);
		hipercub1.establirValor('Ç', (int) 'Ç'*dilatació);
		
		Genomapa genomapa1 = new Genomapa(hipercub1.obtenirParitat(), hipercub1, (Hipercadena) hipercub1.obtenirFill());
//		
//		Cromosoma cromosoma = new Cromosoma(genomapa1.obtenirParitat(), genomapa1, (Haploide) genomapa1.obtenirFill());
		
		System.out.println(genomapa1.obtenirNom());
				
	}

}
