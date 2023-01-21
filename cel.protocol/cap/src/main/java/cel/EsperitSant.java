package cel;

import cel.temps.QuiEra;
import cel.temps.QuiVe;

/**
 * <tt>
 * <center>
 *  <h3>La pregària</h3>
 *  <h5>(Lc 11,2-4)</h5>
 *  5 »I quan pregueu, no sigueu com els hipòcrites, que els agrada de posar-se drets i pregar a les sinagogues i a les cantonades de les places perquè tothom els vegi. Us asseguro que ja tenen la seva recompensa. 6 En canvi, tu, quan preguis, entra a la cambra més retirada, tanca-t'hi amb pany i clau i prega al teu Pare, present en els llocs més amagats, i el teu Pare, que veu el que és amagat, t'ho recompensarà.<br/>
 *  7 »Quan pregueu, no parleu per parlar, com fan els pagans: es pensen que amb la seva xerrameca es faran escoltar. 8 No sigueu, doncs, com ells, que bé sap el vostre Pare de què teniu necessitat abans que li ho demaneu.<br/>
 *  9 »Vosaltres, pregueu així:<br/>
 *  Pare nostre del cel,<br/>
 *  santifica el teu nom,<br/>
 *  10 vingui el teu Regne,<br/>
 *  que es faci la teva voluntat<br/>
 *  aquí a la terra com es fa en el cel.<br/>
 *  11 Dóna'ns avui<br/>
 *  el nostre pa de cada dia;<br/>
 *  12 perdona les nostres ofenses,<br/>
 *  així com nosaltres<br/>
 *  perdonem els qui ens ofenen;<br/>
 *  13 no permetis<br/>
 *  que caiguem en la temptació,<br/>
 *  i allibera'ns del mal.<br/>
 *  14 »Perquè, si perdoneu als altres les seves faltes, el vostre Pare celestial també us perdonarà a vosaltres; 15 però si no els les perdoneu, el vostre Pare no us perdonarà les vostres.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public interface EsperitSant<K,V> extends QuiEra<K>, QuiVe<V>, Esperit {
	K getPare();
	K setPare(K pare);
	V getFill();
	V setFill(V fill);
}
