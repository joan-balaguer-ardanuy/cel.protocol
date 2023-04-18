package cel;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Iterator;

import cel.coordenada.CoordenadaString;
import cel.coordenada.StringCoordenada;
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
import processing.core.*;

public class Simulador extends PApplet implements Esperit {

	private static final long serialVersionUID = -5297826820482250738L;

	DéuPare déuPare;

	Testimonis testimonis;
	Anyell<String,Coordenada> coordenades;
	
	float constantX = 621;
	float constantY = 702;
	float constantZ = 891-199+91;
	float cameraZ = 5000;
	
	float tamany = 200;
	
	boolean clear = false;
	
	float x = 0;
	float y = 0;
	float z = 0;
	
	public void setup() {
		background(0);
		colorMode(RGB, 255);
		noStroke();
		ellipseMode(RADIUS);
		frameRate(25);
		
		int dilatació = 10;
		Hipercub hipercub = new Hipercub(Hipercadena.class, Paritat.XX);
		hipercub.establirValor('A', 65*dilatació);
		hipercub.establirValor('B', 66*dilatació);
		hipercub.establirValor('C', 67*dilatació);
		hipercub.establirValor('D', 68*dilatació);
		hipercub.establirValor('E', 69*dilatació);
		hipercub.establirValor('F', 70*dilatació);
		hipercub.establirValor('G', 71*dilatació);
		hipercub.establirValor('H', 72*dilatació);
		hipercub.establirValor('I', 73*dilatació);
		hipercub.establirValor('J', 74*dilatació);
		hipercub.establirValor('K', 75*dilatació);
		hipercub.establirValor('L', 76*dilatació);
		hipercub.establirValor('M', 77*dilatació);
		hipercub.establirValor('N', 78*dilatació);
		hipercub.establirValor('O', 79*dilatació);
		hipercub.establirValor('P', 80*dilatació);
		hipercub.establirValor('Q', 81*dilatació);
		hipercub.establirValor('R', 82*dilatació);
		hipercub.establirValor('S', 83*dilatació);
		hipercub.establirValor('T', 84*dilatació);
		hipercub.establirValor('U', 85*dilatació);
		hipercub.establirValor('V', 86*dilatació);
		hipercub.establirValor('W', 87*dilatació);
		hipercub.establirValor('X', 88*dilatació);
		hipercub.establirValor('Y', 89*dilatació);
		hipercub.establirValor('Z', 90*dilatació);
		hipercub.establirValor('Ç', 91*dilatació);
		
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
		
		ViaLàctia viaLàctia = new ViaLàctia(Andròmeda.class, sol.obtenirParitat());
		viaLàctia.establirValor(sol, (AlfaCentauri) sol.obtenirFill());
		
		Supercúmul supercúmul = new Supercúmul(Interestellar.class, viaLàctia.obtenirParitat());
		supercúmul.establirValor(viaLàctia, (Andròmeda) viaLàctia.obtenirFill());
		
		Espaitemps espaitemps = new Espaitemps(Hiperespai.class, supercúmul.obtenirParitat());
		espaitemps.establirValor(supercúmul, (Interestellar) supercúmul.obtenirFill());
		
		Aaron aaron = new Aaron(TimeMaster.class, espaitemps.obtenirParitat());
		aaron.establirValor(espaitemps, (Hiperespai) espaitemps.obtenirFill());
		
		déuPare = new DéuPare(MareDeDéu.class, aaron.obtenirParitat());
		déuPare.establirValor(aaron, (TimeMaster) aaron.obtenirFill());
		
		déuPare.afegirTestimoni(this);
		déuPare.obtenirFill().afegirTestimoni(this);
		
//		System.setErr(new PrintStream(new OutputStream() {
//			
//			@Override
//			public void write(int b) throws IOException {
//				// TODO Auto-generated method stub
//				
//			}
//		}));
		coordenades = new StringCoordenada(CoordenadaString.class, déuPare.obtenirParitat());
		coordenades.establirValor(déuPare.obtenirNom(), new Coordenada(déuPare));
		déuPare.execute(déuPare);
	}

	public void draw() {
		background(0);
		camera(width*2, height*2, -cameraZ, 0, 0, 0, 0, 1, 0);
//		hint(DISABLE_DEPTH_TEST); 
		lights();
		spotLight(255, 0, 0, width / 2, height / 2, 5000, 0, 0, -1, PI / 4, 2);
		noStroke();
//		synchronized (this) {
//			if (clear) {
//				Iterator<Anyell<String, Coordenada>> it = coordenades.iterator();
//				while (it.hasNext()) {
//					if (it.next().obtenirValor().getEsperit().obtenirOrdre() == Manament.MOR) {
//						it.remove();
//					}
//				}
//			}
//		}
		synchronized (this) {
			
			for(Anyell<String,Coordenada> anyell : coordenades) {
				Coordenada coordenada = anyell.obtenirValor();
				switch (coordenada.getParitat()) {
				case XX:
					rotateX(coordenada.getAngleX());	
					coordenada.setAngleX(coordenada.getAngleX() + PI / coordenada.getX() % 50);
					break;
				case XY:
					rotateY(coordenada.getAngleY());
					coordenada.setAngleY(coordenada.getAngleY() + PI / coordenada.getY() % 50);
					break;
				default:
					rotateX(coordenada.getAngleX());	
					coordenada.setAngleX(coordenada.getAngleX() + PI / coordenada.getX() % 50);
					rotateY(coordenada.getAngleY());
					coordenada.setAngleY(coordenada.getAngleY() + PI / coordenada.getY() % 50);
					rotateZ(coordenada.getAngleZ());
					coordenada.setAngleZ(coordenada.getAngleZ() + PI / coordenada.getZ() % 50);
					break;
				}
				translate(coordenada.getX() % constantX, coordenada.getY() % constantY, -coordenada.getZ() % constantZ);
				
				switch (coordenada.getParitat()) {
				case XX:
					fill((coordenada.getX() % 255),  coordenada.getY(), (coordenada.getZ() % 255));
					break;
				case XY:
					fill((coordenada.getX()),  coordenada.getY() % 255, (coordenada.getZ() % 255));
					break;
				default:
					fill((coordenada.getX()) % 255,  coordenada.getY() % 255, coordenada.getZ() % 255);
					break;
				}
				sphere(coordenada.getTotal() % 150 + 50);
			}
		}
	}
	
	public void settings() {
		System.setProperty("jogl.disable.openglcore", "false");
		size(1920, 1080, "processing.opengl.PGraphics3D");
//		size(1366, 768, "processing.opengl.PGraphics3D");
	}

	@Override
	public String obtenirNom() {
		return null; 
	}

	@Override
	public String obtenirOrdre() {
		return null;
	}

	@Override
	public void establirOrdre(String ordre) {
		
	}

	@Override
	public void run() {
		
	}

	@Override
	public void execute(Runnable command) {
		newThread(command).start();
	}

	@Override
	public Thread newThread(Runnable r) {
		return new Thread(r);
	}

	@Override
	public void afegirTestimoni(Esperit esperit) {
		
	}

	@Override
	public void alliberarTestimoni(Esperit esperit) {
		
	}

	@Override
	public void esdeveniment(Ordre manament) {
		Esperit esperit = (Esperit) manament.getSource();
		switch (manament.obtenirManament()) {
		case Manament.GÈNESI:
			if(esperit instanceof Aaron) {
				Aaron genomapa = (Aaron) esperit;
				genomapa.afegirTestimoni(this);
				genomapa.obtenirFill().afegirTestimoni(this);
//				execute(genomapa);
			}
//			Coordenada coordenada = new Coordenada(esperit);
//			coordenades.establirValor(esperit.obtenirNom(), coordenada);
			if(esperit instanceof Hipercub) {
				Coordenada coordenada = new Coordenada(esperit);
				coordenades.establirValor(esperit.obtenirNom(), coordenada);
			}
			if(esperit instanceof Genomapa) {
				Coordenada coordenada = new Coordenada(esperit);
				coordenades.establirValor(esperit.obtenirNom(), coordenada);
			}
//			else if(esperit instanceof Hipercadena) {
//				Coordenada coordenada = new Coordenada(esperit);
//				coordenades.establirValor(esperit.obtenirNom(), coordenada);
//			}
//			if(esperit instanceof Genomapa) {
//				for(Anyell<Hipercub,Hipercadena> genomapa : (Genomapa) esperit) {
//					Coordenada coordenada = new Coordenada(genomapa);
//					coordenades.establirValor(esperit.obtenirNom(), coordenada);
//					
//					for(Anyell<Character,Integer> hipercub : genomapa.obtenirClau()) {
//						coordenada = new Coordenada(hipercub);
//						coordenades.establirValor(esperit.obtenirNom(), coordenada);
//					}
//				}
//			} else if(esperit instanceof Haploide) {
//				for(Anyell<Hipercadena,Hipercub> haploide : (Haploide) esperit) {
//					Coordenada coordenada = new Coordenada(haploide);
//					coordenades.establirValor(esperit.obtenirNom(), coordenada);
//					
////					for(Anyell<Integer,Character> hipercadena : haploide.obtenirClau()) {
////						coordenada = new Coordenada(hipercadena);
////						coordenades.establirValor(esperit.obtenirNom(), coordenada);
////					}
//				}
//			}
//			
//			if (esperit instanceof Cromosoma) {
//				Cromosoma pare = (Cromosoma) esperit;
//				
//				for(Anyell<Genomapa,Haploide> cromosoma : pare) {
//					Coordenada coordenada = new Coordenada(cromosoma);
//					coordenades.establirValor(esperit.obtenirNom(), coordenada);
//					
//					for(Anyell<Hipercub,Hipercadena> genomapa : cromosoma.obtenirClau()) {
//						coordenada = new Coordenada(genomapa);
//						coordenades.establirValor(esperit.obtenirNom(), coordenada);
//						
//						for(Anyell<Character,Integer> hipercub : genomapa.obtenirClau()) {
//							coordenada = new Coordenada(hipercub);
//							coordenades.establirValor(esperit.obtenirNom(), coordenada);
//						}
//					}
//				}
//			}
//			if (esperit instanceof Diploide) {
//				Diploide mare = (Diploide) esperit;
//				
//				for(Anyell<Haploide,Genomapa> diploide : mare) {
//					Coordenada coordenada = new Coordenada(diploide);
//					coordenades.establirValor(esperit.obtenirNom(), coordenada);
//					
//					for(Anyell<Hipercadena,Hipercub> haploide : diploide.obtenirClau()) {
//						coordenada = new Coordenada(haploide);
//						coordenades.establirValor(esperit.obtenirNom(), coordenada);
//						
//						for(Anyell<Integer,Character> hipercadena : haploide.obtenirClau()) {
//							coordenada = new Coordenada(hipercadena);
//							coordenades.establirValor(esperit.obtenirNom(), coordenada);
//						}
//					}
//				}
//			}
			
				
			break;
		case Manament.VIU:
//			if (esperit.obtenirNom().length() > 1) {
//				System.out.println(esperit.getClass() + " " + esperit.obtenirNom());
//				Coordenada coordenada = new Coordenada(esperit);
//				coordenades.establirValor(esperit.obtenirNom(), coordenada);
//				clear = true;
//			}
			
			break;
		case Manament.MOR:
			clear = false;
			break;
		default:
			break;
		}
	}

	@Override
	public Paritat obtenirParitat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void establirParitat(Paritat paritat) {
		// TODO Auto-generated method stub
		
	}
}