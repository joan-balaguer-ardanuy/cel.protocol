package cel.temps;

import cel.temps.Gloriós;

public abstract class Temps
	<K extends Gloriós<K,V>,V extends Gloriós<V,K>>
		extends Heretat<K,V>
			implements Gloriós<K,V> {

	private static final long serialVersionUID = 5651963240853233224L;

	public Temps() {
		// TODO Auto-generated constructor stub
	}

}
