package cel.nombres;

import cel.Nombre;
import cel.arca.Animal;
import cel.arca.Mula;

/**
 * <tt>
 * <center>
 * <h3>b. Els pans d'ofrena</h3>
 * <sup>5</sup> »Pren flor de farina i fes-ne coure dotze pans en forma de coca, de sis quilos cada un.
 * <sup>6</sup> Col·loca'ls després sobre la taula d'or pur, en dues piles de sis, a la presència del Senyor.
 * <sup>7</sup> Damunt de cada pila, posa-hi encens pur, per cremar-lo després en honor del Senyor. Aquest encens servirà, en comptes del pa, com a ofrena de memorial.<br/>
 * <sup>8</sup> »Cada dissabte, perpètuament, s'hauran de presentar aquests pans a la presència del Senyor. És un deure dels israelites per sempre.
 * <sup>9</sup> Aquests pans són per a Aaron i els seus descendents; se'ls menjaran en un lloc sant, perquè són una porció molt santa de les ofrenes cremades en honor del Senyor. Aquesta part els és reservada per sempre.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <E>
 */
public class Pila<E>
	extends Nombre<E>
		implements Mula<E> {

	private static final long serialVersionUID = 2656637928525737645L;

	public Pila() {
		super();
	}
	public Pila(Animal<E> pare, E entrada) {
		super(pare);
		establirEntrada(entrada);
	}
	@Override
	public String obtenirNom() {
		return "Déu";
	}
}