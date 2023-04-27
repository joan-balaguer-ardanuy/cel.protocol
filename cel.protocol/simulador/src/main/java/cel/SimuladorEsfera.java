package cel;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Iterator;

import cel.arca.Ramat;
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
import cel.kjdss.ui.KJDSSSample;
import cel.kjdss.ui.KJDSS_Saturation_Event;
import cel.kjdss.ui.KJDSS_Saturation_Listener;
import processing.core.*;

public class SimuladorEsfera extends PApplet implements Esperit, KJDSS_Saturation_Listener {

	private static final long serialVersionUID = -5297826820482250738L;

	Operó operó;

	Anyell<String,Coordenada> coordenades;
	
	Testimonis testimonis;

	KJDSSSample sample = new KJDSSSample();
	
	float cameraZ = 4000;
	float constant = 1000;
	int dilatació = 5;
	
	public void setup() {
		background(0);
		colorMode(RGB, 255);
		noStroke();
		ellipseMode(RADIUS);
		frameRate(25);
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				//Instanciem equalitzador
				//Afegim listener de l'event de saturaci� de l'equalitzador
				sample.Start_KJDS();
			}
		};
		execute(runnable);
		
		Hipercub hipercub = new Hipercub(Hipercadena.class, Paritat.aleatòria());
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
		
		DéuPare déuPare = new DéuPare(MareDeDéu.class, aaron.obtenirParitat());
		déuPare.establirValor(aaron, (TimeMaster) aaron.obtenirFill());
		
		déuPare.afegirTestimoni(this);
		déuPare.obtenirFill().afegirTestimoni(this);
		
		System.setErr(new PrintStream(new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		}));
		coordenades = new StringCoordenada(CoordenadaString.class, operó.obtenirParitat());
		coordenades.establirValor(operó.obtenirNom(), new Coordenada(hipercub, dilatació));
		sample.add_KJDSS_Saturation_Listener(SimuladorEsfera.this);

		déuPare.execute(déuPare);
	}

	public void draw() {
		synchronized (this) {
			background(0);
			camera(0, 0, -cameraZ, 0, 0, 0, 0, 1, 0);
			lights();
			spotLight(255, 0, 0, width / 2, height / 2, 5000, 0, 0, -1, PI / 4, 2);
			noStroke();

			for (Anyell<String, Coordenada> anyell : coordenades) {
				Coordenada coordenada = anyell.obtenirValor();
				switch (coordenada.getParitat()) {
				case XX:
					fill((coordenada.getX3()) % 255, coordenada.getY3() , (coordenada.getZ3()));
					break;
				case XY:
					fill((coordenada.getX3()), coordenada.getY3() % 255, (coordenada.getZ3()));
					break;
				default:
					fill((coordenada.getX3()) % 255, coordenada.getY3() % 255, coordenada.getZ3() % 255);
					break;
				}
				if(coordenada.getEsperit() instanceof Hipercadena || coordenada.getEsperit() instanceof Hipercub) {
					rotateX(coordenada.getAngleX());
					coordenada.setAngleX(coordenada.getAngleX() + PI / coordenada.getX2());
					rotateY(coordenada.getAngleY());
					coordenada.setAngleY(coordenada.getAngleY() + PI / coordenada.getY2());
					rotateZ(coordenada.getAngleZ());
					coordenada.setAngleZ(coordenada.getAngleZ() + PI / coordenada.getZ2());
				} else if(coordenada.getEsperit() instanceof Diploide || coordenada.getEsperit() instanceof Cromosoma) {
					rotateX(coordenada.getAngleX());
					coordenada.setAngleX(coordenada.getAngleX() + PI / coordenada.getX2());
					rotateY(coordenada.getAngleY());
					coordenada.setAngleY(coordenada.getAngleY() + PI / coordenada.getY2());
					rotateZ(coordenada.getAngleZ());
					coordenada.setAngleZ(coordenada.getAngleZ() + PI / coordenada.getZ2());
				}
				pushMatrix();
				
				if(coordenada.getEsperit() instanceof Hipercadena || coordenada.getEsperit() instanceof Hipercub) {
					translate(coordenada.getX() % 250 + 1000, coordenada.getY() % 250 + 1000, -coordenada.getZ() % 250 + 1000);
					sphere(coordenada.getTotal() % 40 + 30);
				} else if(coordenada.getEsperit() instanceof Diploide || coordenada.getEsperit() instanceof Cromosoma) {
					translate(coordenada.getX() % 250 + 1250, coordenada.getY() % 250 + 1250, -coordenada.getZ() % 250 + 1250);
					sphere(coordenada.getTotal() % 80 + 70);
				}
				popMatrix();
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
		Thread t = newThread(command);
		t.start();
//		try {
//			t.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
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
			if(esperit instanceof Ribosoma) {
				Ribosoma genomapa = (Ribosoma) esperit;
				genomapa.afegirTestimoni(this);
				genomapa.obtenirFill().afegirTestimoni(this);
//				execute(genomapa);
			}
			break;
		case Manament.VIU:
			synchronized (this) {
				if(esperit instanceof Hipercub) {
					System.out.println(esperit.getClass() + " " + esperit.obtenirNom());
					Coordenada coordenada = new Coordenada((Hipercub) esperit, dilatació);
					coordenades.establirValor(esperit.obtenirNom(), coordenada);
				} 
				else if(esperit instanceof Hipercadena) {
					System.out.println(esperit.getClass() + " " + esperit.obtenirNom());
					Coordenada coordenada = new Coordenada((Hipercadena) esperit, dilatació);
					coordenades.establirValor(esperit.obtenirNom(), coordenada);
				} else if(esperit instanceof Cromosoma) {
					System.out.println(esperit.getClass() + " " + esperit.obtenirNom());
					Coordenada coordenada = new Coordenada((Cromosoma) esperit, dilatació);
					coordenades.establirValor(esperit.obtenirNom(), coordenada);
				} else if(esperit instanceof Diploide) {
					System.out.println(esperit.getClass() + " " + esperit.obtenirNom());
					Coordenada coordenada = new Coordenada((Diploide) esperit, dilatació);
					coordenades.establirValor(esperit.obtenirNom(), coordenada);
				}
//				if(esperit instanceof Haploide) {
//					Coordenada coordenada = new Coordenada(esperit);
//					System.out.println(esperit.getClass() + " " + esperit.obtenirNom());
//					coordenades.establirValor(esperit.obtenirNom(), coordenada);
//					for(Anyell<Hipercadena,Hipercub> anyell : (Haploide) esperit) {
//						coordenada = new Coordenada(anyell.obtenirClau(), dilatació);
//						coordenades.establirValor(anyell.obtenirClau().obtenirNom(), coordenada);
//						coordenada = new Coordenada(anyell.obtenirValor(), dilatació);
//						coordenades.establirValor(anyell.obtenirValor().obtenirNom(), coordenada);
//					}
//				}
//				System.out.println("VIU: " + esperit.getClass() + " " + esperit.obtenirNom());
//				if (esperit instanceof Cromosoma) {
////					if (!blocked) {
//						blocked = true;
//						Cromosoma pare = (Cromosoma) esperit;
//						for (Anyell<Genomapa, Haploide> cromosoma : pare) {
//							for (Anyell<Character, Integer> hipercub : cromosoma.obtenirClau().obtenirClau()) {
//								Coordenada coordenada = new Coordenada((Hipercub) hipercub, dilatació, init, init, init);
//								coordenades.establirValor(hipercub.obtenirNom(), coordenada);
//								coordenada = new Coordenada((Hipercadena) hipercub.obtenirFill(), dilatació, init, init,
//										init);
//								coordenades.establirValor(hipercub.obtenirFill().obtenirNom(), coordenada);
//							}
////							init += 10;
//						}
////					}
//				}
			}
			break;
		case Manament.MOR:
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

	@Override
	public void on_Saturation_Event(KJDSS_Saturation_Event event) {
		switch (event.getEventType()) {
		case KJDSS_Saturation_Event.Event_Types.SAT:
			for (Anyell<String, Coordenada> anyell : coordenades) {
				Coordenada coordenada = anyell.obtenirValor();
				switch (coordenada.getParitat()) {
				case XX:
					float val = (coordenada.getX2() + (float) 1);
//					coordenada.setX2(val);
					if (val <= coordenada.minX) {
						coordenada.setX2(coordenada.initialX);
					} else if (val > coordenada.maxX) {
						coordenada.setX2(coordenada.initialX);
					} else {
						coordenada.setX2(val);
					}
					break;
				case XY:
					float val2 = (coordenada.getY2() + (float) 1);
//					coordenada.setY2(val2);
					if (val2 <= coordenada.minY) {
						coordenada.setY2(coordenada.initialY);
					} else if (val2 > coordenada.maxY) {
						coordenada.setY2(coordenada.initialY);
					} else {
						coordenada.setY2(val2);
					}
					break;
				default:
					
					float val3 = (coordenada.getZ2() + (float) 1);
//					coordenada.setZ2(val3);
					if (val3 <= coordenada.minZ) {
						coordenada.setZ2(coordenada.initialZ);
					} else if (val3 > coordenada.maxZ) {
						coordenada.setZ2(coordenada.initialZ);
					} else {
						coordenada.setZ2(val3);
					}
					break;
				}
			}
			break;
		case KJDSS_Saturation_Event.Event_Types.SAT_100:

			for (Anyell<String, Coordenada> anyell : coordenades) {
				Coordenada coordenada = anyell.obtenirValor();
				switch (coordenada.getParitat()) {
				case XX:
					float val = (coordenada.getX3() + (float) 0.01);
					if (val <= coordenada.minX) {
						coordenada.setX3(coordenada.initialX);
					} else if (val > coordenada.maxX) {
						coordenada.setX3(coordenada.initialX);
					} else {
						coordenada.setX3(val);
					}
					break;
				case XY:
					float val2 = (coordenada.getY3() + (float) 0.01);
					if (val2 <= coordenada.minY) {
						coordenada.setY3(coordenada.initialY);
					} else if (val2 > coordenada.maxY){
						coordenada.setY3(coordenada.initialY);
					} else {
						coordenada.setY3(val2);
					}
					break;
				default:
					float val3 = (coordenada.getZ3() + (float) 0.01);
					if (val3 <= coordenada.minZ) {
						coordenada.setZ3(coordenada.initialZ);
					} else if (val3 > coordenada.maxZ) {
						coordenada.setZ3(coordenada.initialZ);
					} else {
						coordenada.setZ3(val3);
					}
					break;
				}
				coordenada.setTotal(coordenada.getX3() + coordenada.getY3() + coordenada.getZ3());
			}

		case KJDSS_Saturation_Event.Event_Types.SAT_6000:
			for (Anyell<String, Coordenada> anyell : coordenades) {
				Coordenada coordenada = anyell.obtenirValor();
				switch (coordenada.getParitat()) {
				case XX:
					float val = (coordenada.getX() + (float) 0.001);
//					coordenada.setX2(val);
					if (val <= coordenada.minX) {
						coordenada.setX(coordenada.initialX);
					} else if (val > coordenada.maxX) {
						coordenada.setX(coordenada.initialX);
					} else {
						coordenada.setX(val);
					}
					break;
				case XY:
					float val2 = (coordenada.getY() + (float) 0.001);
//					coordenada.setY2(val2);
					if (val2 <= coordenada.minY) {
						coordenada.setY(coordenada.initialY);
					} else if (val2 > coordenada.maxY) {
						coordenada.setY(coordenada.initialY);
					} else {
						coordenada.setY(val2);
					}
					break;
				default:
					
					float val3 = (coordenada.getZ() + (float) 0.001);
//					coordenada.setZ2(val3);
					if (val3 <= coordenada.minZ) {
						coordenada.setZ(coordenada.initialZ);
					} else if (val3 > coordenada.maxZ) {
						coordenada.setZ(coordenada.initialZ);
					} else {
						coordenada.setZ(val3);
					}
					break;
				}
			}
			break;

		case KJDSS_Saturation_Event.Event_Types.NO_SAT:
			for (Anyell<String, Coordenada> anyell : coordenades) {
				Coordenada coordenada = anyell.obtenirValor();
				switch (coordenada.getParitat()) {
				case XX:
					float val = (coordenada.getX2() - (float) 1);
//					coordenada.setX2(val);
					if (val <= coordenada.minX) {
						coordenada.setX2(coordenada.initialX);
					} else if (val > coordenada.maxX) {
						coordenada.setX2(coordenada.initialX);
					} else {
						coordenada.setX2(val);
					}
					break;
				case XY:
					float val2 = (coordenada.getY2() - (float) 1);
//					coordenada.setY2(val2);
					if (val2 <= coordenada.minY) {
						coordenada.setY2(coordenada.initialY);
					} else if (val2 > coordenada.maxY) {
						coordenada.setY2(coordenada.initialY);
					} else {
						coordenada.setY2(val2);
					}
					break;
				default:
					
					float val3 = (coordenada.getZ2() - (float) 1);
//					coordenada.setZ2(val3);
					if (val3 <= coordenada.minZ) {
						coordenada.setZ2(coordenada.initialZ);
					} else if (val3 > coordenada.maxZ) {
						coordenada.setZ2(coordenada.initialZ);
					} else {
						coordenada.setZ2(val3);
					}
					break;
				}
			}
			break;
		case KJDSS_Saturation_Event.Event_Types.NO_SAT_100:

			for (Anyell<String, Coordenada> anyell : coordenades) {
				Coordenada coordenada = anyell.obtenirValor();
				switch (coordenada.getParitat()) {
				case XX:
					float val = (coordenada.getX3() - (float) 0.01);
					if (val <= coordenada.minX) {
						coordenada.setX3(coordenada.initialX);
					} else if (val > coordenada.maxX) {
						coordenada.setX3(coordenada.initialX);
					} else {
						coordenada.setX3(val);
					}
					break;
				case XY:
					float val2 = (coordenada.getY3() - (float) 0.01);
					if (val2 <= coordenada.minY) {
						coordenada.setY3(coordenada.initialY);
					} else if (val2 > coordenada.maxY){
						coordenada.setY3(coordenada.initialY);
					} else {
						coordenada.setY3(val2);
					}
					break;
				default:
					float val3 = (coordenada.getZ3() - (float) 0.01);
					if (val3 <= coordenada.minZ) {
						coordenada.setZ3(coordenada.initialZ);
					} else if (val3 > coordenada.maxZ) {
						coordenada.setZ3(coordenada.initialZ);
					} else {
						coordenada.setZ3(val3);
					}
					break;
				}
				coordenada.setTotal(coordenada.getX3() + coordenada.getY3() + coordenada.getZ3());
			}

		case KJDSS_Saturation_Event.Event_Types.NO_SAT_6000:
			for (Anyell<String, Coordenada> anyell : coordenades) {
				Coordenada coordenada = anyell.obtenirValor();
				switch (coordenada.getParitat()) {
				case XX:
					float val = (coordenada.getX() - (float) 0.001);
//					coordenada.setX2(val);
					if (val <= coordenada.minX) {
						coordenada.setX(coordenada.initialX);
					} else if (val > coordenada.maxX) {
						coordenada.setX(coordenada.initialX);
					} else {
						coordenada.setX(val);
					}
					break;
				case XY:
					float val2 = (coordenada.getY() - (float) 0.001);
//					coordenada.setY2(val2);
					if (val2 <= coordenada.minY) {
						coordenada.setY(coordenada.initialY);
					} else if (val2 > coordenada.maxY) {
						coordenada.setY(coordenada.initialY);
					} else {
						coordenada.setY(val2);
					}
					break;
				default:
					
					float val3 = (coordenada.getZ() - (float) 0.001);
//					coordenada.setZ2(val3);
					if (val3 <= coordenada.minZ) {
						coordenada.setZ(coordenada.initialZ);
					} else if (val3 > coordenada.maxZ) {
						coordenada.setZ(coordenada.initialZ);
					} else {
						coordenada.setZ(val3);
					}
					break;
				}
			}
			break;
		}
	}
}