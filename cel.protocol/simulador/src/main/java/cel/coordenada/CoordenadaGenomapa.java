package cel.coordenada;

import cel.Anyell;
import cel.Coordenada;
import cel.gènesi.Genomapa;
import cel.Document;
import cel.Paritat;

public class CoordenadaGenomapa extends Document<Coordenada,Genomapa> {

	private static final long serialVersionUID = 982915516292732447L;

	public CoordenadaGenomapa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoordenadaGenomapa(CoordenadaGenomapa pare, Coordenada clau, Genomapa valor) {
		super(GenomapaCoordenada.class, pare, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaGenomapa(CoordenadaGenomapa déu, Paritat paritat, Coordenada clau, Genomapa valor) {
		super(GenomapaCoordenada.class, déu, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaGenomapa(Paritat paritat, Coordenada clau, Genomapa valor) {
		super(GenomapaCoordenada.class, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaGenomapa(CoordenadaGenomapa déu, Paritat paritat) {
		super(déu, paritat);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaGenomapa(CoordenadaGenomapa pare) {
		super(pare);
		// TODO Auto-generated constructor stub
	}

	public CoordenadaGenomapa(Paritat paritat) {
		super(paritat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Anyell<Genomapa, Coordenada> o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obtenirNom() {
		// TODO Auto-generated method stub
		return null;
	}
	
}