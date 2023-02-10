package cel.arca;

public interface Lleó<K,V> extends Animal<Lleó.Cadell<K,V>> {
	
	
	
	
	public interface Cadell<K,V> extends Animal<Cadell<K,V>> {
		K obtenirClau();
		K establirClau(K clau);
		V obtenirValor();
		V establirValor(V valor);
	}
}