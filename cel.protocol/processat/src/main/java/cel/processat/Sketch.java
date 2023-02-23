package cel.processat;

import cel.Esperit;
import cel.Ordre;
import processing.core.*;

public class Sketch extends PApplet implements Esperit {

	float angle = PI / 200;

	public void setup() {
		size(1920, 1080, P3D);
		background(0);
		colorMode(HSB, 360, 100, 100);
		noStroke();
		ellipseMode(RADIUS);
		frameRate(25);
	}

	public void draw() {
		background(0);
		camera(mouseX, mouseY, (height / 2) / tan(PI / 3), width / 2, height / 2, 0, 0, 1, 0);
		lights();
		spotLight(255, 0, 0, width / 2, height / 2, 400, 0, 0, -1, PI / 4, 2);
		noStroke();

		rotateY(angle);
//		rotateX(angle);
//		rotateZ(angle);
		angle = angle + PI / 50;

		translate(width / 2, height / 2, -100);
		fill(255, 100, 100);
		sphere(50);

		translate(width / 4, height / 4, -100);
		fill(128, 255, 100);
		sphere(112);
	}

	public void settings() {
		size(1920, 1080, "processing.opengl.PGraphics3D");
	}

	@Override
	public String obtenirNom() {
		return null;
	}

	@Override
	public void establirNom(String nom) {
		
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
		
	}
}