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
	
	Cromosoma cromosoma;
	DéuPare déuPare;
	Anyell<String,Coordenada> coordenades;
	
	float constantX = 621;
	float constantY = 702;
	float constantZ = 891;
	
	float tamany = 200;
	
	float x = 0;
	float y = 0;
	float z = 0;
	
	public void setup() {
		size(1920, 1080, P3D);
		background(0);
		colorMode(RGB, 255, 255, 255);
		noStroke();
		ellipseMode(RADIUS);
		frameRate(25);
		
		int dilatació = 1;
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
		déuPare = new DéuPare(aaron.obtenirParitat(), aaron, (TimeMaster) aaron.obtenirFill());
//		
		déuPare.afegirTestimoni(this);
		déuPare.obtenirFill().afegirTestimoni(this);

		coordenades = new StringCoordenada(Paritat.XX, déuPare.obtenirNom(), new Coordenada(déuPare.obtenirNom(), déuPare.obtenirParitat())); 
		coordenades.establirValor(hipercub.obtenirNom(), new Coordenada(hipercub.obtenirNom(), hipercub.obtenirParitat()));
		coordenades.establirValor(genomapa.obtenirNom(), new Coordenada(genomapa.obtenirNom(), genomapa.obtenirParitat()));
		coordenades.establirValor(cromosoma.obtenirNom(), new Coordenada(cromosoma.obtenirNom(), cromosoma.obtenirParitat()));
		coordenades.establirValor(cromosoma.obtenirNom(), new Coordenada(cromosoma.obtenirNom(), cromosoma.obtenirParitat()));
		coordenades.establirValor(ribosoma.obtenirNom(), new Coordenada(ribosoma.obtenirNom(), ribosoma.obtenirParitat()));
		coordenades.establirValor(operó.obtenirNom(), new Coordenada(operó.obtenirNom(), operó.obtenirParitat()));
		coordenades.establirValor(terra.obtenirNom(), new Coordenada(terra.obtenirNom(), terra.obtenirParitat()));
		coordenades.establirValor(sol.obtenirNom(), new Coordenada(sol.obtenirNom(), sol.obtenirParitat()));
		coordenades.establirValor(viaLàctia.obtenirNom(), new Coordenada(viaLàctia.obtenirNom(), viaLàctia.obtenirParitat()));
		coordenades.establirValor(supercúmul.obtenirNom(), new Coordenada(supercúmul.obtenirNom(), supercúmul.obtenirParitat()));
		coordenades.establirValor(espaitemps.obtenirNom(), new Coordenada(espaitemps.obtenirNom(), espaitemps.obtenirParitat()));
		coordenades.establirValor(aaron.obtenirNom(), new Coordenada(aaron.obtenirNom(), aaron.obtenirParitat()));
		déuPare.execute(déuPare);
	}

	public void draw() {
		background(0);
		camera(mouseX, mouseY, (height / 8) / tan(PI / 8), width / 2, height / 2, 0, 0, 1, 0);
		lights();
		spotLight(255, 0, 0, width / 2, height / 2, 400, 0, 0, -1, PI / 4, 2);
		noStroke();

		for(Anyell<String,Coordenada> coordCromosoma : coordenades) {
			Coordenada coordenada = coordCromosoma.obtenirValor();
			switch (coordenada.getParitat()) {
			case XX:
				rotateX(coordenada.getAngleX());	
				coordenada.setAngleX(coordenada.getAngleX() + PI / coordenada.getAngleX() % 50);
				break;
			case XY:
				rotateY(coordenada.getAngleY());
				coordenada.setAngleY(coordenada.getAngleY() + PI / coordenada.getAngleY() % 50);
				break;
			default:
				rotateZ(coordenada.getAngleZ());
				coordenada.setAngleZ(coordenada.getAngleZ() + PI / coordenada.getAngleZ() % 50);
				break;
			}
			translate(coordenada.getX() % constantX, coordenada.getY() % constantY, -coordenada.getZ() % constantZ);
//			translate(coordenada.getX(), coordenada.getY(), -coordenada.getZ());
//			fill(coordenada.getX() * 255 / constantX, coordenada.getY() * 255 / constantY, coordenada.getZ() * 255 / constantZ);
			fill((coordenada.getX() * 255 / constantX) % 255, (coordenada.getY() * 255 / constantY) % 255, (coordenada.getZ() * 255 / constantZ) % 255);
			sphere(coordenada.getTotal() % tamany);
		}
	}
	
	public void settings() {
		size(1920, 1080, "processing.opengl.PGraphics3D");
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
		switch (manament.obtenirManament()) {
		case Manament.GÈNESI:
			Esperit esperit = (Esperit) manament.getSource();
			Coordenada coordenada = new Coordenada(esperit.obtenirNom(), esperit.obtenirParitat());
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