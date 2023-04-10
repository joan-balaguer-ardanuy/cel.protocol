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
public class DéuPare extends Home<Aaron,TimeMaster> {

	private static final long serialVersionUID = -2458979709062312538L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Aaron,TimeMaster> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Aaron getKey() {
		return obtenirClau();
	}
	@Override
	public Aaron setKey(Aaron key) {
		return establirClau(key);
	}
	@Override
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
	public DéuPare(Paritat paritat) {
		super(paritat);
	}
	public DéuPare(Paritat paritat, Aaron clau, TimeMaster valor) {
		super(MareDeDéu.class, paritat, clau, valor);
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
	public DéuPare(DéuPare déu, Paritat paritat) {
		super(déu, paritat);
	}
	public DéuPare(DéuPare déu, Paritat paritat, Aaron clau, TimeMaster valor) {
		super(MareDeDéu.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<TimeMaster, Aaron> o) {
		obtenirClau().comparador(obtenirClau().obtenirValor(), obtenirClau().obtenirClau()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Hiperespai,Espaitemps> anyell = obtenirClau().comparador().font();
		comparador((TimeMaster) anyell, (Aaron) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof DéuPare) {
			DéuPare déuPare = (DéuPare) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				déuPare.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				déuPare.alliberar();
				establirValor(déuPare.obtenirClau(), déuPare.obtenirValor());
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