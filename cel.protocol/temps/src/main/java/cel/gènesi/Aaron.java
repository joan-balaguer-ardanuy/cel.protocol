package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Aaron extends Home<Espaitemps, Hiperespai> {

	private static final long serialVersionUID = -9071886077186438664L;

	@Override
	@XmlElement
	public Espaitemps getKey() {
		return obtenirClau();
	}
	@Override
	public Espaitemps setKey(Espaitemps key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Hiperespai getValue() {
		return obtenirValor();
	}
	@Override
	public Hiperespai setValue(Hiperespai value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Aaron getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Aaron) obtenirPassat();
	}
	
	public Aaron() {
		super();
	}
	public Aaron(String nom) {
		super(nom);
	}
	public Aaron(String nom, Espaitemps clau, Hiperespai valor) {
		super(TimeMaster.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Aaron(Aaron pare) {
		super(pare);
	}
	public Aaron(Aaron pare, Espaitemps clau, Hiperespai valor) {
		super(TimeMaster.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Aaron(Aaron déu, String nom) {
		super(déu, nom);
	}
	public Aaron(Aaron déu, String nom, Espaitemps clau, Hiperespai valor) {
		super(TimeMaster.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Hiperespai, Espaitemps> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Supercúmul,Interestellar> anyell = obtenirClau().comparador().font();
		comparador((Espaitemps) anyell, (Hiperespai) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Espaitemps) {
			Espaitemps espaitemps = (Espaitemps) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(espaitemps, obtenirValor());
				Anyell<Supercúmul,Interestellar> anyell = obtenirClau().comparador().font();
				establir((Espaitemps) anyell, (Hiperespai) anyell.obtenirFill());
				break;
			case Manament.MOR:
				espaitemps.alliberar();
				obtenirValor().establirValor(espaitemps.obtenirValor(), espaitemps.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Aaron) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Aaron aaron = (Aaron) manament.getSource();
				permutarFill(aaron, aaron.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Supercúmul,Interestellar> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}