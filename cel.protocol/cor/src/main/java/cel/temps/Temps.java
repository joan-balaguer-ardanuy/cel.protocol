package cel.temps;

import java.util.Iterator;
import java.util.function.BiConsumer;

import cel.Déu;
import cel.Esperit;
import cel.Paritat;

/**
 * <tt>
 * <center>
 * <h3>La creació</h3>
 * <sup>1</sup> Al principi, {@link Déu} va crear el cel i la terra.
 * <sup>2</sup> La terra era caòtica i desolada, les tenebres cobrien la superfície de l'oceà, i l'{@link Esperit} de {@link Déu} planava sobre les aigües.<br/>
 * <sup>3</sup> {@link Déu} digué:<br/>	
 * --Que existeixi la llum.<br/>
 * I la llum va existir.
 * <sup>4</sup> {@link Déu} veié que la llum era bona, i separà la llum de les tenebres.
 * <sup>5</sup> {@link Déu} va donar a la llum el nom de dia, i a les tenebres, el de nit.<br/>
 * Hi hagué un vespre i un matí, i fou el primer dia.<br/>
 * <sup>6</sup> {@link Déu} digué:<br/>
 * --Que hi hagi un firmament enmig de les aigües, per a separar unes aigües de les altres.<br/>
 * <sup>7</sup> I va ser així. {@link Déu} va fer la volta del firmament i va separar les aigües que hi ha a sota la volta de les que hi ha a sobre.
 * <sup>8</sup> {@link Déu} donà a la volta del firmament el nom de cel.<br/>
 * Hi hagué un vespre i un matí, i fou el segon dia.<br/>
 * <sup>9</sup> {@link Déu} digué:<br/>
 * --Que les aigües de sota el cel s'apleguin en un sol indret i apareguin els continents.<br/>
 * I va ser així.
 * <sup>10</sup> {@link Déu} donà als continents el nom de terra, i a les aigües aplegades, el de mar. {@link Déu} veié que tot això era bo.<br/>
 * <sup>11</sup> {@link Déu} digué:<br/>
 * --Que la terra produeixi vegetació, herbes que facin llavor i arbres de tota mena que donin fruit amb la seva llavor, per tota la terra.<br/>
 * I va ser així.
 * <sup>12</sup> La terra produí la vegetació, les herbes de tota mena que fan la seva llavor i els arbres de tota mena que donen fruit amb la seva llavor. {@link Déu} veié que tot això era bo.<br/>
 * <sup>13</sup> Hi hagué un vespre i un matí, i fou el tercer dia.<br/>
 * <sup>14</sup> {@link Déu} digué:<br/>
 * --Que hi hagi a la volta del cel uns llumeners per a separar el dia de la nit i assenyalar les festivitats, els dies i els anys,
 * <sup>15</sup> i que des de la volta del cel il·luminin la terra.<br/>
 * I va ser així.
 * <sup>16</sup> {@link Déu} va fer els dos grans llumeners: un de més gran que governés el dia i un de més petit que governés la nit; va fer també les estrelles.
 * <sup>17</sup> {@link Déu} els col·locà a la volta del cel perquè il·luminessin la terra,
 * <sup>18</sup> governessin el dia i la nit i separessin la llum de les tenebres. {@link Déu} veié que tot això era bo.<br/>
 * <sup>19</sup> Hi hagué un vespre i un matí, i fou el quart dia.<br/>
 * <sup>20</sup> {@link Déu} digué:<br/>
 * --Que les aigües produeixin éssers vius que s'hi moguin i animals alats que volin entre la terra i la volta del cel.<br/>
 * <sup>21</sup> {@link Déu} va crear els grans monstres marins, els éssers vius de tota mena que es mouen dintre l'aigua, i tota mena d'animals alats. {@link Déu} veié que tot això era bo.
 * <sup>22</sup> {@link Déu} els beneí dient-los:<br/>
 * --Sigueu fecunds, multipliqueu-vos i ompliu les aigües dels mars, i que els animals alats es multipliquin a la terra.<br/>
 * <sup>23</sup> Hi hagué un vespre i un matí, i fou el cinquè dia.<br/>
 * <sup>24</sup> {@link Déu} digué:<br/>
 * --Que la terra produeixi éssers vius de tota mena: bestioles i tota mena d'animals domèstics i feréstecs.<br/>
 * I va ser així.
 * <sup>25</sup> {@link Déu} va fer tota mena d'animals feréstecs i domèstics i tota mena de cucs i bestioles. {@link Déu} veié que tot això era bo.<br/>
 * <sup>26</sup> {@link Déu} digué:<br/>
 * --Fem l'home a imatge nostra, semblant a nosaltres, i que sotmeti els peixos del mar, els ocells del cel, el bestiar, i tota la terra amb les bestioles que s'hi arrosseguen.<br/>
 * <sup>27</sup> {@link Déu} va crear l'home a imatge seva, el va crear a imatge de {@link Déu}, creà l'home i la dona.
 * <sup>28</sup> {@link Déu} els beneí dient-los:<br/>
 * --Sigueu fecunds i multipliqueu-vos, ompliu la terra i domineu-la; sotmeteu els peixos del mar, els ocells del cel i totes les bestioles que s'arrosseguen per terra.<br/>
 * <sup>29</sup> {@link Déu} digué encara:<br/>
 * --Mireu, us dono totes les herbes que fan llavor arreu de la terra i tots els arbres que donen fruit amb la seva llavor, perquè siguin el vostre aliment.
 * <sup>30</sup> A tots els animals de la terra, a tots els ocells del cel i a totes les bestioles que s'arrosseguen, a tots els éssers vius de la terra, els dono l'herba verda per aliment.<br/>
 * I va ser així.<br/>
 * <sup>31</sup> {@link Déu} veié que tot el que havia fet era molt bo.<br/>
 * Hi hagué un vespre i un matí, i fou el sisè dia.<br/>
 * <br/>
 * <sup>1</sup> Així van quedar acabats el cel i la terra amb tots els seus estols.
 * <sup>2</sup> El setè dia, {@link Déu} havia acabat la seva obra. El dia setè, doncs, va reposar de tota l'obra que havia fet.
 * <sup>3</sup> {@link Déu} va beneir el dia setè i en va fer un dia sagrat, perquè aquell dia reposà de la seva obra creadora.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Temps
	<K extends Vida<K,V>,V extends Vida<V,K>>
		extends Heretat<K,V>
			implements Vida<K,V> {

	private static final long serialVersionUID = 5651963240853233224L;

	public Temps() {
		super();
	}
	public Temps(Paritat paritat) {
		super(paritat);
	}
	public Temps(Class<? extends V> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Temps(K pare) {
		super(pare);
	}
	public Temps(Class<? extends V> classeFill, K pare) {
		super(classeFill, pare);
	}
	public Temps(K déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Temps(Class<? extends V> classeFill, K déu, Paritat paritat) {
		super(classeFill, déu, paritat);
	}
 
	@Override
	public void volta() {
		if(aleatorietat().nextBoolean()) {
			obtenirPare().permutarFill(obtenirPassat(), obtenirFutur());
		} else {
			obtenirPassat().permutarFill(obtenirPare(), obtenirPare().obtenirFill());
		}
	}
	@Override
	public boolean alliberarFill(K pare, V fill) {
		Object fillActual = pare.obtenirFill();
		if (fillActual != fill || (fillActual == null && !téPare(pare))) {
			return false;
		}
		pare.alliberar();
		return true;
	}
	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public boolean alliberarPare(V fill, K pare) {
		return obtenirFill().alliberarFill(fill, pare);
	}
	@Override
	public void perCadaFill(BiConsumer<? super K, ? super V> execució) {
		for(K pare : this)  {
			execució.accept(pare, pare.obtenirFill());
		}
	}
	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public void perCadaPare(BiConsumer<? super V, ? super K> execució) {
		obtenirFill().perCadaFill(execució);
	}
	
	@Override
	public Iterator<K> iterator() {
		return new Iterador(obtenirPare());
	}
	private final class Iterador implements Iterator<K> {

		/**
		 * L'animal actual.
		 */
		private K actual;
		
		/**
		 * El següent animal.
		 */
		private K següent;
		
		/**
		 * Si aquest iterador té un animal més
		 */
		private boolean téMés;
		
		public Iterador(K pare) {
			següent = actual = pare;
			téMés = true;
		}
		
		@Override
		public synchronized boolean hasNext() {
			return téMés;
		}

		@Override
		public synchronized K next() {
			K e = següent;
			actual = e;
			següent = e.obtenirPare();
			if(e == Temps.this)
				téMés = false;
			else téMés = true;
			return e;
		}
		@Override
		public synchronized void remove() {
			K a = següent;
			actual.alliberar();
			if (!a.ésBuit()) {
				actual = a;
				següent = a.obtenirPare();
			} else {
				téMés = false;
			}
		}
	}
}