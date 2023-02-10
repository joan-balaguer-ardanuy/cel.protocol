package cel.temps;

/**
 * <tt>
 * <center>
 * <h3>El Senyor és el meu pastor</h3>
 *  <i><sup>1</sup> Salm del recull de David.</i><br/>
 *  El Senyor és el meu pastor:<br/>
 *  no em manca res.<br/>
 *  <sup>2</sup> Em fa descansar en prats deliciosos,<br/>
 *  em mena al repòs vora l'aigua,<br/>
 *  <sup>3</sup> i allí em retorna.<br/>
 *  Em guia per camins segurs,<br/>
 *  per amor del seu nom;<br/>
 *  <sup>4</sup> ni que passi per la vall tenebrosa,<br/>
 *  no tinc por de cap mal.<br/>
 *  Tu, Senyor, ets vora meu:<br/>
 *  la teva vara i el teu bastó<br/>
 *  em donen confiança.<br/>
 *  <sup>5</sup> Davant meu pares taula tu mateix<br/>
 *  enfront dels enemics;<br/>
 *  m'has ungit el cap amb perfums,<br/>
 *  omples a vessar la meva copa.<br/>
 *  <sup>6</sup> Ben cert, tota la vida m'acompanyen<br/>
 *  la teva {@link Bondat} i el teu {@link Amor}.<br/>
 *  I viuré anys i més anys<br/>
 *  a la casa del Senyor. <br/>
 * </center>
 * </tt>
 * @author joan

 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Heretat
	<K extends Vida<K,V>,V extends Vida<V,K>>
		extends Tenebres<K,V> 
			implements Vida<K,V> {

	private static final long serialVersionUID = 5942561848199232398L;

	public Heretat() {
		super();
	}
	public Heretat(String nom) {
		super(nom);
	}
	public Heretat(Class<? extends V> classeFill, String nom) {
		super(classeFill, nom);
	}
	public Heretat(K pare) {
		super(pare);
	}
	public Heretat(Class<? extends V> classeFill, K pare) {
		super(classeFill, pare);
	}
	public Heretat(K déu, String nom) {
		super(déu, nom);
	}
	public Heretat(Class<? extends V> classeFill, K déu, String nom) {
		super(classeFill, déu, nom);
	}

	@Override
	public V obtenirFill(K pare) {
		for(K k : this) {
			if(k == pare)
				return pare.obtenirFill();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public K obtenirPare(V fill) {
		return obtenirFill().obtenirFill(fill);
	}
	
	@Override
	public V obtenirFillPerDefecte(K pare, V fillPerDefecte) {
		V fill;
		return (((fill = obtenirFill(pare)) != null) || téPare(pare)) ? fill : fillPerDefecte;
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public K obtenirParePerDefecte(V fill, K parePerDefecte) {
		return obtenirFill().obtenirFillPerDefecte(fill, parePerDefecte);
	}
	
	@Override
	public V establirFill(K pare, V fill) {
		for(K k : this) {
			if(k == pare) {
				fill.establirPare(pare.obtenirPare().obtenirFill());
				pare.obtenirFutur().establirPare(fill);
				fill.establirFill(pare.obtenirPassat());
				return pare.establirFill(fill);
			}
		}
		sotmetreFill(pare, fill);
		return null;
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public K establirPare(V fill, K pare) {
		return obtenirFill().establirFill(fill, pare);
	}

	@Override
	public V establirFillSiAbsent(K pare, V fill) {
		V v = pare.obtenirFill();
		if(v == null) {
			v = establirFill(pare, fill);
		}
		return v;
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public K establirPareSiAbsent(V fill, K pare) {
		return obtenirFill().establirFillSiAbsent(fill, pare);
	}

	@Override
	public void establirTotsElsFills(Vida<? extends K, ? extends V> e) {
		for(K pare : e) {
			establirFill(pare, pare.obtenirFill());
		}
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public void establirTotsElsPares(Vida<? extends V, ? extends K> e) {
		obtenirFill().establirTotsElsFills(e);
	}
}