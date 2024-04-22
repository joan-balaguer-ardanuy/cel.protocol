package cel;

/**
 * <tt>
 * <center>
 * <h3>L'Anticrist</h3>
 * <sup>18</sup> Fills meus, som a l'hora darrera. Havíeu sentit a dir que arribaria l'Anticrist; doncs bé, ara han aparegut molts anticrists. Per això sabem que som a l'hora darrera.
 * <sup>19</sup> Han sortit d'entre nosaltres, però de fet no són dels nostres. Si ho haguessin estat, s'haurien quedat entre nosaltres. Però calia que es veiés que cap d'ells no és dels nostres.<br/>
 * <sup>20</sup> Vosaltres, en canvi, heu estat ungits amb l'Esperit que heu rebut del qui és sant i tots teniu el coneixement.
 * <sup>21</sup> No us escric per dir-vos que desconeixeu la veritat, sinó per dir-vos que la coneixeu i que cap mentida no prové de la veritat.<br/>
 * <sup>22</sup> Qui és, doncs, el mentider? ¿No és el qui nega que Jesús sigui el Messies? Aquest és l'Anticrist, que nega tant el Pare com el Fill.
 * <sup>23</sup> Tothom qui nega el Fill no té tampoc el Pare; tothom qui confessa el Fill té igualment el Pare.<br/>
 * <sup>24</sup> Però vosaltres heu de mantenir allò que heu sentit des del principi. Si manteniu allò que heu sentit des del principi, també vosaltres us mantindreu tant en el Fill com en el Pare.
 * <sup>25</sup> I aquesta és la promesa que ell ens ha fet: la vida eterna.
 * <sup>26</sup> Us escric tot això a propòsit dels qui us volen enganyar.<br/>
 * <sup>27</sup> Quant a vosaltres, sé que manteniu la unció de l'Esperit que heu rebut del Fill i no necessiteu que ningú us instrueixi. La unció que ve del Fill us ensenya totes les coses, diu la veritat i no menteix. Per tant, d'acord amb l'ensenyament que heu rebut, manteniu-vos en el Fill. <br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Fill
	<K extends EsperitSant<K,V>,V extends EsperitSant<V,K>>
		extends Pare<K,V> 
			implements EsperitSant<K,V> {

	private static final long serialVersionUID = 3538974726700165148L;

	@Override
	public K obtenirPassat() {
		return obtenirFill().obtenirFill();
	}
	@Override
	public K establirPassat(K passat) {
		return obtenirFill().establirFill(passat);
	}
	@Override
	public V obtenirFutur() {
		return obtenirFill().obtenirPassat();
	}
	@Override
	public V establirFutur(V futur) {
		return obtenirFill().establirPassat(futur);
	}
	
	public Fill() {
		super();
	}
	public Fill(Paritat paritat) {
		super(paritat);
	}
	public Fill(Paritat paritat, V fill) {
		super(paritat, fill);
	}
	public Fill(K pare) {
		super(pare);
	}
	@SuppressWarnings("unchecked")
	public Fill(K pare, V fill) {
		super(pare, fill);
		pare.obtenirFill().establirFill((K) this);
	}
	@Override
	public void run() {
		execute(obtenirFill());
		super.run();
	}
}