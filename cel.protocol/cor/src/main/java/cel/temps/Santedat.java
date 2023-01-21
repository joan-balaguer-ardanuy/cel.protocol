package cel.temps;

/**
 * <tt>
 * <center>
 * <h3>Les conseqüències de la santedat de Déu</h3>
 * 1 El Senyor va parlar encara a Moisès. Li digué:<br/>
 * 2 --Comunica això a tota la comunitat dels israelites:<br/>
 * »Sigueu sants, perquè jo, el Senyor, el vostre Déu, sóc sant.<br/>
 * 3 »Que tothom respecti la seva mare i el seu pare.<br/>
 * »Guardeu el repòs dels meus dies festius. Jo sóc el Senyor, el vostre Déu.<br/>
 * 4 »No us decanteu cap als ídols, no us fabriqueu déus de fosa. Jo sóc el Senyor, el vostre Déu.<br/>
 * 5 »Quan oferiu al Senyor un sacrifici de comunió, feu-ho de manera que el Senyor es complagui en vosaltres. 6 Mengeu la carn el mateix dia del sacrifici i l'endemà, però el tercer dia cremeu tot el que en quedi. 7 Si algú en menjava el tercer dia, jo no m'hi complauria; aquesta carn és com si fos carronya. 8 El qui en mengés portaria el pes de la seva culpa, perquè profanaria una cosa consagrada a mi, el Senyor, i seria exclòs del poble d'Israel.<br/>
 * 9 »Quan segueu els sembrats, no arribeu fins a la partió del camp ni recolliu les espigolalles. 10 I en la verema, igualment: no esgotimeu la vinya ni recolliu els grans que han caigut. Deixeu-ho per als pobres i els immigrants. Jo sóc el Senyor, el vostre Déu.<br/>
 * 11 »No robeu. No mentiu ni us comporteu falsament amb algú del poble. 12 No jureu en fals pel meu nom. Seria profanar el nom del teu Déu. Jo sóc el Senyor.<br/>
 * 13 »No explotis el teu proïsme ni li prenguis allò que és seu. No retinguis fins l'endemà la paga del jornaler. 14 No insultis un sord ni facis la traveta a un cec. Pensa que el teu Déu ho veu tot. Jo sóc el Senyor.<br/>
 * 15 »En els judicis, no donis sentències injustes. No siguis parcial a favor dels pobres ni afalaguis els poderosos. Fes justícia a tothom. 16 No vagis a escampar calúmnies entre els teus parents. No et presentis com a testimoni buscant la mort del teu proïsme. Jo sóc el Senyor.<br/>
 * 17 »No covis odi contra el teu germà, però corregeix, si cal, el teu proïsme; així no et faràs responsable del seu pecat. 18 No siguis venjatiu ni guardis rancúnia contra ningú del teu poble. Estima els altres com a tu mateix. Jo sóc el Senyor.<br/>
 * 19 »Guardeu també aquestes lleis:<br/>
 * »No aparellis dos animals d'espècies diferents, no sembris el teu camp amb dues classes de llavor ni duguis vestits de roba teixida amb dues menes de fibra.<br/>
 * 20 »Si un home té relacions sexuals amb una esclava que és concubina d'un altre i que no ha estat ni rescatada ni alliberada, després d'investigar el cas haurà de pagar una indemnització. Però no seran condemnats a mort, ja que ella encara és esclava. 21 L'home oferirà a l'entrada de la tenda del trobament un moltó com a sacrifici de reparació. 22 El sacerdot, amb aquest sacrifici de reparació, farà el ritu d'expiació pel pecat que aquell home ha comès; i així obtindrà el perdó del seu pecat.<br/>
 * 23 »Quan entrareu a la terra promesa i plantareu arbres fruiters de tota mena, tingueu per profans els seus fruits durant tres anys; no en mengeu. 24 Tots els fruits que produiran el quart any, consagreu-los al Senyor amb cants de lloança. 25 A partir del cinquè any podreu menjar-ne els fruits. Si ho feu així tindreu millors collites. Jo sóc el Senyor, el vostre Déu.<br/>
 * 26 »No mengeu la carn damunt el lloc mateix on heu vessat la sang. No practiqueu les arts d'endevinar ni els encanteris. 27 No us retalleu tot al volt les vores de la cabellera ni us afaiteu els costats de la barba. 28 No us feu incisions en senyal de dol per un difunt ni us feu gravar cap mena de tatuatge. Jo sóc el Senyor.<br/>
 * 29 »No profanis la teva filla dedicant-la a la prostitució: el país acabaria prostituint-se i es cobriria d'infàmia.<br/>
 * 30 »Guardeu el repòs dels meus dies festius i reverencieu així el meu santuari. Jo sóc el Senyor.<br/>
 * 31 »No acudiu als nigromants ni consulteu els endevins, perquè quedaríeu impurs. Jo sóc el Senyor, el vostre Déu.<br/>
 * 32 »Aixeca't al davant de l'ancià i honora els seus cabells blancs; així reverenciaràs el teu Déu. Jo sóc el Senyor.<br/>
 * 33 »Quan un immigrant vingui a instal·lar-se al costat vostre, en el vostre país, no l'exploteu. 34 Al contrari, considereu-lo com un nadiu, com un de vosaltres. Estima'l com a tu mateix, que també vosaltres vau ser immigrants en el país d'Egipte. Jo sóc el Senyor, el vostre Déu.<br/>
 * 35 »No falsegeu els judicis, ni les mides, ni els pesos o les mesures. 36 Tingueu balances exactes, pesos exactes, mesures exactes. Jo sóc el Senyor, el vostre Déu, que us he fet sortir del país d'Egipte.<br/>
 * 37 »Observeu tots els meus decrets i les meves decisions. Jo sóc el Senyor.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Santedat
	<K extends Viu<K,V>,V extends Viu<V,K>> 
		extends Aliança<K,V> 
			implements Viu<K,V> {

	private static final long serialVersionUID = 5415577903850774847L;

	@Override
	public Class<? extends K> getClassePare() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setClassePare(Class<? extends K> classe) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Class<? extends V> getClasseFill() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setClasseFill(Class<? extends V> classe) {
		// TODO Auto-generated method stub
		
	}
	
	public Santedat() {
		// TODO Auto-generated constructor stub
	}

}
