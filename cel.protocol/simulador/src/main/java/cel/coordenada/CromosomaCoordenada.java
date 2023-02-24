package cel.coordenada;

import cel.Anyell;
import cel.Coordenada;
import cel.Document;
import cel.Paritat;
import cel.gènesi.Cromosoma;

public class CromosomaCoordenada extends Document<Cromosoma, Coordenada> {

	private static final long serialVersionUID = 2925123069612502657L;
	
	public CromosomaCoordenada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CromosomaCoordenada(Paritat paritat) {
		super(paritat);
		// TODO Auto-generated constructor stub
	}
	public CromosomaCoordenada(Paritat paritat, Cromosoma clau, Coordenada valor) {
		super(CoordenadaCromosoma.class, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}
	public CromosomaCoordenada(CromosomaCoordenada pare, Cromosoma clau, Coordenada valor) {
		super(CoordenadaCromosoma.class, pare, clau, valor);
		// TODO Auto-generated constructor stub
	}
	public CromosomaCoordenada(CromosomaCoordenada déu, Paritat paritat, Cromosoma clau, Coordenada valor) {
		super(CoordenadaCromosoma.class, déu, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}
	public CromosomaCoordenada(CromosomaCoordenada déu, Paritat paritat) {
		super(déu, paritat);
		// TODO Auto-generated constructor stub
	}
	public CromosomaCoordenada(CromosomaCoordenada pare) {
		super(pare);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Anyell<Coordenada, Cromosoma> o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String obtenirNom() {
		// TODO Auto-generated method stub
		return null;
	}

}
