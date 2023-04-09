package cel.temps;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import cel.Anyell;
import cel.EsperitSant;

/**
 * <tt>
 * <center>
 * <h3>Els saduceus i la resurrecció</h3>
 * <h5>(Mt 22,23-33; Lc 20,27-38)</h5>
 * <sup>18</sup> Després uns saduceus l'anaren a trobar. Els saduceus neguen que hi hagi resurrecció; per això li van plantejar aquesta dificultat:<br/>
 * <sup>19</sup> --Mestre, Moisès ens va prescriure que, si un home mor i deixa muller, però no ha tingut fills, el seu germà es casi amb la viuda per donar descendència al germà difunt.
 * <sup>20</sup> Doncs bé, hi havia set germans. El primer es va casar, i va morir sense tenir descendència.
 * <sup>21</sup> El segon es va casar amb la dona del difunt, i morí sense tenir-ne descendència. Igualment el tercer.
 * <sup>22</sup> Cap dels set no va tenir descendència. Després de tots va morir també la dona.
 * <sup>23</sup> Per tant, quan arribi la resurrecció i tots ells ressuscitin, de quin dels set serà muller, si tots set s'hi havien casat?<br/>
 * <sup>24</sup> Jesús els respongué:<br/>
 * --Aneu equivocats precisament perquè desconeixeu les Escriptures i el poder de Déu.
 * <sup>25</sup> Quan tots ells ressuscitin d'entre els morts, ja no prendran muller ni marit, sinó que seran com els àngels del cel.<br/>
 * <sup>26</sup> »I sobre el fet que els morts ressusciten, ¿no heu llegit en el llibre de Moisès, en el passatge de la Bardissa, com Déu li va dir: Jo sóc el Déu d'Abraham, el Déu d'Isaac i el Déu de Jacob?
 * <sup>27</sup> Ell no és Déu de morts, sinó de vius. Aneu molt equivocats! <br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public interface Vida<K,V> extends Regne<K>, Poder<V>, EsperitSant<K,V> {

	/**
	 * Rota o revoluciona aquesta instància.
	 */
	void volta();
    
	boolean sócDéu();
	boolean sócPrincipi();
	boolean sócFinal();
	
	/**
	 * Recorre el Fill heretat amb el Pare dins aquesta instància.
	 * 
	 * @param pare el Pare amb el qual l'heretat Fill ha de ser associat.
	 * @param fill el Fill per ser mapat amb el Pare heretat
	 */
	void recórrerFill(K pare, V fill);
    
	/**
	 * Recorre el Pare heretat amb el Fill dins aquesta instància.
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre>
	 * <tt>
	 * retorna obtenirFill().recórrerFill(pare, fill);
	 * </tt>
	 * </pre>
	 * 
	 * @param fill el Fill amb el qual l'heretat Pare ha de ser associat.
	 * @param pare el Pare per ser mapat amb el Fill heretat
	 */
	void recórrerPare(V fill, K pare);
    
	/**
	 * Concorre el Fill heretat amb el Pare dins aquesta instància.
	 * 
	 * @param pare el Pare amb el qual l'heretat Fill ha de ser associat.
	 * @param fill el Fill per ser mapat amb el Pare heretat
	 */
	void concórrerFill(K pare, V fill);
    
	/**
	 * Concorre el Pare heretat amb el Fill dins aquesta instància.
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre>
	 * <tt>
	 * retorna obtenirFill().concórrerFill(pare, fill);
	 * </tt>
	 * </pre>
	 * 
	 * @param fill el Fill amb el qual l'heretat Pare ha de ser associat.
	 * @param pare el Pare per ser mapat amb el Fill heretat
	 */
	void concórrerPare(V fill, K pare);

	/**
	 * Permuta l'heretat Fill amb el Pare dins aquesta instància.
	 * 
	 * @param pare el Pare amb el qual l'heretat Fill ha de ser permutat
	 * @param fill el Fill per ser permutat amb l'heretat Pare
	 */
	void permutarFill(K pare, V fill);

	/**
	 * Permuta l'heretat Pare amb el Fill dins aquesta instància.
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre>
	 * <tt>
	 * retorna obtenirFill().permutarFill(pare, fill);
	 * </tt>
	 * </pre>
	 * 
	 * @param fill el Fill amb el qual l'heretat Pare ha de ser permutat
	 * @param pare el Pare per ser permutat amb l'heretat Fill
	 */
	void permutarPare(V fill, K pare);
    
	/**
	 * Sotmet el Fill heretat amb el Pare dins aquesta instància.
	 * 
	 * @param pare el Pare amb el qual l'heretat Fill ha de ser associat.
	 * @param fill el Fill per ser mapat amb el Pare heretat
	 */
	void sotmetreFill(K pare, V fill);
    
	/**
	 * Sotmet el Pare heretat amb el Fill dins aquesta instància.
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre>
	 * <tt>
	 * retorna obtenirFill().sotmetreFill(pare, fill);
	 * </tt>
	 * </pre>
	 * 
	 * @param fill el Fill amb el qual l'heretat Pare ha de ser associat.
	 * @param pare el Pare per ser mapat amb el Fill heretat
	 */
	void sotmetrePare(V fill, K pare);
	
	/**
	 * Obté el Fill el qual l'heretat Pare és mapat.
	 *
	 * @param pare el Pare el qual el Fill mapat ha de ser obtingut
	 * @return el Fill el qual l'heretat Pare és associat
	 */
	V obtenirFill(K pare);
	
	/**
	 * Obté el Pare el qual l'heretat Fill és mapat.
	 * 
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre>
	 * <tt>
	 * retorna obtenirFill().obtenirFill(pare, fill);
	 * </tt>
	 * </pre>
	 *
	 * @param fill el Fill el qual el Pare mapat ha de ser obtingut
	 * @param parePerDefecte el Pare per defecte del Fill
	 * @return el Fill el qual l'heretat Pare és associat, o el
	 * {@code fillPerDefecte} si aquesta instància no conté cap Fill associat al Pare
	 */
	K obtenirPare(V fill);
	
	/**
	 * Obté el Fill el qual l'heretat Pare és mapat, o
	 * {@code fillPerDefecte} si aquesta instància no conté cap Fill associat al Pare.
	 *
	 * @param pare el Pare el qual el Fill mapat ha de ser obtingut
	 * @param fillPerDefecte el Fill per defecte del Pare
	 * @return el Fill el qual l'heretat Pare és associat, o el
	 * {@code fillPerDefecte} si aquesta instància no conté cap Fill associat al Pare
	 */
	V obtenirFillPerDefecte(K pare, V fillPerDefecte);
	
	/**
	 * Obté el Pare el qual l'heretat Fill és mapat, o
	 * {@code parePerDefecte} si aquesta instància no conté cap Pare associat al Fill.
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre>
	 * <tt>
	 * retorna obtenirFill().obtenirFillPerDefecte(pare, fill);
	 * </tt>
	 * </pre>
	 *
	 * @param fill el Fill el qual el Pare mapat ha de ser obtingut
	 * @param parePerDefecte el Pare per defecte del Fill
	 * @return el Fill el qual l'heretat Pare és associat, o el
	 * {@code fillPerDefecte} si aquesta instància no conté cap Fill associat al Pare
	 */
	K obtenirParePerDefecte(V fill, K parePerDefecte);

	/**
	 * Mapa l'heretat Fill amb el Pare en aquesta instància. 
	 * Si la instància prèviament contenia una instància pel
	 * Pare, l'antic Fill és reemplaçat pel Fill.
	 *
	 * @param pare el Pare amb el qual el Fill ha de ser associat
	 * @param fill el Fill per ser mapat amb l'heretat Pare
	 * @return el Fill previ associat amb el Pare, o <tt>nul</tt>
	 * si no hi ha instància associada al Pare.
	 * @since 1
	 */
	V establirFill(K pare, V fill);

	/**
	 * Mapa l'heretat Pare amb el Fill en aquesta instància. 
	 * Si la instància prèviament contenia una instància pel
	 * Fill, l'antic Pare és reemplaçat pel Pare.
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre>
	 * <tt>
	 * retorna obtenirFill().establirFill(pare, fill);
	 * </tt>
	 * </pre>
	 *
	 * @param fill el Fill amb el qual el Pare ha de ser associat
	 * @param pare el Pare per ser mapat amb l'heretat Fill
	 * @return el Pare previ associat amb el Fill, o <tt>nul</tt>
	 * si no hi ha instància associada al Fill.
	 * @since 1
	 */
	K establirPare(V fill, K pare);
	
	/**
	 * Si l'heretat Pare no està ja mapat amb un Fill l'associa amb el Fill establert i retorna
	 * <tt>nul</tt>, del contrari retorna el Fill actual.
	 *
	 * <pre>
	 * <tt>
	 * V fill = instància.obtenirFill(pare);
	 * if (fill == nul)
	 *     fill = instància.establirFill(pare, fill);
	 *	
	 * retorna fill;
	 * </tt>
	 * </pre>
	 * 
	 * @param pare el Pare amb el qual l'heretat Fill ha de ser associat
	 * @param fill el Fill per ser mapat amb l'heretat Pare
	 * @return el Fill previ associat amb l'heretat Pare, o
	 * <tt>nul</tt> si no hi havia instància pel Pare.
	 */
	V establirFillSiAbsent(K pare, V fill);
	
	/**
	 * Si l'heretat Fill no està ja mapat amb un Pare l'associa amb el Pare establert i retorna
	 * <tt>nul</tt>, del contrari retorna el Pare actual.
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre>
	 * <tt>
	 * retorna obtenirFill().establirFillSiAbsent(pare, fill);
	 * </tt>
	 * </pre>
	 * 
	 * @param fill el Fill amb el qual l'heretat Pare ha de ser associat
	 * @param pare el Pare per ser mapat amb l'heretat Fill
	 * @return el Pare previ associat amb l'heretat Fill, o
	 * <tt>nul</tt> si no hi havia instància pel Fill.
	 */
	K establirPareSiAbsent(V fill, K pare);
	
	/**
	 * Estableix tote els {@link Anyell} Pare-Fill des de la instància <tt>e</tt> a aquesta instància.
	 * L'esdeveniment d'aquesta execució és equivalent a executar {@link #estableixFill(Object,Object) estableixFill(pare, fill)}
	 * una vegada per cada instància des del Pare pare el Fill fill en l'heretada instància, El comportament
	 * d'aquesta execució no està definit si l'heretada instància és modificada mentre l'execució està sent executada.
	 * 
	 * @param e instància a ser heretada en aquesta instància.
	 * @since 1
	 */
	void establirTotsElsFills(Vida<? extends K, ? extends V> e);
	
	/**
	 * Estableix tots ELS {@link Anyell} Fill-Pare des de la instància <tt>e</tt> a aquesta instància.
	 * L'esdeveniment d'aquesta execució és equivalent a executar {@link #estableixPare(Object,Object) estableixPare(fill, pare)}
	 * una vegada per cada instància des del Fill fill el Pare pare en l'heretada instància, El comportament
	 * d'aquesta execució no està definit si l'heretada instància és modificada mentre l'execució està sent executada.
	 * 
	 * @param e instància a ser heretada en aquesta instància.
	 * @since 1
	 */
	void establirTotsElsPares(Vida<? extends V, ? extends K> e);
	
	/**
	 * Reemplaça la instància per l'especificat Fill si i sols si està actualment
	 * mapada a algun Pare
	 *
	 * @implSpec La implementació per defecte és equivalent a (per aquesta instància:
	 *
	 * <pre>
	 *  {@code
	 * si (instància.contéFill(pare)) {
	 *     retorna instància.establirFill(pare, fill);
	 * } del contrari
	 *     retorna nul;
	 * }
	 * </pre>
	 *
	 * @param pare el Pare amb el qual l'heretat Fill és mapat.
	 * @param fill el Fill a ser mapat amb l'heretat Pare
	 * @return el Fill prèviament mapat amb l'heretat Pare, o <tt>nul</tt> si no
	 * hi havien {@link Anyell} pel Pare-
	 */
	V reemplaçarFill(K pare, V fill);
	
	/**
	 * Reemplaça la instància per l'especificat Pare si i sols si està actualment
	 * mapada a algun Fill
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre>
	 * <tt>
	 * retorna obtenirFill().reemplaçarFill(pare, fill);
	 * </tt>
	 * </pre>
	 *
	 * @param pare el Pare amb el qual l'heretat Fill és mapat.
	 * @param fill el Fill a ser mapat amb l'heretat Pare
	 * @return el Fill prèviament mapat amb l'heretat Pare, o <tt>nul</tt> si no
	 * hi havien {@link Anyell} pel Pare-
	 */
	K reemplaçarPare(V fill, K pare);
	
	/**
	 * Substitueix la instància per a l'heretat Pare si i sols si està actualment mapat a
	 * l'actual Fill.
	 * 
	 * @implSpec La implementació per defecte és equivalent, per aquesta instància:
	 * <pre> {@code
     * si (instància.contéPare(pare) && Objects.equals(pare.obtenirFill(), anticFill)) {
     *     instància.establirFill(pare, nouFill);
     *     retorna cert;
     * } else
     *     retorna fals;
     * }</pre>
	 * 
	 * @param pare el Pare amb el qual el Fill heretat és mapat
	 * @param anticFill el Fill esperat a ser mapat amb l'heretat Pare
	 * @param nouFill el Fill a ser mapat amb l'heretat Pare
	 * @return {@code cert} si el Fill ha estat reemplaçat
	 */
	boolean reemplaçarFill(K pare, V anticFill, V nouFill);
	
	/**
	 * Substitueix la instància per a l'heretat Fill si i sols si està actualment mapat a
	 * l'actual Pare.
	 * 
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre> {@code
	 * retorna obtenirFill().reemplaçarFill(fill, anticPare, nouPare);
	 * }</pre>
	 * 
	 * @param fill el Fill amb el qual el Pare heretat és mapat
	 * @param anticPare el Pare esperat a ser mapat amb l'heretat Fill
	 * @param nouPare el Pare a ser mapat amb l'heretat Fill
	 * @return {@code cert} si el Pare ha estat reemplaçat
	 */
	boolean reemplaçarPare(V fill, K anticPare, K nouPare);
	
	/**
	 * Substitueix cada Fill de instància amb la sortida de la funció establerta en aquesta
	 * instància fins que tots els fills hagin estat processats.
	 *
	 * @implSpec
	 * <p>La implementació per defecte és equivalent a, per aquesta
	 * instància:
	 * <pre>
	 *  {@code
	 * for (K instància : this)
	 *     instància.establirFill(function.apply(instància.obtenirPare(), instància.obtenirFill()));
	 * }
	 * </pre>
	 * 
	 * @param funció {@link BiFunction} la funció a executar
	 */
	void reemplaçarTotsElsFills(BiFunction<? super K, ? super V, ? extends V> funció);
	
	/**
	 * Substitueix cada Pare de instància amb la sortida de la funció establerta en aquesta
	 * instància fins que tots els pares hagin estat processats.
	 *
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;..
	 * <pre>
	 *  {@code
	 * obtenirFill().reemplaçarTotsElsFills(funció)
	 * }
	 * </pre>
	 * 
	 * @param funció {@link BiFunction} la funció a executar
	 */
	void reemplaçarTotsElsPares(BiFunction<? super V, ? super K, ? extends K> funció);
	
	/**
	 * Alibera la instància per l'heretat Pare si i sols si està actualment mapat en el Fill.
	 *
	 * @implSpec La implementació per defecte és equivalent a, per aquesta
	 *           instància:
	 *
	 * <pre>
	 *  {@code
	 * si (instància.contéPare(pare) && Objects.equals(instància.obtenirFill(pare), fill)) {
	 *     instància.alliberarFill(pare);
	 *     retorna cert;
	 * } else
	 *     retorna fals;
	 * }
	 * </pre>
	 * 
	 * @param pare el Pare amb el qual l'heretat Fill és mapat
	 * @param fill el Fill esperat per ser mapat amb l'heretat Pare
	 * @return {@code cert} si el Fill ha sigut alluberat
	 */
	boolean alliberarFill(K pare, V fill);

	/**
	 * Alibera la instància per l'heretat Fill si i sols si està actualment mapat en el Pare.
	 *
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;..
	 * <pre>
	 *  {@code
	 * obtenirFill().alliberarFill(fill, pare)
	 * }
	 * </pre>
	 * 
	 * @param fill el Fill amb el qual l'heretat Pare és mapat
	 * @param pare el Pare esperat per ser mapat amb l'heretat Fill
	 * @return {@code cert} si el Pare ha sigut alluberat
	 */
	boolean alliberarPare(V fill, K pare);
	
	/**
	 * Executa l'acció establerta per a cada instància en aquesta instància fins que tots els fills
	 * hagin processat. 
	 *
	 * @implSpec La implementació per defecte és equivalent a, per aquesta
	 *           instància:
	 * <pre>
	 * {@code
	 * per (K instància : this)
	 *     action.acceptar(instància, instància.obtenirFill());
	 * }
	 * </pre>
	 *
	 * @param execution {@link BiConsumer} l'execució a processar
	 */
	void perCadaFill(BiConsumer<? super K, ? super V> execució);

	/**
	 * Executa l'acció establerta per a cada instància en aquesta instància fins que tots els fills
	 * hagin processat.
	 *
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;..
	 * <pre>
	 *  {@code
	 * obtenirFill().perCadaPare(exeució)
	 * }
	 * </pre>
	 *
	 * @param execution {@link BiConsumer} l'execució a processar
	 */
	void perCadaPare(BiConsumer<? super V, ? super K> execució);
	
	/**
	 * Si l'heretat Pare no està ja mapat amb el Fill, intenta processar el seu Fill
	 * implementant la funció d'{@link Anyell} establert i la introdueix en aquesta instància,
	 * 
	 * <p>Si la funció retorna {@code null} cap {@link Anyell} és enregistrat.</p>
	 * 
	 * @implSpec La implementació per defecte és equivalent als següents passos
	 *           per aquesta instància, després aquesta rectorna l'actual Fill o
	 *           {@code nul} si és absent:
	 *
	 * <pre>
	 * <tt>
	 * si (instància.obtenirFill(pare) == nul) {
	 *     V nouFill = funcióUnificació.aplica(pare);
	 *     if (nouFill != nul)
	 *         instància.estableixFill(pare, nouFill);
	 * }
	 * </tt>
	 * </pre>
	 * @param pare el Pare amb el qual l'heretat Fill ha de ser mapat
	 * @param funcióUnificació la funció per processar un Fill
	 * @return l'actual (existent o processat) Fill mapat amb l'heretat Pare,
	 * o nul si el Fill processat és nul
	 */
	V processarFillSiAbsent(K pare, Function<? super K, ? extends V> funcióUnificació);
	
	/**
	 * Si l'heretat Fill no està ja mapat amb el Pare, intenta processar el seu Pare
	 * implementant la funció d'{@link Anyell} establert i la introdueix en aquesta instància,
	 * 
	 * <p>Si la funció retorna {@code null} cap {@link Anyell} és enregistrat.</p>
	 * 
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;..
	 * <pre>
	 *  {@code
	 * obtenirFill().processarFillSiAbsent(funcióUnificació)
	 * }
	 * </pre>
	 *
	 * @param fill el Fill amb el qual l'heretat Pare ha de ser mapat
	 * @param funcióUnificació la funció per processar un Pare
	 * @return l'actual (existent o processat) Pare mapat amb l'heretat Fill,
	 * o nul si el Pare processat és nul
	 */
	K processarPareSiAbsent(V fill, Function<? super V, ? extends K> funcióUnificació);
	
	/**
	 * Si el Fill per a l'heretat Pare és present i no-nul, intenta processar
	 * una nova instància establerta el Pare i el seu actual mapat Fill.
	 * 
	 * <p>Si la funció retorna {@code nul}, la instància és alliberada.</p>
	 * 
	 * @implSpec La implementació per defecte és equivalent a executar els
	 * següents passos per aquesta {@code instància}, després retornant el
	 * Fill actual o {@code nul} si és absent:
	 *
	 * <pre>
	 * <tt>
	 * si (pare.getFill() != null) {
	 *     V anticFill = pare.obtenirFill();
	 *     V nouFill = funcióUnificació.aplicar(pare, anticFill);
	 *     si (nouFill != null)
	 *         instància.establirFill(pare, nouFill);
	 *     del contrari
	 *         instància.alliberarFill(pare);
	 * }
	 * </tt>
	 * </pre>
	 * @param pare el Pare amb el qual l'heretat Fill ha de ser mapat.
	 * @param funcióUnificació la funció a processar un Fill
	 * @return el nou Fill mapat amb l'heretat Pare, o nul si cap
	 */
	V processarFillSiPresent(K pare, BiFunction<? super K, ? super V, ? extends V> funcióUnificació);
	
	/**
	 * Si el Pare per a l'heretat Fill és present i no-nul, intenta processar
	 * una nova instància establerta el Fill i el seu actual mapat Pare.
	 * 
	 * <p>Si la funció retorna {@code nul}, la instància és alliberada.</p>
	 * 
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;..
	 * <pre>
	 *  {@code
	 * obtenirFill().processarFillSiPresent(funcióUnificació)
	 * }
	 * </pre>
	 * 
	 * @param fill el Fill amb el qual l'heretat Pare ha de ser mapat.
	 * @param funcióUnificació la funció a processar un Pare
	 * @return el nou Pare mapat amb l'heretat Fill, o nul si cap
	 */
	K processarPareSiPresent(V fill, BiFunction<? super V, ? super K, ? extends K> funcióUnificació);
	
	/**
	 * Intenta executar una instància per al Pare heretat i el seu actual
	 * mapat Fill. 
	 * 
	 * (El mètode {@link #unirFill unirFill()} és sovint més simple d'emprar per aquesta
	 * finalitat.)
	 *
	 * <p>
	 * Si la funció retorna <tt>nul</tt>, la instància és alliberada (o
	 * persisteix absenta si és inicialment absenta). 
	 *
	 * @implSpec La implementació per defecte és equivalent a executar els
	 *           següents passos per aquesta {@code instància}, llavors retornant
	 *           el Fill actual o <tt>nul</tt> si és absent:
	 *
	 * <pre>
	 * <tt>
	 * V anticFill = pare.obtenirFill();
	 * V nouFill = funcióUnificació.aplicar(pare, anticFill);
	 * si (anticFill != nul) {
	 *    si (nouFill != nul)
	 *       instància.establirFill(pare, nouFill);
	 *    del contrari
	 *       instància.alliberarFill(pare);
	 * } del contrari {
	 *    si (nouFill != nul)
	 *       instància.establirFill(pare, nouFill);
	 *    del contrari
	 *       retorna nul;
	 * }
	 * </tt>
	 * </pre>
	 * @param pare el Pare amb el qual l'heretat Fill ha de ser mapat
	 * @param funcióUnificació la funció a processar un Fill
	 * @return el nou Fill mapat amb l'heretat Pare
	 */
	V processarFill(K pare, BiFunction<? super K, ? super V, ? extends V> funcióUnificació);
	
	/**
	 * Intenta executar una instància per al Fill heretat i el seu actual
	 * mapat Pare. 
	 * 
	 * (El mètode {@link #unirPare unirPare()} és sovint més simple d'emprar per aquesta
	 * finalitat.)
	 *
	 * <p>
	 * Si la funció retorna <tt>nul</tt>, la instància és alliberada (o
	 * persisteix absenta si és inicialment absenta). 
	 * </p>
	 * 
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;..
	 * <pre>
	 *  {@code
	 * obtenirFill().processarFill(funcióUnificació)
	 * }
	 * </pre>
	 * 
	 * @param fill el Fill amb el qual l'heretat Pare ha de ser mapat
	 * @param funcióUnificació la funció a processar un Pare
	 * @return el nou Pare mapat amb l'heretat Fill
	 */
	K processarPare(V fill, BiFunction<? super V, ? super K, ? extends K> funcióUnificació);
	
	/**
	 * Si l'heretat Pare no està ja mapat amb un Fill l'associa amb l'establert Fill.
	 * Del contrari, reemplaça el mapat Fill amb la sortida de l'establerta funcio de unificació,
	 * o l'allibera si la sortida és <tt>nul</tt>. Aquest mètode pot ser de implementació
	 * quan combinen complexos fills per al Pare.
	 * 
	 * <p>Si la funció retorna <tt>nul</tt> la instància és alliberada.</p>
	 * 
	 * @implSpec La implementació per defecte és equivalent a executar els
	 * següents passos per aquesta <tt>instància</tt>, llavors retornant a l'actual
	 * Fill o <tt>nul</tt> si és absent:
	 * 
	 * <pre>
	 * {@code
	 * V anticFill = pare.obtenirFill();
	 * V nouFill = (anticFill == nul) ? fill :
	 *              funcióUnificació.aplicar(anticFill, fill);
	 * si (nouFill == nul)
	 *     instància.reemplaçarFill(pare);
	 * del contrari
	 *     instància.establirFill(pare, nouFill);
	 * }
	 * </pre>
	 * 
	 * @param pare el Pare amb el qual el Fill resultant ha de ser mapat
	 * @param fill el no-nul Fill per ser unificat amb l'existent Fill mapat
	 * amb el Pare
	 * @param funcióUnificació la funció per reprogramar un Fill si és present
	 * mapat amb el Pare
	 * @return el nou Fill mapat amb l'heretat Pare, o nul si no hi ha
	 * Fill mapat amb el Pare
	 */
	V unirFill(K pare, V fill, BiFunction<? super V, ? super V, ? extends V> funcióUnificació);
	
	/**
	 * Si l'heretat Fill no està ja mapat amb un Pare l'associa amb l'establert Pare.
	 * Del contrari, reemplaça el mapat Pare amb la sortida de l'establerta funcio de unificació,
	 * o l'allibera si la sortida és <tt>nul</tt>. Aquest mètode pot ser de implementació
	 * quan combinen complexos fills per al Pare.
	 * 
	 * <p>Si la funció retorna <tt>nul</tt> la instància és alliberada.</p>
	 * 
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;..
	 * <pre>
	 *  {@code
	 * obtenirFill().unirFill(fill, valor, funcióUnificació)
	 * }
	 * </pre>
	 * 
	 * @param fill el Fill amb el qual el Pare resultant ha de ser mapat
	 * @param pare el no-nul Pare per ser unificat amb l'existent Pare mapat
	 * amb el Fill
	 * @param funcióUnificació la funció per reprogramar un Pare si és present
	 * mapat amb el Fill
	 * @return el nou Pare mapat amb l'heretat Fill, o nul si no hi ha
	 * Pare mapat amb el Fill
	 */
	K unirPare(V fill, K pare, BiFunction<? super K, ? super K, ? extends K> funcióUnificació);

	Vida.Reproductor<K,V> comparador();
	
	interface Reproductor<K,V> extends Comparador<K,V> {
		
		V font();
		
		void establirPare(K pare);
		
		void establirFill(V fill);
	}
}