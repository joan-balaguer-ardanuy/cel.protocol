package cel;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import cel.temps.Temps;

/**
 * <tt>
 * <center>
 * <h3>L'home en el paradís</h3>
 * Quan el Senyor-Déu va fer la terra i el cel
 * <sup>5</sup> no hi havia cap matoll ni havia nascut l'herba, perquè el Senyor-Déu encara no havia fet ploure, ni existia cap home que pogués conrear els camps.
 * <sup>6</sup> Però de dintre la terra pujava una humitat que els amarava en tota la seva extensió.<br/>
 * <sup>7</sup> Llavors el Senyor-Déu va modelar l'home amb pols de la terra. Li va infondre l'alè de vida, i l'home es convertí en un ésser viu.
 * <sup>8</sup> Després el Senyor-Déu plantà un jardí a l'Edèn, a la regió d'orient, i va posar-hi l'home que havia modelat.
 * <sup>9</sup> El Senyor-Déu va fer néixer de la terra fèrtil tota mena d'arbres que fan goig de veure i donen fruits saborosos. Al mig del jardí hi féu néixer l'arbre de la vida i l'arbre del coneixement del bé i del mal.<br/>
 * <sup>10</sup> De l'Edèn naixia un riu que regava el jardí, i des d'allà se separava en quatre braços:
 * <sup>11</sup> el primer es diu Fison, i recorre tot el país d'Havilà, on hi ha or,
 * <sup>12</sup> i l'or d'aquest país és molt fi; també s'hi troben la resina olorosa de bdel·li i la pedra d'ònix.
 * <sup>13</sup> El segon riu es diu Guihon, i recorre tot el país de Cuix.
 * <sup>14</sup> El tercer riu és el Tigris, que passa per la part oriental d'Assíria, i el quart és l'Eufrates.<br/>
 * <sup>15</sup> El Senyor-Déu va prendre l'home i el va posar al jardí de l'Edèn perquè el conreés i el guardés.
 * <sup>16</sup> I li va donar aquest manament:<br/>
 * --Pots menjar dels fruits de tots els arbres del jardí.
 * <sup>17</sup> Però no mengis del fruit de l'arbre del coneixement del bé i del mal, perquè el dia que en mengis, tingues per cert que moriràs.<br/>
 * <sup>18</sup> Llavors el Senyor-Déu es digué: «No és bo que l'home estigui sol. Li faré una ajuda que li faci costat.»<br/>
 * <sup>19</sup> El Senyor-Déu va modelar amb terra tots els animals feréstecs i tots els ocells, i els va presentar a l'home, per veure quin nom els donaria: cada un dels animals havia de portar el nom que l'home li posés.
 * <sup>20</sup> L'home donà un nom a cada un dels animals domèstics i feréstecs i a cada un dels ocells; però no va trobar una ajuda que li fes costat.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public class Cel<K,V> extends Temps<Anyell<K,V>,Anyell<V,K>> implements Anyell<K, V> {

	private static final long serialVersionUID = -6865045165135680029L;

	public K obtenirClau() {
		// TODO Auto-generated method stub
		return null;
	}

	public K establirClau(K clau) {
		// TODO Auto-generated method stub
		return null;
	}

	public V obtenirValor() {
		// TODO Auto-generated method stub
		return null;
	}

	public V establirValor(V valor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Cel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public V obtenirValor(K clau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K obtenirClau(V valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contéClau(Object clau) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contéValor(Object valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V obtenirValorPerDefecte(K clau, V valorPerDefecte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K obtenirClauPerDefecte(V valor, K clauPerDefecte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Anyell<K, V> obtenirParePerClau(K clau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Anyell<V, K> obtenirFillPerValor(V valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long índexDeClau(K clau) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long índexDeValor(V valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public V establirValor(K clau, V valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K establirClau(V valor, K clau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V establirValorSiAbsent(K clau, V valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K establirClauSiAbsent(V valor, K clau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V reemplaçarValor(K clau, V valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K reemplaçarClau(V valor, K clau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean reemplaçarValor(K clau, V valorAntic, V valorNou) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reemplaçarClau(V valor, K clauAntiga, K clauNova) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reemplaçarTotsElsValors(BiFunction<? super K, ? super V, ? extends V> funció) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reemplaçarTotesLesClaus(BiFunction<? super V, ? super K, ? extends K> funció) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V alliberarValor(K clau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K alliberarClau(V valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alliberarValor(K clau, V valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alliberarClau(V valor, K clau) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void perCadaValor(BiConsumer<? super K, ? super V> acció) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perCadaClau(BiConsumer<? super V, ? super K> acciÓ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V processarValorSiAbsent(K clau, Function<? super K, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K processarClauSiAbsent(V valor, Function<? super V, ? extends K> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V processarValorSiPresent(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K processarClauSiPresent(V valor, BiFunction<? super V, ? super K, ? extends K> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V processarValor(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K processarClau(V valor, BiFunction<? super V, ? super K, ? extends K> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V unirValor(K clau, V valor, BiFunction<? super V, ? super V, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K unirClau(V valor, K clau, BiFunction<? super K, ? super K, ? extends K> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

}