package cel;

import cel.temps.QuiEra;
import cel.temps.QuiVe;

/**
 * <tt>
 * <center>
 *  <h3>La pregària</h3>
 *  <h5>(Lc 11,2-4)</h5>
 *  <sup>5</sup> »I quan pregueu, no sigueu com els hipòcrites, que els agrada de posar-se drets i pregar a les sinagogues i a les cantonades de les places perquè tothom els vegi. Us asseguro que ja tenen la seva recompensa.
 *  <sup>6</sup> En canvi, tu, quan preguis, entra a la cambra més retirada, tanca-t'hi amb pany i clau i prega al teu Pare, present en els llocs més amagats, i el teu Pare, que veu el que és amagat, t'ho recompensarà.<br/>
 *  <sup>7</sup> »Quan pregueu, no parleu per parlar, com fan els pagans: es pensen que amb la seva xerrameca es faran escoltar.
 *  <sup>8</sup> No sigueu, doncs, com ells, que bé sap el vostre Pare de què teniu necessitat abans que li ho demaneu.<br/>
 *  <sup>9</sup> »Vosaltres, pregueu així:<br/>
 *  Pare nostre del cel,<br/>
 *  santifica el teu nom,<br/>
 *  <sup>10</sup> vingui el teu Regne,<br/>
 *  que es faci la teva voluntat<br/>
 *  aquí a la terra com es fa en el cel.<br/>
 *  <sup>11</sup> Dóna'ns avui<br/>
 *  el nostre pa de cada dia;<br/>
 *  <sup>12</sup> perdona les nostres ofenses,<br/>
 *  així com nosaltres<br/>
 *  perdonem els qui ens ofenen;<br/>
 *  <sup>13</sup> no permetis<br/>
 *  que caiguem en la temptació,<br/>
 *  i allibera'ns del mal.<br/>
 *  <sup>14</sup> »Perquè, si perdoneu als altres les seves faltes, el vostre Pare celestial també us perdonarà a vosaltres;
 *  <sup>15</sup> però si no els les perdoneu, el vostre Pare no us perdonarà les vostres.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 * 
 * @see QuiEra
 * @see QuiVe
 * @see Esperit
 */
public interface EsperitSant<K,V> extends QuiEra<K>, QuiVe<V>, Esperit {
	
	/**
	 * Obté el Pare corresponent a aquesta instància.
	 * @return el Pare corresponent a aquesta instància
	 */
	K obtenirPare();
	
	/**
     * Estableix el Pare corresponent a aquesta instància amb el Pare
     * especificat. (Escriu a través de la instància) El
     * comportament d'aquesta invocació no està definida si la instància ha estat
     * alliberada d'aquesta instància.
     *
     * @param pare el nou Pare per ser establert en aquesta instància
     */
	K establirPare(K pare);
	
	/**
	 * Retorna el Fill corresponent a aquesta instància.
	 * @return el Fill corresponent a aquesta insstància
	 */
	V obtenirFill();
	
	/**
     * Estableix el Fill corresponent a aquesta instància amb el Fill
     * especificat. (Escriu a través de la instància) El	
     * comportament d'aquesta invocació no està definit si la instància ha estat
     * alliberada d'aquesta instància.
     *
     * @param fill el nou Fill per ser establert en aquesta instància
     */
	V establirFill(V fill);
	
	/**
	 * Allibera aquesta instància de tota altra instància.
	 */
	void alliberar();
	
	/**
	 * Retorna <tt>cert</tt> si la instància no conté cap altra instància,
	 * <tt>fals</tt> del contrari.
	 * @return <tt>cert</tt> si la instància no conté cap altra instància,
	 * <tt>fals</tt> del contrari
	 */
	boolean estàBuit();
	
	/**
	 * Retorna el comparador corresponent a aquesta instància.
	 * @return el comparador corresponent a aquesta instància
	 */
	EsperitSant.Comparador<K, V> comparador();
	
	/**
	 * El comparador de informació de l'{@link EsperitSant}.
	 * 
	 * @author joan
	 *
	 * @param <K> és la CLAU
	 * @param <V> és el VALOR
	 */
	public interface Comparador<K, V> {

		/**
		 * Compara una instància Pare de classe K amb una instància Fill de classe V.
		 * L'ordre de la sortida és recursiu.
		 * 
		 * @param pare el Pare que es compara
		 * @param fill el Fill que es compara
		 */
		void compara(K pare, V fill);
	}
}