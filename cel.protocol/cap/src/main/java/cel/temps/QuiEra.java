package cel.temps;

/**
 * <tt>
 * <center>
 * <h3>Salutació</h3>
 * <sup>4</sup> Joan, a les set esglésies que hi ha a la província de l'Àsia. Us desitjo la gràcia i la pau de part de Déu, el qui és, el qui era i el qui ve, de part dels set esperits que estan davant el seu tron,
 * <sup>5</sup> i de part de Jesucrist, el testimoni fidel, el primogènit dels qui retornen d'entre els morts, el sobirà dels reis de la terra.<br/>
 * Ell ens estima i ens ha alliberat dels nostres pecats amb la seva sang,
 * <sup>6</sup> i ha fet de nosaltres una casa reial, uns sacerdots dedicats a Déu, el seu Pare. A ell sigui donada la glòria i el poder pels segles dels segles. Amén.<br/>
 * <sup>7</sup> Mireu, ve enmig dels núvols, i tothom el veurà amb els propis ulls, fins aquells qui el van traspassar; tots els pobles de la terra faran grans planys per ell. Sí! Amén!<br/>
 * <sup>8</sup> Jo sóc l'Alfa i l'Omega, diu el Senyor Déu, el qui és, el qui era i el qui ve, el Déu de l'univers.<br/>
 * </center>
 * </tt>
 *  
 * @author joan
 *
 * @param <K> és la CLAU
 */
public interface QuiEra<K> extends Passat<K> {
	
	/**
	 * Obté el Pare corresponent a aquesta instància.
	 * @return el Pare corresponent a aquesta instància
	 */
	K obtenirPare();
	
	/**
     * Estableix el Pare corresponent a aquesta instància amb el Pare
     * especificat. (Escriu a través del {@link QuiEra}). El
     * comportament d'aquesta invocació no està definit si el aquesta instància ha estat
     * alliberada del {@link QuiEra}.
     *
     * @param pare el nou Pare per ser establert en aquesta instància
     * @return l'antic Pare que era establert en aquesta instància
     */
	K establirPare(K pare);
}
 