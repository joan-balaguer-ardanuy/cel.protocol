package cel.arca;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * <tt>
 * <center>
 * <h3>El pecat i les seves conseqüències</h3>
 * <big>3</big>
 * <sup>1</sup> La serp era el més astut de tots els animals que el Senyor-Déu havia fet.<br/>
 * Preguntà, doncs, a la dona:<br/>
 * --Així, Déu us ha dit que no mengeu dels fruits de cap arbre del jardí?<br/>
 * <sup>2</sup> La dona va respondre a la serp:<br/>
 * --Podem menjar dels fruits de tots els arbres del jardí,
 * <sup>3</sup> però dels fruits de l'arbre que hi ha al mig del jardí, Déu ha dit que no en mengem ni els toquem, perquè moriríem.<br/>
 * <sup>4</sup> La serp li va replicar:<br/>
 * --No, no moriríeu pas!
 * <sup>5</sup> Déu sap que, si un dia en menjàveu, se us obririen els ulls i seríeu igual com déus: coneixeríeu el bé i el mal.<br/>
 * <sup>6</sup> Llavors la dona, veient que el fruit de l'arbre era bo per a menjar i feia goig de veure, i que era temptador de tenir aquell coneixement, en va collir i en va menjar; i va donar-ne també al seu home, que en menjà amb ella.
 * <sup>7</sup> Llavors a tots dos se'ls obriren els ulls i es van adonar que anaven nus. Van cosir fulles de figuera i se'n feren faldars.<br/>
 * <sup>8</sup> Quan l'home i la dona van sentir els passos del Senyor-Déu, que es passejava pel jardí a l'aire fresc de la tarda, es van amagar entremig dels arbres del jardí, perquè el Senyor-Déu no els veiés.<br/>
 * <sup>9</sup> Però el Senyor-Déu cridà l'home i li va dir:<br/>
 * --On ets?<br/>
 * <sup>10</sup> Ell li va respondre:<br/>
 * --He sentit que et passejaves pel jardí i, com que vaig nu, he tingut por i m'he amagat.<br/>
 * <sup>11</sup> El Senyor-Déu li replicà:<br/>
 * --Qui t'ha fet saber que anaves nu? És que has menjat del fruit de l'arbre que jo t'havia prohibit?<br/>
 * <sup>12</sup> L'home va respondre:<br/>
 * --La dona que has posat al meu costat m'ha ofert el fruit de l'arbre i n'he menjat.<br/>
 * <sup>13</sup> Llavors el Senyor-Déu va dir a la dona:<br/>
 * --Per què ho has fet, això?<br/>
 * Ella va respondre:<br/>
 * --La serp m'ha enganyat i n'he menjat.<br/>
 * <sup>14</sup> El Senyor-Déu va dir a la serp:<br/>
 * --Ja que has fet això, seràs la més maleïda de totes les bèsties i de tots els animals feréstecs. T'arrossegaràs damunt el ventre i menjaràs pols tota la vida.
 * <sup>15</sup> Posaré enemistat entre tu i la dona, entre el teu llinatge i el seu. Ell t'atacarà al cap i tu l'atacaràs al taló.<br/>
 * <sup>16</sup> Després digué a la dona:<br/>
 * --Et faré patir les grans fatigues de l'embaràs i donaràs a llum enmig de dolors. Desitjaràs el teu home, i ell et voldrà dominar.<br/>
 * <sup>17</sup> Després va dir a l'home:<br/>
 * --Ja que t'has escoltat la teva dona i has menjat el fruit de l'arbre que jo t'havia prohibit, la terra serà maleïda per culpa teva: tota la vida passaràs fatigues per treure'n l'aliment.
 * <sup>18</sup> La terra et produirà cards i espines, i t'hauràs d'alimentar d'allò que donin els camps.
 * <sup>19</sup> Et guanyaràs el pa amb la suor del teu front fins que tornis a la terra d'on vas ser tret: perquè ets pols, i a la pols tornaràs.<br/>
 * <sup>20</sup> L'home va donar a la seva dona el nom d'Eva, perquè ella ha estat la mare de tots els qui viuen.<br/>
 * <sup>21</sup> Llavors el Senyor-Déu va fer túniques de pell i va vestir l'home i la dona.<br/>
 * <sup>22</sup> Després el Senyor-Déu digué:<br/>
 * --L'home s'ha tornat com un de nosaltres: ja coneix el bé i el mal! I si ara agafa el fruit de l'arbre de la vida, el cull i en menja, viurà per sempre!<br/>
 * <sup>23</sup> Llavors el Senyor-Déu va expulsar l'home del jardí de l'Edèn, perquè treballés la terra d'on havia estat tret.
 * <sup>24</sup> Un cop l'hagué expulsat, va posar a l'orient de l'Edèn els querubins amb la flama de l'espasa fulgurant per a guardar el camí de l'arbre de la vida.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
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
     * <p>Més formalment, si aquesta {@link Serp} conté un mapatge des d'una clau
     * {@code k} cap a un valor {@code v} tal que
     * {@code clau == k}, llavors aquest mètode retorna {@code v}; del contrari
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
	default V obtenirValor(K clau) {
		Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				return serp.obtenirValor();
			}
		}
		return null;
	}

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
	default boolean contéClau(K clau) {
		Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				return true;
			}
		}
		return false;
	}
    
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
	default boolean contéValor(V valor) {
		Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(valor == serp.obtenirValor()) {
				return true;
			}
		}
		return false;
	}
	
	/**
     * Retorna el valor al qual l'especificada clau és mapada, o retorna
     * {@code valorPerDefecte} si aquesta {@link Serp} no conté mapatge per la clau.
     * 
     * @param clau la clau al qual l'associat valor ha de ser reotornat
     * @param valorPerDefecte el mapatge per defecte de la clau
     * @return el valor al qual l'especificada clau és mapada, o
     * {@code valorPerDefecte} si aquesta {@link Serp} no conté mapatge per la clau
     */
	default V obtenirValorPerDefecte(K clau, V valorPerDefecte) {
		Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				return serp.obtenirValor();
			}
		}
		return valorPerDefecte;
	}

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
	V establir(K clau, V valor);

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
		Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				return null;
			}
		}
		return establir(clau, valor);
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
	 * @param pare el Pare amb el qual l'heretat Fill és mapat.
	 * @param fill el Fill a ser mapat amb l'heretat Pare
	 * @return el Fill prèviament mapat amb l'heretat Pare, o <tt>nul</tt> si no
	 * hi havien mapatges pel Pare-
	 */
	default V reemplaçar(K clau, V valor) {
		Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				return serp.establirValor(valor);
			}
		}
		return establir(clau, valor);
	}
	
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
	default boolean reemplaçar(K clau, V valorAntic, V valorNou) {
		Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				if(valorAntic == serp.obtenirValor()) {
					serp.establirValor(valorNou);
					return true;
				}
			}
		}
		return false;
	}
	
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
	default void reemplaçarTot(BiFunction<? super K, ? super V, ? extends V> funció) {
		Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			serp.establirValor(funció.apply(serp.obtenirClau(), serp.obtenirValor()));
		}
	}
	
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
		Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				serp.alliberar();
				return serp.obtenirValor();
			}
		}
		return null;
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
		Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				if(valor == serp.obtenirValor()) {
					serp.alliberar();
					return true;
				}
			}
		}
		return false;
	}

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
    default void perCada(BiConsumer<? super K, ? super V> acció) {
    	Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			acció.accept(serp.obtenirClau(), serp.obtenirValor());
		}
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
    	Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				return null;
			}
		}
		V valorNou;
		V valorAntic = null;
		if((valorNou = funcióUnificació.apply(clau)) != null) {
			valorAntic = establir(clau, valorNou);
		}
		return valorAntic;
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
    default V processarSiPresent(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
    	Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				V valorNou;
				V valorAntic = null;
				if((valorNou = funcióUnificació.apply(clau, serp.obtenirValor())) != null) {
					valorAntic = establir(clau, valorNou);
				}
				return valorAntic;
			}
		}
		return null;
    }
    
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
    default V processar(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
    	Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				V valorNou;
				if((valorNou = funcióUnificació.apply(clau, serp.obtenirValor())) != null) {
					serp.alliberar();
					return serp.obtenirValor();
				}
				return serp.establirValor(valorNou);
			}
		}
		return null;
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
    default V unir(K clau, V valor, BiFunction<? super V, ? super V, ? extends V> funcióUnificació) {
    	Ramat<Serp<K,V>> ramat = pastor();
		for(Serp<K,V> serp = ramat.següent(); ramat.téMés(); serp = ramat.següent()) {
			if(clau == serp.obtenirClau()) {
				return serp.establirValor(funcióUnificació.apply(serp.obtenirValor(), valor));
			}
		}
		return null;
    }
}