package cel.gènesi;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import cel.Anyell;
import cel.Esperit;
import cel.Manament;
import cel.Ordre;
import cel.Paritat;

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
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Paritat obtenirParitat() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String obtenirOrdre() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String obtenirNom() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void establirParitat(Paritat paritat) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void establirOrdre(String ordre) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void esdeveniment(Ordre manament) {
				Esperit esperit = (Esperit) manament.getSource();
				switch (manament.obtenirManament()) {
				case Manament.GÈNESI:
					if(esperit instanceof DéuPare) {
						DéuPare déuPare = (DéuPare) esperit;
						déuPare.afegirTestimoni(this);
						déuPare.obtenirFill().afegirTestimoni(this);
						execute(déuPare);
					} else if(esperit instanceof Hipercub) {
						System.out.println(esperit.obtenirNom());
					} else {
						System.out.println(esperit.getClass());
					}
					break;
				default:
					break;
				}
			}
			
			@Override
			public void alliberarTestimoni(Esperit esperit) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afegirTestimoni(Esperit esperit) {
				// TODO Auto-generated method stub
				
			}
		};
		
		int dilatació = 1;
		Hipercub hipercub = new Hipercub(Paritat.XX, 'A', 1*dilatació);
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
		
		déuPare.afegirTestimoni(esperit);
		déuPare.obtenirFill().afegirTestimoni(esperit);
		
		System.setErr(new PrintStream(new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		}));
		déuPare.execute(déuPare);
	}
}