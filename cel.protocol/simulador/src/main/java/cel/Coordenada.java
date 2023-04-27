package cel;

import cel.gènesi.Cromosoma;
import cel.gènesi.Diploide;
import cel.gènesi.Genomapa;
import cel.gènesi.Haploide;
import cel.gènesi.Hipercadena;
import cel.gènesi.Hipercub;

public class Coordenada {
	static char[] lletres = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',  'O', 'P', 'Q', 'R','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Ç' };
	float constant;
	
	Paritat paritat = Paritat.YY;
	float x = 0;
	float y = 0;
	float z = 0;
	float x2 = 0;
	float y2 = 0;
	float z2 = 0;
	float x3 = 0;
	float y3 = 0;
	float z3 = 0;
	float total = 0;

	static final float PI = (float) Math.PI;
	float angleX;
	float angleY;
	float angleZ;

	float minX, minY, minZ;
	float initialX, initialY, initialZ;
	float maxX, maxY, maxZ;
	
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
	
	public float getX2() {
		return x2;
	}
	public void setX2(float x2) {
		this.x2 = x2;
	}
	public float getY2() {
		return y2;
	}
	public void setY2(float y2) {
		this.y2 = y2;
	}
	public float getZ2() {
		return z2;
	}
	public void setZ2(float z2) {
		this.z2 = z2;
	}
	
	public float getX3() {
		return x3;
	}
	public void setX3(float x3) {
		this.x3 = x3;
	}
	public float getY3() {
		return y3;
	}
	public void setY3(float y3) {
		this.y3 = y3;
	}
	public float getZ3() {
		return z3;
	}
	public void setZ3(float z3) {
		this.z3 = z3;
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
	
	public Coordenada(Hipercub hipercub, int dilatació) {
		esperit = hipercub;
		paritat = hipercub.obtenirParitat();
		for(Anyell<Character,Integer> anyell : hipercub) {
			switch (obtenirDimensió(anyell.obtenirClau())) {
			case XX:
				x += anyell.obtenirValor() / dilatació;
				break;
			case XY:
				y += anyell.obtenirValor() / dilatació;
				break;
			default:
				z += anyell.obtenirValor() / dilatació;
				break;
			}
		}
		total = x + y + z;
		minX = x/1.1f;
		minY = y/1.1f;
		minZ = z/1.1f;
		maxX = x*1.1f;
		maxY = y*1.1f;
		maxZ = z*1.1f;
		initialX = x;
		initialY = y;
		initialZ = z;
		x2 = x;
		y2 = y;
		z2 = z;
		x3 = x;
		y3 = y;
		z3 = z;
		angleX = 0;
		angleY = 0;
		angleZ = 0;
//		angleY = PI / (y % 200);
	}
	public Coordenada(Hipercadena hipercadena, int dilatació) {
		esperit = hipercadena;
		paritat = hipercadena.obtenirParitat();
		for(Anyell<Integer,Character> anyell : hipercadena) {
			switch (obtenirDimensió(anyell.obtenirValor())) {
			case XX:
				x += anyell.obtenirClau() / dilatació;
				break;
			case XY:
				y += anyell.obtenirClau() / dilatació;
				break;
			default:
				z += anyell.obtenirClau() / dilatació;
				break;
			}
		}
		total = x + y + z;
		minX = x/1.1f;
		minY = y/1.1f;
		minZ = z/1.1f;
		maxX = x*1.1f;
		maxY = y*1.1f;
		maxZ = z*1.1f;
		initialX = x;
		initialY = y;
		initialZ = z;
		x2 = x;
		y2 = y;
		z2 = z;
		x3 = x;
		y3 = y;
		z3 = z;
		angleX = 0;
		angleY = 0;
		angleZ = 0;
	}
	public Coordenada(Diploide diploide, int dilatació) {
		esperit = diploide;
		paritat = diploide.obtenirParitat();
		
		for(Anyell<Haploide,Genomapa> mare : diploide) {
			for(Anyell<Integer,Character> hipercadena : mare.obtenirClau().obtenirClau()) {
				switch (obtenirDimensió(hipercadena.obtenirValor())) {
				case XX:
					x += hipercadena.obtenirClau() / dilatació;
					break;
				case XY:
					y += hipercadena.obtenirClau() / dilatació;
					break;
				default:
					z += hipercadena.obtenirClau() / dilatació;
					break;
				}	
			}
		}
		total = x + y + z;
		minX = x/1.1f;
		minY = y/1.1f;
		minZ = z/1.1f;
		maxX = x*1.1f;
		maxY = y*1.1f;
		maxZ = z*1.1f;
		initialX = x;
		initialY = y;
		initialZ = z;
		x2 = x;
		y2 = y;
		z2 = z;
		x3 = x;
		y3 = y;
		z3 = z;
		angleX = 0;
		angleY = 0;
		angleZ = 0;
	}
	public Coordenada(Cromosoma cromosoma, int dilatació) {
		esperit = cromosoma;
		paritat = cromosoma.obtenirParitat();
		
		for(Anyell<Genomapa,Haploide> mare : cromosoma) {
			for(Anyell<Character,Integer> hipercadena : mare.obtenirClau().obtenirClau()) {
				switch (obtenirDimensió(hipercadena.obtenirClau())) {
				case XX:
					x += hipercadena.obtenirValor() / dilatació;
					break;
				case XY:
					y += hipercadena.obtenirValor() / dilatació;
					break;
				default:
					z += hipercadena.obtenirValor() / dilatació;
					break;
				}	
			}
		}
		total = x + y + z;
		minX = x/1.1f;
		minY = y/1.1f;
		minZ = z/1.1f;
		maxX = x*1.1f;
		maxY = y*1.1f;
		maxZ = z*1.1f;
		initialX = x;
		initialY = y;
		initialZ = z;
		x2 = x;
		y2 = y;
		z2 = z;
		x3 = x;
		y3 = y;
		z3 = z;
		angleX = 0;
		angleY = 0;
		angleZ = 0;
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
		minX = x/1.5f;
		minY = y/1.5f;
		minZ = z/1.5f;
		maxX = x*1.5f;
		maxY = y*1.5f;
		maxZ = z*1.5f;
		initialX = x;
		initialY = y;
		initialZ = z;
		x2 = x;
		y2 = y;
		z2 = z;
		angleX = PI / (x % 200);
		angleY = PI / (y % 200);
		angleZ = PI / (z % 200);
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