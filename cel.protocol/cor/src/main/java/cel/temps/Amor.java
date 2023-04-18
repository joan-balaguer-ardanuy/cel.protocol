package cel.temps;

import java.util.Objects;
import java.util.function.BiFunction;

import cel.Paritat;

/**
 * <tt>
 * <center>
 * <h3>Déu és amor</h3>
 * <sup>7</sup> Estimats meus, estimem-nos els uns als altres, perquè l'amor ve de Déu; tothom qui estima ha nascut de Déu i coneix Déu.
 * <sup>8</sup> El qui no estima no coneix Déu, perquè Déu és amor.<br/>
 * <sup>9</sup> L'amor de Déu s'ha manifestat enmig nostre quan ha enviat al món el seu Fill únic perquè visquem gràcies a ell.
 * <sup>10</sup> L'amor consisteix en això: no som nosaltres qui ens hem avançat a estimar Déu; ell ens ha estimat primer i ha enviat el seu Fill com a víctima que expia els nostres pecats.<br/>
 * <sup>11</sup> Estimats meus, si Déu ens ha estimat tant, també nosaltres ens hem d'estimar els uns als altres.
 * <sup>12</sup> A Déu, ningú no l'ha vist mai; però si ens estimem, ell està en nosaltres i, dins nostre, el seu amor ha arribat a la plenitud.
 * <sup>13</sup> Coneixem que estem en ell i que ell està en nosaltres perquè ens ha donat el seu Esperit.<br/>
 * <sup>14</sup> Nosaltres donem testimoni d'allò que hem contemplat: el Pare ha enviat el seu Fill com a salvador del món.
 * <sup>15</sup> Per això tothom qui confessa que Jesús és el Fill de Déu, està en Déu, i Déu en ell.<br/>
 * <sup>16</sup> Nosaltres hem conegut l'amor que Déu ens té i hi hem cregut. Déu és amor; el qui està en l'amor està en Déu, i Déu està en ell.
 * <sup>17</sup> A dins nostre, l'amor ha arribat a la plenitud, i per això mirem amb confiança el dia del judici, perquè, tot i que estem en aquest món, vivim tal com Jesucrist viu.
 * <sup>18</sup> On hi ha amor no hi ha por, ja que l'amor, quan és complet, treu fora la por. La por i el càstig van junts; per això només té por el qui no estima Déu plenament.<br/>
 * <sup>19</sup> Ja que Déu ens ha estimat primer, estimem també nosaltres.
 * <sup>20</sup> Si algú afirmava: «Jo estimo Déu», però no estima el seu germà, seria un mentider, perquè el qui no estima el seu germà, que veu, no pot estimar Déu, que no veu.
 * <sup>21</sup> Aquest és el manament que hem rebut de Jesús: qui estima Déu, també ha d'estimar el seu germà.<br/>
 * </center>
 * </tt>
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Amor
	<K extends Vida<K,V>,V extends Vida<V,K>> 
		extends Bondat<K, V>
			implements Vida<K,V> {

	private static final long serialVersionUID = -7927605437161885044L;

	public Amor() {
		super();
	}
	public Amor(Paritat paritat) {
		super(paritat);
	}
	public Amor(Class<? extends V> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Amor(K pare) {
		super(pare);
	}
	public Amor(Class<? extends V> classeFill, K pare) {
		super(classeFill, pare);
	}
	public Amor(K déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Amor(Class<? extends V> classeFill, K déu, Paritat paritat) {
		super(classeFill, déu, paritat);
	}

	@Override
	public V reemplaçarFill(K pare, V fill) {
		V fillActual;
        if ((fillActual = pare.obtenirFill()) != null) {
            fillActual = establirFill(pare, fill);
        }
        return fillActual;
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public K reemplaçarPare(V fill, K pare) {
		return obtenirFill().reemplaçarFill(fill, pare);
	}

	@Override
	public boolean reemplaçarFill(K pare, V anticFill, V nouFill) {
		Object curValue = pare.obtenirFill();
        if (!Objects.equals(curValue, anticFill) ||
            (curValue == null && !téPare(pare))) {
            return false;
        }
        establirFill(pare, nouFill);
        return true;
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public boolean reemplaçarPare(V fill, K anticPare, K nouPare) {
		return obtenirFill().reemplaçarFill(fill, anticPare, nouPare);
	}

	@Override
	public void reemplaçarTotsElsFills(BiFunction<? super K, ? super V, ? extends V> funció) {
		Objects.requireNonNull(funció);
        perCadaFill((k,v) -> {
            while(!reemplaçarFill(k, v, funció.apply(k, v))) {
                // v changed or k is gone
                if ( (v = k.obtenirFill()) == null) {
                    // k is no longer in the map.
                    break;
                }
            }
        });
	}

	/**
	 * {@inheritDoc}
     *
     * @implSpec
     * Aquesta implementació delega el mètode al Fill
	 */
	@Override
	public void reemplaçarTotsElsPares(BiFunction<? super V, ? super K, ? extends K> funció) {
		obtenirFill().reemplaçarTotsElsFills(funció);
	}
	
	@Override
	public abstract Vida.Reproductor<K, V> comparador();
//	{
//		return comparador == null ? comparador = new Òrgan((K) crea(getClass(), obtenirFill().getClass(), obtenirNom())) : comparador;
//	}

	protected abstract class Òrgan implements Reproductor<K,V> {

		V font;
		
		public Òrgan(V font) {
			this.font = font;
		}
		
		@Override
		public V font() {
			return font;
		}
		
		public abstract void establirPare(K clau);
		
		public abstract void establirFill(V fill);

		@Override
		public synchronized void compara(K pare, V fill) {
			K p = pare.obtenirPare();
			V f = fill.obtenirPare();
			do {
				p.compareTo(f);
				establirFill(p.comparador().font());
				p = p.obtenirPare();
				f = f.obtenirPare();
				if ((p != pare && f != fill)) {
					f.compareTo(p);
					establirPare(f.comparador().font());
					p = p.obtenirPare();
					f = f.obtenirPare();
				}

			} while (p != pare && f != fill);
			
//			do {
//				p = f.obtenirFill();
//				f = p.obtenirFill();
//				p.compareTo(f);
//				establirFill(p.comparador().font());
//				if((p != pare && f != fill)) {
//					p = f.obtenirFill();
//					f = p.obtenirFill();
//					f.compareTo(p);
//					establirPare(f.comparador().font());
//				}
//			} while(p != pare && f != fill);
		}
	}
}