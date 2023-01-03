package cel;

import java.io.Serializable;

public interface Missatger extends Serializable, Cloneable {

	String getNom();
	String setNom(String nom);
	
	String getOrdre();
	String setOrdre(String ordre);
}
