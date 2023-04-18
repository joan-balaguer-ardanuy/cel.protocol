package cel.coordenada;

import cel.Anyell;
import cel.Coordenada;
import cel.Document;
import cel.Esperit;
import cel.Paritat;
import cel.gènesi.Hipercub;

public class CoordenadaString extends Document<Coordenada, String> {

	private static final long serialVersionUID = -2841331171181639653L;

	public CoordenadaString() {
		super();
	}

	public CoordenadaString(CoordenadaString pare, Coordenada clau, String valor) {
		super(StringCoordenada.class, pare, clau, valor);
	}

	public CoordenadaString(CoordenadaString déu, Paritat paritat, Coordenada clau, String valor) {
		super(StringCoordenada.class, déu, paritat, clau, valor);
	}

	public CoordenadaString(Class<StringCoordenada> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}

	public CoordenadaString(CoordenadaString déu, Paritat paritat) {
		super(déu, paritat);
	}

	public CoordenadaString(CoordenadaString pare) {
		super(pare);
	}

	public CoordenadaString(Paritat paritat) {
		super(paritat);
	}

	@Override
	public int compareTo(Anyell<String, Coordenada> o) {
		return 0;
	}

	@Override
	public String obtenirNom() {
		return obtenirValor();
	}

}