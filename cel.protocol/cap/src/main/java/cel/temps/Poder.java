package cel.temps;

import cel.EsperitSant;

/**
 * <tt>
 * <center>
 * <h3>Abraham intercedeix per Sodoma</h3>
 * <sup>16</sup> Aquells homes es van aixecar i van dirigir la mirada cap a Sodoma. Abraham els acompanyava per acomiadar-los.
 * <sup>17</sup> El Senyor es deia: «Per què haig d'amagar a Abraham el que faré?
 * <sup>18</sup> Abraham s'ha de convertir en un poble gran i poderós, tant, que tots el pobles de la terra es valdran del seu nom per a beneir-se.
 * <sup>19</sup> Jo m'he fet meu Abraham perquè mani als seus fills i als seus descendents que no s'apartin dels meus camins i siguin rectes i justos; així jo compliré a favor d'ell tot el que li he promès.»<br/>
 * <sup>20</sup> Llavors el Senyor digué a Abraham:<br/>
 * --El clam que puja contra Sodoma i Gomorra és molt fort. És greu, el seu pecat.
 * <sup>21</sup> Hi baixaré i veuré si les seves obres corresponen al clam que m'arriba. Sigui el que sigui, ho sabré.<br/>
 * <sup>22</sup> Els dos homes que acompanyaven el Senyor se'n van anar cap a Sodoma, però Abraham es quedà encara davant d'ell.
 * <sup>23</sup> Llavors Abraham s'acostà i digué:<br/>
 * --¿De debò que faràs desaparèixer tant el just com el culpable?
 * <sup>24</sup> Suposem que a la ciutat hi ha cinquanta justos. ¿De debò que els faràs desaparèixer? ¿No perdonaràs aquest lloc per amor d'aquells cinquanta?
 * <sup>25</sup> Mai de la vida no faràs una cosa així! ¿Exterminaràs el just amb el culpable? ¿Que el just i el culpable siguin tractats igual? Mai de la vida! ¿El qui judica tota la terra, no farà justícia?<br/>
 * <sup>26</sup> El Senyor va respondre:<br/>
 * --Si trobava dintre de Sodoma cinquanta justos, per amor d'ells perdonaria tota la ciutat.<br/>
 * <sup>27</sup> Abraham va insistir:<br/>
 * --Goso parlar al Senyor, jo que sóc només pols i cendra.
 * <sup>28</sup> Suposem que, per a arribar a cinquanta justos, en faltessin cinc. ¿Per aquests cinc, destruiries tota la ciutat?<br/>
 * El Senyor li va dir:<br/>
 * --No la destruiria si hi trobava quaranta-cinc justos.<br/>
 * <sup>29</sup> Abraham va tornar a parlar:<br/>
 * --Suposem que només n'hi hagués quaranta.<br/>
 * El Senyor va respondre:<br/>
 * --No ho faria, per consideració a aquests quaranta.<br/>
 * <sup>30</sup> Abraham va continuar:<br/>
 * --Que el meu Senyor no s'enfadi si insisteixo. Suposem que només n'hi hagués trenta.<br/>
 * El Senyor respongué:<br/>
 * --No ho faria si n'hi trobava trenta.<br/>
 * <sup>31</sup> Abraham va insistir:<br/>
 * --Goso parlar encara al meu Senyor. Suposem que només n'hi hagués vint.<br/>
 * El Senyor va respondre:<br/>
 * --No la destruiria, per consideració a aquests vint.<br/>
 * <sup>32</sup> Abraham insistí novament:<br/>
 * --Que el meu Senyor no s'enfadi si insisteixo per darrera vegada. Suposem que només n'hi hagués deu.<br/>
 * El Senyor li respongué:<br/>
 * --No la destruiria, per consideració a aquests deu.<br/>
 * <sup>33</sup> Quan acabà de parlar amb Abraham, el Senyor se n'anà, i Abraham se'n tornà al lloc on vivia.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <V> és el VALOR
 */
public interface Poder<V> extends QuiVe<V>, Comparable<V> {

	/**
	 * Obté la teva Mare de Déu corresponent a aquest {@link Poder}.
	 * @return la teva Mare de Déu corresponent a aquest {@link Poder}
	 */
	V obtenirMareDeDéu();

	/**
     * Estableix la teva Mare de Déu corresponent a aquest {@link Poder} amb la deessa
     * especificada. (Escriu a través del {@link Poder}). El
     * comportament d'aquesta invocació no està definit si Mare de Déu ha estat
     * alliberada d'aquest {@link Poder}.
     *
     * @param mareDeDéu la nova Mare de Déu per ser establerta en aquest {@link Poder}
     * @return la nova Mare de Déu que serà establerta en aquest {@link Poder}
     */
	V establirMareDeDéu(V mareDeDéu);
	
	/**
	 * Allibera aquest {@link EsperitSant} de tota altra instància.
	 */
	void alliberar();
	
	/**
	 * Retorna <tt>cert</tt> si l'{@link EsperitSant} no té cap altra instància Pare,
	 * <tt>fals</tt> del contrari.
	 * @return <tt>cert</tt> si l'{@link EsperitSant} no té cap altra instància Pare,
	 * <tt>fals</tt> del contrari
	 */
	boolean ésBuit();
	
	/**
	 * Retorna <tt>cert</tt> si el Fill està en aquest {@link Poder}, <tt>fals</tt> si no està.
	 * @param fill el Fill a buscar
	 * @return <tt>cert</tt> si el Fill està en aquest {@link Poder}, <tt>fals</tt> si no està
	 */
	boolean téFill(V fill);
	
	/**
	 * <p>Afegeix el Fill especificat en aquest {@link Poder} si no està ja present
	 * Més formalment, afegeix el Fill especificat {@code fill} a aquest {@link Poder}
	 * si no té cap Fill com aquest, tal que {@code fill == f}.</p>
	 * 
	 * <p>Si aquest {@link Poder} ja té el Fill, la execució deixa el {@link Poder} no modificat
	 * i retorna {@code fals}.</p>
	 * 
	 * <p>L'estipulació de sobre no implica que els poders hagin d'acceptar tots els
	 * {@code fills}; els {@code poders} poden denegar d'afegir qualsevol Fill. Les implementacions del
	 * {@link Poder} individuals haurien de documentar qualsevol restricció en els
	 * {@code fills} que aquests poden contenir.</p>
	 * 
	 * @param fill el Fill per ser afegit en aquest {@link Poder}
	 * @return {@code cert} si aquest {@link Poder} no tenia l'especificat Fill
	 */
	boolean afegirFill(V fill);
	
	/**
	 * Allibera el Fill si és trobat dins aquest {@link Poder}. Més formalment,
	 * allibera un Fill tal que {@code fill == f}.
	 * @param fill el Fill a ser trobat i alliberat
	 * @return <tt>cert</tt> si l'operació s'ha realitzat amb èxit, <tt>fals</tt> del contrari.
	 */
	boolean alliberarFill(V fill);
	
	/**
	 * Retorna {@code cert} si aquest {@link Poder} té cada un dels {@code fills} de
	 * l'especificat Fill. Si l'especificat Fill és també un {@link Poder}, aquest
	 * mètode retorna {@code cert} si aquest és un <i>poder</i> dins aquest {@link Poder}.
	 * 
	 * @param fill el Fill per comprovar si es troba contigut en aquest {@link Poder}
	 * @return {@code cert} si aquest {@link Poder} conté tots els {@code fills} de
	 * l'especificat Fill.
	 */
	boolean téCadaFill(V fill);
	
	/**
	 * Afegeix cada un dels {@code fills} en l'especificat Fill a aquest {@link Poder} si
	 * aquests no són ja presents. Si l'especificat Fill és també un {@link Poder}, el
	 * mètode {@code afegeixCadaFill} efectivament modifica aquest {@link Poder} tal que
	 * el seu valor és la <i>unió</i> dels dos {@code poders}. El comportament de la seva
	 * operació no està definit si l'especificat {@code fill} és modificat mentre l'execució
	 * es troba en curs.
	 * 
	 * @param fill el Fill el qual estan tinguts els {@code fills} per ser afegits a
	 * aquest {@link Poder}
	 * @return {@code cert} si aquest {@link Poder} ha canviat com a resultat de la invocació
	 */
	boolean afegirCadaFill(V fill);
	
	/**
	 * Allibera d'aquest {@link Poder} tots els {@code fills} que són continguts en
	 * l'especificat Fill. Si l'especificat Fill és també un {@link Poder}, aquesta
	 * operació efectivament modifica aquest {@link Poder} tal que el seu valor
	 * és l'<i>asimètrica diferència de {@link Poder}</i> dels dos {@code poders}.
	 * 
	 * @param fill el Fill tenint tots els {@code fills} per ser alliberats d'aquest
	 * {@link Poder}
	 * @return {@code cert} si aquest {@link Poder} ha canviat com a resultat de la
	 * invocació
	 */
	boolean alliberaCadaFill(V fill);
	
	/**
	 * Reté només els {@code fills} en aquest {@link Poder} que són tinguts en
	 * l'especificat Fill. En altres paraules, allibera d'aquest {@link Poder} tots els
	 * seus {@code oares} que no són tinguts en l'especificat Fill. Si l'especificat
	 * Fill és també un {@link Poder}, aquesta operació efectivament modifica aquest
	 * {@link Poder} tal que el se valor és la <i>intersecció</i> dels dos {@code poders}.
	 * 
	 * @param fill el Fill tenint els {@code fills} per ser retinguts en aquest {@link Poder}
	 * @return {@code cert} si aquest {@link Poder} ha canviat com a resultat de la invocació
	 */
	boolean retenirCadaFill(V fill);
}