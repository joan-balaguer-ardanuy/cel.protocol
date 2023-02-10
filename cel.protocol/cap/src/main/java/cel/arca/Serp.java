package cel.arca;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface Serp<K,V> extends Animal<Serp<K,V>> {
    /**
     * Obté la clau corresponent a aquesta {@link Serp}.
     *
     * @return la clau corresponent a aquesta {@link Serp}
     */
	K obtenirClau();

    /**
     * Estableix la clau corresponent a aquesta {@link Serp} amb l'espeificada
     * clau.
     *
     * @param clau nova clau per ser establerta en aquesta {@link Serp}
     * @return antic valor corresponent a la Serp
     */
	K establirClau(K clau);

    /**
     * Obté el valor corresponent a aquesta {@link Serp}.
     *
     * @return el valor corresponent a aquesta {@link Serp}
     */
	V obtenirValor();

    /**
     * Estableix el valor corresponent a aquesta {@link Serp} amb l'espeificat
     * valor.
     *
     * @param valor nou valor per ser establert en aquesta {@link Serp}
     * @return antic valor corresponent a la {@link Serp}
     */	
	V establirValor(V valor);

    /**
     * Retorna el valor al qual l'especificada clau és mapada,
     * o {@code nul} si aquesta {@link Serp} no conté mapatge per a la clau.
     *
     * <p>Més formalment, si aquest Serp conté un mapatge des d'una clau
     * {@code k} cap a un valor {@code v} el qual aquest
     * {@code Objectes.igual(clau, k)},
     * llavors aquest mètode retorna {@code v}; del contrari
     * aquest retorna {@code nul}.
     *
     * <p>Si aquesta {@link Serp} permet valors nuls, llavors un retorn de valor
     * {@code nul} no <i>necessàriament</i> indica que la {@link Serp}
     * no conté mapatge per a la clau; és tanbé possible que la {@link Serp}
     * explícitament mapi la clau a {@code nul}.  L'operació {@link #contéClau
     * contéClau} pot ser emprat per distingir aquests dos casos.
     *
     * @param clau la clau el qual el seu valor associat ha de ser retornat
     * @return el valor al qual la clau especificada és mapada, o
     *         {@code nul} si aquesta {@link Serp} no conté mapatge per la clau
     */
	V obtenirValor(K clau);

	/**
     * Retorna {@code cert} si aquesta {@link Serp} conté un mapatge per l'especificada
     * clau. Més formalment, retorna {@code cert} si i sols si
     * aquesta {@link Serp} conté un mapatge per a la clau {@code k} tal que
     * {@code Objectes.igual(clau, k)}.
     *
     * @param clau clau que la seva presència en aquesta {@link Serp} ha de ser provada
     * @return {@code cert} si aquesta {@link Serp} conté un mapatge per a l'especificada
     *         clau
     */
	boolean contéClau(Object clau);
    
	/**
     * Retorna {@code cert} si aquesta {@link Serp} conté un mapatge per l'especificat
     * valor. Més formalment, retorna {@code cert} si i sols si
     * aquest {@link Serp} conté un mapatge per al valor {@code v} tal que
     * {@code Objectes.igual(valor, v)}.
     *
     * @param valor valor que la seva presència en aquesta {@link Serp} ha de ser provat
     * @return {@code cert} si aquesta {@link Serp} conté un mapatge per a l'especificat
     *         valor
     */
	boolean contéValor(Object valor);
	
	/**
     * Retorna el valor al qual l'especificada clau és mapada, o retorna
     * {@code valorPerDefecte} si aquesta {@link Serp} no conté mapatge per la clau.
     * 
     * @param clau la clau al qual l'associat valor ha de ser reotornat
     * @param valorPerDefecte el mapatge per defecte de la clau
     * @return el valor al qual l'especificada clau és mapada, o
     * {@code valorPerDefecte} si aquesta {@link Serp} no conté mapatge per la clau
     */
	V obtenirValorPerDefecte(K clau, V valorPerDefecte);
		
	/**
	 * Obté la posició de la primera aparició en la qual es troba la clau respecte aquesta instància.
	 * @param clau la clau a obtenir la posició
	 * @return la posició en el qual es troba la clau respecte aquesta instància.
	 */
	long índexDeClau(K clau);

	/**
	 * Mapa el valor amb la clau en aquesta {@link Serp}. 
	 * Si la instància prèviament contenia una instància pel
	 * valor, l'antiga clau és reemplaçada pel valor.
	 *
	 * @param clau la clau amb el qual el valor ha de ser associat
	 * @param valor el valor per ser mapat amb la clau
	 * @return el valor previ associat amb la clau, o <tt>nul</tt>
	 * si no hi ha instància associada a la clau.
	 * @since 1
	 */
	V establirValor(K clau, V valor);

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
	 * @return el valor previ associat amb la clau, o
	 * <tt>nul</tt> si no hi havia instància per la clau.
	 */
	V establirValorSiAbsent(K clau, V valor);
		
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
	 * @param pare el Pare amb el qual l'heretat Fill és mapat.
	 * @param fill el Fill a ser mapat amb l'heretat Pare
	 * @return el Fill prèviament mapat amb l'heretat Pare, o <tt>nul</tt> si no
	 * hi havien mapatges pel Pare-
	 */
	V reemplaçarValor(K clau, V valor);
	
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
	 * Executa l'acció establerta per a cada instància en aquesta instància fins que tots els valors
	 * hagin processat. 
	 *
	 * @implSpec La implementació per defecte és equivalent a, per aquesta
	 *           instància:
	 * <pre>
	 * {@code
	 * per (Serp instància : this)
	 *     action.acceptar(instància.obtenirClau(), instància.obtenirValor());
	 * }
	 * </pre>
	 *
	 * @param execution {@link BiConsumer} l'execució a processar
	 */
    void perCadaValor(BiConsumer<? super K, ? super V> acció);

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
}