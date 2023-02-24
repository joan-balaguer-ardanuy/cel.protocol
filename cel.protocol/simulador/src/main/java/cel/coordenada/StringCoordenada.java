package cel.coordenada;

import cel.Anyell;
import cel.Coordenada;
import cel.Document;
import cel.Paritat;

public class StringCoordenada extends Document<String, Coordenada> {

	public StringCoordenada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StringCoordenada(StringCoordenada déu, Paritat paritat, String clau, Coordenada valor) {
		super(CoordenadaString.class, déu, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public StringCoordenada(StringCoordenada pare, String clau, Coordenada valor) {
		super(CoordenadaString.class, pare, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public StringCoordenada(Paritat paritat, String clau, Coordenada valor) {
		super(CoordenadaString.class, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public StringCoordenada(StringCoordenada déu, Paritat paritat) {
		super(déu, paritat);
		// TODO Auto-generated constructor stub
	}

	public StringCoordenada(StringCoordenada pare) {
		super(pare);
		// TODO Auto-generated constructor stub
	}

	public StringCoordenada(Paritat paritat) {
		super(paritat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Anyell<Coordenada, String> o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obtenirNom() {
		// TODO Auto-generated method stub
		return null;
	}

}
