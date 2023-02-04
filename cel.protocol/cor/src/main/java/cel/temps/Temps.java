package cel.temps;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 
 * <tt>
 * <center>
 * <h3>La creació</h3>
 * <sup>1</sup> Al principi, Déu va crear el cel i la terra.
 * <sup>2</sup> La terra era caòtica i desolada, les tenebres cobrien la superfície de l'oceà, i l'Esperit de Déu planava sobre les aigües.<br/>
 * <sup>3</sup> Déu digué:<br/>
 * --Que existeixi la llum.<br/>
 * I la llum va existir.
 * <sup>4</sup> Déu veié que la llum era bona, i separà la llum de les tenebres.
 * <sup>5</sup> Déu va donar a la llum el nom de dia, i a les tenebres, el de nit.<br/>
 * Hi hagué un vespre i un matí, i fou el primer dia.<br/>
 * <sup>6</sup> Déu digué:<br/>
 * --Que hi hagi un firmament enmig de les aigües, per a separar unes aigües de les altres.<br/>
 * <sup>7</sup> I va ser així. Déu va fer la volta del firmament i va separar les aigües que hi ha a sota la volta de les que hi ha a sobre.
 * <sup>8</sup> Déu donà a la volta del firmament el nom de cel.<br/>
 * Hi hagué un vespre i un matí, i fou el segon dia.<br/>
 * <sup>9</sup> Déu digué:<br/>
 * --Que les aigües de sota el cel s'apleguin en un sol indret i apareguin els continents.<br/>
 * I va ser així.
 * <sup>10</sup> Déu donà als continents el nom de terra, i a les aigües aplegades, el de mar. Déu veié que tot això era bo.<br/>
 * <sup>11</sup> Déu digué:<br/>
 * --Que la terra produeixi vegetació, herbes que facin llavor i arbres de tota mena que donin fruit amb la seva llavor, per tota la terra.<br/>
 * I va ser així.
 * <sup>12</sup> La terra produí la vegetació, les herbes de tota mena que fan la seva llavor i els arbres de tota mena que donen fruit amb la seva llavor. Déu veié que tot això era bo.<br/>
 * <sup>13</sup> Hi hagué un vespre i un matí, i fou el tercer dia.<br/>
 * <sup>14</sup> Déu digué:<br/>
 * --Que hi hagi a la volta del cel uns llumeners per a separar el dia de la nit i assenyalar les festivitats, els dies i els anys,
 * <sup>15</sup> i que des de la volta del cel il·luminin la terra.<br/>
 * I va ser així.
 * <sup>16</sup> Déu va fer els dos grans llumeners: un de més gran que governés el dia i un de més petit que governés la nit; va fer també les estrelles.
 * <sup>17</sup> Déu els col·locà a la volta del cel perquè il·luminessin la terra,
 * <sup>18</sup> governessin el dia i la nit i separessin la llum de les tenebres. Déu veié que tot això era bo.<br/>
 * <sup>19</sup> Hi hagué un vespre i un matí, i fou el quart dia.<br/>
 * <sup>20</sup> Déu digué:<br/>
 * --Que les aigües produeixin éssers vius que s'hi moguin i animals alats que volin entre la terra i la volta del cel.<br/>
 * <sup>21</sup> Déu va crear els grans monstres marins, els éssers vius de tota mena que es mouen dintre l'aigua, i tota mena d'animals alats. Déu veié que tot això era bo.
 * <sup>22</sup> Déu els beneí dient-los:<br/>
 * --Sigueu fecunds, multipliqueu-vos i ompliu les aigües dels mars, i que els animals alats es multipliquin a la terra.<br/>
 * <sup>23</sup> Hi hagué un vespre i un matí, i fou el cinquè dia.<br/>
 * <sup>24</sup> Déu digué:<br/>
 * --Que la terra produeixi éssers vius de tota mena: bestioles i tota mena d'animals domèstics i feréstecs.<br/>
 * I va ser així.
 * <sup>25</sup> Déu va fer tota mena d'animals feréstecs i domèstics i tota mena de cucs i bestioles. Déu veié que tot això era bo.<br/>
 * <sup>26</sup> Déu digué:<br/>
 * --Fem l'home a imatge nostra, semblant a nosaltres, i que sotmeti els peixos del mar, els ocells del cel, el bestiar, i tota la terra amb les bestioles que s'hi arrosseguen.<br/>
 * <sup>27</sup> Déu va crear l'home a imatge seva, el va crear a imatge de Déu, creà l'home i la dona.
 * <sup>28</sup> Déu els beneí dient-los:<br/>
 * --Sigueu fecunds i multipliqueu-vos, ompliu la terra i domineu-la; sotmeteu els peixos del mar, els ocells del cel i totes les bestioles que s'arrosseguen per terra.<br/>
 * <sup>29</sup> Déu digué encara:<br/>
 * --Mireu, us dono totes les herbes que fan llavor arreu de la terra i tots els arbres que donen fruit amb la seva llavor, perquè siguin el vostre aliment.
 * <sup>30</sup> A tots els animals de la terra, a tots els ocells del cel i a totes les bestioles que s'arrosseguen, a tots els éssers vius de la terra, els dono l'herba verda per aliment.<br/>
 * I va ser així.<br/>
 * <sup>31</sup> Déu veié que tot el que havia fet era molt bo.<br/>
 * Hi hagué un vespre i un matí, i fou el sisè dia.<br/>
 * <br/>
 * <sup>1</sup> Així van quedar acabats el cel i la terra amb tots els seus estols.
 * <sup>2</sup> El setè dia, Déu havia acabat la seva obra. El dia setè, doncs, va reposar de tota l'obra que havia fet.
 * <sup>3</sup> Déu va beneir el dia setè i en va fer un dia sagrat, perquè aquell dia reposà de la seva obra creadora.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Temps
	<K extends Viu<K,V>,V extends Viu<V,K>>
		extends Heretat<K,V>
			implements Viu<K,V> {

	private static final long serialVersionUID = 5651963240853233224L;

	public Temps() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void volta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recórrerFill(K pare, V fill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recórrerPare(V fill, K pare) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void concórrerFill(K pare, V fill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void concórrerPare(V fill, K pare) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void permutarFill(K pare, V fill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void permutarPare(V fill, K pare) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sotmetreFill(K pare, V fill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sotmetrePare(V fill, K pare) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V obtenirFillPerDefecte(K pare, V fillPerDefecte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K obtenirParePerDefecte(V fill, K parePerDefecte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V establirFill(K pare, V fill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K establirPare(V fill, K pare) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V establirFillSiAbsent(K pare, V fill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K establirPareSiAbsent(V fill, K pare) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void establirTotsElsFills(Viu<? extends K, ? extends V> e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void establirTotsElsPares(Viu<? extends V, ? extends K> e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V reemplaçarFill(K pare, V fill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K reemplaçarPare(V fill, K pare) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean reemplaçarFill(K pare, V anticFill, V nouFill) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reemplaçarPare(V fill, K anticPare, K nouPare) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reemplaçarTotsElsFills(BiFunction<? super K, ? super V, ? extends V> funció) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reemplaçarTotsElsPares(BiFunction<? super V, ? super K, ? extends K> funció) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean alliberarFill(K pare, V fill) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alliberarPare(V fill, K pare) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void perCadaFill(BiConsumer<? super K, ? super V> execució) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perCadaPare(BiConsumer<? super V, ? super K> execució) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V processarFillSiAbsent(K pare, Function<? super K, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K processarPareSiAbsent(V fill, Function<? super V, ? extends K> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V processarFillSiPresent(K pare, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K processarPareSiPresent(V fill, BiFunction<? super V, ? super K, ? extends K> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V processarFill(K pare, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K processarPare(V fill, BiFunction<? super V, ? super K, ? extends K> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V unirFill(K pare, V fill, BiFunction<? super V, ? super V, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K unirPare(V fill, K pare, BiFunction<? super K, ? super K, ? extends K> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
