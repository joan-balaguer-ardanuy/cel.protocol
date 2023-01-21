package cel.temps;

import cel.Esperit;

/**
 * <tt>
 * <center>
 * <h3>Salutació</h3>
 * 4 Joan, a les set esglésies que hi ha a la província de l'Àsia. Us desitjo la gràcia i la pau de part de Déu, el qui és, el qui era i el qui ve, de part dels set esperits que estan davant el seu tron, 5 i de part de Jesucrist, el testimoni fidel, el primogènit dels qui retornen d'entre els morts, el sobirà dels reis de la terra.<br/>
 * Ell ens estima i ens ha alliberat dels nostres pecats amb la seva sang, 6 i ha fet de nosaltres una casa reial, uns sacerdots dedicats a Déu, el seu Pare. A ell sigui donada la glòria i el poder pels segles dels segles. Amén.<br/>
 * 7 Mireu, ve enmig dels núvols, i tothom el veurà amb els propis ulls, fins aquells qui el van traspassar; tots els pobles de la terra faran grans planys per ell. Sí! Amén!<br/>
 * 8 Jo sóc l'Alfa i l'Omega, diu el Senyor Déu, el qui és, el qui era i el qui ve, el Déu de l'univers.<br/>
 * </center>
 * </tt>
 *  
 * @author joan
 *
 * @param <K>
 */
public interface QuiEra<K> extends Esperit {
	K getPare();
	K setPare(K pare);
}
 