package cel.gènesi;

import java.util.Iterator;

import cel.Anyell;
import cel.Esperit;
import cel.Testimonis;
import cel.arca.Ramat;

public class Execució {

	public static void main(String[] args) {
		Hipercub hipercub = new Hipercub("Déu", 'A', (int) 'A');
		hipercub.establirValor('B', (int) 'B');
		hipercub.establirValor('C', (int) 'C');
		hipercub.establirValor('D', (int) 'D');
		hipercub.establirValor('E', (int) 'E');
		hipercub.establirValor('F', (int) 'F');
		hipercub.establirValor('G', (int) 'G');
		hipercub.establirValor('H', (int) 'H');
		hipercub.establirValor('I', (int) 'I');
		hipercub.establirValor('J', (int) 'J');
		hipercub.establirValor('K', (int) 'K');
		hipercub.establirValor('L', (int) 'L');
		hipercub.establirValor('M', (int) 'M');
		hipercub.establirValor('N', (int) 'N');
		hipercub.establirValor('O', (int) 'O');
		hipercub.establirValor('P', (int) 'P');
		hipercub.establirValor('Q', (int) 'Q');
		hipercub.establirValor('R', (int) 'R');
		hipercub.establirValor('S', (int) 'S');
		hipercub.establirValor('T', (int) 'T');
		hipercub.establirValor('U', (int) 'U');
		hipercub.establirValor('V', (int) 'V');
		hipercub.establirValor('W', (int) 'W');
		hipercub.establirValor('X', (int) 'X');
		hipercub.establirValor('Y', (int) 'Y');
		hipercub.establirValor('Z', (int) 'Z');
		hipercub.establirValor('Ç', (int) 'Ç');
		
		Genomapa genomapa = new Genomapa("Déu", hipercub, (Hipercadena) hipercub.obtenirFill());
		genomapa.execute(genomapa);
	}
}