package cel.gènesi;

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
		
		Genomapa genomapa = new Genomapa(hipercub.obtenirNom(), hipercub, (Hipercadena) hipercub.obtenirFill());
		Cromosoma cromosoma = new Cromosoma(genomapa.obtenirNom(), genomapa, (Haploide) genomapa.obtenirFill());
		Ribosoma ribosoma = new Ribosoma(cromosoma.obtenirNom(), cromosoma, (Diploide) cromosoma.obtenirFill());
		Operó operó = new Operó(ribosoma.obtenirNom(), ribosoma, (Tetraploide) ribosoma.obtenirFill());
		Terra terra = new Terra(operó.obtenirNom(), operó, (Poliploide) operó.obtenirFill());
		Sol sol = new Sol(terra.obtenirNom(), terra, (Mar) terra.obtenirFill());
		ViaLàctia viaLàctia = new ViaLàctia(sol.obtenirNom(), sol, (AlfaCentauri) sol.obtenirFill());
		Supercúmul supercúmul = new Supercúmul(viaLàctia.obtenirNom(), viaLàctia, (Andròmeda) viaLàctia.obtenirFill());
		Espaitemps espaitemps = new Espaitemps(supercúmul.obtenirNom(), supercúmul, (Interestellar) supercúmul.obtenirFill());
		Aaron aaron = new Aaron(espaitemps.obtenirNom(), espaitemps, (Hiperespai) espaitemps.obtenirFill());
		DéuPare déuPare = new DéuPare(aaron.obtenirNom(), aaron, (TimeMaster) aaron.obtenirFill());
		déuPare.execute(déuPare);
	}
}