package cel.gènesi;

import cel.Paritat;

public class Execució {

	public static void main(String[] args) {
		int dilatació = 1;
		Hipercub hipercub = new Hipercub(Paritat.YY, 'A', (int) 'A'*dilatació);
		hipercub.establirValor('B', (int) 'B'*dilatació);
		hipercub.establirValor('C', (int) 'C'*dilatació);
		hipercub.establirValor('D', (int) 'D'*dilatació);
		hipercub.establirValor('E', (int) 'E'*dilatació);
		hipercub.establirValor('F', (int) 'F'*dilatació);
		hipercub.establirValor('G', (int) 'G'*dilatació);
		hipercub.establirValor('H', (int) 'H'*dilatació);
		hipercub.establirValor('I', (int) 'I'*dilatació);
		hipercub.establirValor('J', (int) 'J'*dilatació);
		hipercub.establirValor('K', (int) 'K'*dilatació);
		hipercub.establirValor('L', (int) 'L'*dilatació);
		hipercub.establirValor('M', (int) 'M'*dilatació);
		hipercub.establirValor('N', (int) 'N'*dilatació);
		hipercub.establirValor('O', (int) 'O'*dilatació);
		hipercub.establirValor('P', (int) 'P'*dilatació);
		hipercub.establirValor('Q', (int) 'Q'*dilatació);
		hipercub.establirValor('R', (int) 'R'*dilatació);
		hipercub.establirValor('S', (int) 'S'*dilatació);
		hipercub.establirValor('T', (int) 'T'*dilatació);
		hipercub.establirValor('U', (int) 'U'*dilatació);
		hipercub.establirValor('V', (int) 'V'*dilatació);
		hipercub.establirValor('W', (int) 'W'*dilatació);
		hipercub.establirValor('X', (int) 'X'*dilatació);
		hipercub.establirValor('Y', (int) 'Y'*dilatació);
		hipercub.establirValor('Z', (int) 'Z'*dilatació);
		hipercub.establirValor('Ç', (int) 'Ç'*dilatació);
		
		Genomapa genomapa = new Genomapa(hipercub.obtenirParitat(), hipercub, (Hipercadena) hipercub.obtenirFill());
		Cromosoma cromosoma = new Cromosoma(genomapa.obtenirParitat(), genomapa, (Haploide) genomapa.obtenirFill());
		Ribosoma ribosoma = new Ribosoma(cromosoma.obtenirParitat(), cromosoma, (Diploide) cromosoma.obtenirFill());
		Operó operó = new Operó(ribosoma.obtenirParitat(), ribosoma, (Tetraploide) ribosoma.obtenirFill());
		Terra terra = new Terra(operó.obtenirParitat(), operó, (Poliploide) operó.obtenirFill());
		Sol sol = new Sol(terra.obtenirParitat(), terra, (Mar) terra.obtenirFill());
		ViaLàctia viaLàctia = new ViaLàctia(sol.obtenirParitat(), sol, (AlfaCentauri) sol.obtenirFill());
		Supercúmul supercúmul = new Supercúmul(viaLàctia.obtenirParitat(), viaLàctia, (Andròmeda) viaLàctia.obtenirFill());
		Espaitemps espaitemps = new Espaitemps(supercúmul.obtenirParitat(), supercúmul, (Interestellar) supercúmul.obtenirFill());
		Aaron aaron = new Aaron(espaitemps.obtenirParitat(), espaitemps, (Hiperespai) espaitemps.obtenirFill());
		DéuPare déuPare = new DéuPare(aaron.obtenirParitat(), aaron, (TimeMaster) aaron.obtenirFill());
		cromosoma.run();
	}
}