package cel.coordenada;

import cel.Anyell;
import cel.Coordenada;
import cel.Document;
import cel.Paritat;
import cel.gènesi.Genomapa;

public class GenomapaCoordenada extends Document<Genomapa, Coordenada> {

	private static final long serialVersionUID = -7763178537113654524L;

	public GenomapaCoordenada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenomapaCoordenada(GenomapaCoordenada pare, Genomapa clau, Coordenada valor) {
		super(CoordenadaGenomapa.class, pare, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public GenomapaCoordenada(GenomapaCoordenada déu, Paritat paritat, Genomapa clau, Coordenada valor) {
		super(CoordenadaGenomapa.class, déu, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public GenomapaCoordenada(Paritat paritat, Genomapa clau, Coordenada valor) {
		super(CoordenadaGenomapa.class, paritat, clau, valor);
		// TODO Auto-generated constructor stub
	}

	public GenomapaCoordenada(GenomapaCoordenada déu, Paritat paritat) {
		super(déu, paritat);
		// TODO Auto-generated constructor stub
	}

	public GenomapaCoordenada(GenomapaCoordenada pare) {
		super(pare);
		// TODO Auto-generated constructor stub
	}

	public GenomapaCoordenada(Paritat paritat) {
		super(paritat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Anyell<Coordenada, Genomapa> o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obtenirNom() {
		// TODO Auto-generated method stub
		return null;
	}

}
