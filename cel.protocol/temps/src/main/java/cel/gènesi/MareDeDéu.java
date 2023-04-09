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
	public MareDeDéu(Paritat paritat) {
		super(paritat);
	}
	public MareDeDéu(Paritat paritat, TimeMaster clau, Aaron valor) {
		super(DéuPare.class, paritat, clau, valor);
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
	public MareDeDéu(MareDeDéu déu, Paritat paritat) {
		super(déu, paritat);
	}
	public MareDeDéu(MareDeDéu déu, Paritat paritat, TimeMaster clau, Aaron valor) {
		super(DéuPare.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Aaron, TimeMaster> o) {
		obtenirClau().comparador(obtenirClau().obtenirValor(), obtenirClau().obtenirClau()).compara(obtenirClau(), o.obtenirClau());
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
			case Manament.GÈNESI:
				if(sócDéu()) {
					execute(establirClau(aaron, (TimeMaster) aaron.obtenirFill()));
				}
				break;
			default:
				break;
			}
		}
		else if(manament.getSource() instanceof MareDeDéu) {
			MareDeDéu mareDeDéu = (MareDeDéu) manament.getSource();
			switch (manament.obtenirManament()) {
				case Manament.VIU:
					comparador(obtenirValor(), obtenirClau()).compara(mareDeDéu.obtenirDéu(), obtenirMareDeDéu());
					Anyell<Aaron,TimeMaster> anyell = mareDeDéu.comparador().font();
					donarManament(new Ordre(anyell));
					execute(anyell);
					break;
				default:
					return;
			}
		}
	}
	@Override
	public void run() {
		getKey().run();
		super.run();
	}
}