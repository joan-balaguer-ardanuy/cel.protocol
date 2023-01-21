package cel;

import java.io.Serializable;

/**
 * <tt>
 * <center>
 * 3 ¿Poden dos homes<br/>
 * començar junts un viatge<br/>
 * si abans no s'han posat d'acord?<br/>
 * 4 ¿Rugeix el lleó enmig del bosc<br/>
 * si no ha trobat cap presa?<br/>
 * ¿Crida el seu cadell des de l'amagatall<br/>
 * si no ha caçat res?<br/>
 * 5 ¿Cau l'ocell en un parany<br/>
 * sense un esquer que l'hi porti?<br/>
 * ¿Salten de terra els filats<br/>
 * si no hi ha res per capturar?<br/>
 * 6 ¿Toca a la ciutat el corn de guerra<br/>
 * sense que la gent s'alarmi?<br/>
 * ¿Passa cap desgràcia a la ciutat<br/>
 * que no vingui de la mà del Senyor?<br/>
 * 7 Doncs bé, el Senyor, Déu sobirà,<br/>
 * no fa res<br/>
 * sense revelar el seu designi secret<br/>
 * als seus servents, els profetes.<br/>
 * 8 Quan un lleó rugeix,<br/>
 * qui no s'esglaia?<br/>
 * Quan parla el Senyor, Déu sobirà,<br/>
 * qui no transmetrà el seu missatge? <br/>
 * </center>
 * </tt>
 * @author joan
 *
 */
public interface Missatge extends Serializable, Cloneable {

	String getNom();
	String setNom(String nom);
	
	String getOrdre();
	String setOrdre(String ordre);
}
