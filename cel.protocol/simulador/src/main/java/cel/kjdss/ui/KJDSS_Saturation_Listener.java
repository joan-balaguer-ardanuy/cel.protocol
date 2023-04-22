package cel.kjdss.ui;

public interface KJDSS_Saturation_Listener {
	/***
	 * Es dispara en quan actua el comparador de nivell 
	 * @param event
	 * Cont� tipus d'event i informaci� de la banda analitzada.
	 */
	public void on_Saturation_Event(KJDSS_Saturation_Event event);
}
