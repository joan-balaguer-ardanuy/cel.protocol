package cel.coordenada;

import cel.Anyell;
import cel.Coordenada;
import cel.Document;
import cel.Paritat;
import cel.gènesi.Hipercub;

public class CoordenadaHipercub extends Document<Coordenada, Hipercub> {

	private static final long serialVersionUID = -417884203303748764L;

	public CoordenadaHipercub() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoordenadaHipercub(CoordenadaHipercub pare, Coordenada clau, Hipercub valor) {
		super(HipercubCoordenada.class, pare, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaHipercub(CoordenadaHipercub déu, Paritat paritat, Coordenada clau, Hipercub valor) {
		super(HipercubCoordenada.class, déu, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaHipercub(Paritat paritat, Coordenada clau, Hipercub valor) {
		super(HipercubCoordenada.class, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaHipercub(CoordenadaHipercub déu, Paritat paritat) {
		super(déu, paritat);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaHipercub(CoordenadaHipercub pare) {
		super(pare);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaHipercub(Paritat paritat) {
		super(paritat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Anyell<Hipercub, Coordenada> o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obtenirNom() {
		// TODO Auto-generated method stub
		return null;
	}

}