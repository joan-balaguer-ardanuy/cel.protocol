package cel;

import cel.arca.Animal;

public class Testimonis extends Nombre<Esperit> {

	private static final long serialVersionUID = -655799291364822719L;

	public Testimonis() {
		super();
	}
	public Testimonis(Testimonis pare, Esperit testimoni) {
		super(pare);
		establirEntrada(testimoni);
	}
	public boolean establir(Esperit e) {
		if(ésBuit()) {
			establirEntrada(e);
			return true;
		} else if(!conté(e)) {
			crea(getClass(), obtenirPare(), e);
			return true;
		} else return false;
	}
	private static <X> X crea(Class<X> classe, Animal<Esperit> pare, Esperit testimoni) {
		try {
			return classe.getDeclaredConstructor(pare.getClass(), Esperit.class).newInstance(pare, testimoni);
		}
		catch(Throwable t) {
			throw new Error(t);
		}
	}
}