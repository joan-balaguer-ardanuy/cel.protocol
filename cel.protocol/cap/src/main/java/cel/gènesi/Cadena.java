package cel.gènesi;

import cel.Anyell;

/**
 * <tt>
 * <center>
 * <h3>El regne de mil anys</h3>
 * <sup>1</sup> Després vaig veure baixar del cel un àngel, que duia a la mà la clau dels abismes i una gran cadena.
 * <sup>2</sup> L'àngel va agafar el drac, la serp antiga, que és el diable i Satanàs, i l'encadenà per mil anys;
 * <sup>3</sup> el va llançar als abismes, on el tancà amb clau i segellà la porta perquè no enganyi més els pobles fins que es compleixin els mil anys. Acabat, caldrà que sigui deslligat per poc temps.<br/>
 * <sup>4</sup> Aleshores vaig veure uns trons, on es van asseure tots aquells qui han rebut el poder de judicar. Vaig veure les ànimes dels qui havien estat decapitats per haver donat testimoni de Jesús i per haver anunciat la paraula de Déu; tots aquests s'havien negat a adorar la bèstia i la seva estàtua, i a portar el seu encuny al front o a la mà. Van tornar a la vida i regnaren amb el Crist durant mil anys.
 * <sup>5</sup> Els altres morts no han de reviure abans de complir-se els mil anys. Aquesta és la primera resurrecció.
 * <sup>6</sup> Feliços i sants els qui tinguin part en aquesta primera resurrecció! La segona mort no té cap poder damunt d'ells: seran sacerdots dedicats a Déu i al Crist i regnaran amb ell durant mil anys.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public interface Cadena<K,V> extends Anyell<K,V> {

	K getKey();
	K setKey(K key);
	V getValue();
	V setValue(V value);
	
	Anyell<K,V> getEntry();
	
	boolean conté(Anyell<K,V> entrada);
	Anyell<K,V> obtenir(K clau);
	boolean establir(Anyell<K,V> entrada);
	boolean alliberar(Anyell<K,V> entrada);
	boolean contéTot(Anyell<K,V> entrada);
	void establirTot(Anyell<K,V> entrada);
	boolean retenirTot(Anyell<K,V> entrada);
}