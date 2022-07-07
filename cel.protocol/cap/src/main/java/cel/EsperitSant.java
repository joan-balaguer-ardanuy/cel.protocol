package cel;

import cel.temps.QuiEra;
import cel.temps.QuiVe;

public interface EsperitSant<K,V> extends QuiEra<K>, QuiVe<V> {
	K getPare();
	K setPare(K pare);
	V getFill();
	V setFill(V fill);
}
