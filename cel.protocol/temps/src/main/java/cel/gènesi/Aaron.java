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
public class Aaron extends Home<Espaitemps, Hiperespai> {

	private static final long serialVersionUID = -9071886077186438664L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Espaitemps,Hiperespai> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Espaitemps getKey() {
		return obtenirClau();
	}
	@Override
	public Espaitemps setKey(Espaitemps key) {
		return establirClau(key);
	}
	@Override
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
	public Aaron(Paritat paritat) {
		super(paritat);
	}
	public Aaron(Paritat paritat, Espaitemps clau, Hiperespai valor) {
		super(TimeMaster.class, paritat, clau, valor);
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
	public Aaron(Aaron déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Aaron(Aaron déu, Paritat paritat, Espaitemps clau, Hiperespai valor) {
		super(TimeMaster.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Hiperespai, Espaitemps> o) {
		obtenirClau().comparador(obtenirClau().obtenirValor(), obtenirClau().obtenirClau()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Interestellar,Supercúmul> anyell = obtenirClau().comparador().font();
		comparador((Hiperespai) anyell, (Espaitemps) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Aaron) {
			Aaron aaron = (Aaron) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				aaron.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				aaron.alliberar();
				establirValor(aaron.obtenirClau(), aaron.obtenirValor());
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