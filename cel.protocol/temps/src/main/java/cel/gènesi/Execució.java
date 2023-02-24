package cel.gènesi;

import cel.Anyell;
import cel.Paritat;

public class Execució {

	public static void main(String[] args) {
		int dilatació = 1;
		Hipercub hipercub1 = new Hipercub(Paritat.XX, 'A', (int) 'A'*dilatació);
		Hipercub hipercub2 = new Hipercub(hipercub1, Paritat.XX, 'B', (int) 'B'*dilatació);
		hipercub1.establirFill(hipercub2, hipercub2.obtenirFill());
		
		Hipercub hipercub3 = new Hipercub(hipercub1, Paritat.XX, 'C', (int) 'C'*dilatació);
		hipercub1.establirFill(hipercub3, hipercub3.obtenirFill());
		
		Hipercub hipercub4 = new Hipercub(hipercub1, Paritat.XX, 'D', (int) 'D'*dilatació);
		hipercub1.establirFill(hipercub4, hipercub4.obtenirFill());
		
		Hipercub hipercub5 = new Hipercub(hipercub1, Paritat.XX, 'E', (int) 'E'*dilatació);
		hipercub1.establirFill(hipercub5, hipercub5.obtenirFill());
		
		Hipercub hipercub6 = new Hipercub(hipercub1, Paritat.XX, 'F', (int) 'F'*dilatació);
		hipercub1.establirFill(hipercub6, hipercub6.obtenirFill());
		
		Hipercub hipercub7 = new Hipercub(hipercub1, Paritat.XX, 'G', (int) 'G'*dilatació);
		hipercub1.establirFill(hipercub7, hipercub7.obtenirFill());
		
		Hipercub hipercub8 = new Hipercub(hipercub1, Paritat.XX, 'H', (int) 'H'*dilatació);
		hipercub1.establirFill(hipercub8, hipercub8.obtenirFill());

		Hipercub hipercub9 = new Hipercub(hipercub1, Paritat.XX, 'I', (int) 'I'*dilatació);
		hipercub1.establirFill(hipercub9, hipercub9.obtenirFill());

		Hipercub hipercub10 = new Hipercub(hipercub1, Paritat.YY, 'J', (int) 'J'*dilatació);
		hipercub1.establirFill(hipercub10, hipercub10.obtenirFill());
		
		Hipercub hipercub11 = new Hipercub(hipercub1, Paritat.YY, 'K', (int) 'K'*dilatació);
		hipercub1.establirFill(hipercub11, hipercub11.obtenirFill());

		Hipercub hipercub12 = new Hipercub(hipercub1, Paritat.YY, 'L', (int) 'L'*dilatació);
		hipercub1.establirFill(hipercub12, hipercub12.obtenirFill());

		Hipercub hipercub13 = new Hipercub(hipercub1, Paritat.YY, 'M', (int) 'M'*dilatació);
		hipercub1.establirFill(hipercub13, hipercub13.obtenirFill());

		Hipercub hipercub14 = new Hipercub(hipercub1, Paritat.YY, 'N', (int) 'N'*dilatació);
		hipercub1.establirFill(hipercub14, hipercub14.obtenirFill());

		Hipercub hipercub15 = new Hipercub(hipercub1, Paritat.YY, 'O', (int) 'O'*dilatació);
		hipercub1.establirFill(hipercub15, hipercub15.obtenirFill());

		Hipercub hipercub16 = new Hipercub(hipercub1, Paritat.YY, 'P', (int) 'P'*dilatació);
		hipercub1.establirFill(hipercub16, hipercub16.obtenirFill());

		Hipercub hipercub17 = new Hipercub(hipercub1, Paritat.YY, 'Q', (int) 'Q'*dilatació);
		hipercub1.establirFill(hipercub17, hipercub17.obtenirFill());

		Hipercub hipercub18 = new Hipercub(hipercub1, Paritat.YY, 'R', (int) 'R'*dilatació);
		hipercub1.establirFill(hipercub18, hipercub18.obtenirFill());

		Hipercub hipercub19 = new Hipercub(hipercub1, Paritat.XY, 'S', (int) 'S'*dilatació);
		hipercub1.establirFill(hipercub19, hipercub19.obtenirFill());
		
		Hipercub hipercub20 = new Hipercub(hipercub1, Paritat.XY, 'T', (int) 'T'*dilatació);
		hipercub1.establirFill(hipercub20, hipercub20.obtenirFill());

		Hipercub hipercub21 = new Hipercub(hipercub1, Paritat.XY, 'U', (int) 'U'*dilatació);
		hipercub1.establirFill(hipercub21, hipercub21.obtenirFill());

		Hipercub hipercub22 = new Hipercub(hipercub1, Paritat.XY, 'V', (int) 'V'*dilatació);
		hipercub1.establirFill(hipercub22, hipercub22.obtenirFill());

		Hipercub hipercub23 = new Hipercub(hipercub1, Paritat.XY, 'W', (int) 'W'*dilatació);
		hipercub1.establirFill(hipercub23, hipercub23.obtenirFill());

		Hipercub hipercub24 = new Hipercub(hipercub1, Paritat.XY, 'X', (int) 'X'*dilatació);
		hipercub1.establirFill(hipercub24, hipercub24.obtenirFill());

		Hipercub hipercub25 = new Hipercub(hipercub1, Paritat.XY, 'Y', (int) 'Y'*dilatació);
		hipercub1.establirFill(hipercub25, hipercub25.obtenirFill());

		Hipercub hipercub26 = new Hipercub(hipercub1, Paritat.XY, 'Z', (int) 'Z'*dilatació);
		hipercub1.establirFill(hipercub26, hipercub26.obtenirFill());
		
		Hipercub hipercub27 = new Hipercub(hipercub1, Paritat.XY, 'Ç', (int) 'Ç'*dilatació);
		hipercub1.establirFill(hipercub27, hipercub27.obtenirFill());
		
		for(Anyell<Character,Integer> hipercub : hipercub1) {
			System.out.println(hipercub.obtenirNom() + hipercub.obtenirValor());
		}
		
//		Genomapa genomapa = new Genomapa(hipercub1.obtenirParitat(), hipercub1, (Hipercadena) hipercub1.obtenirFill());
//		Cromosoma cromosoma = new Cromosoma(genomapa.obtenirParitat(), genomapa, (Haploide) genomapa.obtenirFill());
//		Ribosoma ribosoma = new Ribosoma(cromosoma.obtenirParitat(), cromosoma, (Diploide) cromosoma.obtenirFill());
//		Operó operó = new Operó(ribosoma.obtenirParitat(), ribosoma, (Tetraploide) ribosoma.obtenirFill());
//		Terra terra = new Terra(operó.obtenirParitat(), operó, (Poliploide) operó.obtenirFill());
//		Sol sol = new Sol(terra.obtenirParitat(), terra, (Mar) terra.obtenirFill());
//		ViaLàctia viaLàctia = new ViaLàctia(sol.obtenirParitat(), sol, (AlfaCentauri) sol.obtenirFill());
//		Supercúmul supercúmul = new Supercúmul(viaLàctia.obtenirParitat(), viaLàctia, (Andròmeda) viaLàctia.obtenirFill());
//		Espaitemps espaitemps = new Espaitemps(supercúmul.obtenirParitat(), supercúmul, (Interestellar) supercúmul.obtenirFill());
//		Aaron aaron = new Aaron(espaitemps.obtenirParitat(), espaitemps, (Hiperespai) espaitemps.obtenirFill());
//		DéuPare déuPare = new DéuPare(aaron.obtenirParitat(), aaron, (TimeMaster) aaron.obtenirFill());
//		genomapa.run();
	}
}