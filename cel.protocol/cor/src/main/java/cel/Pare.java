package cel;

/**
 * <tt>
 * <center>
 * <h3>Confiança i neguit</h3>
 * <h5>(Lc 12,22-31)</h5>
 * <sup>25</sup> »Per això us dic: No us preocupeu per la vostra vida, pensant què menjareu o què beureu, ni pel vostre cos, pensant com us vestireu. ¿No val més la vida que el menjar, i el cos més que el vestit?
 * <sup>26</sup> Mireu els ocells del cel: no sembren, ni seguen, ni recullen en graners, i el vostre Pare celestial els alimenta. ¿No valeu més vosaltres que no pas ells?
 * <sup>27</sup> ¿Qui de vosaltres, per més que s'hi esforci, pot allargar d'un sol instant la seva vida?
 * <sup>28</sup> I del vestit, per què us en preocupeu? Fixeu-vos com creixen les flors del camp: no treballen ni filen,
 * <sup>29</sup> però us asseguro que ni Salomó, amb tota la seva magnificència, no anava vestit com cap d'elles.
 * <sup>30</sup> I si l'herba del camp, que avui és i demà la tiren al foc, Déu la vesteix així, ¿no farà més per vosaltres, gent de poca fe?
 * <sup>31</sup> Per tant, no us preocupeu, pensant què menjareu, o què beureu, o com us vestireu.
 * <sup>32</sup> Tot això, els pagans ho busquen amb neguit, però el vostre Pare celestial ja sap prou que en teniu necessitat.
 * <sup>33</sup> Vosaltres, busqueu primer el Regne de Déu i fer el que ell vol, i tot això us ho donarà de més a més.
 * <sup>34</sup> No us preocupeu, doncs, pel demà, que el demà ja s'ocuparà d'ell mateix. Cada dia en té prou amb els seus maldecaps.<br/>
 * </center>
 * </tt>
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Pare
	<K extends EsperitSant<K,V>,V extends EsperitSant<V,K>> 
		extends Déu
			implements EsperitSant<K,V> {

	private static final long serialVersionUID = 8831092807347333251L;

	K pare;
	V fill;
	
	public K obtenirPare() {
		return pare;
	}
	public K establirPare(K pare) {
		K antic = this.pare;
		this.pare = pare;
		return antic;
	}
	public V obtenirFill() {
		return fill;
	}
	public V establirFill(V fill) {
		V nou = this.fill;
		this.fill = fill;
		return nou;
	}
	
	public Pare() {
		super();
	}
	public Pare(Paritat paritat) {
		super(paritat);
	}
	@SuppressWarnings("unchecked")
	public Pare(Paritat paritat, V fill) {
		super(paritat);
		establirPare((K) this);
		establirFill(fill);
	}
	public Pare(K pare) {
		super(pare.obtenirParitat());
		establirPare(pare);
		establirFill(pare.obtenirFill());
	}
	public Pare(K pare, V fill) {
		super(pare.obtenirParitat());
		establirPare(pare);
		establirFill(fill);
	}
	
	@Override
	public abstract Object clone();
}