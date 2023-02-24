package cel;

public enum Paritat {
	XY,
	XX,
	YY;
	
	public Paritat oposada() {
		if(this == Paritat.XX)
			return XY;
		else if(this == Paritat.XY)
			return XX;
		else return YY;
	}
}
