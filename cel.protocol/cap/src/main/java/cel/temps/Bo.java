package cel.temps;

import cel.EsperitSant;

/**
 * <tt>
 * <center>
 * <h3>El jove ric</h3>
 * <h5>(Mc 10,17-30; Lc 18,18-30)</h5>
 * <sup>16</sup> Un jove anà a trobar Jesús i va preguntar-li:<br/>
 * --Mestre, quina cosa bona haig de fer per a obtenir la vida eterna?<br/>
 * <sup>17</sup> Jesús li digué:<br/>
 * --Per què em preguntes sobre el que és bo? Un de sol és bo. Si vols entrar a la vida, guarda els manaments.<br/>
 * <sup>18</sup> Ell li preguntà:<br/>
 * --Quins?<br/>
 * Jesús li respongué:<br/>
 * -- No matis, no cometis adulteri, no robis, no acusis ningú falsament,
 * <sup>19</sup> honra el pare i la mare, i estima els altres com a tu mateix.<br/>
 * <sup>20</sup> El jove li va dir:<br/>
 * --Tot això ja ho he complert. Què em falta encara?<br/>
 * <sup>21</sup> Jesús li respongué:<br/>
 * --Si vols ser perfecte, vés, ven tot el que tens i dóna-ho als pobres, i tindràs un tresor al cel. Després vine i segueix-me.<br/>
 * <sup>22</sup> Quan aquell jove va sentir aquestes paraules, se n'anà tot trist, perquè tenia molts béns.<br/>
 * <sup>23</sup> Llavors Jesús digué als seus deixebles:<br/>
 * --Us asseguro que un ric difícilment entrarà al Regne del cel.
 * <sup>24</sup> Més encara: és més fàcil que un camell passi pel forat d'una agulla que no pas que un ric entri al Regne de Déu.<br/>
 * <sup>25</sup> Els deixebles, en sentir aquestes paraules, quedaren molt desconcertats, i deien:<br/>
 * --Si és així, qui pot salvar-se?<br/>
 * <sup>26</sup> Jesús se'ls mirà i els digué:<br/>
 * --Als homes els és impossible, però Déu ho pot tot.<br/>
 * <sup>27</sup> Llavors Pere li va dir:<br/>
 * --Mira, nosaltres ho hem deixat tot i t'hem seguit. Què rebrem, doncs?<br/>
 * <sup>28</sup> Jesús els digué:<br/>
 * --Us ho asseguro: quan neixi el món nou i el Fill de l'home s'assegui en el seu tron gloriós, també vosaltres, els qui m'heu seguit, us asseureu en dotze trons i jutjareu les dotze tribus d'Israel.
 * <sup>29</sup> I tothom qui pel meu nom hagi deixat cases, germans, germanes, pare, mare, fills o camps, en rebrà cent vegades més i posseirà la vida eterna.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 */
public interface Bo<K> extends QuiEra<K> {

	/**
	 * Obté el teu Déu corresponent a aquesta instància.
	 * @return el teu Déu corresponent a aquesta instància
	 */
	K obtenirDéu();

	/**
     * Estableix el teu Déu corresponent a aquesta instància amb el déu
     * especificat. (Escriu a través de la instància). El
     * comportament d'aquesta invocació no està definit si la instància ha estat
     * alliberada d'aquesta instància.
     *
     * @param déu el teu Déu per ser establert en aquesta instància
     */
	void establirDéu(K déu);

	/**
	 * Obté el passat corresponent a aquesta instància.
	 * @return el passat corresponent a aquesta instància
	 */
	K obtenirPassat();

	/**
     * Estableix el passat corresponent a aquesta instància amb el passat
     * especificat. (Escriu a través de la instància). El
     * comportament d'aquesta invocació no està definit si la instància ha estat
     * alliberada d'aquesta instància.
     *
     * @param passat el nou passat per ser establert en aquesta instància
     */
	void establirPassat(K passat);
	
	/**
	 * Obté la classe Pare corresponent a aquesta instància.
	 * @return la classe Pare corresponent a aquesta instància
	 */
	Class<? extends K> obtenirClassePare();
	
	/**
     * Estableix la classe Pare corresponent a aquesta instància amb la classe Pare
     * especificada. (Escriu a través de la instància). El
     * comportament d'aquesta invocació no està definit si la instància ha estat
     * alliberada d'aquesta instància.
     *
     * @param classe la nova classe Pare per ser establerta en aquesta instància
     */
	void establirClassePare(Class<? extends K> classe);
	
	/**
	 * Obté el Pare de la posició N.
	 * @param N la posició en la qual es troba la instància
	 * @return la instància de la posició N
	 */
	K obtenirPare(long N);
	
	/**
	 * Retorna <tt>cert</tt> si el Pare està en aquesta instància, <tt>fals</tt> si no està.
	 * @param pare el Pare a buscar
	 * @return <tt>cert</tt> si el Pare està en aquesta instància, <tt>fals</tt> si no està
	 */
	boolean contéPare(K pare);
	
	/**
	 * Allibera el Pare si és trobat dins aquesta instància.
	 * @param pare el Pare a ser trobat i alliberat
	 * @return <tt>cert</tt> si l'operació s'ha realitzat amb èxit, <tt>fals</tt> del contrari.
	 */
	boolean alliberaPare(K pare);
	
	/**
	 * Obté la posició de la primera aparició en la qual es troba el Pare respecte aquesta instància.
	 * @param pare el Pare a obtenir la posició
	 * @return la posició en el qual es troba el Pare respecte aquesta instància.
	 */
	long índexDePare(K pare);
	
	/**
	 * Obté la posició de la darrera aparició en la qual es troba el Pare respecte aquesta instància.
	 * @param pare el Pare a obtenir la posició
	 * @return la posició en el qual es troba el Pare respecte aquesta instància.
	 */
	long darrerÍndexDePare(K pare);
	
	/**
	 * Allibera el Pare que es troba en la posició N.
	 * @param N la posició en la qual s'ha d'alliberar el Pare
	 */
	void alliberaPare(long N);
}