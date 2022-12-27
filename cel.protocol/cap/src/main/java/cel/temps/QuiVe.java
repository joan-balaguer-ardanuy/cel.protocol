package cel.temps;

import cel.Servent;

public interface QuiVe<V> extends Servent {
	Class<? extends V> getClasseFill();
	void setClasseFill(Class<? extends V> classe);
	V getFill();
	V setFill(V fill);
}