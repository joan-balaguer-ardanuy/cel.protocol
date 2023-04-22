package cel;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import cel.gènesi.Aaron;
import cel.gènesi.AlfaCentauri;
import cel.gènesi.Andròmeda;
import cel.gènesi.Cromosoma;
import cel.gènesi.Diploide;
import cel.gènesi.DéuPare;
import cel.gènesi.Espaitemps;
import cel.gènesi.Genomapa;
import cel.gènesi.Haploide;
import cel.gènesi.Hipercadena;
import cel.gènesi.Hipercub;
import cel.gènesi.Hiperespai;
import cel.gènesi.Interestellar;
import cel.gènesi.Mar;
import cel.gènesi.MareDeDéu;
import cel.gènesi.Operó;
import cel.gènesi.Poliploide;
import cel.gènesi.Ribosoma;
import cel.gènesi.Sol;
import cel.gènesi.Supercúmul;
import cel.gènesi.Terra;
import cel.gènesi.Tetraploide;
import cel.gènesi.TimeMaster;
import cel.gènesi.ViaLàctia;

public class Execució {                                                                                                                        

	public static void main(String[] args) {
		
		Esperit esperit = new Esperit() {
			
			private static final long serialVersionUID = 4985487628873024010L;

			@Override
			public Thread newThread(Runnable r) {
				return new Thread(r);
			}
			
			@Override
			public void execute(Runnable command) {
				newThread(command).start();
			}
			
			@Override
			public void run() {
				
			}
			
			@Override
			public Paritat obtenirParitat() {
				return null;
			}
			
			@Override
			public String obtenirOrdre() {
				return null;
			}
			
			@Override
			public String obtenirNom() {
				return null;
			}
			
			@Override
			public void establirParitat(Paritat paritat) {
				
			}
			
			@Override
			public void establirOrdre(String ordre) {
				
			}
			
			@Override
			public void esdeveniment(Ordre manament) {
				Esperit esperit = (Esperit) manament.getSource();
				switch (manament.obtenirManament()) {
				case Manament.GÈNESI:
					if(esperit instanceof Terra) {
						Terra aaron = (Terra) esperit;
						aaron.afegirTestimoni(this);
						aaron.obtenirFill().afegirTestimoni(this);
						execute(aaron);
					}
					break;
				case Manament.VIU:
//						if(esperit instanceof Diploide || esperit instanceof Cromosoma) {
//						System.out.println("VIU: " + esperit.getClass() + " " + esperit.obtenirNom());
//					}
					if(esperit instanceof Tetraploide || esperit instanceof Ribosoma) {
						System.out.println("VIU: " + esperit.getClass());
						}
					if(esperit instanceof Poliploide || esperit instanceof Operó) {
						System.out.println("VIU: " + esperit.getClass());
					}
					break;
				case Manament.MOR:
					break;
				default:
					break;
				}
			}
			
			@Override
			public void alliberarTestimoni(Esperit esperit) {
				
			}
			
			@Override
			public void afegirTestimoni(Esperit esperit) {
				
			}
		};
		
		int dilatació = 1;
		Hipercub hipercub = new Hipercub(Hipercadena.class, Paritat.aleatòria());
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
		
		Genomapa genomapa = new Genomapa(Haploide.class, hipercub.obtenirParitat());
		genomapa.establirValor(hipercub, (Hipercadena) hipercub.obtenirFill());
		
		Cromosoma cromosoma = new Cromosoma(Diploide.class, genomapa.obtenirParitat());
		cromosoma.establirValor(genomapa, (Haploide) genomapa.obtenirFill());
		
		Ribosoma ribosoma = new Ribosoma(Tetraploide.class, cromosoma.obtenirParitat());
		ribosoma.establirValor(cromosoma, (Diploide) cromosoma.obtenirFill());
		
		Operó operó = new Operó(Poliploide.class, ribosoma.obtenirParitat());
		operó.establirValor(ribosoma, (Tetraploide) ribosoma.obtenirFill());
		
		Terra terra = new Terra(Mar.class, operó.obtenirParitat());
		terra.establirValor(operó, (Poliploide) operó.obtenirFill());
		
		Sol sol = new Sol(AlfaCentauri.class, terra.obtenirParitat());
		sol.establirValor(terra, (Mar) terra.obtenirFill());
		
//		ViaLàctia viaLàctia = new ViaLàctia(Andròmeda.class, sol.obtenirParitat());
//		viaLàctia.establirValor(sol, (AlfaCentauri) sol.obtenirFill());
//		
//		Supercúmul supercúmul = new Supercúmul(Interestellar.class, viaLàctia.obtenirParitat());
//		supercúmul.establirValor(viaLàctia, (Andròmeda) viaLàctia.obtenirFill());
//		
//		Espaitemps espaitemps = new Espaitemps(Hiperespai.class, supercúmul.obtenirParitat());
//		espaitemps.establirValor(supercúmul, (Interestellar) supercúmul.obtenirFill());
//		
//		Aaron aaron = new Aaron(TimeMaster.class, espaitemps.obtenirParitat());
//		aaron.establirValor(espaitemps, (Hiperespai) espaitemps.obtenirFill());
//		
//		DéuPare déuPare = new DéuPare(MareDeDéu.class, aaron.obtenirParitat());
//		déuPare.establirValor(aaron, (TimeMaster) aaron.obtenirFill());
		
		sol.afegirTestimoni(esperit);
		sol.obtenirFill().afegirTestimoni(esperit);
		
		System.setErr(new PrintStream(new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		}));
		sol.execute(sol);
	}
}