package cel.temps;

import cel.Corona;

/**
 * <tt>
 * <center>
 * <h3>Els deu manaments</h3>
 * <h5>(Dt 5,6-21)</h5> 
 * <sup>1</sup> Déu va donar al poble d'Israel aquests manaments:<br/>
 * <sup>2</sup> --Jo sóc el Senyor, el teu Déu, que t'he fet sortir del país d'Egipte, la terra on eres esclau.<br/>
 * <sup>3</sup> »No tinguis cap altre déu fora de mi.<br/>
 * <sup>4</sup> »No et fabriquis ídols; no et facis cap imatge del que hi ha dalt al cel, aquí baix a la terra o en les aigües d'aquí baix.
 * <sup>5</sup> No els adoris ni els donis culte, perquè jo, el Senyor, el teu Déu, sóc el Déu-gelós: demano comptes als fills de les culpes dels pares fins a la tercera i la quarta generació dels qui no m'estimen.
 * <sup>6</sup> Però, per als qui m'estimen i guarden els meus preceptes, mantinc el meu amor durant un miler de generacions.<br/>
 * <sup>7</sup> »No juris en fals pel nom del Senyor, el teu Déu, perquè jo, el Senyor, no tinc per innocent el qui jura en fals pel meu nom.<br/>
 * <sup>8</sup> »Recorda't de consagrar-me el repòs del dissabte.
 * <sup>9</sup> Tens sis dies per a treballar i fer totes les feines que calgui,
 * <sup>10</sup> però el dia setè és el dia de repòs, dedicat al Senyor, el teu Déu. No facis cap treball ni tu, ni el teu fill, ni la teva filla, ni el teu esclau, ni la teva esclava, ni cap dels teus animals, ni l'immigrant que resideix a la teva ciutat.
 * <sup>11</sup> Perquè en sis dies el Senyor va fer el cel, la terra, el mar i tot el que s'hi mou, però el dia setè va reposar: per això el Senyor ha beneït el dissabte i l'ha consagrat.<br/>
 * <sup>12</sup> »Honra el pare i la mare. Així tindràs llarga vida en el país que et dóna el Senyor, el teu Déu.<br/>
 * <sup>13</sup> »No matis.<br/>
 * <sup>14</sup> »No cometis adulteri.<br/>
 * <sup>15</sup> »No robis.<br/>
 * <sup>16</sup> »No acusis ningú falsament.<br/>
 * <sup>17</sup> »No desitgis la casa d'un altre. No desitgis la seva dona, ni el seu esclau, ni la seva esclava, ni el seu bou, ni el seu ase, ni res del que li pertany.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Aliança
	<K extends Viu<K,V>,V extends Viu<V,K>> 
		extends Corona<K, V> 
			implements Viu<K, V> {

	private static final long serialVersionUID = 5965027698000727917L;

	public K obtenirDéu() {
		return null;
	}
	public void establirDéu() {
		
	}
	public V obtenirMareDeDéu() {
		return null;
	}

	public void establirMareDeDéu(V mareDeDéu) {
		
	}

	public Aliança() {
		
	}

}
