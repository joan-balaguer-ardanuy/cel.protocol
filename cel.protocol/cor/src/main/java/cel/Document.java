package cel;

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
	public Document(Paritat paritat) {
		super(paritat);
	}
	public Document(Class<? extends Document<V,K>> classeFill, Paritat paritat, K clau, V valor) {
		super(classeFill, paritat);
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
	public Document(Document<K,V> déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Document(Class<? extends Document<V,K>> classeFill, Document<K,V> déu, Paritat paritat, K clau, V valor) {
		super(classeFill, déu, paritat);
		establirClau(clau);
		establirValor(valor);
	}

	@Override
	public V obtenirValor(K clau) {
		for(Anyell<K,V> anyell : this) {
			if(clau == anyell.obtenirClau()) {
				return anyell.obtenirValor();
			}
		}
		return null;
	}
	@Override
	public K obtenirClau(V valor) {
		return obtenirFill().obtenirValor(valor);
	}
	@Override
	public boolean contéClau(K clau) {
		for(Anyell<K,V> anyell : this) {
			if(clau == anyell.obtenirClau()) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean contéValor(V valor) {
		return obtenirFill().contéClau(valor);
	}
	@Override
	public V obtenirValorPerDefecte(K clau, V valorPerDefecte) {
		for(Anyell<K,V> anyell : this) {
			if(clau == anyell.obtenirClau()) {
				return anyell.obtenirValor();
			}
		}
		return valorPerDefecte;
	}
	@Override
	public K obtenirClauPerDefecte(V valor, K clauPerDefecte) {
		return obtenirFill().obtenirValorPerDefecte(valor, clauPerDefecte);
	}
	@Override
	public Anyell<K,V> obtenirParePerClau(K clau) {
		for(Anyell<K,V> anyell : this) {
			if(clau == anyell.obtenirClau()) {
				return anyell;
			}
		}
		return null;
	}
	@Override
	public Anyell<V, K> obtenirFillPerValor(V valor) {
		return obtenirFill().obtenirParePerClau(valor);
	}
	@SuppressWarnings("unchecked")
	@Override
	public synchronized Anyell<K,V> establirValor(K clau, V valor) {
		return (Anyell<K,V>) crea(getClass(), obtenirPare(), clau, valor);
	}
	@Override
	public Anyell<V,K> establirClau(V valor, K clau) {
		return obtenirFill().establirValor(valor, clau);
	}
	@Override
	public void establirCadaValor(Anyell<? extends K, ? extends V> a) {
		for(Anyell<? extends K, ? extends V> anyell : a) {
			establirValor(anyell.obtenirClau(), anyell.obtenirValor());
		}
	}
	@Override
	public void establirCadaClau(Anyell<? extends V, ? extends K> a) {
		obtenirFill().establirCadaValor(a);
	}
	@Override
	public Anyell<K,V> establirValorSiAbsent(K clau, V valor) {
		for(Anyell<K,V> anyell : this) {
			if(clau == anyell.obtenirClau()) {
				return null;
			}
		}
		return establirValor(clau, valor);
	}
	@Override
	public Anyell<V,K> establirClauSiAbsent(V valor, K clau) {
		return obtenirFill().establirValorSiAbsent(valor, clau);
	}
	@Override
	public V reemplaçarValor(K clau, V valor) {
		for(Anyell<K,V> anyell : this) {
			if(clau == anyell.obtenirClau()) {
				return anyell.establirValor(valor);
			}
		}
		return null;
	}
	@Override
	public K reemplaçarClau(V valor, K clau) {
		return obtenirFill().reemplaçarValor(valor, clau);
	}
	@Override
	public boolean reemplaçarValor(K clau, V valorAntic, V valorNou) {
		for(Anyell<K,V> anyell : this) {
			if(clau == anyell.obtenirClau()) {
				if(valorAntic == anyell.obtenirValor()) {
					anyell.establirValor(valorNou);
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean reemplaçarClau(V valor, K clauAntiga, K clauNova) {
		return obtenirFill().reemplaçarValor(valor, clauAntiga, clauNova);
	}
	@Override
	public void reemplaçarTotsElsValors(BiFunction<? super K, ? super V, ? extends V> funció) {
		for(Anyell<K,V> anyell : this) {
			anyell.establirValor(funció.apply(anyell.obtenirClau(), anyell.obtenirValor()));
		}
	}
	@Override
	public void reemplaçarTotesLesClaus(BiFunction<? super V, ? super K, ? extends K> funció) {
		obtenirFill().reemplaçarTotsElsValors(funció);
	}
	@Override
	public V alliberarValor(K clau) {
		for(Anyell<K,V> anyell : this) {
			if(clau == anyell.obtenirClau()) {
				anyell.alliberar();
				return anyell.obtenirValor();
			}
		}
		return null;
	}
	@Override
	public K alliberarClau(V valor) {
		return obtenirFill().alliberarValor(valor);
	}
	@Override
	public boolean alliberarValor(K clau, V valor) {
		for(Anyell<K,V> anyell : this) {
			if(clau == anyell.obtenirClau()) {
				if(valor == anyell.obtenirValor()) {
					anyell.alliberar();
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean alliberarClau(V valor, K clau) {
		return obtenirFill().alliberarValor(valor, clau);
	}
	@Override
	public void perCadaValor(BiConsumer<? super K, ? super V> acció) {
		for(Anyell<K,V> anyell : this) {
			acció.accept(anyell.obtenirClau(), anyell.obtenirValor());
		}
	}
	@Override
	public void perCadaClau(BiConsumer<? super V, ? super K> acció) {
		obtenirFill().perCadaValor(acció);
	}
	@Override
	public V processarValorSiAbsent(K clau, Function<? super K, ? extends V> funcióUnificació) {
		for(Anyell<K,V> anyell : this)  {
			if(clau == anyell.obtenirClau()) {
				return null;
			}
		}
		V valorNou;
		V valorAntic = null;
		if((valorNou = funcióUnificació.apply(clau)) != null) {
			valorAntic = obtenirValor(clau);
			alliberarValor(clau);
			establirValor(clau, valorNou);
		}
		return valorAntic;
	}
	@Override
	public K processarClauSiAbsent(V valor, Function<? super V, ? extends K> funcióUnificació) {
		return obtenirFill().processarValorSiAbsent(valor, funcióUnificació);
	}
	@Override
	public V processarValorSiPresent(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		for(Anyell<K,V> anyell : this)  {
			if(clau == anyell.obtenirClau()) {
				V valorNou;
				V valorAntic = null;
				if((valorNou = funcióUnificació.apply(clau, anyell.obtenirValor())) != null) {
					valorAntic = obtenirValor(clau);
					alliberarValor(clau);
					establirValor(clau, valorNou);
				}
				return valorAntic;
			}
		}
		return null;
	}
	@Override
	public K processarClauSiPresent(V valor, BiFunction<? super V, ? super K, ? extends K> funcióUnificació) {
		return obtenirFill().processarValorSiPresent(valor, funcióUnificació);
	}
	@Override
	public V processarValor(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		for(Anyell<K,V> anyell : this)  {
			if(clau == anyell.obtenirClau()) {
				V newValue;
				if((newValue = funcióUnificació.apply(clau, anyell.obtenirValor())) == null) {
					anyell.alliberar();
					return anyell.obtenirValor();
				}
				else return anyell.establirValor(newValue);
			}
		}
		return null;
	}
	@Override
	public K processarClau(V valor, BiFunction<? super V, ? super K, ? extends K> funcióUnificació) {
		return obtenirFill().processarValor(valor, funcióUnificació);
	}
	@Override
	public V unirValor(K clau, V valor, BiFunction<? super V, ? super V, ? extends V> funcióUnificació) {
		for(Anyell<K,V> entry : this)  {
			if(clau == entry.obtenirClau()) {
				return entry.establirValor(funcióUnificació.apply(entry.obtenirValor(), valor));
			}
		}
		return null;
	}
	@Override
	public K unirClau(V valor, K clau, BiFunction<? super K, ? super K, ? extends K> funcióUnificació) {
		return obtenirFill().unirValor(valor, clau, funcióUnificació);
	}
	@Override
	public Anyell<K, V> clone() {
		Anyell<K, V> anyell = super.clone();
		anyell.establirClau(obtenirClau());
		anyell.establirValor(obtenirValor());
		return anyell;
	}
	@Override
	public abstract int compareTo(Anyell<V,K> o);
	
	Anyell.Generador<K,V> comparador;
	
	@Override
	public Anyell.Generador<K,V> comparador() {
		return comparador == null ? comparador = new Matriu(obtenirValor(), obtenirClau()) : comparador;
	}
	public Anyell.Generador<K,V> comparador(V valor, K clau) {
		comparador = new Matriu(valor, clau);
		return comparador;
	}
	private class Matriu extends Òrgan implements Generador<K,V> {

		@SuppressWarnings("unchecked")
		public Matriu(V valor, K clau) {
			super((Anyell<V,K>) crea(Document.this.obtenirFill().getClass(), Paritat.aleatòria(), valor, clau));
		}
		@SuppressWarnings("unchecked")
		@Override
		public void establir(V valor, K clau) {
			Anyell<V,K> anyell = (Anyell<V,K>) crea(Document.this.obtenirFill().getClass(), font(), font().obtenirParitat(), valor, clau);
			font().establirFill(anyell, anyell.obtenirFill());
//			font().establirValor(valor, clau);
		}
		@Override
		public void establirPare(Anyell<K, V> pare) {
			establir(pare.obtenirValor(), pare.obtenirClau());
		}
		@Override
		public void establirFill(Anyell<V, K> fill) {
			establir(fill.obtenirClau(),fill.obtenirValor());
		}
	}
}