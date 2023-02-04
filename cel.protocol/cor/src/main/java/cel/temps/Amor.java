package cel.temps;

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
	<K extends Viu<K,V>,V extends Viu<V,K>> 
		extends Regne<K, V>
			implements Viu<K,V> {

	private static final long serialVersionUID = -7927605437161885044L;

	public Amor() {

	}

	@Override
	public Reproductor<K, V> comparador() {
		return null;
	}

}
