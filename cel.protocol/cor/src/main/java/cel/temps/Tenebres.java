package cel.temps;

import cel.Paritat;

/**
 * <tt>
 * <center>
 * <h3>Novena plaga: la tenebra</h3>
 * <sup>21</sup> El Senyor va dir a Moisès:<br/>
 * --Estén enlaire la mà i que caigui sobre Egipte una foscor tan espessa que fins i tot es pugui tocar.<br/>
 * <sup>22</sup> Moisès va estendre enlaire la mà i durant tres dies hi hagué en tot el país d'Egipte una tenebra tan espessa
 * <sup>23</sup> que no es veien els uns als altres. Durant tres dies, ningú no es pogué moure del lloc on era. Mentrestant, tots els israelites tenien llum als llocs on residien.<br/>
 * <sup>24</sup> El faraó va cridar Moisès i li digué:<br/>
 * --Aneu a adorar el Senyor. Us podeu endur també els vostres fills, però els ramats de vaques i d'ovelles han de quedar-se aquí.<br/>
 * <sup>25</sup> Moisès va replicar:<br/>
 * --¿Ens les donaràs tu, les víctimes per als sacrificis i els holocaustos que hem d'oferir al Senyor, el nostre Déu?
 * <sup>26</sup> Els nostres ramats també vindran amb nosaltres; aquí no hi quedarà ni un sol animal. Les víctimes per al culte del Senyor, el nostre Déu, les hem de prendre dels nostres ramats; i fins que serem allí no sabrem què li hem d'oferir.<br/>
 * <sup>27</sup> Però el Senyor va endurir el cor del faraó, que no volgué deixar-los sortir.
 * <sup>28</sup> El faraó digué a Moisès:<br/>
 * --Vés-te'n d'aquí i no t'atreveixis més a presentar-te davant meu. El dia que tornis, moriràs.<br/>
 * <sup>29</sup> Moisès li respongué:<br/>
 * --Passarà tal com has dit: no et tornaré a veure mai més.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Tenebres
	<K extends Vida<K,V>,V extends Vida<V,K>>
		extends Amor<K,V>
			implements Vida<K,V> {

	/**
	 * 9215082810166762734
	 */
	private static final long serialVersionUID = 9215082810166762734L;

	public Tenebres() {
		super();
	}
	public Tenebres(Paritat paritat) {
		super(paritat);
	}
	public Tenebres(Class<? extends V> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Tenebres(K pare) {
		super(pare);
	}
	public Tenebres(Class<? extends V> classeFill, K pare) {
		super(classeFill, pare);
	}
	public Tenebres(K déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Tenebres(Class<? extends V> classeFill, K déu, Paritat paritat) {
		super(classeFill, déu, paritat);
	}
	
	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public boolean téFill(V fill) {
		return obtenirFill().téPare(fill);
	}
	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public boolean alliberarFill(V fill) {
		return obtenirFill().alliberarPare(fill);
	}
	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public boolean afegirFill(V fill) {
		return obtenirFill().afegirPare(fill);
	}
	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public boolean téCadaFill(V fill) {
		return obtenirFill().téCadaPare(fill);
	}
	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public boolean afegirCadaFill(V fill) {
		return obtenirFill().afegirCadaPare(fill);
	}
	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public boolean alliberaCadaFill(V fill) {
		return obtenirFill().alliberarCadaPare(fill);
	}
	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public boolean retenirCadaFill(V fill) {
		return obtenirFill().retenirCadaPare(fill);
	}
	@Override
	public void run() {
		if((sócDéu() && !ésBuit()) || !sócFinal()) {
			obtenirFill().run();
		}
		super.run();
	}
}