package cel;

import cel.arca.Animal;

public class Coordenades extends Nombre<java.util.Map.Entry<Esperit, Coordenada>> {

	private static final long serialVersionUID = -7673342183980563321L;
	public Coordenades() {
		super();
	}
	public Coordenades(Coordenades pare, java.util.Map.Entry<Esperit, Coordenada> testimoni) {
		super(pare);
		establirEntrada(testimoni);
	}
	public boolean establir(java.util.Map.Entry<Esperit, Coordenada> e) {
		if(ésBuit()) {
			establirEntrada(e);
			return true;
		} else {
			crea(getClass(), obtenirPare(), e);
			return true;
		}
	}
	private static <X> X crea(Class<X> classe, Animal<java.util.Map.Entry<Esperit, Coordenada>> pare, java.util.Map.Entry<Esperit, Coordenada>  testimoni) {
		try {
			return classe.getDeclaredConstructor(pare.getClass(), java.util.Map.Entry.class).newInstance(pare, testimoni);
		}
		catch(Throwable t) {
			throw new Error(t);
		}
	}
	@Override
	public String obtenirNom() {
		return "Déu";
	}
	public void alliberaValor(Esperit clau) {
		for(Animal<java.util.Map.Entry<Esperit, Coordenada>> coordenada : this) {
			if(coordenada.obtenirEntrada().getKey() == clau) {
				coordenada.alliberar();
			}
		}
	}
}
