package cel;

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
	
	Genomapa genomapa;
//	Operó operó;
	
	Anyell<String,Coordenada> coordenades;
	
	float constantX = 621;
	float constantY = 702;
	float constantZ = 891-199+91;
	float cameraZ = 5000;
	
	float tamany = 200;
	
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
		Hipercub hipercub = new Hipercub(Paritat.XX, 'A', (int) 'A'*dilatació);
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
		
		genomapa = new Genomapa(hipercub.obtenirParitat(), hipercub, (Hipercadena) hipercub.obtenirFill());
		genomapa.afegirTestimoni(this);
		genomapa.obtenirFill().afegirTestimoni(this);
		coordenades = new StringCoordenada(genomapa.obtenirParitat(), genomapa.obtenirNom(), new Coordenada(genomapa));
		genomapa.execute(genomapa);
	}

	public void draw() {
		background(0);
		camera(0, 0, -cameraZ, 0, 0, 0, 0, 1, 0);
		lights();
		spotLight(255, 0, 0, width / 2, height / 2, 5000, 0, 0, -1, PI / 4, 2);
		noStroke();
		
		for(Anyell<String,Coordenada> anyell : coordenades) {
			Coordenada coordenada = anyell.obtenirValor();
//			if(coordenada.getEsperit() instanceof Hipercadena) {
//				rotateX(coordenada.getAngleX());	
//				coordenada.setAngleX(coordenada.getAngleX() + PI / coordenada.getX() % 50);
//			} else if(coordenada.getEsperit() instanceof Hipercub) {
//				rotateY(coordenada.getAngleY());
//				coordenada.setAngleY(coordenada.getAngleY() + PI / coordenada.getY() % 50);
//			}
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
//			rotateZ(coordenada.getAngleZ());
//			coordenada.setAngleZ(coordenada.getAngleZ() + PI / coordenada.getZ() % 50);
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
//			if(coordenada.getEsperit() instanceof Hipercadena) {
//				fill((coordenada.getX() % 255),  coordenada.getY(), (coordenada.getZ() % 255));
//			} else if(coordenada.getEsperit() instanceof Hipercub) {
//				fill((coordenada.getX()),  coordenada.getY() % 255, (coordenada.getZ() % 255));
//			}
			sphere(coordenada.getTotal() % 200);
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
		case Manament.VIU:
//			if(esperit instanceof Hipercub) {
//				Coordenada coordenada = new Coordenada((Hipercub) esperit);
//				coordenades.establirValor(esperit.obtenirNom(), coordenada);
//			} else if(esperit instanceof Hipercadena) {
//				Coordenada coordenada = new Coordenada((Hipercadena) esperit);
//				coordenades.establirValor(esperit.obtenirNom(), coordenada);
//			}
//			
			Coordenada coordenada = new Coordenada(esperit);
			coordenades.establirValor(esperit.obtenirNom(), coordenada);
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