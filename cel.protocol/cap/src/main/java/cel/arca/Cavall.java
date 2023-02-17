package cel.arca;

/**
 * <tt>
 * <center>
 * <h3>La sisena trompeta</h3>
 * <sup>13</sup> Va tocar el sisè àngel i vaig sentir una veu que sortia dels quatre angles de l'altar d'or que hi ha al davant de Déu,
 * <sup>14</sup> i deia al sisè àngel que acabava de tocar:<br/>
 * --Deslliga els quatre àngels encadenats vora l'Eufrates, el gran riu.<br/>
 * <sup>15</sup> Llavors foren deslligats els quatre àngels que estaven preparats per a tal hora i tal dia de tal mes i tal any, perquè matessin la tercera part dels homes.
 * <sup>16</sup> El seu exèrcit era de vint mil miríades de soldats a cavall: així vaig sentir que ho proclamaven.
 * <sup>17</sup> Els cavalls i els seus genets, que vaig veure en plena visió, duien cuirasses de color de foc, de jacint i de sofre; els caps dels cavalls semblaven caps de lleó, i les seves boques vomitaven foc, sofre i fum.
 * <sup>18</sup> Una tercera part dels homes va morir d'aquelles tres plagues: el foc, el fum i el sofre que vomitaven les boques dels cavalls.
 * <sup>19</sup> El poder dels cavalls era, doncs, a la boca, i també a la cua, ja que tenien cues com serps, amb cap i tot, capaces de fer mal.<br/>
 * <sup>20</sup> Els homes que quedaven, els qui no van morir d'aquelles plagues, no abandonaren els déus que les seves mans havien fabricat i van continuar adorant dimonis i ídols d'or, plata, bronze, pedra i fusta, incapaços de veure-hi, de sentir-hi o de caminar;
 * <sup>21</sup> i tampoc no van deixar de cometre assassinats i maleficis, immoralitats i robatoris.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 */
public interface Cavall<E> extends Animal<E> {

	default boolean establirTot(long índex, Animal<E> a) {
		boolean modified = false;
        for (Animal<E> e : a) {
            establir(índex++, e.obtenirEntrada());
            modified = true;
        }
        return modified;
	}
	default E obtenir(long índex) {
		Ramat<E> it = pastor();
		for(E element = it.següent(); it.téMés(); element = it.següent()) {
			if(índex == 0) {
				return element;
			}
			índex--;
		}
		return null;
	}
	default void establir(long índex, E element) {
		for(Animal<E> actual : this) {
			if(índex == 0) {
				actual.establir(element);
			}
			índex--;
		}
	}
	default E establirPresent(long índex, E element) {
		for(Animal<E> actual : this) {
			if(índex == 0) {
				return actual.establirEntrada(element);
			}
			índex--;
		}
		return null;
	}
	default E alliberar(long índex) {
		for(Animal<E> actual : this) {
			if(índex == 0) {
				actual.alliberar();
				return actual.obtenirEntrada();
			}
			índex--;
		}
		return null;
	}
	default long índexDe(E element) {
		long índex = 0;
		Ramat<E> pastor = pastor();
		for(E ovella = pastor.següent(); pastor.téMés(); ovella = pastor.següent()) {
			if(ovella == element) {
				return índex;
			}
			índex++;
		}
		return 0;
	}
	default long darrerÍndexDe(E element) {
		long índex = 0;
		Ramat<E> conductor = conductor();
		for(E militant = conductor.següent(); conductor.téMés(); militant = conductor.següent()) {
			if(militant == element) {
				return índex;
			}
			índex++;
		}
		return 0;
	}
}