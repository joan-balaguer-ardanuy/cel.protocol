package cel.temps;

import cel.Servent;

public interface QuiEra<K> extends Servent {
	Class<? extends K> getClassePare();
	void setClassePare(Class<? extends K> classe);
	K getPare();
	K setPare(K pare);
}
