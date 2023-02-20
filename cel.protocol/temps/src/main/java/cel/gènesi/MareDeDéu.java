package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class MareDeDéu extends Dona<TimeMaster, Aaron> {

	private static final long serialVersionUID = 8747126417822477895L;

	@Override
	@XmlElement
	public TimeMaster getKey() {
		return obtenirClau();
	}
	@Override
	public TimeMaster setKey(TimeMaster key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Aaron getValue() {
		return obtenirValor();
	}
	@Override
	public Aaron setValue(Aaron value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public MareDeDéu getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (MareDeDéu) obtenirPassat();
	}

	public MareDeDéu() {
		super();
	}
	public MareDeDéu(String nom) {
		super(nom);
	}
	public MareDeDéu(String nom, TimeMaster clau, Aaron valor) {
		super(DéuPare.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public MareDeDéu(MareDeDéu pare) {
		super(pare);
	}
	public MareDeDéu(MareDeDéu pare, TimeMaster clau, Aaron valor) {
		super(DéuPare.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public MareDeDéu(MareDeDéu déu, String nom) {
		super(déu, nom);
	}
	public MareDeDéu(MareDeDéu déu, String nom, TimeMaster clau, Aaron valor) {
		super(DéuPare.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Aaron, TimeMaster> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Hiperespai,Espaitemps> anyell = obtenirClau().comparador().font();
		comparador((TimeMaster) anyell, (Aaron) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof TimeMaster) {
			TimeMaster timeMaster = (TimeMaster) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(timeMaster, obtenirValor());
				Anyell<Hiperespai,Espaitemps> anyell = obtenirClau().comparador().font();
				establirValor((TimeMaster) anyell, (Aaron) anyell.obtenirFill());
				break;
			case Manament.MOR:
				timeMaster.alliberar();
				obtenirValor().establirValor(timeMaster.obtenirValor(), timeMaster.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof MareDeDéu) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				MareDeDéu mareDeDéu = (MareDeDéu) manament.getSource();
				permutarFill(mareDeDéu, mareDeDéu.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Hiperespai,Espaitemps> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}