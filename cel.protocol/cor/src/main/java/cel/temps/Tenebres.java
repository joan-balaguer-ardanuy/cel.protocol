package cel.temps;

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
	<K extends Viu<K,V>,V extends Viu<V,K>>
		extends Amor<K,V>
			implements Viu<K,V> {

	private static final long serialVersionUID = 9215082810166762734L;

	public Tenebres() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public V obtenirFutur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void establirFutur(V futur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V obtenirFill(long N) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contéFill() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alliberaFill(V fill) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long índexDeFill(V fill) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long darrerÍndexDeFill(V fill) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void alliberaFill(long N) {
		// TODO Auto-generated method stub
		
	}

}
