package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Espaitemps extends Home<Supercúmul,Interestellar> {

	private static final long serialVersionUID = -6584596587851190399L;
	@Override
	@XmlElement
	public Supercúmul getKey() {
		return obtenirClau();
	}
	@Override
	public Supercúmul setKey(Supercúmul key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Interestellar getValue() {
		return obtenirValor();
	}
	@Override
	public Interestellar setValue(Interestellar value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Espaitemps getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Espaitemps) obtenirPassat();
	}

	public Espaitemps() {
		super();
	}
	public Espaitemps(String nom) {
		super(nom);
	}
	public Espaitemps(String nom, Supercúmul clau, Interestellar valor) {
		super(Hiperespai.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Espaitemps(Espaitemps pare) {
		super(pare);
	}
	public Espaitemps(Espaitemps pare, Supercúmul clau, Interestellar valor) {
		super(Hiperespai.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Espaitemps(Espaitemps déu, String nom) {
		super(déu, nom);
	}
	public Espaitemps(Espaitemps déu, String nom, Supercúmul clau, Interestellar valor) {
		super(Hiperespai.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Interestellar, Supercúmul> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<ViaLàctia,Andròmeda> anyell = obtenirClau().comparador().font();
		comparador((Supercúmul) anyell, (Interestellar) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Supercúmul) {
			Supercúmul supercúmul = (Supercúmul) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(supercúmul, obtenirValor());
				Anyell<ViaLàctia,Andròmeda> anyell = obtenirClau().comparador().font();
				establir((Supercúmul) anyell, (Interestellar) anyell.obtenirFill());
				break;
			case Manament.MOR:
				supercúmul.alliberar();
				obtenirValor().establirValor(supercúmul.obtenirValor(), supercúmul.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Espaitemps) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Espaitemps espaitemps = (Espaitemps) manament.getSource();
				permutarFill(espaitemps, espaitemps.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<ViaLàctia,Andròmeda> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}