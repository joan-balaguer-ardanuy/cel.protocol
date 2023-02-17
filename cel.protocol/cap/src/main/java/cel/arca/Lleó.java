package cel.arca;

import java.util.ConcurrentModificationException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import cel.Anyell;

/**
 * <tt>
 * <center>
 * <h3>Daniel a la fossa dels lleons</h3>
 * <sup>2</sup> Darius va creure oportú de nomenar cent vint sàtrapes per a administrar tot el seu reialme,
 * <sup>3</sup> i, per damunt d'ells, designà tres alts funcionaris. Daniel era un d'aquests tres. Els sàtrapes havien de donar compte de l'administració als tres alts funcionaris, per evitar al rei qualsevol perjudici.
 * <sup>4</sup> Daniel es distingia entre els alts funcionaris i els sàtrapes perquè estava dotat més que ningú, i el rei pensava posar-lo al capdamunt de tot el reialme.
 * <sup>5</sup> Per això els altres dos alts funcionaris i els sàtrapes cercaven algun motiu de queixa contra Daniel en l'administració del regne, però no van trobar-ne cap ni tampoc van trobar indicis de corrupció. Daniel era de tota confiança, i no el podien acusar de corrupció ni de negligència.
 * <sup>6</sup> Llavors aquells homes es van dir: «No trobarem res contra Daniel si no ho busquem en la religió del seu Déu.»
 * <sup>7</sup> Aquells alts funcionaris i sàtrapes van anar, doncs, tot seguit a trobar el rei per dir-li:
 * --Que el rei Darius visqui per sempre!
 * <sup>8</sup> Tots els alts funcionaris del regne, els prefectes, els sàtrapes, els consellers i els governadors han acordat de redactar un decret reial que posi en vigor aquesta prohibició: "Durant trenta dies, ningú no podrà adreçar cap pregària a cap déu o a cap home, sinó tan sols a tu, oh rei; si ho fa, serà llançat a la fossa dels lleons."
 * <sup>9</sup> Ara, doncs, oh rei, signa aquest decret i promulga aquesta prohibició; i que ningú no la pugui modificar, tal com exigeix la llei irrevocable dels medes i dels perses.
 * <sup>10</sup> El rei Darius va signar aquella prohibició.
 * <sup>11</sup> Quan Daniel va saber que havia estat signat aquell decret, entrà a casa seva. La casa tenia orientades les finestres de la cambra alta cap a Jerusalem, i allà tres vegades cada dia Daniel s'agenollava pregant i lloant el seu Déu; així ho havia fet sempre.
 * <sup>12</sup> Aquells homes, doncs, van anar-hi i van trobar Daniel pregant i suplicant al seu Déu.
 * <sup>13</sup> Tot seguit es presentaren al rei i li van recordar el seu decret. Li digueren:
 * --¿No vas signar una ordre prohibint durant trenta dies que ningú pregués a cap déu ni a cap home fora de tu, oh rei, sota pena de ser llançat a la fossa dels lleons?
 * El rei els va respondre:
 * --És cert, i segons la llei dels medes i dels perses el decret és irrevocable.
 * <sup>14</sup> Aleshores ells van exclamar davant el rei:
 * --Doncs Daniel, un dels deportats de Judà, no fa cas de tu, oh rei, ni de la prohibició que vas signar: tres vegades al dia fa la seva pregària.
 * <sup>15</sup> El rei, en sentir-ho, es va entristir molt i es va proposar de salvar Daniel; fins a la posta del sol va fer els possibles per alliberar-lo.
 * <sup>16</sup> Però aquells homes l'anaren a trobar i li digueren:
 * --Sàpigues, oh rei, que, segons la llei dels medes i els perses, tot decret reial, un cop promulgat, és irrevocable.
 * <sup>17</sup> Finalment el rei va ordenar que portessin Daniel i el tiressin a la fossa dels lleons. El rei li va dir:
 * --El Déu que tu adores cada dia, et salvarà.
 * <sup>18</sup> Després van dur una pedra per tancar la boca d'aquella fossa; el rei la va segellar amb el seu anell i amb l'anell dels seus magnats, perquè ningú no pogués fer res a favor de Daniel.
 * <sup>19</sup> El rei va tornar al palau, va passar la nit en dejú, no es féu portar les concubines i no pogué dormir.
 * <sup>20</sup> A trenc d'alba es va llevar i se n'anà de pressa a la fossa dels lleons.
 * <sup>21</sup> Quan era a la vora, va cridar Daniel i li preguntà amb veu adolorida:
 * --Daniel, servent del Déu viu, ¿el Déu que tu adores cada dia t'ha pogut salvar dels lleons?
 * <sup>22</sup> Llavors Daniel va parlar al rei. Li va dir:
 * --Que el rei visqui per sempre!
 * <sup>23</sup> El meu Déu ha enviat el seu àngel a cloure la gola dels lleons i no m'han fet cap mal. Ell sap que sóc innocent i que no he comès res de mal contra tu, oh rei.
 * <sup>24</sup> El rei se'n va alegrar molt i ordenà que traguessin Daniel de la fossa. El van treure i no li van trobar ni una sola ferida, perquè havia confiat en el seu Déu.
 * <sup>25</sup> Després el rei va ordenar que portessin aquells homes que havien acusat Daniel i els tiressin a la fossa dels lleons amb els seus fills i les seves dones. Encara no havien tocat a terra, que els lleons els van clavar les urpes i trituraren tots els seus ossos.
 * <sup>26</sup> Llavors el rei Darius va escriure aquesta carta a la gent de tots els pobles, nacions i llengües que habiten arreu de la terra:
 * --Us desitjo molta pau!
 * <sup>27</sup> Jo, en persona, mano que en tots els dominis del meu reialme tothom respecti i reverenciï el Déu de Daniel.
 * »Ell és el Déu viu, el Déu etern.
 * El seu regne no es desfarà,
 * el seu imperi no tindrà fi.
 * <sup>28</sup> Ell salva i allibera.
 * Fa senyals i prodigis
 * al cel i a la terra,
 * i ha salvat Daniel
 * de les urpes dels lleons.
 * <sup>29</sup> Daniel va prosperar durant el regnat de Darius i de Cir, el persa. 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public interface Lleó<K, V> extends Animal<Lleó.Cadell<K, V>> {

	/**
     * Retorna {@code cert} si aquest {@link Lleó} conté un mapatge per l'especificada
     * clau. Més formalment, retorna {@code cert} si i sols si
     * aquesta {@link Lleó} conté un mapatge per a la clau {@code k} tal que
     * {@code Objectes.igual(clau, k)}.
     *
     * @param clau clau que la seva presència en aquest {@link Lleó} ha de ser provada
     * @return {@code cert} si aquest {@link Lleó} conté un mapatge per a l'especificada
     *         clau
     */
	default boolean contéClau(K clau) {
		Ramat<Lleó.Cadell<K, V>> cadellada = pastor();
		for (Lleó.Cadell<K, V> cadell = cadellada.següent(); cadellada.téMés(); cadell = cadellada.següent()) {
			if (clau == cadell.obtenirClau()) {
				return true;
			}
		}
		return false;
	}
    
	/**
     * Retorna {@code cert} si aquest {@link Lleó} conté un mapatge per l'especificat
     * valor. Més formalment, retorna {@code cert} si i sols si
     * aquest {@link Lleó} conté un mapatge per al valor {@code v} tal que
     * {@code Objectes.igual(valor, v)}.
     *
     * @param valor valor que la seva presència en aquesta {@link Lleó} ha de ser provat
     * @return {@code cert} si aquesta {@link Lleó} conté un mapatge per a l'especificat
     *         valor
     */
	default boolean contéValor(V valor) {
		Ramat<Lleó.Cadell<K, V>> cadellada = pastor();
		for (Lleó.Cadell<K, V> cadell = cadellada.següent(); cadellada.téMés(); cadell = cadellada.següent()) {
			if (valor == cadell.obtenirValor()) {
				return true;
			}
		}
		return false;
	}

    /**
     * Retorna el valor al qual l'especificada clau és mapada,
     * o {@code nul} si aquesta {@link Lleó} no conté mapatge per a la clau.
     *
     * <p>Més formalment, si aquesta {@link Lleó} conté un mapatge des d'una clau
     * {@code k} cap a un valor {@code v} tal que
     * {@code clau == k}, llavors aquest mètode retorna {@code v}; del contrari
     * aquest retorna {@code nul}.
     *
     * <p>Si aquesta {@link Lleó} permet valors nuls, llavors un retorn de valor
     * {@code nul} no <i>necessàriament</i> indica que la {@link Lleó}
     * no conté mapatge per a la clau; és tanbé possible que la {@link Lleó}
     * explícitament mapi la clau a {@code nul}.  L'operació {@link #contéClau
     * contéClau} pot ser emprat per distingir aquests dos casos.
     *
     * @param clau la clau el qual el seu valor associat ha de ser retornat
     * @return el valor al qual la clau especificada és mapada, o
     *         {@code nul} si aquesta {@link Lleó} no conté mapatge per la clau
     */
	default V obtenir(K clau) {
		Ramat<Lleó.Cadell<K, V>> cadellada = pastor();
		for (Lleó.Cadell<K, V> cadell = cadellada.següent(); cadellada.téMés(); cadell = cadellada.següent()) {
			if (clau == cadell.obtenirClau()) {
				return cadell.obtenirValor();
			}
		}
		return null;
	}

	/**
	 * Mapa el valor amb la clau en aquest {@link Anyell}. 
	 * Si la instància prèviament contenia una instància pel
	 * valor, l'antiga clau és reemplaçada pel valor.
	 *
	 * @param clau la clau amb el qual el valor ha de ser associat
	 * @param valor el valor per ser mapat amb la clau
	 * @return el valor previ associat amb la clau, o <tt>nul</tt>
	 * si no hi ha instància associada a la clau.
	 * @since 1
	 */
	V establir(K clau, V valor);

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
	default V alliberarValor(K clau) {
		Ramat<Lleó.Cadell<K, V>> cadellada = pastor();
		for (Lleó.Cadell<K, V> cadell = cadellada.següent(); cadellada.téMés(); cadell = cadellada.següent()) {
			if (clau == cadell.obtenirClau()) {
				cadellada.alliberar();
				return cadell.obtenirValor();
			}
		}
		return null;
	}

    /**
     * Estableix tots els mapatges des del {@link Lleó} especificat a aquest
     * {@link Lleó}. L'efecte d'aquesta invocació és equivalent a fer la
     * invoació {@link #establir(Object,Object) establir(k, v)} en aquest
     * {@link Lleó} una vegada per cada mapatge des de la clau {@code k} al
     * valor {@code v} en el {@link Lleó} especificat. El comportament d'aquesta
     * operació no està definit si el {@link Lleó} especificat és modificat
     * mentre la operació està en progrés.
     *
     * @param a mapatges per ser establerts en aquest {@link Lleó}
     */
	default void establirTot(Lleó<K, V> m) {
		Ramat<Lleó.Cadell<K, V>> cadellada = m.pastor();
		for (Lleó.Cadell<K, V> cadell = cadellada.següent(); cadellada.téMés(); cadell = cadellada.següent()) {
			establir(cadell.obtenirClau(), cadell.obtenirValor());
		}
	}

	/**
     * Retorna el valor al qual l'especificada clau és mapada, o retorna
     * {@code valorPerDefecte} si aquest {@link Lleó} no conté mapatge per la clau.
     * 
     * @param clau la clau al qual l'associat valor ha de ser reotornat
     * @param valorPerDefecte el mapatge per defecte de la clau
     * @return el valor al qual l'especificada clau és mapada, o
     * {@code valorPerDefecte} si aquest {@link LLeó} no conté mapatge per la clau
     */
	default V obtenirPerDefecte(K clau, V valorPerDefecte) {
		V v;
		return (((v = obtenir(clau)) != null) || contéClau(clau)) ? v : valorPerDefecte;
	}

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
	default void perCada(BiConsumer<? super K, ? super V> acció) {
		Ramat<Lleó.Cadell<K, V>> cadellada = pastor();
		for (Lleó.Cadell<K, V> cadell = cadellada.següent(); cadellada.téMés(); cadell = cadellada.següent()) {
			K k;
			V v;
			try {
				k = cadell.obtenirClau();
				v = cadell.obtenirValor();
			} catch (IllegalStateException ise) {
				// this usually means the entry is no longer in the map.
				throw new ConcurrentModificationException(ise);
			}
			acció.accept(k, v);
		}
	}
	
	/**
	 * Substitueix cada valor de {@link Lleó} amb la sortida de la funció establerta en aquest
	 * {@link Lleó} fins que tots els valors hagin estat processats.
	 *
	 * @implSpec
	 * <p>La implementació per defecte és equivalent a, per aquest
	 * {@link Lleó}:
	 * <pre>
	 *  {@code
	 * for (K instància : this)
	 *     instància.establirValor(funció.aplicar(instància.obtenirClau(), instància.obtenirValor()));
	 * }
	 * </pre>
	 * 
	 * @param funció {@link BiFunction} la funció a executar
	 */
	default void reemplaçarTot(BiFunction<? super K, ? super V, ? extends V> function) {
		Ramat<Lleó.Cadell<K, V>> cadellada = pastor();
		for (Lleó.Cadell<K, V> cadell = cadellada.següent(); cadellada.téMés(); cadell = cadellada.següent()) {
			K k;
			V v;
			try {
				k = cadell.obtenirClau();
				v = cadell.obtenirValor();
			} catch (IllegalStateException ise) {
				// this usually means the entry is no longer in the map.
				throw new ConcurrentModificationException(ise);
			}

			// ise thrown from function is not a cme.
			v = function.apply(k, v);

			try {
				cadell.establirValor(v);
			} catch (IllegalStateException ise) {
				// this usually means the entry is no longer in the map.
				throw new ConcurrentModificationException(ise);
			}
		}
	}
	
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
	default V establirSiAbsent(K clau, V valor) {
		V v = obtenir(clau);
		if (v == null) {
			v = establir(clau, valor);
		}

		return v;
	}
    
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
	default boolean alliberar(K clau, V valor) {
		V valorActual = obtenir(clau);
		if ((valorActual != valor) || (valorActual == null && !contéClau(clau))) {
			return false;
		}
		alliberarValor(clau);
		return true;
	}

	/**
	 * Substitueix la instància per a la clau si i sols si està actualment mapada a
	 * l'actual valor.
	 * 
	 * @implSpec La implementació per defecte és equivalent, per aquesta instància:
	 * <pre> {@code
     * si (instància.contéClau(clau) && instància.obtenir(clau) == valorAntic) {
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
	default boolean reemplaçar(K clau, V valorAntic, V valorNou) {
		V valor = obtenir(clau);
		if ((valor != valorAntic) || (valor == null && !contéClau(clau))) {
			return false;
		}
		establir(clau, valorNou);
		return true;
	}

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
	default V reemplaçar(K key, V value) {
		V curValue;
		if (((curValue = obtenir(key)) != null) || contéClau(key)) {
			curValue = establir(key, value);
		}
		return curValue;
	}
	
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
	default V processarSiAbsent(K clau, Function<? super K, ? extends V> funcióUnificació) {
		V valor;
		if ((valor = obtenir(clau)) == null) {
			V valorNou;
			if ((valorNou = funcióUnificació.apply(clau)) != null) {
				establir(clau, valorNou);
				return valorNou;
			}
		}

		return valor;
	}

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
	default V processarSiPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		V oldValue;
		if ((oldValue = obtenir(key)) != null) {
			V newValue = remappingFunction.apply(key, oldValue);
			if (newValue != null) {
				establir(key, newValue);
				return newValue;
			} else {
				alliberarValor(key);
				return null;
			}
		} else {
			return null;
		}
	}

    /**
	 * Intenta executar una instància per a la clau i el seu actual
	 * mapat valor. 
	 * 
	 * (El mètode {@link #unir unir()} és sovint més simple d'emprar per aquesta
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
	default V processar(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		V oldValue = obtenir(clau);
		V newValue = funcióUnificació.apply(clau, oldValue);
		if (newValue == null) {
			// delete mapping
			if (oldValue != null || contéClau(clau)) {
				// something to remove
				alliberarValor(clau);
				return null;
			} else {
				// nothing to do. Leave things as they were.
				return null;
			}
		} else {
			// add or replace old mapping
			establir(clau, newValue);
			return newValue;
		}
	}

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
	default V unir(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
		V oldValue = obtenir(key);
		V newValue = (oldValue == null) ? value : remappingFunction.apply(oldValue, value);
		if (newValue == null) {
			alliberarValor(key);
		} else {
			establir(key, newValue);
		}
		return newValue;
	}
	
	/**
	 * <tt>
	 * <center>
	 * <h3>Jacob beneeix els seus dotze fills</h3>
	 * <big>49</big>
	 * <sup>1</sup> Jacob va cridar els seus fills i els digué:<br/>
	 * --Reuniu-vos i us anunciaré el que us passarà en el futur:<br/>
	 * <sup>2</sup> Aplegueu-vos i escolteu, fills de Jacob,<br/>
	 * escolteu el vostre pare Israel.<br/>
	 * <sup>3</sup> »Rubèn, tu ets el meu primogènit,<br/>
	 * la meva força,<br/>
	 * la primícia del meu vigor,<br/>
	 * superior en dignitat, superior en poder,<br/>
	 * <sup>4</sup> impetuós com els aiguats.<br/>
	 * Però no seràs més que els altres,<br/>
	 * perquè vas pujar al llit del teu pare:<br/>
	 * pujant al meu llit, et vas deshonrar.<br/>
	 * <sup>5</sup> »Simeó i Leví són germans,<br/>
	 * s'han decidit a destruir<br/>
	 * amb violència.<br/>
	 * <sup>6</sup> No vull tenir part en el seu complot,<br/>
	 * no vull assistir a la seva conjura;<br/>
	 * enfurismats van matar uns homes,<br/>
	 * gent forta com toros,<br/>
	 * mutilant-los de grat.<br/>
	 * <sup>7</sup> Maleït el seu enuig, tan violent,<br/>
	 * el seu furor, massa cruel!<br/>
	 * Repartiré els seus fills<br/>
	 * entre les tribus de Jacob,<br/>
	 * els escamparé<br/>
	 * per les tribus d'Israel.<br/>
	 * <sup>8</sup> »Judà, els teus germans t'enaltiran.<br/>
	 * Agafaràs pel coll els enemics,<br/>
	 * es prosternaran davant teu<br/>
	 * els teus germans.<br/>
	 * <sup>9</sup> Judà, fill meu, ets un cadell de lleó<br/>
	 * que tornes de la caça.<br/>
	 * Com un lleó t'ajeus i t'estires.<br/>
	 * Ets una lleona. Qui et farà aixecar?<br/>
	 * <sup>10</sup> El ceptre no serà mai pres de Judà,<br/>
	 * no mancarà als seus fills<br/>
	 * el comandament,<br/>
	 * fins que vindrà aquell a qui pertany<br/>
	 * i a qui els pobles obeiran.<br/>
	 * <sup>11</sup> Fermarà a la vinya el seu pollí,<br/>
	 * als ceps triats, el fill de la somera;<br/>
	 * rentarà amb vi la seva roba,<br/>
	 * amb sang de raïms la seva túnica.<br/>
	 * <sup>12</sup> Tindrà els ulls tèrbols de tant de vi,<br/>
	 * les dents blanques de tanta llet.<br/>
	 * <sup>13</sup> »Zabuló viurà vora la mar,<br/>
	 * serà una badia<br/>
	 * on les naus fondejaran.<br/>
	 * El seu territori arribarà fins a Sidó.<br/>
	 * <sup>14</sup> »Issacar és un ase robust,<br/>
	 * ajaçat entre les cledes.<br/>
	 * <sup>15</sup> Veu que és bonic el seu lloc de repòs,<br/>
	 * que el país és agradable,<br/>
	 * i ajup l'espatlla sota la càrrega,<br/>
	 * sotmès a treballs forçats.<br/>
	 * <sup>16</sup> »Dan farà de jutge del seu poble,<br/>
	 * com una de les tribus d'Israel.<br/>
	 * <sup>17</sup> Serà una serp vora el camí,<br/>
	 * un escurçó vora la ruta;<br/>
	 * picarà la pota del cavall<br/>
	 * i farà caure d'esquena el cavaller.<br/>
	 * <sup>18</sup> Senyor, jo espero la teva salvació.<br/>
	 * <sup>19</sup> »A Gad l'atacaran<br/>
	 * incursions de bandolers;<br/>
	 * però, quan ell els ataqui,<br/>
	 * no els deixarà de petja.<br/>
	 * <sup>20</sup> »Aser tindrà un pa suculent,<br/>
	 * farà que sigui les delícies dels reis.<br/>
	 * <sup>21</sup> »Neftalí és una cérvola en llibertat,<br/>
	 * que cria cervatells bonics.<br/>
	 * <sup>22</sup> »Josep és un plançó fruitós,<br/>
	 * un plançó fruitós vora una font;<br/>
	 * els seus brots s'enfilen paret amunt.<br/>
	 * <sup>23</sup> L'han provocat<br/>
	 * disparant en contra d'ell,<br/>
	 * l'han atacat llançant-li sagetes.<br/>
	 * <sup>24</sup> Però el seu arc es manté ferm,<br/>
	 * mentre ell mou àgilment braços i mans,<br/>
	 * pel poder del Déu fort de Jacob,<br/>
	 * pel nom del Pastor, la Roca d'Israel.<br/>
	 * <sup>25</sup> Que el Déu del teu pare t'ajudi,<br/>
	 * que el Déu totpoderós et beneeixi:<br/>
	 * benediccions de dalt el cel,<br/>
	 * benediccions de les aigües abismals,<br/>
	 * sota la terra;<br/>
	 * benediccions de la dona<br/>
	 * que és fecunda,<br/>
	 * <sup>26</sup> benediccions del teu pare, més potents<br/>
	 * que les benediccions<br/>
	 * de les muntanyes antigues,<br/>
	 * millors que les delícies<br/>
	 * de les collades eternes.<br/>
	 * Que totes elles davallin<br/>
	 * damunt el cap de Josep,<br/>
	 * sobre el front<br/>
	 * del qui ha estat consagrat<br/>
	 * sobre els germans.<br/>
	 * <sup>27</sup> »Benjamí és un llop que destrossa:<br/>
	 * al matí devora una presa,<br/>
	 * al vespre en reparteix les despulles.<br/>
	 * <sup>28</sup> Tots aquests formen les dotze tribus d'Israel.<br/>
	 * Aquestes són les paraules que els va dir el seu pare quan va beneir-los. Donà una benedicció apropiada a cada un.<br/> 
	 * </center>
	 * </tt>
	 *  
	 * @author joan
	 *
	 * @param <K> és la CLAU
	 * @param <V> és el VALOR
	 */
	public interface Cadell<K,V> extends Animal<Cadell<K,V>> {
		
		K obtenirClau();

		K establirClau(K clau);

		V obtenirValor();

		V establirValor(V valor);
	}
}