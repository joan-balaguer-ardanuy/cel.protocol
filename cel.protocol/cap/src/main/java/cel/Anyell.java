package cel;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import cel.temps.Vida;

/** 
 * <tt>
 * <center>
 * <h3>Litúrgia celestial: Els màrtirs de l'Anyell</h3>
 * <sup>9</sup> Després d'això, vaig veure que hi havia una multitud tan gran que ningú no l'hauria poguda comptar. Eren gent de totes les nacions, tribus, pobles i llengües. S'estaven drets davant el tron i davant l'Anyell, vestits de blanc i amb palmes a les mans,
 * <sup>10</sup> i proclamaven amb veu forta:<br/>
 * --La salvació ve del nostre Déu, que seu al tron, i de l'Anyell.<br/>
 * <sup>11</sup> I tots els àngels que s'estaven drets al voltant del tron, dels ancians i dels quatre vivents es van prosternar davant el tron amb el front a terra i adoraven Déu
 * <sup>12</sup> dient:<br/>
 * --Amén. Lloança, glòria, saviesa, acció de gràcies, honor, poder i força al nostre Déu pels segles dels segles. Amén.<br/>
 * <sup>13</sup> Aleshores un dels ancians va prendre la paraula i em preguntà:<br/>
 * --Aquests que van vestits de blanc, qui són i d'on vénen?<br/>
 * <sup>14</sup> Jo li vaig respondre:<br/>
 * --Senyor meu, tu ho saps.<br/>
 * Ell em digué:<br/>
 * --Aquests són els qui vénen de la gran tribulació. Han rentat els seus vestits amb la sang de l'Anyell i els han quedat blancs.
 * <sup>15</sup> Per això estan davant el tron de Déu donant-li culte nit i dia dins el seu temple. El qui seu al tron els farà viure en el seu tabernacle.
 * <sup>16</sup> Mai més no passaran fam ni set, ni els farà mal el sol ni la xardor,
 * <sup>17</sup> perquè l'Anyell que està en el tron els pasturarà i els conduirà a les fonts d'aigua viva. I Déu eixugarà totes les llàgrimes dels seus ulls.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 * 
 * @see Vida
 * @see java.util.Map.Entry
 */
public interface Anyell<K,V> extends Vida<Anyell<K,V>, Anyell<V,K>> {

    /**
     * Obté la clau corresponent a aquest {@link Anyell}.
     *
     * @return la clau corresponent a aquest {@link Anyell}
     */
	K obtenirClau();

    /**
     * Estableix la clau corresponent a aquest {@link Anyell} amb l'espeificada
     * clau.
     *
     * @param clau nova clau per ser establerta en aquest {@link Anyell}
     * @return antic valor corresponent a l'Anyell
     */
	K establirClau(K clau);

    /**
     * Obté el valor corresponent a aquest {@link Anyell}.
     *
     * @return el valor corresponent a aquest {@link Anyell}
     */
	V obtenirValor();

    /**
     * Estableix el valor corresponent a aquest {@link Anyell} amb l'espeificat
     * valor.
     *
     * @param valor nou valor per ser establert en aquest {@link Anyell}
     * @return antic valor corresponent a l'{@link Anyell}
     */	
	V establirValor(V valor);

    /**
     * Retorna el valor al qual l'especificada clau és mapada,
     * o {@code nul} si aquest {@link Anyell} no conté mapatge per a la clau.
     *
     * <p>Més formalment, si aquest Anyell conté un mapatge des d'una clau
     * {@code k} cap a un valor {@code v} el qual aquest
     * {@code Objectes.igual(clau, k)},
     * llavors aquest mètode retorna {@code v}; del contrari
     * aquest retorna {@code nul}.
     *
     * <p>Si aquest {@link Anyell} permet valors nuls, llavors un retorn de valor
     * {@code nul} no <i>necessàriament</i> indica que l'{@link Anyell}
     * no conté mapatge per a la clau; és tanbé possible que l'{@link Anyell}
     * explícitament mapi la clau a {@code nul}.  L'operació {@link #contéClau
     * contéClau} pot ser emprat per distingir aquests dos casos.
     *
     * @param clau la clau el qual el seu valor associat ha de ser retornat
     * @return el valor al qual la clau especificada és mapada, o
     *         {@code nul} si aquest {@link Anyell} no conté mapatge per la clau
     */
	V obtenirValor(K clau);
	
	/**
     * Retorna la clau al qual l'especificat valor és mapat,
     * o {@code nul} si aquest {@link Anyell} no conté mapatge per al valor.
     *
     * <p>Més formalment, si aquest Anyell conté un mapatge des d'un valor
     * {@code v} cap a una clau {@code k} el qual aquesta
     * {@code Objectes.igual(valor, v)},
     * llavors aquest mètode retorna {@code k}; del contrari
     * aquest retorna {@code nul}.
     *
     * <p>Si aquest {@link Anyell} permet claus nul·les, llavors un retorn de clau
     * {@code nul·la} no <i>necessàriament</i> indica que l'{@link Anyell}
     * no conté mapatge per al valor; és tanbé possible que l'{@link Anyell}
     * explícitament mapi el valor a {@code nul}.  L'operació {@link #contéValor
     * contéValor} pot ser emprat per distingir aquests dos casos.
     *
     * @param valor el valor el qual la seva clau associada ha de ser retornada
     * @return la clau a la qual el valor especificat és mapat, o
     *         {@code nul} si aquest {@link Anyell} no conté mapatge per el valor
     */
	K obtenirClau(V valor);
    
	/**
     * Retorna {@code cert} si aquest {@link Anyell} conté un mapatge per l'especificada
     * clau. Més formalment, retorna {@code cert} si i sols si
     * aquest {@link Anyell} conté un mapatge per a la clau {@code k} tal que
     * {@code Objectes.igual(clau, k)}.
     *
     * @param clau clau que la seva presència en aquest {@link Anyell} ha de ser provada
     * @return {@code cert} si aquest {@link Anyell} conté un mapatge per a l'especificada
     *         clau
     */
	boolean contéClau(K clau);
    
	/**
     * Retorna {@code cert} si aquest {@link Anyell} conté un mapatge per l'especificat
     * valor. Més formalment, retorna {@code cert} si i sols si
     * aquest {@link Anyell} conté un mapatge per al valor {@code v} tal que
     * {@code Objectes.igual(valor, v)}.
     *
     * @param valor valor que la seva presència en aquest {@link Anyell} ha de ser provat
     * @return {@code cert} si aquest {@link Anyell} conté un mapatge per a l'especificat
     *         valor
     */
	boolean contéValor(V valor);
	
	/**
     * Retorna el valor al qual l'especificada clau és mapada, o retorna
     * {@code valorPerDefecte} si aquest {@link Anyell} no conté mapatge per la clau.
     * 
     * @param clau la clau al qual l'associat valor ha de ser reotornat
     * @param valorPerDefecte el mapatge per defecte de la clau
     * @return el valor al qual l'especificada clau és mapada, o
     * {@code valorPerDefecte} si aquest {@link Anyell} no conté mapatge per la clau
     */
	V obtenirValorPerDefecte(K clau, V valorPerDefecte);
	
	/**
     * Retorna la clau a la qual l'especificat valor és mapat, o retorna
     * {@code clauPerDefecte} si aquest {@link Anyell} no conté mapatge per el valor.
     * 
     * @param valor el valor al qual l'associada clau ha de ser retornada
     * @param clauPerDefecte el mapatge per defecte del valor
     * @return la clau a la qual l'especificat valor és mapat, o
     * {@code clauPerDefecte} si aquest {@link Anyell} no conté mapatge per el valor
     */
	K obtenirClauPerDefecte(V valor, K clauPerDefecte);
	
	/**
     * Retorna l'{@link Anyell} al qual l'especificada clau és continguda,
     * o {@code nul} si aquest {@link Anyell} no conté mapatge per a la clau.
     *
     * @param clau la clau el qual el seu {@link Anyell} ha de ser retornat
     * @return {@link Anyell} el mapatge al qual la clau especificada és cpmtoguda, o
     *         {@code nul} si aquest {@link Anyell} no conté mapatge per la clau
     */
	Anyell<K,V> obtenirParePerClau(K clau);

	/**
     * Retorna l'{@link Anyell} al qual l'especificat valor és contingut,
     * o {@code nul} si aquest {@link Anyell} no conté mapatge per al vañpr.
     *
     * @param valor el valor el qual el seu {@link Anyell} ha de ser retornat
     * @return {@link Anyell} el mapatge al qual el valor especificat és contingut, o
     *         {@code nul} si aquest {@link Anyell} no conté mapatge per el valor
     */
	Anyell<V,K> obtenirFillPerValor(V valor);

	/**
	 * Mapa el valor amb la clau en aquest {@link Anyell}. 
	 * Si la instància prèviament contenia una instància pel
	 * valor, l'antiga clau és reemplaçada pel valor.
	 *
	 * @param clau la clau amb el qual el valor ha de ser associat
	 * @param valor el valor per ser mapat amb la clau
	 * @return l'{@link Anyell} associada amb la clau
	 * @since 1
	 */
	Anyell<K,V> establirValor(K clau, V valor);

	/**
	 * Mapa la clau amb el valor en aquest {@link Anyell}. 
	 * Si la instància prèviament contenia una instància per la
	 * clau, l'antic valor és reemplaçat per la clau.
	 *
	 * @param valor el valor amb el qual la clau ha de ser associada
	 * @param clau la clau per ser mapada amb el valor
	 * @return l'{@link Anyell} associat amb el valor
	 * @since 1
	 */
	Anyell<V,K> establirClau(V valor, K clau);
	
	/**
	 * Si la clau no està ja mapada amb un valor l'associa amb el valor establert i retorna
	 * <tt>nul</tt>, del contrari retorna el valor actual.
	 * @implSpec
     * La implementació per defecte és equivalent a, per aquesta {@code instància}:
     *
     * <pre> {@code
     * V valor = instància.obtenirValor(key);
     * if (valor == null)
     *     valor = instància.estableixValor(clau, valor);
     *
     * retorna valor;
     * }</pre>
	 * 
	 * @param clau la clau amb la qual el valor ha de ser associat
	 * @param valor el valor per ser mapat amb la clau
	 * @return l'{@link Anyell} associat amb la clau.
	 */
	Anyell<K,V> establirValorSiAbsent(K clau, V valor);
	
	/**
	 * Si el valor no està ja mapat amb una clau l'associa amb la clau establerta i retorna
	 * <tt>nul</tt>, del contrari retorna la clau actual.
	 * 
	 * @implSpec
     * La implementació per defecte és equivalent a, per aquesta {@code instància}:
     *
     * <pre> {@code
     * retorna obtenirFill().establirValorSiAbsent(valor, clau);
     * }</pre>
	 * 
	 * @param valor el valor amb el qual la clau ha de ser associada
	 * @param clau la clau per ser mapada amb el valor
	 * @return l'{@link Anyell} associat amb el valor.
	 */
	Anyell<V,K> establirClauSiAbsent(V valor, K clau);

    /**
     * Estableix tots els mapatges des de l'{@link Anyell} especificat a aquest
     * {@link Anyell}. L'efecte d'aquesta invocació és equivalent a fer la
     * invoació {@link #establirValor(Object,Object) establirValor(k, v)} en aquest
     * {@link Anyell} una vegada per cada mapatge des de la clau {@code k} al
     * valor {@code v} en l'{@link Anyell} especificat. El comportament d'aquesta
     * operació no està definit si l'{@link Anyell} especificat és modificat
     * mentre la operació està en progrés.
     *
     * @param a mapatges per ser establerts en aquest {@link Anyell}
     */
    void establirCadaValor(Anyell<? extends K, ? extends V> a);
    

    /**
     * Estableix tots els mapates des de l'{@link Anyell} especificat a aquest
     * {@link Anyell}. L'efecte d'aquesta invocació és equivalent a fer la
     * invoació {@link #establirClau(Object,Object) establirValor(v, k)} en aquest
     * {@link Anyell} una vegada per cada mapatge des del valor{@code v} a la
     * clau {@code k} en l'{@link Anyell} especificat. El comportament d'aquesta
     * operació no està definit si l'{@link Anyell} especificat és modificat
     * mentre la operació està en progrés.
     *
     * @param a mapatges per ser establerts en aquest {@link Anyell}
     */
    void establirCadaClau(Anyell<? extends V, ? extends K> a);
    
	/**
	 * Reemplaça la instància per l'especificat valor si i sols si està actualment
	 * mapat a alguna clau
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
	 * @param clau la clau amb la qual el valor és mapat.
	 * @param valor el valor a ser mapat amb la clau
	 * @return el Fill prèviament mapat amb l'heretat Pare, o <tt>nul</tt> si no
	 * hi havien mapatges pel Pare-
	 */
	V reemplaçarValor(K clau, V valor);
	
	/**
	 * Reemplaça la instància per l'especificada clau si i sols si està actualment
	 * mapada a algun valor
	 *
	 * @implSpec La implementació per defecte és equivalent a (per aquesta instància:
	 *
	 * <pre>
	 *  {@code
	 * obtenirFill().establirValor(valor, clau);
	 * }
	 * </pre>
	 *
	 * @param valor el valor amb el qual la clau és mapada.
	 * @param clau la clau a ser mapada amb el valor
	 * @return la clau prèviament mapada amb el valor, o <tt>nul</tt> si no
	 * hi havien mapatges pel valor-
	 */
	K reemplaçarClau(V valor, K clau);
	
	/**
	 * Substitueix la instància per a la clau si i sols si està actualment mapada a
	 * l'actual valor.
	 * 
	 * @implSpec La implementació per defecte és equivalent, per aquesta instància:
	 * <pre> {@code
     * si (instància.contéClau(clau) && Objectes.igual(instància.obtenirValor(clau), valorAntic)) {
     *     instància.estableixValor(clau, valorNou);
     *     retorna cert;
     * } del contrari
     *     retorna fals;;
     * }</pre>
	 * 
	 * @param clau la clau amb la qual el valor és mapat
	 * @param valorAntic el valor esperat a ser mapat amb la clau
	 * @param nouFill el Fill a ser mapat amb l'heretat Pare
	 * @return {@code cert} si el Fill ha estat reemplaçat
	 */
	boolean reemplaçarValor(K clau, V valorAntic, V valorNou);
	
	/**
	 * Substitueix la instància per al valor si i sols si està actualment mapat a
	 * l'actual clau.
	 * 
	 * @implSpec La implementació per defecte és equivalent, per aquesta instància:
	 * <pre> {@code
     * obtenirFill().reemplaçarValor(valor, clauAntiga, clauNoa);
     * }</pre>
	 * 
	 * @param clau la clau amb la qual el valor és mapat
	 * @param valorAntic el valor esperat a ser mapat amb la clau
	 * @param nouFill el Fill a ser mapat amb l'heretat Pare
	 * @return {@code cert} si el Fill ha estat reemplaçat
	 */
	boolean reemplaçarClau(V valor, K clauAntiga, K clauNova);
	
	/**
	 * Substitueix cada valor de instància amb la sortida de la funció establerta en aquesta
	 * instància fins que tots els valors hagin estat processats.
	 *
	 * @implSpec
	 * <p>La implementació per defecte és equivalent a, per aquesta
	 * instància:
	 * <pre>
	 *  {@code
	 * for (K instància : this)
	 *     instància.establirValor(funció.aplicar(instància.obtenirClau(), instància.obtenirValor()));
	 * }
	 * </pre>
	 * 
	 * @param funció {@link BiFunction} la funció a executar
	 */
	void reemplaçarTotsElsValors(BiFunction<? super K, ? super V, ? extends V> funció);
	
	/**
	 * Substitueix cada clau de instància amb la sortida de la funció establerta en aquesta
	 * instància fins que totes les claus hagin estat processades.
	 *
	 * @implSpec
	 * <p>La implementació per defecte és equivalent a, per aquesta
	 * instància:
	 * <pre>
	 *  {@code
	 * obtenirFill().reemplaçarTotsElsValors(funció);
	 * }
	 * </pre>
	 * 
	 * @param funció {@link BiFunction} la funció a executar
	 */
	void reemplaçarTotesLesClaus(BiFunction<? super V, ? super K, ? extends K> funció);
	
	/**
	 * Allibera el mapatge per una clau des d'aquesta instància si està present.
	 * Més formalment, si aquesta instància conté un mapatge des d'una
	 * clau {@code k} a un valor {@code v} tal que {@code Objectes.igual(key, k)},
	 * aquest mapatge és alliberat. (La instància pot contenir com a màxim un mapatge)
	 * 
	 * <p>Retorna el valor el qual aquesta instància estava prèviament associada la clau,
	 * o {@code nul} si la instància no conté mapatge per a la clau</p>
	 *
	 * <p>Si aquesta instància permet valors nuls, llavors un retorn de valor de
	 * {@code nul} no <i>necessàriament</i> indica que la instància no
	 * conté mapatges per la clau; és també possible que la instància
	 * explícitament mapés per la clau; és també possible que la instàmcia
	 * explícitament mapés la clau a {@code nul}.</p>
     * 
     * <p>La instància no conté un mapatge per la clau especificada una vegada
     * l'execució retorna.</p>
     * 
     * @param clau clau la qual el mapatge ha de ser alliberat de la instància
     * @return el valor previ mapat amb la {@code clau}, o
     *         {@code nul} si no hi havia mapatge per la {@code clau}.
     */
	V alliberarValor(K clau);
	
	/**
	 * Allibera el mapatge per un valor des d'aquesta instància si està present.
	 * Més formalment, si aquesta instància conté un mapatge des d'un
	 * valor {@code v} a una clau {@code k} tal que {@code Objectes.igual(valor, v)},
	 * aquest mapatge és alliberat. (La instància pot contenir com a màxim un mapatge)
	 * 
	 * <p>Retorna la clau la qual aquesta instància estava prèviament associada el valor,
	 * o {@code nul} si la instància no conté mapatge per al valor</p>
	 *
	 * <p>Si aquesta instància permet claus nul·les, llavors un retorn de clau de
	 * {@code nul} no <i>necessàriament</i> indica que la instància no
	 * conté mapatges pel valor; és també possible que la instància
	 * explícitament mapés pel valor; és també possible que la instància
	 * explícitament mapés el valor a {@code nul}.</p>
     * 
     * <p>La instància no conté un mapatge pel valor especificat una vegada
     * l'execució retorna.</p>
     * 
     * @param valor valor el qual el mapatge ha de ser alliberat de la instància
     * @return la clau prèvia mapada amb el {@code valor}, o
     *         {@code nul} si no hi havia mapatge pel {@code valor}.
     */
	K alliberarClau(V valor);
    
	/**
	 * Alibera la instància per la clau si i sols si està actualment mapat en el valor.
	 *
	 * @implSpec La implementació per defecte és equivalent a, per aquesta
	 *           instància:
	 *
	 * <pre>
	 *  {@code
	 * si (instància.contéClau(clau) && Objects.equals(instància.obtenirValor(clau), valor)) {
	 *     instància.alliberarValor(clau);
	 *     retorna cert;
	 * } del contrari
	 *     retorna fals;
	 * }
	 * </pre>
	 * 
	 * @param clau la clau amb la qual el valor és mapat
	 * @param valor el valor esperat per ser mapat amb la clau
	 * @return {@code cert} si el valor ha sigut alluberat
	 */
	boolean alliberarValor(K clau, V valor);
    
	/**
	 * Alibera la instància pel valor si i sols si està actualment mapat en la clau.
	 *
	 * @implSpec La implementació per defecte és equivalent a, per aquesta
	 *           instància:
	 *
	 * <pre>
	 *  {@code
	 * obtenirFill().alliberarValor(valor, clau);
	 * }
	 * </pre>
	 * 
	 * @param clau la clau amb la qual el valor és mapat
	 * @param valor el valor esperat per ser mapat amb la clau
	 * @return {@code cert} si el valor ha sigut alluberat
	 */
    boolean alliberarClau(V valor, K clau);

	/**
	 * Executa l'acció establerta per a cada instància en aquesta instància fins que tots els valors
	 * hagin processat. 
	 *
	 * @implSpec La implementació per defecte és equivalent a, per aquesta
	 *           instància:
	 * <pre>
	 * {@code
	 * per (Anyell instància : this)
	 *     action.acceptar(instància.obtenirClau(), instància.obtenirValor());
	 * }
	 * </pre>
	 *
	 * @param acció {@link BiConsumer} l'execució a processar
	 */
    void perCadaValor(BiConsumer<? super K, ? super V> acció);

	/**
	 * Executa l'acció establerta per a cada instància en aquesta instància fins que totes les claus
	 * hagin processat. 
	 *
	 * @implSpec La implementació per defecte és equivalent a, per aquesta
	 *           instància:
	 * <pre>
	 * {@code
	 * per (Anyell instància : this)
	 *     action.acceptar(instància.obtenirValor(), instància.obtenirClau());
	 * }
	 * </pre>
	 *
	 * @param acció {@link BiConsumer} l'execució a processar
	 */
    void perCadaClau(BiConsumer<? super V, ? super K> acció);
	
	/**
	 * Si la clau no està ja mapada amb el valor, intenta processar el seu valor
	 * implementant la funció de mapatge establert i la introdueix en aquesta instància,
	 * 
	 * <p>Si la funció retorna {@code nul} cap mapatge és enregistrat.</p>
	 * 
	 * @implSpec La implementació per defecte és equivalent als següents passos
	 *           per aquesta instància, després aquesta retorna l'actual valor o
	 *           {@code nul} si és absent:
	 *
	 * <pre>
	 * <tt>
	 * si (instància.obtenirValor(clau) == nul) {
	 *     V nouValor = funcióUnificació.aplica(clau);
	 *     if (nouValor != nul)
	 *         instància.estableixValor(clau, nouValor);
	 * }
	 * </tt>
	 * </pre>
	 * @param clau la clau amb la qual el valor ha de ser mapat
	 * @param funcióUnificació la funció per processar un valor
	 * @return l'actual (existent o processat) valor mapat amb la clau,
	 * o nul si el valor processat és nul
	 */
    V processarValorSiAbsent(K clau, Function<? super K, ? extends V> funcióUnificació);
    
    /**
	 * Si el valor no està ja mapat amb la clau, intenta processar la seva clau
	 * implementant la funció de mapatge establert i la introdueix en aquesta instància,
	 * 
	 * <p>Si la funció retorna {@code nul} cap mapatge és enregistrat.</p>
	 * 
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;..
	 * <pre>
	 *  {@code
	 * obtenirFill().processarValorSiAbsent(funcióUnificació)
	 * }
	 * </pre>
	 *
	 * @param valor el valor amb el qual la clau ha de ser mapada
	 * @param funcióUnificació la funció per processar una clau
	 * @return l'actual (existent o processada) clau mapada amb el valor,
	 * o nul si la clau processada és nul·la
	 */
    K processarClauSiAbsent(V valor, Function<? super V, ? extends K> funcióUnificació);
    
    /**
	 * Si el valor per a la clau és present i no-nul, intenta processar
	 * una nova instància establerta la clau i el seu actual mapat valor.
	 * 
	 * <p>Si la funció retorna {@code nul}, la instància és alliberada.</p>
	 * 
	 * @implSpec La implementació per defecte és equivalent a executar els
	 * següents passos per aquesta {@code instància}, després retornant el
	 * valor actual o {@code nul} si és absent:
	 *
	 * <pre>
	 * <tt>
	 * si (instància.obtenirValor(clau) != null) {
	 *     V anticValor = instància.obtenirValor(clau);
	 *     V nouValor = funcióUnificació.aplicar(clau, anticValor);
	 *     si (nouValor != null)
	 *         instància.establirValor(clau, nouValor);
	 *     del contrari
	 *         instància.alliberarValor(clau);
	 * }
	 * </tt>
	 * </pre>
	 * @param clau la clau amb la qual el valor ha de ser mapat.
	 * @param funcióUnificació la funció a processar un valor
	 * @return el nou valor mapat amb la clau, o nul si cap
	 */
    V processarValorSiPresent(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació);
    
    /**
	 * Si la clau per al valor és present i no-nul, intenta processar
	 * una nova instància establerta el valor i la seva actual mapada clau.
	 * 
	 * <p>Si la funció retorna {@code nul}, la instància és alliberada.</p>
	 * 
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 * <pre>
	 *  {@code
	 * obtenirFill().processarValorSiPresent(funcióUnificació)
	 * }
	 * </pre>
	 * 
	 * @param valor el valor amb el qual la clau ha de ser mapada.
	 * @param funcióUnificació la funció a processar una clau
	 * @return la nova clau mapada amb el valor, o nul si cap
	 */
    K processarClauSiPresent(V valor, BiFunction<? super V, ? super K, ? extends K> funcióUnificació);
    
    /**
	 * Intenta executar una instància per a la clau i el seu actual
	 * mapat valor. 
	 * 
	 * (El mètode {@link #unirValor unirValor()} és sovint més simple d'emprar per aquesta
	 * finalitat.)
	 *
	 * <p>
	 * Si la funció retorna <tt>nul</tt>, la instància és alliberada (o
	 * persisteix absenta si és inicialment absenta). 
	 *
	 * @implSpec La implementació per defecte és equivalent a executar els
	 *           següents passos per aquesta {@code instància}, llavors retornant
	 *           el valor actual o <tt>nul</tt> si és absent:
	 *
	 * <pre>
	 * <tt>
	 * V anticValor = instància.obtenirValor(clau);
	 * V nouValor = funcióUnificació.aplicar(clau, anticValor);
	 * si (anticValor != nul) {
	 *    si (nouValor != nul)
	 *       instància.establirValor(clau, nouValor);
	 *    del contrari
	 *       instància.alliberarValor(clau);
	 * } del contrari {
	 *    si (nouValor != nul)
	 *       instància.establirValor(clau, nouValor);
	 *    del contrari
	 *       retorna nul;
	 * }
	 * </tt>
	 * </pre>
	 * @param clau la clau amb la qual el valor ha de ser mapat
	 * @param funcióUnificació la funció a processar un valor
	 * @return el nou valor mapat amb la clau
	 */
    V processarValor(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació);
    
    /**
	 * Intenta executar una instància per al valor i la seva actual
	 * mapada clau. 
	 * 
	 * (El mètode {@link #unirClau unirClau()} és sovint més simple d'emprar per aquesta
	 * finalitat.)
	 *
	 * <p>
	 * Si la funció retorna <tt>nul</tt>, la instància és alliberada (o
	 * persisteix absenta si és inicialment absenta). 
	 *
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;.
	 *
	 * <pre>
	 * <tt>
	 * obtenirFill().processarValor(valor, funcióUnificació);
	 * </tt>
	 * </pre>
	 * @param valor el valor amb el qual la clau ha de ser mapada
	 * @param funcióUnificació la funció a processar una clau
	 * @return la nova clau mapada amb el valor
	 */
    K processarClau(V valor, BiFunction<? super V, ? super K, ? extends K> funcióUnificació);
    
    /**
	 * Si la clau no està ja mapada amb un valor l'associa amb l'establert valor.
	 * Del contrari, reemplaça el mapat valor amb la sortida de l'establerta funció de unificació,
	 * o l'allibera si la sortida és <tt>nul</tt>. Aquest mètode pot ser de implementació
	 * quan combinen complexos valors per a la clau.
	 * 
	 * <p>Si la funció retorna <tt>nul</tt> la instància és alliberada.</p>
	 * 
	 * @implSpec La implementació per defecte és equivalent a executar els
	 * següents passos per aquesta <tt>instància</tt>, llavors retornant a l'actual
	 * valor o <tt>nul</tt> si és absent:
	 * 
	 * <pre>
	 * {@code
	 * V anticValor = instància.obtenirValor(clau);
	 * V nouValor = (anticValor == nul) ? valor :
	 *              funcióUnificació.aplicar(anticValor, valor);
	 * si (nouValor == nul)
	 *     instància.reemplaçarValor(clau);
	 * del contrari
	 *     instància.establirValor(clau, nouValor);
	 * }
	 * </pre>
	 * 
	 * @param clau la clau amb la qual el valor resultant ha de ser mapat
	 * @param valor el no-nul valor per ser unificat amb l'existent valor mapat
	 * amb la clau
	 * @param funcióUnificació la funció per reprogramar un valor si és present
	 * mapat amb la clau
	 * @return el nou valor mapat amb la clau, o nul si no hi ha
	 * valor mapat amb la clau
	 */
    V unirValor(K clau, V valor, BiFunction<? super V, ? super V, ? extends V> funcióUnificació);
    
    /**
	 * Si el valor no està ja mapat amb una clau l'associa amb l'establerta clau.
	 * Del contrari, reemplaça la mapada clau amb la sortida de l'establerta funcio de unificació,
	 * o l'allibera si la sortida és <tt>nul</tt>. Aquest mètode pot ser de implementació
	 * quan combinen complexos valors per a la clau.
	 * 
	 * <p>Si la funció retorna <tt>nul</tt> la instància és alliberada.</p>
	 * 
	 * @implSpec Implementació per defecte: la instància delega el mètode al Fill,
	 * si i sols si K hereta Viu&ltK,V&gt: i V hereta Viu&ltV,K&gt;..
	 * <pre>
	 *  {@code
	 * obtenirFill().unirFill(funcióUnificació)
	 * }
	 * </pre>
	 * 
	 * @param valor el valor amb el qual la clau resultant ha de ser mapada
	 * @param clau la no-nul·la clau per ser unificada amb l'existent clau mapada
	 * amb el valor
	 * @param funcióUnificació la funció per reprogramar una clau si és present
	 * mapada amb el valor
	 * @return la nova clau mapada amb el valor, o nul si no hi ha
	 * clau mapada amb el valor
	 */
    K unirClau(V valor, K clau, BiFunction<? super K, ? super K, ? extends K> funcióUnificació);
    
    @Override
    Anyell.Generador<K,V> comparador();
    
    interface Generador<K,V> extends Reproductor<Anyell<K,V>,Anyell<V,K>> {
    	void establir(V clau, K valor);
    }
}