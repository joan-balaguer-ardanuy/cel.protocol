package cel;

/**
 * 
 * Visió preparatòria: litúrgia celestial
4
1 Després d'això, vaig veure una porta oberta en el cel, i vaig sentir aquella veu semblant al toc de trompeta que abans m'havia parlat. Em deia:
--Puja aquí dalt i et faré conèixer allò que aviat, després d'aquestes coses, s'ha de complir.
2 Immediatament, l'Esperit es va apoderar de mi, i vaig veure un tron posat en el cel. Hi seia algú 3 que resplendia amb un esclat semblant al del jaspi i la cornalina, i el tron era nimbat per un cercle de llum que brillava com la maragda. 4 Al seu voltant hi havia vint-i-quatre trons, on seien vint-i-quatre ancians, vestits de blanc i coronats amb corones d'or. 5 El tron espurnejava de llampecs, seguits pel retruny de la tronada. Davant el tron cremaven set torxes enceses, que són els set esperits de Déu, 6 i per terra s'estenia com un mar de vidre semblant al glaç. Als quatre costats del tron hi havia quatre vivents plens d'ulls, que miraven endavant i endarrere. 7 El primer vivent era semblant a un lleó; el segon, a un toro; el tercer tenia aspecte d'home, i el quart era semblant a una àguila en ple vol. 8 Cada un dels quatre vivents tenia sis ales, i estaven plens d'ulls que miraven tot al voltant i cap al tron. Nit i dia no paraven de repetir: «Sant, sant, sant és el Senyor, Déu de l'univers, el qui era, el qui és i el qui ve.»
9 I sempre que aquells vivents glorificaven i honoraven el qui seu al tron i viu pels segles dels segles i li donaven gràcies, 10 els vint-i-quatre ancians es prosternaven davant el qui seu al tron, adorant el qui viu pels segles dels segles. Posaven les seves corones davant el tron i proclamaven:
11 --Ets digne, Senyor Déu nostre,
de rebre la glòria, l'honor i el poder,
perquè has creat tot l'univers.
Quan res no existia,
tu vas voler que tot fos creat. 

 * @author joan
 *
 */
public abstract class Déu implements Esperit {

	private static final long serialVersionUID = 5479249085887728066L;

	public String getNom() {
		return null;
	}
 
	public String setNom(String nom) {
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
	public void esdeveniment(Ordre manament) {
		// TODO Auto-generated method stub
		
	}
}
