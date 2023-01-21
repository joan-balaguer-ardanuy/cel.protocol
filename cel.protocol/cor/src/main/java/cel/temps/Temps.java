package cel.temps;

/**
 * 
 * <tt>
 * <center>
 *  1 Al principi, Déu va crear el cel i la terra. 2 La terra era caòtica i desolada, les tenebres cobrien la superfície de l'oceà, i l'Esperit de Déu planava sobre les aigües.<br/>
 *  3 Déu digué:<br/>
 *  --Que existeixi la llum.<br/>
 *  I la llum va existir. 4 Déu veié que la llum era bona, i separà la llum de les tenebres. 5 Déu va donar a la llum el nom de dia, i a les tenebres, el de nit.<br/>
 *  Hi hagué un vespre i un matí, i fou el primer dia.<br/>
 *  6 Déu digué:v
 *  --Que hi hagi un firmament enmig de les aigües, per a separar unes aigües de les altres.<br/>
 *  7 I va ser així. Déu va fer la volta del firmament i va separar les aigües que hi ha a sota la volta de les que hi ha a sobre. 8 Déu donà a la volta del firmament el nom de cel.<br/>
 *  Hi hagué un vespre i un matí, i fou el segon dia.<br/>
 *  9 Déu digué:<br/>
 *  --Que les aigües de sota el cel s'apleguin en un sol indret i apareguin els continents.<br/>
 *  I va ser així. 10 Déu donà als continents el nom de terra, i a les aigües aplegades, el de mar. Déu veié que tot això era bo.<br/>
 *  11 Déu digué:<br/>
 *  --Que la terra produeixi vegetació, herbes que facin llavor i arbres de tota mena que donin fruit amb la seva llavor, per tota la terra.<br/>
 *  I va ser així. 12 La terra produí la vegetació, les herbes de tota mena que fan la seva llavor i els arbres de tota mena que donen fruit amb la seva llavor. Déu veié que tot això era bo.<br/>
 *  13 Hi hagué un vespre i un matí, i fou el tercer dia.<br/>
 *  14 Déu digué:<br/>
 *  --Que hi hagi a la volta del cel uns llumeners per a separar el dia de la nit i assenyalar les festivitats, els dies i els anys, 15 i que des de la volta del cel il·luminin la terra.<br/>
 *  I va ser així. 16 Déu va fer els dos grans llumeners: un de més gran que governés el dia i un de més petit que governés la nit; va fer també les estrelles. 17 Déu els col·locà a la volta del cel perquè il·luminessin la terra, 18 governessin el dia i la nit i separessin la llum de les tenebres. Déu veié que tot això era bo.<br/>
 *  19 Hi hagué un vespre i un matí, i fou el quart dia.<br/>
 *  20 Déu digué:<br/>
 *  --Que les aigües produeixin éssers vius que s'hi moguin i animals alats que volin entre la terra i la volta del cel.<br/>
 *  21 Déu va crear els grans monstres marins, els éssers vius de tota mena que es mouen dintre l'aigua, i tota mena d'animals alats. Déu veié que tot això era bo. 22 Déu els beneí dient-los:<br/>
 *  --Sigueu fecunds, multipliqueu-vos i ompliu les aigües dels mars, i que els animals alats es multipliquin a la terra.<br/>
 *  23 Hi hagué un vespre i un matí, i fou el cinquè dia.<br/>
 *  24 Déu digué:<br/>
 *  --Que la terra produeixi éssers vius de tota mena: bestioles i tota mena d'animals domèstics i feréstecs.<br/>
 *  I va ser així. 25 Déu va fer tota mena d'animals feréstecs i domèstics i tota mena de cucs i bestioles. Déu veié que tot això era bo.<br/>
 *  26 Déu digué:<br/>
 *  --Fem l'home a imatge nostra, semblant a nosaltres, i que sotmeti els peixos del mar, els ocells del cel, el bestiar, i tota la terra amb les bestioles que s'hi arrosseguen.<br/>
 *  27 Déu va crear l'home a imatge seva, el va crear a imatge de Déu, creà l'home i la dona. 28 Déu els beneí dient-los:<br/>
 *  --Sigueu fecunds i multipliqueu-vos, ompliu la terra i domineu-la; sotmeteu els peixos del mar, els ocells del cel i totes les bestioles que s'arrosseguen per terra.<br/>
 *  29 Déu digué encara:<br/>
 *  --Mireu, us dono totes les herbes que fan llavor arreu de la terra i tots els arbres que donen fruit amb la seva llavor, perquè siguin el vostre aliment. 30 A tots els animals de la terra, a tots els ocells del cel i a totes les bestioles que s'arrosseguen, a tots els éssers vius de la terra, els dono l'herba verda per aliment.<br/>
 *  I va ser així.<br/>
 *  31 Déu veié que tot el que havia fet era molt bo.<br/>
 *  Hi hagué un vespre i un matí, i fou el sisè dia.<br/>
 *  <br/>
 *  1 Així van quedar acabats el cel i la terra amb tots els seus estols. 2 El setè dia, Déu havia acabat la seva obra. El dia setè, doncs, va reposar de tota l'obra que havia fet. 3 Déu va beneir el dia setè i en va fer un dia sagrat, perquè aquell dia reposà de la seva obra creadora.<br/>
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

}
