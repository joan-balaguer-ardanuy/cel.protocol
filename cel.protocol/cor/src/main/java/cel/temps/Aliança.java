package cel.temps;

import java.util.Objects;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;

import cel.Cel;
import cel.Ordre;
import cel.Paritat;

/**
 * <tt>
 * <center>
 * <h3>Els deu manaments</h3>
 * <h5>(Dt 5,6-21)</h5> 
 * <sup>1</sup> Déu va donar al poble d'Israel aquests manaments:<br/>
 * <sup>2</sup> --Jo sóc el Senyor, el teu Déu, que t'he fet sortir del país d'Egipte, la terra on eres esclau.<br/>
 * <sup>3</sup> »No tinguis cap altre déu fora de mi.<br/>
 * <sup>4</sup> »No et fabriquis ídols; no et facis cap imatge del que hi ha dalt al cel, aquí baix a la terra o en les aigües d'aquí baix.
 * <sup>5</sup> No els adoris ni els donis culte, perquè jo, el Senyor, el teu Déu, sóc el Déu-gelós: demano comptes als fills de les culpes dels pares fins a la tercera i la quarta generació dels qui no m'estimen.
 * <sup>6</sup> Però, per als qui m'estimen i guarden els meus preceptes, mantinc el meu amor durant un miler de generacions.<br/>
 * <sup>7</sup> »No juris en fals pel nom del Senyor, el teu Déu, perquè jo, el Senyor, no tinc per innocent el qui jura en fals pel meu nom.<br/>
 * <sup>8</sup> »Recorda't de consagrar-me el repòs del dissabte.
 * <sup>9</sup> Tens sis dies per a treballar i fer totes les feines que calgui,
 * <sup>10</sup> però el dia setè és el dia de repòs, dedicat al Senyor, el teu Déu. No facis cap treball ni tu, ni el teu fill, ni la teva filla, ni el teu esclau, ni la teva esclava, ni cap dels teus animals, ni l'immigrant que resideix a la teva ciutat.
 * <sup>11</sup> Perquè en sis dies el Senyor va fer el cel, la terra, el mar i tot el que s'hi mou, però el dia setè va reposar: per això el Senyor ha beneït el dissabte i l'ha consagrat.<br/>
 * <sup>12</sup> »Honra el pare i la mare. Així tindràs llarga vida en el país que et dóna el Senyor, el teu Déu.<br/>
 * <sup>13</sup> »No matis.<br/>
 * <sup>14</sup> »No cometis adulteri.<br/>
 * <sup>15</sup> »No robis.<br/>
 * <sup>16</sup> »No acusis ningú falsament.<br/>
 * <sup>17</sup> »No desitgis la casa d'un altre. No desitgis la seva dona, ni el seu esclau, ni la seva esclava, ni el seu bou, ni el seu ase, ni res del que li pertany.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Aliança
	<K extends Vida<K,V>,V extends Vida<V,K>> 
		extends Cel<K, V> 
			implements Vida<K, V> {

	private static final long serialVersionUID = 5965027698000727917L;

	K déu;
	
	public K obtenirDéu() {
		return déu;
	}
	public K establirDéu(K déu) {
		K antic = this.déu;
		this.déu = déu;
		return antic;
	}
	public V obtenirMareDeDéu() {
		return obtenirFill().obtenirDéu();
	}
	public V establirMareDeDéu(V mareDeDéu) {
		return obtenirFill().establirDéu(mareDeDéu);
	}

	/*
	 * ELS SET SEGELLS
	 * ===============
	 * */
	
	public Aliança() {
		super();
	}
	public Aliança(Paritat paritat) {
		super(paritat);
	}
	public Aliança(Class<? extends V> classeFill, Paritat paritat) {
		super(paritat, crea(classeFill, paritat.oposada()));
		establirDéu(obtenirPare());
		establirMareDeDéu(obtenirFill());
	}
	public Aliança(K pare) {
		super(pare);
	}
	public Aliança(Class<? extends V> classeFill, K pare) {
		super(pare, crea(classeFill, pare.obtenirFill()));
		establirDéu(pare.obtenirDéu());
		establirMareDeDéu(pare.obtenirMareDeDéu());
	}
	public Aliança(K déu, Paritat paritat) {
		super(paritat);
		establirDéu(déu);
	}
	public Aliança(Class<? extends V> classeFill, K déu, Paritat paritat) {
		super(paritat, crea(classeFill, déu.obtenirMareDeDéu(), paritat.oposada()));
		establirDéu(déu);
	}
	@Override
	public boolean sócDéu() {
		return this == obtenirDéu();
	}
	@Override
	public boolean sócMareDeDéu() {
		return obtenirFill() == obtenirMareDeDéu();
	}
	public boolean sócPrincipi()
	{
		return obtenirPare() == obtenirDéu();
	}
	
	@Override
	protected void donarManament(Ordre manament) {
		super.donarManament(manament);
		if(!sócDéu())
			déu.esdeveniment(manament);
	}
	@Override
	public V processarFillSiAbsent(K pare, Function<? super K, ? extends V> funcióUnificació) {
		Objects.requireNonNull(funcióUnificació);
		V fill, nouFill;
		return ((fill = pare.obtenirFill()) == null && (nouFill = funcióUnificació.apply(pare)) != null
				&& (fill = establirFillSiAbsent(pare, nouFill)) == null) ? nouFill : fill;
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public K processarPareSiAbsent(V fill, Function<? super V, ? extends K> funcióUnificació) {
		return obtenirFill().processarFillSiAbsent(fill, funcióUnificació);
	}

	@Override
	public V processarFillSiPresent(K pare, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		Objects.requireNonNull(funcióUnificació);
		V anticFill;
		while ((anticFill = pare.obtenirFill()) != null) {
			V newValue = funcióUnificació.apply(pare, anticFill);
			if (newValue != null) {
				if (reemplaçarFill(pare, anticFill, newValue))
					return newValue;
			} else if (alliberarFill(pare, anticFill))
				return null;
		}
		return anticFill;
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public K processarPareSiPresent(V fill, BiFunction<? super V, ? super K, ? extends K> funcióUnificació) {
		return obtenirFill().processarFillSiPresent(fill, funcióUnificació);
	}

	@Override
	public V processarFill(K pare, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		Objects.requireNonNull(funcióUnificació);
		V anticFill = pare.obtenirFill();
		for (;;) {
			V nouFill = funcióUnificació.apply(pare, anticFill);
			if (nouFill == null) {
				// alliberar mapatge
				if (anticFill != null) {
					// allibera Fill antic
					if (alliberarFill(pare, anticFill)) {
						// removed the old value as expected
						return null;
					}
					// un altre Fill ha reemplaçat l'antic. Torna-ho a provar
					anticFill = pare.obtenirFill();
				} else {
					// res a fer. Deixa les coses com estaven
					return null;
				}
			} else {
				// afegeix o reemplaça l'antic mapatge
				if (anticFill != null) {
					// reemplaça
					if (reemplaçarFill(pare, anticFill, nouFill)) {
						// reemplaçat com s'esperava.
						return nouFill;
					}
					// un altre Fill ha reemplaçat l'antic. Torna-ho a provar
					anticFill = pare.obtenirFill();
				} else {
					// afegeix (reemplaça su anticFill era nul)
					if ((anticFill = establirFillSiAbsent(pare, nouFill)) == null) {
						// replaced
						return nouFill;
					}
					// un altre Fill ha reemplaçat l'antic. Torna-ho a provar
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public K processarPare(V fill, BiFunction<? super V, ? super K, ? extends K> funcióUnificació) {
		return obtenirFill().processarFill(fill, funcióUnificació);
	}
	
	@Override
	public V unirFill(K pare, V fill, BiFunction<? super V, ? super V, ? extends V> funcióUnificació) {
		Objects.requireNonNull(funcióUnificació);
		Objects.requireNonNull(fill);
		V anticFill = pare.obtenirFill();
		for (;;) {
			if (anticFill != null) {
				V newValue = funcióUnificació.apply(anticFill, fill);
				if (newValue != null) {
					if (reemplaçarFill(pare, anticFill, newValue))
						return newValue;
				} else if (alliberarFill(pare, anticFill)) {
					return null;
				}
				anticFill = pare.obtenirFill();
			} else {
				if ((anticFill = establirFillSiAbsent(pare, fill)) == null) {
					return fill;
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public K unirPare(V fill, K pare, BiFunction<? super K, ? super K, ? extends K> funcióUnificació) {
		return obtenirFill().unirFill(fill, pare, funcióUnificació);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public K clone() {
		try {
			K pare = (K) getClass().getConstructor().newInstance();
			V fill = (V) obtenirFill().getClass().getConstructor().newInstance();
			pare.establirParitat(obtenirParitat());
			fill.establirParitat(obtenirFill().obtenirParitat());
			pare.establirPare(pare);
			fill.establirPare(fill);
			pare.establirFill(fill);
			fill.establirFill(pare);
			pare.establirDéu(obtenirDéu());
			fill.establirDéu(obtenirMareDeDéu());
			return pare;
		} catch (Throwable t) {
			throw new Error("hyperspace.time.Unification: clone exception.", t);
		}
	}
	
	/**
	 * L'aleatorietat.
	 */
	transient Random aleatorietat;
	
	/**
	 * L'aleatorietat
	 * @return l'aleatorietat.
	 */
	protected Random aleatorietat() {
		return aleatorietat == null ? (aleatorietat = new Random()) : aleatorietat;
	}
}