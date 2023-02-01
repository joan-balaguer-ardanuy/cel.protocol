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
