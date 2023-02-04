package cel;

/**
 * <tt>
 * <center>
 * <h3>Carta a l'església d'Esmirna</h3>
 * <sup>8</sup> »A l'àngel de l'església d'Esmirna, escriu-li:<br/>
 * »"Això diu el primer i el darrer, el qui era mort però ha tornat a la vida:<br/>
 * <sup>9</sup> »Conec la tribulació que passes i la teva pobresa, encara que, de fet, ets ric. Sé com t'injurien els qui es diuen jueus i no són res més que una sinagoga de Satanàs.
 * <sup>10</sup> No tinguis cap por dels sofriments que t'esperen. El diable, per provar-vos, en llançarà alguns de vosaltres a la presó, i la tribulació durarà deu dies. Sigues fidel fins a la mort i et donaré la corona de la vida.<br/>
 * <sup>11</sup> »Qui tingui orelles, que escolti què diu l'Esperit a les esglésies. Als qui surtin vencedors, la segona mort no els farà cap mal."<br/>
 * </center>
 * </tt>
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Corona
	<K extends EsperitSant<K,V>,V extends EsperitSant<V,K>>
		extends Fill<K,V> 
			implements EsperitSant<K,V> {

	private static final long serialVersionUID = 5798757654450842940L;

	public Corona() {
	}

	@Override
	public void alliberar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estàBuit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public abstract Comparador<K, V> comparador();
}