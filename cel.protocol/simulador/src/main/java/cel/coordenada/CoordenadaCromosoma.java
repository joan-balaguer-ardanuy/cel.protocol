package cel.coordenada;

import cel.Anyell;
import cel.Coordenada;
import cel.Document;
import cel.Paritat;
import cel.gènesi.Cromosoma;

public class CoordenadaCromosoma extends Document<Coordenada, Cromosoma> {

	@Override
	public int compareTo(Anyell<Cromosoma, Coordenada> o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obtenirNom() {
		// TODO Auto-generated method stub
		return null;
	}

	public CoordenadaCromosoma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoordenadaCromosoma(CoordenadaCromosoma pare, Coordenada clau, Cromosoma valor) {
		super(CromosomaCoordenada.class, pare, clau, valor);
	}
	public CoordenadaCromosoma(CoordenadaCromosoma déu, Paritat paritat, Coordenada clau, Cromosoma valor) {
		super(CromosomaCoordenada.class, déu, paritat, clau, valor);
	}
	public CoordenadaCromosoma(Paritat paritat, Coordenada clau, Cromosoma valor) {
		super(CromosomaCoordenada.class, paritat, clau, valor);
	}
	public CoordenadaCromosoma(CoordenadaCromosoma déu, Paritat paritat) {
		super(déu, paritat);
	}
	public CoordenadaCromosoma(CoordenadaCromosoma pare) {
		super(pare);
	}
	public CoordenadaCromosoma(Paritat paritat) {
		super(paritat);
	}
}
