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
	public Supercúmul getKey() {
		return obtenirClau();
	}
	@Override
	public Supercúmul setKey(Supercúmul key) {
		return establirClau(key);
	}
	@Override
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
		this(Hiperespai.class, Paritat.aleatòria());
	}
	public Espaitemps(Paritat paritat) {
		super(paritat);
	}
	public Espaitemps(Class<Hiperespai> classeFill, Paritat paritat) {
		super(classeFill, paritat);
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
		obtenirClau().comparador(new Interestellar()).compara(obtenirClau(), o.obtenirClau());
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
				break;
			default:
				return;
			}
		} else if(manament.getSource() instanceof Supercúmul) {
			Supercúmul supercúmul = (Supercúmul) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.MOR:
				if(!sócDéu()) {
					obtenirClau().comparador(new Interestellar()).compara(supercúmul, obtenirValor());
					Interestellar interestellar = (Interestellar) obtenirClau().comparador().font();
					obtenirMareDeDéu().establirValor(interestellar, (Supercúmul) interestellar.obtenirFill());
				}
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
		obtenirValor().run();
		super.run();
	}
}