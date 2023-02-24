package cel.coordenada;

import cel.Anyell;
import cel.Coordenada;
import cel.Document;
import cel.Paritat;
import cel.gènesi.Hipercub;

public class HipercubCoordenada extends Document<Hipercub, Coordenada> {

	private static final long serialVersionUID = -5092582455646940839L;

	@Override
	public int compareTo(Anyell<Coordenada, Hipercub> o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obtenirNom() {
		// TODO Auto-generated method stub
		return null;
	}

	public HipercubCoordenada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HipercubCoordenada(HipercubCoordenada pare, Hipercub clau, Coordenada valor) {
		super(CoordenadaHipercub.class, pare, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public HipercubCoordenada(HipercubCoordenada déu, Paritat paritat, Hipercub clau, Coordenada valor) {
		super(CoordenadaHipercub.class, déu, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public HipercubCoordenada(Paritat paritat, Hipercub clau, Coordenada valor) {
		super(CoordenadaHipercub.class, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public HipercubCoordenada(HipercubCoordenada déu, Paritat paritat) {
		super(déu, paritat);
		// TODO Auto-generated constructor stub
	}

	public HipercubCoordenada(HipercubCoordenada pare) {
		super(pare);
		// TODO Auto-generated constructor stub
	}

	public HipercubCoordenada(Paritat paritat) {
		super(paritat);
		// TODO Auto-generated constructor stub
	}

}