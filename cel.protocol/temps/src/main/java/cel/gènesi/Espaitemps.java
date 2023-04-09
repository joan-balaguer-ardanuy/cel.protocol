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
public class Espaitemps extends Home<Supercúmul,Interestellar> {

	private static final long serialVersionUID = -6584596587851190399L;
	
	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Supercúmul,Interestellar> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
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
	public Espaitemps(Paritat paritat) {
		super(paritat);
	}
	public Espaitemps(Paritat paritat, Supercúmul clau, Interestellar valor) {
		super(Hiperespai.class, paritat, clau, valor);
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
	public Espaitemps(Espaitemps déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Espaitemps(Espaitemps déu, Paritat paritat, Supercúmul clau, Interestellar valor) {
		super(Hiperespai.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Interestellar, Supercúmul> o) {
		obtenirClau().comparador(obtenirClau().obtenirValor(), obtenirClau().obtenirClau()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Andròmeda,ViaLàctia> anyell = obtenirClau().comparador().font();
		comparador((Interestellar) anyell, (Supercúmul) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Espaitemps) {
			Espaitemps espaitemps = (Espaitemps) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				espaitemps.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				espaitemps.alliberar();
				establirValor(espaitemps.obtenirClau(), espaitemps.obtenirValor());
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