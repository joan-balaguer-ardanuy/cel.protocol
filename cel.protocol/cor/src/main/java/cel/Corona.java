package cel;

public abstract class Corona
	<K extends EsperitSant<K,V>,V extends EsperitSant<V,K>>
		extends Fill<K,V> 
			implements EsperitSant<K,V> {

	private static final long serialVersionUID = 5798757654450842940L;

	public Corona() {
	}
}