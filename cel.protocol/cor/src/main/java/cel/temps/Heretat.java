package cel.temps;

/**
 * <tt>
 * <center>
 *  <i>1 Salm del recull de David.</i><br/>
 *  El Senyor és el meu pastor:<br/>
 *  no em manca res.<br/>
 *  2 Em fa descansar en prats deliciosos,<br/>
 *  em mena al repòs vora l'aigua,<br/>
 *  3 i allí em retorna.<br/>
 *  Em guia per camins segurs,<br/>
 *  per amor del seu nom;<br/>
 *  4 ni que passi per la vall tenebrosa,<br/>
 *  no tinc por de cap mal.<br/>
 *  Tu, Senyor, ets vora meu:<br/>
 *  la teva vara i el teu bastó<br/>
 *  em donen confiança.<br/>
 *  5 Davant meu pares taula tu mateix<br/>
 *  enfront dels enemics;<br/>
 *  m'has ungit el cap amb perfums,<br/>
 *  omples a vessar la meva copa.<br/>
 *  6 Ben cert, tota la vida m'acompanyen<br/>
 *  la teva bondat i el teu amor.<br/>
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
	<K extends Viu<K,V>,V extends Viu<V,K>>
		extends Tenebres<K,V> 
			implements Viu<K,V> {

	private static final long serialVersionUID = 5942561848199232398L;

	public Heretat() {
		// TODO Auto-generated constructor stub
	}

}
