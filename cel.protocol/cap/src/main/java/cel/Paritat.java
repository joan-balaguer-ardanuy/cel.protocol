package cel;

import java.util.Random;

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
	/**
	 * L'aleatorietat.
	 */
	private static Random aleatorietat = new Random();
	
	/**
	 * L'aleatorietat
	 * @return l'aleatorietat.
	 */
	public static Paritat aleatòria() {
//		if(aleatorietat.nextBoolean()) {
//			return XX;
//		} else {
//			return XY;
//		}
		switch (aleatorietat.nextInt(3)) {
		case 0:
			return XY;
		case 1:
			return XX;
		default:
			return YY;
		}
//		int val = aleatorietat.nextInt(1001);
//		if(val <= 499) {
//			return XX;
//		} else if (val > 499 && val < 1000) {
//			return XY;
//		}
//		else {
//			return YY;
//		}
	}
}
