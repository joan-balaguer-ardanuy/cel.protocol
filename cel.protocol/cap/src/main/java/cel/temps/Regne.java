package cel.temps;

/**
 * <tt>
 * <center>
 * <h3>Litúrgia celestial: Les noces de l'Anyell</h3>
 * <sup>1</sup> Després d'això, vaig sentir al cel la veu forta d'una gran gentada que proclamava:<br/>
 * --Al·leluia! La salvació, la glòria i el poder són del nostre Déu.
 * <sup>2</sup> Les seves sentències són justes, no van mai errades. Ha condemnat la gran prostituta que corrompia la terra amb la seva prostitució, li ha demanat comptes de la sang dels seus servents, que ella havia vessat amb les seves mans.<br/>
 * <sup>3</sup> I proclamaven encara:<br/>
 * --Al·leluia! El fum del seu incendi pujarà pels segles dels segles.<br/>
 * <sup>4</sup> Aleshores els vint-i-quatre ancians amb els quatre vivents es van prosternar i adoraven Déu, que seu al tron, dient:<br/>
 * --Amén! Al·leluia!<br/>
 * <sup>5</sup> Després va sortir del tron una veu que exclamava:<br/>
 * --Lloeu el nostre Déu, tots els seus servents, tots els qui el venereu, petits i grans.<br/>
 * <sup>6</sup> Llavors vaig sentir la veu d'una gran gentada, que era com el bramul de les onades, com el retruny d'una tronada potent. I deien:<br/>
 * --Al·leluia! El Senyor nostre, el Déu de l'univers, ha instaurat el seu Regne.
 * <sup>7</sup> Alegrem-nos-en i celebrem-ho, cantem la seva glòria. Ha arribat l'hora de les noces de l'Anyell, i la seva esposa ja està engalanada.
 * <sup>8</sup> Li ha estat concedit de vestir-se de lli blanc i resplendent, que són les bones obres del poble sant.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 */
public interface Regne<K> extends QuiEra<K>, Iterable<K> {

	/**
	 * Obté el teu Déu corresponent a aquest {@link Regne}.
	 * @return el teu Déu corresponent a aquest {@link Regne}
	 */
	K obtenirDéu();

	/**
     * Estableix el teu Déu corresponent a aquest {@link Regne} amb el déu
     * especificat. (Escriu a través del {@link Regne}). El
     * comportament d'aquesta invocació no està definit si Déu ha estat
     * alliberada d'aquest {@link Regne}.
     *
     * @param déu el teu Déu per ser establert en aquest {@link Regne}
     * @return el teu Déu que era establert en aquest {@link Regne}
     */
	K establirDéu(K déu);
	
	/**
	 * Allibera aquest {@link Regne} de tota altra instància.
	 */
	void alliberar();
	
	/**
	 * Retorna <tt>cert</tt> si el {@link Regne} no té cap altra instància Pare,
	 * <tt>fals</tt> del contrari.
	 * @return <tt>cert</tt> si l {@link Regne} no té cap altra instància Pare,
	 * <tt>fals</tt> del contrari
	 */
	boolean ésBuit();
	
	/**
	 * Retorna <tt>cert</tt> si el Pare està en aquest {@link Regne}, <tt>fals</tt> si no està.
	 * @param pare el Pare a buscar
	 * @return <tt>cert</tt> si el Pare està en aquest {@link Regne}, <tt>fals</tt> si no està
	 */
	boolean téPare(K pare);
	
	/**
	 * <p>Afegeix el Pare especificat en aquest {@link Regne} si no està ja present
	 * Més formalment, afegeix el Pare especificat {@code pare} a aquest {@link Regne}
	 * si no té cap Pare com aquest, tal que {@code pare == p}.</p>
	 * 
	 * <p>Si aquest {@link Regne} ja té el Pare, la execució deixa el {@link Regne} no modificat
	 * i retorna {@code fals}.</p>
	 * 
	 * <p>L'estipulació de sobre no implica que els {@code regnes} hagin d'acceptar tots els
	 * {@code pares}; els {@code regnes} poden denegar d'afegir qualsevol Pare. Les implementacions del
	 * {@link Regne} individuals haurien de documentar qualsevol restricció en els
	 * {@code pares} que aquests poden tenir.</p>
	 * 
	 * @param pare el Pare per ser afegit en aquest {@link Regne}
	 * @return {@code cert} si aquest {@link Regne} no tenia l'especificat Pare
	 */
	boolean afegirPare(K pare);
	
	/**
	 * Allibera el Pare si és trobat dins aquest {@link Regne}. Més formalment,
	 * allibera un Pare tal que {@code pare == p}.
	 * @param pare el Pare a ser trobat i alliberat
	 * @return <tt>cert</tt> si l'operació s'ha realitzat amb èxit, <tt>fals</tt> del contrari.
	 */
	boolean alliberarPare(K pare);
	
	/**
	 * Retorna {@code cert} si aquest {@link Regne} té cada un dels {@code pares} de
	 * l'especificat Pare. Si l'especificat Pare és també un {@link Regne}, aquest
	 * mètode retorna {@code cert} si aquest és un <i>regne</i> dins aquest {@link Regne}.
	 * 
	 * @param pare el Pare per comprovar si es troba tingut en aquest {@link Regne}
	 * @return {@code cert} si aquest {@link Regne} té tots els {@code pares} de
	 * l'especificat Pare.
	 */
	boolean téCadaPare(K pare);
	
	/**
	 * Afegeix cada un dels {@code pares} en l'especificat Pare a aquest {@link Regne} si
	 * aquests no són ja presents. Si l'especificat Pare és també un {@link Regne}, el
	 * mètode {@code afegeixCadaPare} efectivament modifica aquest {@link Regne} tal que
	 * el seu valor és la <i>unió</i> dels dos {@code regnes}. El comportament de la seva
	 * operació no està definit si l'especificat {@code pare} és modificat mentre l'execució
	 * es troba en curs.
	 * 
	 * @param pare el Pare el qual estan tinguts els {@code pares} per ser afegits a
	 * aquest {@link Regne}
	 * @return {@code cert} si aquest {@link Regne} ha canviat com a resultat de la invocació
	 */
	boolean afegirCadaPare(K pare);
	
	/**
	 * Allibera d'aquest {@link Regne} tots els {@code pares} que són tinguts en
	 * l'especificat Pare. Si l'especificat Pare és també un {@link Regne}, aquesta
	 * operació efectivament modifica aquest {@link Regne} tal que el seu valor
	 * és l'<i>asimètrica diferència de {@link Regne}</i> dels dos {@code regnes}.
	 * 
	 * @param pare el Paré tenint tots els {@code pares} per ser alliberats d'aquest
	 * {@link Regne}
	 * @return {@code cert} si aquest {@link Regne} ha canviat com a resultat de la
	 * invocació
	 */
	boolean alliberarCadaPare(K pare);
	
	/**
	 * Reté només els {@code pares} en aquest {@link Regne} que són tinguts en
	 * l'especificat Pare. En altres paraules, allibera d'aquest {@link Regne} tots els
	 * seus {@code oares} que no són tinguts en l'especificat Pare. Si l'especificat
	 * Pare és també un {@link Regne}, aquesta operació efectivament modifica aquest
	 * {@link Regne} tal que el se valor és la <i>intersecció</i> dels dos {@code regnes}.
	 * 
	 * @param pare el Pare tenint els {@code pares} per ser retinguts en aquest {@link Regne}
	 * @return {@code cert} si aquest {@link Regne} ha canviat com a resultat de la invocació
	 */
	boolean retenirCadaPare(K pare);
}