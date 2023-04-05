package cel;

import cel.gènesi.Genomapa;
import cel.gènesi.Hipercadena;
import cel.gènesi.Hipercub;

public class Coordenada {
	static char[] lletres = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',  'O', 'P', 'Q', 'R','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Ç' };
	float constant;
	
	Paritat paritat = Paritat.YY;
	float x = 0;
	float y = 0;
	float z = 0;
	float total = 0;

	static final float PI = (float) Math.PI;
	float angleX;
	float angleY;
	float angleZ;
	
	Esperit esperit;
	
	String nom;
	
	public Esperit getEsperit() {
		return esperit;
	}
	public void setEsperit(Esperit esperit) {
		this.esperit = esperit;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getX() {
		return x;
	}
	public void setX(float r) {
		this.x = r;
	}
	public float getY() {
		return y;
	}
	public void setY(float g) {
		this.y = g;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float b) {
		this.z = b;
	}
	public float getAngleX() {
		return angleX;
	}
	public void setAngleX(float angleX) {
		this.angleX = angleX;
	}
	public float getAngleY() {
		return angleY;
	}
	public void setAngleY(float angleY) {
		this.angleY = angleY;
	}
	public float getAngleZ() {
		return angleZ;
	}
	public void setAngleZ(float angleZ) {
		this.angleZ = angleZ;
	}
	public Paritat getParitat() {
		return paritat;
	}
	public void setParitat(Paritat paritat) {
		this.paritat = paritat;
	}
	
	public Coordenada(Hipercub hipercub) {
		esperit = hipercub;
		for(Anyell<Character,Integer> anyell : hipercub) {
			switch (obtenirDimensió(anyell.obtenirClau())) {
			case XX:
				x += obtenirValor(anyell.obtenirClau());
				break;
			case XY:
				y += obtenirValor(anyell.obtenirClau());
				break;
			default:
				z += obtenirValor(anyell.obtenirClau());
				break;
			}
		}
		total = x + y + z;
		angleY = PI / (y % 200);
//		switch (hipercub.obtenirParitat()) {
//		case XX:
//			angleX = PI / (x % 200);
//			break;
//		case XY:
//			angleY = PI / (y % 200);
//			break;
//		default:
//			angleZ = PI / (z % 200);
//			break;
//		}
	}
	public Coordenada(Hipercadena hipercadena) {
		esperit = hipercadena;
		for(Anyell<Integer,Character> anyell : hipercadena) {
			switch (obtenirDimensió(anyell.obtenirValor())) {
			case XX:
				x += obtenirValor(anyell.obtenirValor());
				break;
			case XY:
				y += obtenirValor(anyell.obtenirValor());
				break;
			default:
				z += obtenirValor(anyell.obtenirValor());
				break;
			}
		}
		total = x + y + z;
		angleX = PI / (x % 200);
//		switch (hipercadena.obtenirParitat()) {
//		case XX:
//			angleX = PI / (x % 200);
//			break;
//		case XY:
//			angleY = PI / (y % 200);
//			break;
//		default:
//			angleZ = PI / (z % 200);
//			break;
//		}
	}
	public Coordenada(Esperit esperit) {
		this.esperit = esperit;
		this.paritat = esperit.obtenirParitat();
		this.nom = esperit.obtenirNom();
		
		int índex = 0;
		for(índex = 0; índex < nom.length(); índex++) {
			char key = nom.charAt(índex);
			switch (obtenirDimensió(key)) {
			case XX:
				x += obtenirValor(key);
				break;
			case XY:
				y += obtenirValor(key);
				break;
			case YY:
				z += obtenirValor(key);
				break;
			default:
				break;
			}
		}
		
		total = x + y + z;
		
		switch (paritat) {
		case XX:
			angleX = PI / (x % 200);
			break;
		case XY:
			angleY = PI / (y % 200);
			break;
		default:
			angleZ = PI / (z % 200);
			break;
		}
	}
	public static int obtenirValor(char lletra) {
		
		switch (lletra) {
		case 'A':
			return 65;
		case 'B':
			return 66;
		case 'C':
			return 67;
		case 'D':
			return 68;
		case 'E':
			return 69;
		case 'F':
			return 70;
		case 'G':
			return 71;
		case 'H':
			return 72;
		case 'I':
			return 73;
		case 'J':
			return 74;
		case 'K':
			return 75;
		case 'L':
			return 76;
		case 'M':
			return 77;
		case 'N':
			return 78;
		case 'O':
			return 79;
		case 'P':
			return 80;
		case 'Q':
			return 81;
		case 'R':
			return 82;
		case 'S':
			return 83;
		case 'T':
			return 84;
		case 'U':
			return 85;
		case 'V':
			return 86;
		case 'W':
			return 87;
		case 'X':
			return 88;
		case 'Y':
			return 89;
		case 'Z':
			return 90;
		case 'Ç':
			return 91;
		default:
			return 0;
		}
	}
	public static Paritat obtenirDimensió(char lletra) {
		switch (lletra) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
			return Paritat.XX;
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
			return Paritat.YY;
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'Ç':
		default:
			return Paritat.XY;
		}
	}
}