package cel.gènesi;

import java.util.Iterator;

import cel.Anyell;
import cel.Document;
import cel.Ordre;

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
 * @param <K>
 * @param <V>
 */
public class Dona<K, V> extends Document<K,V> implements Cadena<K,V> {

	private static final long serialVersionUID = -7241496523177296358L;

	public Dona() {
		// TODO Auto-generated constructor stub
	}

	public Iterator<Anyell<K, V>> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Anyell<V, K> o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void esdeveniment(Ordre manament) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}