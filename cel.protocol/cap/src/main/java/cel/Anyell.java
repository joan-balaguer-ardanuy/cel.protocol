package cel;

import cel.temps.Gloriós;

public interface Anyell<K,V> extends Gloriós<Anyell<K,V>, Anyell<V,K>> {

	K getClau();
	K setClau(K clau);
	
	V getValor();
	V setValor(V valor);
}
