package cel.arca;

import cel.temps.Regne;

/**
 * @author joan
 *
 * @param <E>
 */
public interface Animal<E> extends Regne<Animal<E>> {
	E obtenirElement();
	E establirElement(E element);
	
	default void pasturar(Animal<E> a) {
		a.establirPare(obtenirPare());
		a.establirPassat(this);
		obtenirPare().establirPassat(a);
		establirPare(a);
	}
	default void conduir(Animal<E> a) {
		a.establirPare(this);
		a.establirPassat(obtenirPassat());
		obtenirPassat().establirPare(a);
		establirPassat(a);
	}
	default void alliberar() {
		obtenirPare().establirPassat(obtenirPassat());
		obtenirPassat().establirPare(obtenirPare());
		establirPare(this);
		establirPassat(this);
	}
	default boolean ésBuit() {
		return obtenirPare() == this ? obtenirElement() == null : false;
	}
	default boolean conté(E e) {
		Ramat<E> ramat = ramat();
		if (e == null) {
			while (ramat.téMés())
				if (ramat.següent() == null)
					return true;
		} else {
			while (ramat.téMés())
				if (e.equals(ramat.següent()))
					return true;
		}
		return false;
	}
	
	Ramat<E> ramat();
	
	boolean establir(E e);
	
	default boolean alliberar(E e) {
		Ramat<E> ramat = ramat();
		if (e == null) {
			while (ramat.téMés()) {
				if (ramat.següent() == null) {
					ramat.alliberar();
					return true;
				}
			}
		} else {
			while (ramat.téMés()) {
				if (e.equals(ramat.següent())) {
					ramat.alliberar();
					return true;
				}
			}
		}
		return false;
	}
	default boolean contéTot(Animal<E> a) {
		Ramat<E> ramat = ramat();
		for (E e = ramat.següent(); ramat.téMés() ; e = ramat.següent())
			if (!conté(e))
				return false;
		return true;
	}
	default boolean establirTot(Animal<E> n) {
		boolean modificat = false;
		Ramat<E> ramat = ramat();
		for (E e = ramat.següent(); ramat.téMés() ; e = ramat.següent())
			if (establir(e))
				modificat = true;
		return modificat;
	}
	default boolean alliberarTot(Animal<E> a) {
		boolean modificat = false;
		Ramat<E> ramat = ramat();
		while (ramat.téMés()) {
			if (a.conté(ramat.següent())) {
				ramat.alliberar();
				modificat = true;
			}
		}
		return modificat;
	}
	default boolean descartarTot(Animal<E> a) {
		boolean modificat = false;
		Ramat<E> ramat = ramat();
		while (ramat.téMés()) {
			if (!a.conté(ramat.següent())) {
				ramat.alliberar();
				modificat = true;
			}
		}
		return modificat;
	}
}