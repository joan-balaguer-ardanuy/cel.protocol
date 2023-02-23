
package cel.gènesi;

import cel.Anyell;
import cel.Document;
import cel.Paritat;

/**
 * <tt>
 * <center>
 * <h3>Caín i Abel</h3>
 * <sup>1</sup> L'home s'uní a Eva, la seva dona, que va infantar Caín. Ella deia:<br/>
 * --He procreat un noi, gràcies al Senyor.<br/>
 * <sup>2</sup> Més endavant va infantar Abel, germà de Caín. Abel era pastor d'ovelles i Caín treballava la terra.
 * <sup>3</sup> Acabades les collites, Caín va presentar al Senyor una ofrena dels fruits de la terra.
 * <sup>4</sup> Abel va oferir també les primeres cries del ramat amb el greix de les víctimes.<br/>
 * El Senyor va acollir favorablement Abel i la seva ofrena,
 * <sup>5</sup> però no acollí Caín i la seva. Caín es va irritar molt i anava amb el cap baix.
 * <sup>6</sup> El Senyor li digué:<br/>
 * --Per què estàs irritat i no aixeques el cap?
 * <sup>7</sup> Si obres bé, seràs acceptat; però, si no obres bé, el pecat aguaita a la porta: ell et desitja, però tu l'has de dominar.<br/>
 * <sup>8</sup> Caín va dir al seu germà Abel:<br/>
 * --Sortim al camp.<br/>
 * Un cop van ser al camp, Caín es va llançar sobre el seu germà Abel i el va matar.<br/>
 * <sup>9</sup> Llavors el Senyor va preguntar a Caín:<br/>
 * --On és el teu germà Abel?<br/>
 * Ell va respondre:<br/>
 * --No ho sé. Que potser sóc el guardià del meu germà?<br/>
 * <sup>10</sup> El Senyor li replicà:<br/>
 * --Què has fet? La sang del teu germà clama a mi des de la terra!
 * <sup>11</sup> Des d'ara, doncs, seràs maleït de la terra, que ha obert la boca per recollir de les teves mans la sang del teu germà.
 * <sup>12</sup> Quan treballis la terra, ja no et donarà els seus fruits. Aniràs pel món errant i fugitiu.<br/>
 * <sup>13</sup> Caín respongué al Senyor:<br/>
 * --El meu crim és massa gran per a poder-lo suportar.
 * <sup>14</sup> Des d'avui em bandeges de la terra fèrtil, i m'hauré d'amagar de la teva presència. Aniré pel món errant i fugitiu, i el primer que em trobi em matarà.<br/>
 * <sup>15</sup> El Senyor li va replicar:<br/>
 * --Això, no! Si algú mata Caín, Caín serà venjat set vegades.<br/>
 * Llavors el Senyor el va marcar amb un senyal, perquè no el matessin els qui el trobarien.<br/>
 * <sup>16</sup> Caín es retirà de la presència del Senyor i se n'anà a viure al país de Nod, a l'orient de l'Edèn.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Home<K,V> extends Document<K, V> implements Sang<K, V> {

	private static final long serialVersionUID = 3590272279824571851L;

	public Home() {
		super();
	}
	public Home(Paritat paritat) {
		super(paritat);
	}
	public Home(Class<? extends Document<V, K>> classeFill, Paritat paritat, K clau, V valor) {
		super(classeFill, paritat, clau, valor);
	}
	public Home(Document<K, V> pare) {
		super(pare);
	}
	public Home(Class<? extends Document<V, K>> classeFill, Document<K, V> pare, K clau, V valor) {
		super(classeFill, pare, clau, valor);
	}
	public Home(Document<K, V> déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Home(Class<? extends Document<V, K>> classeFill, Document<K, V> déu, Paritat paritat, K clau, V valor) {
		super(classeFill, déu, paritat, clau, valor);
	}

	@Override
	public V obtenir(K clau) {
		return obtenirValor(clau);
	}
	@Override
	public Anyell<K,V> establir(K clau, V valor) {
		return establirValor(clau, valor);
	}
	@Override
	public V alliberar(K clau) {
		return alliberarValor(clau);
	}
	@Override
	public void establirTot(Sang<? extends K, ? extends V> s) {
		establirCadaValor(s);
	}
}
