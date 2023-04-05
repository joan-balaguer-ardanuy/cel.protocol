package cel.coordenada;

import cel.Anyell;
import cel.Coordenada;
import cel.Document;
import cel.Esperit;
import cel.Paritat;
import cel.arca.Animal;
import cel.gènesi.Hipercub;

public class StringCoordenada extends Document<String, Coordenada> {

	private static final long serialVersionUID = -4018071576453175595L;

	public StringCoordenada() {
		super();
	}

	public StringCoordenada(StringCoordenada déu, Paritat paritat, String clau, Coordenada valor) {
		super(CoordenadaString.class, déu, paritat, clau, valor);
	}

	public StringCoordenada(StringCoordenada pare, String clau, Coordenada valor) {
		super(CoordenadaString.class, pare, clau, valor);
	}

	public StringCoordenada(Paritat paritat, String clau, Coordenada valor) {
		super(CoordenadaString.class, paritat, clau, valor);
	}

	public StringCoordenada(StringCoordenada déu, Paritat paritat) {
		super(déu, paritat);
	}

	public StringCoordenada(StringCoordenada pare) {
		super(pare);
	}

	public StringCoordenada(Paritat paritat) {
		super(paritat);
	}

	@Override
	public int compareTo(Anyell<Coordenada, String> o) {
		return 0;
	}

	@Override
	public String obtenirNom() {
		return obtenirClau();
	}
}
