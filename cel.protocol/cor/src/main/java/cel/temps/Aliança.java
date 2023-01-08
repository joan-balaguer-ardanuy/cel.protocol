package cel.temps;

import cel.Corona;

/**
 * <tt>
 * <center>
 *  1 Déu va donar al poble d'Israel aquests manaments:<br/>
 *  2 --Jo sóc el Senyor, el teu Déu, que t'he fet sortir del país d'Egipte, la terra on eres esclau.<br/>
 *  3 »No tinguis cap altre déu fora de mi.<br/>
 *  4 »No et fabriquis ídols; no et facis cap imatge del que hi ha dalt al cel, aquí baix a la terra o en les aigües d'aquí baix. 5 No els adoris ni els donis culte, perquè jo, el Senyor, el teu Déu, sóc el Déu-gelós: demano comptes als fills de les culpes dels pares fins a la tercera i la quarta generació dels qui no m'estimen. 6 Però, per als qui m'estimen i guarden els meus preceptes, mantinc el meu amor durant un miler de generacions.<br/>
 *  7 »No juris en fals pel nom del Senyor, el teu Déu, perquè jo, el Senyor, no tinc per innocent el qui jura en fals pel meu nom.<br/>
 *  8 »Recorda't de consagrar-me el repòs del dissabte. 9 Tens sis dies per a treballar i fer totes les feines que calgui, 10 però el dia setè és el dia de repòs, dedicat al Senyor, el teu Déu. No facis cap treball ni tu, ni el teu fill, ni la teva filla, ni el teu esclau, ni la teva esclava, ni cap dels teus animals, ni l'immigrant que resideix a la teva ciutat. 11 Perquè en sis dies el Senyor va fer el cel, la terra, el mar i tot el que s'hi mou, però el dia setè va reposar: per això el Senyor ha beneït el dissabte i l'ha consagrat.<br/>
 *  12 »Honra el pare i la mare. Així tindràs llarga vida en el país que et dóna el Senyor, el teu Déu.<br/>
 *  13 »No matis.<br/>
 *  14 »No cometis adulteri.<br/>
 *  15 »No robis.<br/>
 *  16 »No acusis ningú falsament.<br/>
 *  17 »No desitgis la casa d'un altre. No desitgis la seva dona, ni el seu esclau, ni la seva esclava, ni el seu bou, ni el seu ase, ni res del que li pertany.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K>
 * @param <V>
 */
public abstract class Aliança
	<K extends Viu<K,V>,V extends Viu<V,K>> 
		extends Corona<K, V> 
			implements Viu<K, V> {

	private static final long serialVersionUID = 5965027698000727917L;

	public K getDéu() {
		return null;
	}
	public K setDéu() {
		return null;
	}
	public V getMareDeDéu() {
		return null;
	}

	public V setMareDeDéu(V mareDeDéu) {
		return null;
	}

	public Aliança() {
		
	}

}
