package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class TimeMaster extends Dona<Hiperespai, Espaitemps> {

	private static final long serialVersionUID = 349428359088025708L;

	@Override
	@XmlElement
	public Hiperespai getKey() {
		return obtenirClau();
	}
	@Override
	public Hiperespai setKey(Hiperespai key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Espaitemps getValue() {
		return obtenirValor();
	}
	@Override
	public Espaitemps setValue(Espaitemps value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public TimeMaster getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (TimeMaster) obtenirPassat();
	}
	
	public TimeMaster() {
		super();
	}
	public TimeMaster(String nom) {
		super(nom);
	}
	public TimeMaster(String nom, Hiperespai clau, Espaitemps valor) {
		super(Aaron.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public TimeMaster(TimeMaster pare) {
		super(pare);
	}
	public TimeMaster(TimeMaster pare, Hiperespai clau, Espaitemps valor) {
		super(Aaron.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public TimeMaster(TimeMaster déu, String nom) {
		super(déu, nom);
	}
	public TimeMaster(TimeMaster déu, String nom, Hiperespai clau, Espaitemps valor) {
		super(Aaron.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Espaitemps, Hiperespai> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Interestellar,Supercúmul> anyell = obtenirClau().comparador().font();
		comparador((Hiperespai) anyell, (Espaitemps) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Hiperespai) {
			Hiperespai interestel_lar = (Hiperespai) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(interestel_lar, obtenirValor());
				Anyell<Interestellar,Supercúmul> anyell = obtenirClau().comparador().font();
				establirValor((Hiperespai) anyell, (Espaitemps) anyell.obtenirFill());
				break;
			case Manament.MOR:
				interestel_lar.alliberar();
				obtenirValor().establirValor(interestel_lar.obtenirValor(), interestel_lar.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof TimeMaster) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				TimeMaster hiperespai = (TimeMaster) manament.getSource();
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
		for(Anyell<Interestellar,Supercúmul> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}