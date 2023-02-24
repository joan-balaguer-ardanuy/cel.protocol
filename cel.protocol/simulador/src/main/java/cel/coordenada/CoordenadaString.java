package cel.coordenada;

import cel.Anyell;
import cel.Coordenada;
import cel.Document;
import cel.Paritat;

public class CoordenadaString extends Document<Coordenada, String> {

	public CoordenadaString() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoordenadaString(CoordenadaString pare, Coordenada clau, String valor) {
		super(StringCoordenada.class, pare, clau, valor);
	}

	public CoordenadaString(CoordenadaString déu, Paritat paritat, Coordenada clau, String valor) {
		super(StringCoordenada.class, déu, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaString(Paritat paritat, Coordenada clau, String valor) {
		super(StringCoordenada.class, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaString(CoordenadaString déu, Paritat paritat) {
		super(déu, paritat);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaString(CoordenadaString pare) {
		super(pare);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaString(Paritat paritat) {
		super(paritat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Anyell<String, Coordenada> o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obtenirNom() {
		// TODO Auto-generated method stub
		return null;
	}

}
