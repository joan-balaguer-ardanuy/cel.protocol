package cel.gènesi;

import cel.Anyell;
import cel.Document;
import cel.Paritat;

/**
 * <tt>
 * <center>
 * <h3>L'home i la dona</h3>
 * <sup>21</sup> Llavors el Senyor-Déu va fer caure l'home en un son profund. Quan quedà adormit, prengué una de les seves costelles i omplí amb carn el buit que havia deixat.
 * <sup>22</sup> De la costella que havia pres a l'home, el Senyor-Déu va fer-ne la dona, i la presentà a l'home.<br/>
 * <sup>23</sup> L'home exclamà:<br/>
 * --Aquesta sí que és os dels meus ossos i carn de la meva carn! El seu nom serà "dona", perquè ha estat presa de l'home.
 * <sup>24</sup> Per això l'home deixa el pare i la mare per unir-se a la seva dona, i des d'aquest moment formen una sola carn.<br/>
 * <sup>25</sup> Tots dos, l'home i la seva dona, anaven nus, i no se n'avergonyien.<br/>
 * </center>
 * </tt>
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Dona<K, V> extends Document<K,V> implements Cadena<K,V> {

	private static final long serialVersionUID = -7241496523177296358L;

	public Dona() {
		super();
	}
	public Dona(Paritat paritat) {
		super(paritat);
	}
	public Dona(Class<? extends Document<V, K>> classeFill, Paritat paritat, K clau, V valor) {
		super(classeFill, paritat, clau, valor);
	}
	public Dona(Document<K, V> pare) {
		super(pare);
	}
	public Dona(Class<? extends Document<V, K>> classeFill, Document<K, V> pare, K clau, V valor) {
		super(classeFill, pare, clau, valor);
	}
	public Dona(Document<K, V> déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Dona(Class<? extends Document<V, K>> classeFill, Document<K, V> déu, Paritat paritat, K clau, V valor) {
		super(classeFill, déu, paritat, clau, valor);
	}

	@Override
	public boolean conté(Anyell<K, V> entrada) {
		return téPare(entrada);
	}
	@Override
	public Anyell<K, V> obtenir(K clau) {
		return obtenirParePerClau(clau);
	}
	@Override
	public boolean establir(Anyell<K, V> entrada) {
		return establirFill(entrada, entrada.obtenirFill()) != null;
	}
	@Override
	public boolean alliberar(Anyell<K, V> entrada) {
		return alliberarFill(entrada, entrada.obtenirFill());
	}
	@Override
	public boolean contéTot(Anyell<K, V> entrada) {
		return téCadaPare(entrada);
	}
	@Override
	public void establirTot(Anyell<K, V> entrada) {
		establirCadaValor(entrada);
	}
	@Override
	public boolean retenirTot(Anyell<K, V> entrada) {
		return retenirCadaPare(entrada);
	}
}