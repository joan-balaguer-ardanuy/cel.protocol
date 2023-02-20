package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Hiperespai extends Dona<Interestellar,Supercúmul> {

	private static final long serialVersionUID = -7763397311549664178L;

	@Override
	@XmlElement
	public Interestellar getKey() {
		return obtenirClau();
	}
	@Override
	public Interestellar setKey(Interestellar key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Supercúmul getValue() {
		return obtenirValor();
	}
	@Override
	public Supercúmul setValue(Supercúmul value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Hiperespai getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Hiperespai) obtenirPassat();
	}

	public Hiperespai() {
		super();
	}
	public Hiperespai(String nom) {
		super(nom);
	}
	public Hiperespai(String nom, Interestellar clau, Supercúmul valor) {
		super(Espaitemps.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Hiperespai(Hiperespai pare) {
		super(pare);
	}
	public Hiperespai(Hiperespai pare, Interestellar clau, Supercúmul valor) {
		super(Espaitemps.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Hiperespai(Hiperespai déu, String nom) {
		super(déu, nom);
	}
	public Hiperespai(Hiperespai déu, String nom, Interestellar clau, Supercúmul valor) {
		super(Espaitemps.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Supercúmul, Interestellar> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Andròmeda,ViaLàctia> anyell = obtenirClau().comparador().font();
		comparador((Interestellar) anyell, (Supercúmul) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Interestellar) {
			Interestellar interestel_lar = (Interestellar) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(interestel_lar, obtenirValor());
				Anyell<Andròmeda,ViaLàctia> anyell = obtenirClau().comparador().font();
				establirValor((Interestellar) anyell, (Supercúmul) anyell.obtenirFill());
				break;
			case Manament.MOR:
				interestel_lar.alliberar();
				obtenirValor().establirValor(interestel_lar.obtenirValor(), interestel_lar.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Hiperespai) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Hiperespai hiperespai = (Hiperespai) manament.getSource();
				permutarFill(hiperespai, hiperespai.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Andròmeda,ViaLàctia> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}