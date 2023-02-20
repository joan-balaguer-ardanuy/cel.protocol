package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class DéuPare extends Home<Aaron,TimeMaster> {

	private static final long serialVersionUID = -2458979709062312538L;

	@Override
	@XmlElement
	public Aaron getKey() {
		return obtenirClau();
	}
	@Override
	public Aaron setKey(Aaron key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public TimeMaster getValue() {
		return obtenirValor();
	}
	@Override
	public TimeMaster setValue(TimeMaster value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public DéuPare getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (DéuPare) obtenirPassat();
	}
	
	public DéuPare() {
		super();
	}
	public DéuPare(String nom) {
		super(nom);
	}
	public DéuPare(String nom, Aaron clau, TimeMaster valor) {
		super(MareDeDéu.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public DéuPare(DéuPare pare) {
		super(pare);
	}
	public DéuPare(DéuPare pare, Aaron clau, TimeMaster valor) {
		super(MareDeDéu.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public DéuPare(DéuPare déu, String nom) {
		super(déu, nom);
	}
	public DéuPare(DéuPare déu, String nom, Aaron clau, TimeMaster valor) {
		super(MareDeDéu.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<TimeMaster, Aaron> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Espaitemps,Hiperespai> anyell = obtenirClau().comparador().font();
		comparador((Aaron) anyell, (TimeMaster) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Aaron) {
			Aaron aaron = (Aaron) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(aaron, obtenirValor());
				Anyell<Espaitemps,Hiperespai> anyell = obtenirClau().comparador().font();
				establir((Aaron) anyell, (TimeMaster) anyell.obtenirFill());
				break;
			case Manament.MOR:
				aaron.alliberar();
				obtenirValor().establirValor(aaron.obtenirValor(), aaron.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof DéuPare) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				DéuPare déuPare = (DéuPare) manament.getSource();
				permutarFill(déuPare, déuPare.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Espaitemps,Hiperespai> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}