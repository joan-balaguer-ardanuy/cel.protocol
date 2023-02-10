package cel;

import java.io.Serializable;

/**
 * <tt>
 * <center>
 * <h3> Missió del profeta</h3>
 * <sup>3</sup> ¿Poden dos homes<br/>
 * començar junts un viatge<br/>
 * si abans no s'han posat d'acord?<br/>
 * <sup>4</sup> ¿Rugeix el lleó enmig del bosc<br/>
 * si no ha trobat cap presa?<br/>
 * ¿Crida el seu cadell des de l'amagatall<br/>
 * si no ha caçat res?<br/>
 * <sup>5</sup> ¿Cau l'ocell en un parany<br/>
 * sense un esquer que l'hi porti?<br/>
 * ¿Salten de terra els filats<br/>
 * si no hi ha res per capturar?<br/>
 * <sup>6</sup> ¿Toca a la ciutat el corn de guerra<br/>
 * sense que la gent s'alarmi?<br/>
 * ¿Passa cap desgràcia a la ciutat<br/>
 * que no vingui de la mà del Senyor?<br/>
 * <sup>7</sup> Doncs bé, el Senyor, Déu sobirà,<br/>
 * no fa res<br/>
 * sense revelar el seu designi secret<br/>
 * als seus servents, els profetes.<br/>
 * <sup>8</sup> Quan un lleó rugeix,<br/>
 * qui no s'esglaia?<br/>
 * Quan parla el Senyor, Déu sobirà,<br/>
 * qui no transmetrà el seu missatge? <br/>
 * </center>
 * </tt>
 * 
 * @author joan
 * 
 * @see Serializable
 * @see Cloneable
 */
public interface Missatge extends Cloneable, Serializable {

	/**
	 * Obté el nom de la instància d'aquest {@link Missatge} a transmetre.
	 * @return {@link String} el nom de la instància d'aquest {@link Missatge}
	 */
	String obtenirNom();
	
	/**
	 * Estableix el nom de la instància d'aquest {@link Missatge} a transmetre.
	 * @param nom el nom de la instància d'aquest {@link Missatge} a transmetre
	 */
	void establirNom(String nom);
	
	/**
	 * Obté l'ordre de la instància d'aquest {@link Missatge} a transmetre.
	 * @return {@link String} l'ordre de la instància d'aquest {@link Missatge}
	 */
	String obtenirOrdre();

	/**
	 * Estableix l'ordre de la instància d'aquest {@link Missatge} a transmetre.
	 * @param ordre l'ordre de la instància d'aquest {@link Missatge} a transmetre
	 */
	void establirOrdre(String ordre);
}