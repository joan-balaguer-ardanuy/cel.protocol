package cel;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import cel.temps.Temps;

/**
 * <tt>
 * <center>
 * <big>5</big>
 * <sup>1</sup> Després vaig veure a la mà dreta del qui seia al tron un document escrit per davant i per darrere i tancat amb set segells.
 * <sup>2</sup> Vaig veure també un àngel poderós que cridava amb tota la força:<br/>
 * --¿Qui és digne de trencar els segells i d'obrir el document?<br/>
 * <sup>3</sup> Però, ni al cel ni a la terra ni sota la terra, ningú no va ser capaç d'obrir el document i de veure què deia.
 * <sup>4</sup> Jo, veient que no trobaven ningú que fos digne d'obrir-lo i de veure què deia, plorava desconsoladament.
 * <sup>5</sup> Però un dels ancians em digué:<br/>
 * --No ploris: ha triomfat el lleó de la tribu de Judà, el rebrot de David. Ell obrirà el document i els seus set segells.<br/>
 * <sup>6</sup> Aleshores vaig veure al mig, en el tron, envoltat dels quatre vivents i dels vint-i-quatre ancians, un anyell dret, com degollat. Tenia set banyes i set ulls, que són els set esperits de {@link Déu}, enviats per tota la terra.
 * <sup>7</sup> L'{@link Anyell} es va acostar al qui seia al tron i prengué de la seva mà dreta aquell document.
 * <sup>8</sup> Així que el prengué, els quatre vivents i els vint-i-quatre ancians es van prosternar davant l'{@link Anyell}. Cada un tenia una cítara i una copa d'or, plena de perfums d'encens, que són les pregàries del poble sant.
 * <sup>9</sup> I entonaven un càntic nou que deia:<br/>
 * --Ets digne de prendre el document<br/>
 * i d'obrir-ne els segells,<br/>
 * perquè has estat degollat<br/>
 * i has comprat per a {@link Déu}<br/>
 * amb la teva sang<br/>
 * gent de tota tribu, llengua,<br/>
 * poble i nació,<br/>
 * <sup>10</sup> i n'has fet una casa reial<br/>
 * i uns sacerdots dedicats al nostre {@link Déu},<br/>
 * que regnaran a la terra.<br/>
 * <sup>11</sup> Llavors, en plena visió, vaig sentir les veus d'una multitud d'àngels que envoltaven el tron, i les veus dels vivents i dels ancians. Eren milers de milers i miríades de miríades,
 * <sup>12</sup> que exclamaven amb veu forta:<br/>
 * --Digne és l'{@link Anyell}<br/>
 * que ha estat degollat<br/>
 * de rebre tot poder, riquesa, saviesa,<br/>
 * força, honor, glòria i lloança.<br/>
 * <sup>13</sup> Després vaig sentir totes les criatures que hi ha al cel, a la terra, sota la terra i al mar, totes les que hi ha en aquests llocs, que proclamaven:<br/>
 * --Al qui seu al tron i a l'{@link Anyell}<br/>
 * siguin donats la lloança, l'honor,<br/>
 * la glòria i el poder<br/>
 * pels segles dels segles.<br/>
 * <sup>14</sup> Els quatre vivents responien:<br/>
 * --Amén.<br/>
 * I els ancians es van prosternar adorant.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Document<K,V> extends Temps<Anyell<K,V>,Anyell<V,K>> implements Anyell<K,V> {

	private static final long serialVersionUID = -6865045165135680029L;

	K clau;
	
	public K obtenirClau() {
		return clau;
	}

	public K establirClau(K clau) {
		K antigaClau = this.clau;
		this.clau = clau;
		return antigaClau;
	}

	public V obtenirValor() {
		return obtenirFill().obtenirClau();
	}

	public V establirValor(V valor) {
		return obtenirFill().establirClau(valor);
	}
	
	public Document() {
		super();
	}
	public Document(String nom) {
		super(nom);
	}
	public Document(Class<? extends Document<V,K>> classeFill, String nom, K clau, V valor) {
		super(classeFill, nom);
		establirClau(clau);
		establirValor(valor);
	}
	public Document(Document<K,V> pare) {
		super(pare);
	}
	public Document(Class<? extends Document<V,K>> classeFill, Document<K,V> pare, K clau, V valor) {
		super(classeFill, pare);
		establirClau(clau);
		establirValor(valor);
	}
	public Document(Document<K,V> déu, String nom) {
		super(déu, nom);
	}
	public Document(Class<? extends Document<V,K>> classeFill, Document<K,V> déu, String nom, K clau, V valor) {
		super(classeFill, déu, nom);
		establirClau(clau);
		establirValor(valor);
	}

	@Override
	public V obtenirValor(K clau) {
		return null;
	}
	@Override
	public K obtenirClau(V valor) {
		return null;
	}
	@Override
	public boolean contéClau(Object clau) {
		return false;
	}
	@Override
	public boolean contéValor(Object valor) {
		return false;
	}
	@Override
	public V obtenirValorPerDefecte(K clau, V valorPerDefecte) {
		return null;
	}
	@Override
	public K obtenirClauPerDefecte(V valor, K clauPerDefecte) {
		return null;
	}
	@Override
	public Anyell<K, V> obtenirParePerClau(K clau) {
		return null;
	}
	@Override
	public Anyell<V, K> obtenirFillPerValor(V valor) {
		return null;
	}
	@Override
	public long índexDeClau(K clau) {
		return 0;
	}
	@Override
	public long índexDeValor(V valor) {
		return 0;
	}
	@Override
	public V establirValor(K clau, V valor) {
		return null;
	}
	@Override
	public K establirClau(V valor, K clau) {
		return null;
	}
	@Override
	public V establirValorSiAbsent(K clau, V valor) {
		return null;
	}
	@Override
	public K establirClauSiAbsent(V valor, K clau) {
		return null;
	}
	@Override
	public V reemplaçarValor(K clau, V valor) {
		return null;
	}
	@Override
	public K reemplaçarClau(V valor, K clau) {
		return null;
	}
	@Override
	public boolean reemplaçarValor(K clau, V valorAntic, V valorNou) {
		return false;
	}
	@Override
	public boolean reemplaçarClau(V valor, K clauAntiga, K clauNova) {
		return false;
	}
	@Override
	public void reemplaçarTotsElsValors(BiFunction<? super K, ? super V, ? extends V> funció) {
		
	}
	@Override
	public void reemplaçarTotesLesClaus(BiFunction<? super V, ? super K, ? extends K> funció) {
		
	}
	@Override
	public V alliberarValor(K clau) {
		return null;
	}
	@Override
	public K alliberarClau(V valor) {
		return null;
	}
	@Override
	public boolean alliberarValor(K clau, V valor) {
		return false;
	}
	@Override
	public boolean alliberarClau(V valor, K clau) {
		return false;
	}
	@Override
	public void perCadaValor(BiConsumer<? super K, ? super V> acció) {
		
	}
	@Override
	public void perCadaClau(BiConsumer<? super V, ? super K> acciÓ) {
		
	}
	@Override
	public V processarValorSiAbsent(K clau, Function<? super K, ? extends V> funcióUnificació) {
		return null;
	}
	@Override
	public K processarClauSiAbsent(V valor, Function<? super V, ? extends K> funcióUnificació) {
		return null;
	}
	@Override
	public V processarValorSiPresent(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		return null;
	}
	@Override
	public K processarClauSiPresent(V valor, BiFunction<? super V, ? super K, ? extends K> funcióUnificació) {
		return null;
	}
	@Override
	public V processarValor(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		return null;
	}
	@Override
	public K processarClau(V valor, BiFunction<? super V, ? super K, ? extends K> funcióUnificació) {
		return null;
	}
	@Override
	public V unirValor(K clau, V valor, BiFunction<? super V, ? super V, ? extends V> funcióUnificació) {
		return null;
	}
	@Override
	public K unirClau(V valor, K clau, BiFunction<? super K, ? super K, ? extends K> funcióUnificació) {
		return null;
	}
	@Override
	public Iterator<Anyell<K, V>> iterator() {
		return null;
	}
	@Override
	public Object clone() {
		return null;
	}
	@Override
	public abstract int compareTo(Anyell<V, K> o);
	@Override
	public abstract void esdeveniment(Ordre manament);
	@Override
	public abstract void run();
}