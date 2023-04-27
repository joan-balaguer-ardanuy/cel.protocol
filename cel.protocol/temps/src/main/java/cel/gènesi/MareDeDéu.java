package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;
import cel.Paritat;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class MareDeDéu extends Dona<TimeMaster, Aaron> {

	private static final long serialVersionUID = 8747126417822477895L;
	
	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<TimeMaster,Aaron> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public TimeMaster getKey() {
		return obtenirClau();
	}
	@Override
	public TimeMaster setKey(TimeMaster key) {
		return establirClau(key);
	}
	@Override
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
	public MareDeDéu(Paritat paritat) {
		super(paritat);
	}
	public MareDeDéu(Class<DéuPare> classeFill, Paritat paritat) {
		super(DéuPare.class, paritat);
	}
	public MareDeDéu(MareDeDéu pare) {
		super(pare);
	}
	public MareDeDéu(MareDeDéu pare, TimeMaster clau, Aaron valor) {
		super(DéuPare.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public MareDeDéu(MareDeDéu déu, Paritat paritat) {
		super(déu, paritat);
	}
	public MareDeDéu(MareDeDéu déu, Paritat paritat, TimeMaster clau, Aaron valor) {
		super(DéuPare.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Aaron, TimeMaster> o) {
		obtenirClau().comparador(new Aaron(TimeMaster.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Espaitemps,Hiperespai> anyell = obtenirClau().comparador().font();
		comparador((Aaron) anyell, (TimeMaster) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Hiperespai) {
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				Hiperespai hiperespai = (Hiperespai) manament.getSource();
				TimeMaster timeMaster = new TimeMaster(Aaron.class, Paritat.aleatòria());
				timeMaster.establirValor(hiperespai, (Espaitemps) hiperespai.obtenirFill());
				donarManament(new Ordre(timeMaster));
				break;
			default:
				break;
			}
		}
		else if(manament.getSource() instanceof MareDeDéu) {
			MareDeDéu mareDeDéu = (MareDeDéu) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				mareDeDéu.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				mareDeDéu.alliberar();
				break;
			default:
				return;
			}
		} else if(manament.getSource() instanceof Aaron) {
			Aaron aaron = (Aaron) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.MOR:
				if (!sócDéu() && aaron.sócDéu()) {
					obtenirValor().comparador(new TimeMaster(Aaron.class, Paritat.aleatòria())).compara(aaron, obtenirClau());
					TimeMaster timeMaster = (TimeMaster) obtenirValor().comparador().font();
					obtenirMareDeDéu().establirClau(timeMaster, (Aaron) timeMaster.obtenirFill());
				}
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
		obtenirClau().run();
		super.run();
	}
}