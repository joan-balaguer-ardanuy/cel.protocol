package cel;

/**
 * <tt>
 * <center>
 * <h3>Visió preparatòria: litúrgia celestial</h3>
 * <sup>1</sup> Després d'això, vaig veure una porta oberta en el cel, i vaig sentir aquella veu semblant al toc de trompeta que abans m'havia parlat. Em deia:<br/>
 * --Puja aquí dalt i et faré conèixer allò que aviat, després d'aquestes coses, s'ha de complir.<br/>
 * <sup>2</sup> Immediatament, l'Esperit es va apoderar de mi, i vaig veure un tron posat en el cel. Hi seia algú
 * <sup>3</sup> que resplendia amb un esclat semblant al del jaspi i la cornalina, i el tron era nimbat per un cercle de llum que brillava com la maragda.
 * <sup>4</sup> Al seu voltant hi havia vint-i-quatre trons, on seien vint-i-quatre ancians, vestits de blanc i coronats amb corones d'or.
 * <sup>5</sup> El tron espurnejava de llampecs, seguits pel retruny de la tronada. Davant el tron cremaven set torxes enceses, que són els set esperits de Déu,
 * <sup>6</sup> i per terra s'estenia com un mar de vidre semblant al glaç. Als quatre costats del tron hi havia quatre vivents plens d'ulls, que miraven endavant i endarrere.
 * <sup>7</sup> El primer vivent era semblant a un lleó; el segon, a un toro; el tercer tenia aspecte d'home, i el quart era semblant a una àguila en ple vol.
 * <sup>8</sup> Cada un dels quatre vivents tenia sis ales, i estaven plens d'ulls que miraven tot al voltant i cap al tron. Nit i dia no paraven de repetir: «Sant, sant, sant és el Senyor, Déu de l'univers, el qui era, el qui és i el qui ve.»<br/>
 * <sup>9</sup> I sempre que aquells vivents glorificaven i honoraven el qui seu al tron i viu pels segles dels segles i li donaven gràcies,
 * <sup>10</sup> els vint-i-quatre ancians es prosternaven davant el qui seu al tron, adorant el qui viu pels segles dels segles. Posaven les seves corones davant el tron i proclamaven:<br/>
 * <sup>11</sup> --Ets digne, Senyor Déu nostre,<br/>
 * de rebre la glòria, l'honor i el poder,<br/>
 * perquè has creat tot l'univers.<br/>
 * Quan res no existia,<br/>
 * tu vas voler que tot fos creat.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 */
public abstract class Déu implements Esperit {

	private static final long serialVersionUID = 5479249085887728066L;

	public String obtenirNom() {
		return null;
	}
 
	public String establirNom(String nom) {
		return null;
	}

	@Override
	public String getOrdre() {
		return null;
	}

	@Override
	public String setOrdre(String ordre) {
		return null;
	}


	public Déu() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public void manament(Ordre manament) {
		// TODO Auto-generated method stub
		
	}
}
