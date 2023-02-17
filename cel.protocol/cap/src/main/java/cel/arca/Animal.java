package cel.arca;

import java.util.Iterator;

import cel.temps.Regne;

/**
 * <tt>
 * <center>
 * <h3>Les causes del diluvi</h3>
 * <sup>1</sup> Quan els homes començaren a multiplicar-se a la terra i els van néixer filles,
 * <sup>2</sup> alguns dels fills de Déu, en veure que les filles dels homes eren belles, prengueren per mullers totes les que van voler.<br/>
 * <sup>3</sup> El Senyor va dir: «El meu alè de vida no es mantindrà per sempre en els homes, perquè són de carn mortal. No viuran més de cent vint anys.»<br/>
 * <sup>4</sup> En aquell temps, i més tard encara, hi havia gegants a la terra, perquè de la unió d'alguns dels fills de Déu amb les filles dels homes en van néixer herois, homes de renom des dels temps antics.<br/>
 * <sup>5</sup> Quan el Senyor va veure com creixia la malícia dels homes i que d'un cap a l'altre del dia només pensaven a fer mal,
 * <sup>6</sup> s'entristí i es penedí d'haver-los creat.
 * <sup>7</sup> I va dir: «Faré desaparèixer de la terra l'home que vaig crear. No hi deixaré ni homes, ni animals, ni bestioles, ni ocells. Em penedeixo d'haver-los fet.»<br/>
 * <sup>8</sup> Però el Senyor va mirar Noè amb benvolença.<br/>
 * </center>
 * </tt>
 * @author joan
 *
 * @param <E>
 */
public interface Animal<E> extends Regne<Animal<E>> {
	
	/**
	 * Obté l'element contigut dins aquesta instància d'{@link Animal}.
	 * @return l'element contigut dins aquesta instància.
	 */
	E obtenirEntrada();

	/**
	 * Estableix l'element contigut dins aquesta instància d'{@link Animal}.
	 * @param entrada l'entrada per ser establert dins aquesta instància
	 * @return l'antiga entrada contigut dins aquesta instància.
	 */
	E establirEntrada(E entrada);
	
	/**
	 * Pastura l'{@link Animal} d'aquest {@link Regne} a les fonts d'aigua viva.
	 * @param a l'{@link Animal} a ser pasturat a les fonts d'aigua viva
	 */
	default void pasturar(Animal<E> a) {
		a.establirPare(obtenirPare());
		a.establirPassat(this);
		obtenirPare().establirPassat(a);
		establirPare(a);
	}
	/**
	 * Condueix l'{@link Animal} d'aquest {@link Regne} a les fonts d'aigua viva.
	 * @param a l'{@link Animal} a ser conduït a les fonts d'aigua viva
	 */
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
		return obtenirPare() == this ? obtenirEntrada() == null : false;
	}
	@Override
	default boolean téPare(Animal<E> pare) {
		for(Animal<E> animal : this)  {
			if(animal == pare) {
				return true;
			}
		}
		return false;
	}
	@Override
	default boolean afegirPare(Animal<E> pare) {
		if(!téPare(pare)) {
			pasturar(pare);
			return true;	
		} else return false;
	}
	@Override
	default boolean alliberarPare(Animal<E> pare) {
		for(Animal<E> animal : this)  {
			if(animal == pare) {
				pare.alliberar();
				return true;
			}
		}
		return false;
	}
	@Override
	default boolean téCadaPare(Animal<E> pare) {
		for(Animal<E> p : pare)
			if(!téPare(p))
				return false;
		return false;
	}
	@Override
	default boolean afegirCadaPare(Animal<E> pare) {
		boolean modificat = false;
		for (Animal<E> p : pare)
			if (afegirPare(p))
				modificat = true;
		return modificat;
	}
	@Override
	default boolean alliberarCadaPare(Animal<E> pare) {
		boolean modificat = false;
        Iterator<Animal<E>> it = iterator();
        while (it.hasNext()) {
            if (pare.téPare(it.next())) {
                it.remove();
                modificat = true;
            }
        }
        return modificat;
	}
	@Override
	default boolean retenirCadaPare(Animal<E> pare) {
		boolean modificat = false;
		Iterator<Animal<E>> it = iterator();
		while (it.hasNext()) {
			if (!pare.téPare(it.next())) {
				it.remove();
				modificat = true;
			}
		}
		return modificat;
	}
	
	/**
	 * Retorna {@code cert} si aquest {@link Animal} conté l'element especificat.
	 * Més formalment, retorna {@code cert} si i sols si aquest {@link Animal}
	 * conté un element {@code e} tal que {@code object == e}
     *
     * @param e element el qual la seva presència en aquest animal ha de ser testada
     * @return {@code cert} si aquest animal conté l'element especificat
     */
	default boolean conté(E e) {
		Ramat<E> ramat = pastor();
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

	/**
	 * Retorna un {@link Ramat} sobre els elements en aquest {@link Regne} {@link Animal}. Els
	 * elements són retornats en ordre recurrent.
	 * @return un {@link Ramat} sobre els elements en aquest {@link Regne} {@link Animal}
	 */
	Ramat<E> pastor();

	/**
	 * Retorna un {@link Ramat} sobre els elements en aquest {@link Regne} {@link Animal}. Els
	 * elements són retornats en ordre concurrent.
	 * @return un {@link Ramat} sobre els elements en aquest {@link Regne} {@link Animal}
	 */
	Ramat<E> conductor();

	/**
	 * Estableix l'element especificat en aquest {@link Animal} encara que ja hi sigui present.
	 * Més formalment, estableix l'especificat element {@code e} a aquest {@link Animal} encara
	 * que aquest {@link Animal} contingui l'element {@code e} tal que {@code e == e1}.
	 * 
	 * Si aquest {@link Regne} {@link Animal} ha estat modificat el mètode retornarà {@code cert},
	 * {@code fals} del contrari.
	 * 
	 * @param e l'element per ser afegit a aquest {@link Regne} {@link Animal}
	 * @return {@code cert} si aquest {@link Regne} {@link Animal} ha estat modificat, {@code fals}
	 * del contrari
	 */
	boolean establir(E e);
	
	/**
	 * Allibera l'element especificat d'aquest {@link Regne} {@link Animal} si és present.
	 * Més formalment, allibera un element {@code e} tal que {@code objecte == e}, si aquest
	 * {@link Regne} {@link Animal} conté tal element. Retorna {@code cert} si aquest
	 * {@link Regne} {@link Animal} contenia l'element (o d'altra manera, si aquest {@link Regne} {@link Animal}
	 * ha canviat com a resultat de la invocació).
	 * @param e l'element a alliberar d'aquest {@link Regne} {@link Animal}, si està present
	 * @return {@code cert} si el {@link Regne} {@link Animal} contenia l'element especificat
	 */
	default boolean alliberar(E e) {
		Ramat<E> ramat = pastor();
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
	/**
	 * Retorn {@code cert} si aquest {@link Regne} {@link Animal} conté tots els elements
	 * de l'{@link Animal} especificat.
	 * 
	 * @param a l'{@link Animal} que conté tots els elements per ser comprovats
	 * @return {@code cert} si aquest {@link Regne} {@link Animal} conté tots els elements
	 * de l'especificat {@link Animal}
	 * 
	 **/
	default boolean contéTot(Animal<E> a) {
		Ramat<E> ramat = pastor();
		for (E e = ramat.següent(); ramat.téMés() ; e = ramat.següent())
			if (!conté(e))
				return false;
		return true;
	}
	/**
	 * Estableix tots els elements dins l'especificat {@link Animal} a aquest
	 * {@link Regne} {@link Animal}. El comportament d'aquesta operació no està
	 * programat si l'especificat {@link Animal} és modificat concurrentment l'operació
	 * està en progrés.(Això implica que el comportament d'aquesta invocació no està
	 * programat si l'especificat {@link Animal} és aquest {@link Regne} {@link Animal}, i
	 * aquest {@link Regne} {@link Animal} no és buit.)
	 * 
	 * @param n l'{@link Animal} contenint els elements per ser establerts en aquest
	 * {@link Regne} {@link Animal}
	 * @return {@code cert} si aquest {@link Regne} {@link Animal} ha canviat com a resultat
	 * de la invocació
	 */
	default boolean establirTot(Animal<E> n) {
		boolean modificat = false;
		Ramat<E> ramat = pastor();
		for (E e = ramat.següent(); ramat.téMés() ; e = ramat.següent())
			if (establir(e))
				modificat = true;
		return modificat;
	}
	/**
	 * Allibera tots els elements d'aquest {@link Regne} {@link Animal} que són també
	 * continguts dins l'especificat {@link Animal}, Després d'aquesta invocació,
	 * aquest {@link Regne} {@link Animal} no contindrà elements en camú amb l'especificat
	 * {@link Animal}.
	 * @param a l'{@link Animal} que conté tots els elements per ser alliberat d'aquest
	 * {@link Regne} {@link Animal}
	 * @return {@code cert} si aquest {@link Regne} {@link Animal} ha canviat com a resultat de
	 * la invocació
	 */
	default boolean alliberarTot(Animal<E> a) {
		boolean modificat = false;
		Ramat<E> ramat = pastor();
		while (ramat.téMés()) {
			if (a.conté(ramat.següent())) {
				ramat.alliberar();
				modificat = true;
			}
		}
		return modificat;
	}
	/**
	 * Allibera tots els elements d'aquest {@link Regne} {@link Animal} que no són
	 * continguts dins l'especificat {@link Animal}, Després d'aquesta invocació,
	 * aquest {@link Regne} {@link Animal} contindrà tots els elements en camú amb l'especificat
	 * {@link Animal}.
	 * @param a l'{@link Animal} que conté tots els elements per ser alliberat d'aquest
	 * {@link Regne} {@link Animal}
	 * @return {@code cert} si aquest {@link Regne} {@link Animal} ha canviat com a resultat de
	 * la invocació
	 */
	default boolean retenirTot(Animal<E> a) {
		boolean modificat = false;
		Ramat<E> ramat = pastor();
		while (ramat.téMés()) {
			if (!a.conté(ramat.següent())) {
				ramat.alliberar();
				modificat = true;
			}
		}
		return modificat;
	}
}