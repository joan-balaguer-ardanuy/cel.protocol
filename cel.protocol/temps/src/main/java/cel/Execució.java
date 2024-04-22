package cel;

import cel.gènesi.*;

public class Execució {                                                                                                                        

	public static void main(String[] args) throws Throwable {
		
		int dilatació = 10;
		Hipercub hipercub = new Hipercub();
		hipercub.establirValor('A', 1*dilatació);
		hipercub.establirValor('B', 2*dilatació);
		hipercub.establirValor('C', 3*dilatació);
		hipercub.establirValor('D', 4*dilatació);
		hipercub.establirValor('E', 5*dilatació);
		hipercub.establirValor('F', 6*dilatació);
		hipercub.establirValor('G', 7*dilatació);
		hipercub.establirValor('H', 8*dilatació);
		hipercub.establirValor('I', 9*dilatació);
		hipercub.establirValor('J', 10*dilatació);
		hipercub.establirValor('K', 11*dilatació);
		hipercub.establirValor('L', 12*dilatació);
		hipercub.establirValor('M', 13*dilatació);
		hipercub.establirValor('N', 14*dilatació);
		hipercub.establirValor('O', 15*dilatació);
		hipercub.establirValor('P', 16*dilatació);
		hipercub.establirValor('Q', 17*dilatació);
		hipercub.establirValor('R', 18*dilatació);
		hipercub.establirValor('S', 19*dilatació);
		hipercub.establirValor('T', 20*dilatació);
		hipercub.establirValor('U', 21*dilatació);
		hipercub.establirValor('V', 22*dilatació);
		hipercub.establirValor('W', 23*dilatació);
		hipercub.establirValor('X', 24*dilatació);
		hipercub.establirValor('Y', 25*dilatació);
		hipercub.establirValor('Z', 26*dilatació);
		hipercub.establirValor('Ç', 27*dilatació);

		Genomapa genomapa = new Genomapa();
		genomapa.establirValor(hipercub, (Hipercadena) hipercub.obtenirFill());
		
		Cromosoma cromosoma = new Cromosoma();
		cromosoma.establirValor(genomapa, (Haploide) genomapa.obtenirFill());

//		Ribosoma ribosoma = new Ribosoma();
//		ribosoma.establirValor(cromosoma, (Diploide) cromosoma.obtenirFill());
//		
//		Operó operó = new Operó();
//		operó.establirValor(ribosoma, (Tetraploide) ribosoma.obtenirFill());
//		
//		Terra terra = new Terra();
//		terra.establirValor(operó, (Poliploide) operó.obtenirFill());
//		
//		Sol sol = new Sol();
//		sol.establirValor(terra, (Mar) terra.obtenirFill());
//		
//		ViaLàctia viaLàctia = new ViaLàctia();
//		viaLàctia.establirValor(sol, (AlfaCentauri) sol.obtenirFill());
//		
//		Supercúmul supercúmul = new Supercúmul();
//		supercúmul.establirValor(viaLàctia, (Andròmeda) viaLàctia.obtenirFill());
//		
//		Espaitemps espaitemps = new Espaitemps();
//		espaitemps.establirValor(supercúmul, (Interestellar) supercúmul.obtenirFill());
//		
//		Aaron aaron = new Aaron();
//		aaron.establirValor(espaitemps, (Hiperespai) espaitemps.obtenirFill());
//		
//		DéuPare déuPare = new DéuPare();
//		déuPare.establirValor(aaron, (TimeMaster) aaron.obtenirFill());
		
		cromosoma.execute(cromosoma);
	}
}