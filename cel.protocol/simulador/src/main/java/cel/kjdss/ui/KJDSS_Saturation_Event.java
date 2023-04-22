package cel.kjdss.ui;

import java.util.EventObject;

import cel.kjdss.ui.KJScopeAndSpectrumAnalyzer.Band;



public class KJDSS_Saturation_Event extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int eventType = -1;
	private Band pBand = null;
	

	public static class Event_Types {
		public static final int SAT_6000 = 0;
		public static final int NO_SAT_6000 = 1;
		public static final int SAT_100 = 2;
		public static final int NO_SAT_100 = 3;
		public static final int SAT = 4;
		public static final int NO_SAT = 5;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public Band getBand() {
		return pBand;
	}
	
	public void setBand(Band pBand) {
		this.pBand = pBand;
	}
	
	public KJDSS_Saturation_Event(Object source) {

		super(source);
	}
}
