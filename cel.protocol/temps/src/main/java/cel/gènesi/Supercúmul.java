package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Supercúmul extends Home<ViaLàctia, Andròmeda> {

	private static final long serialVersionUID = -5993795274429700449L;

	@Override
	@XmlElement
	public ViaLàctia getKey() {
		return obtenirClau();
	}
	@Override
	public ViaLàctia setKey(ViaLàctia key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Andròmeda getValue() {
		return obtenirValor();
	}
	@Override
	public Andròmeda setValue(Andròmeda value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Supercúmul getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Supercúmul) obtenirPassat();
	}

	public Supercúmul() {
		super();
	}
	public Supercúmul(String nom) {
		super(nom);
	}
	public Supercúmul(String nom, ViaLàctia clau, Andròmeda valor) {
		super(Interestellar.class, nom, clau, valor);
	}
	public Supercúmul(Supercúmul pare) {
		super(pare);
	}
	public Supercúmul(Supercúmul pare, ViaLàctia clau, Andròmeda valor) {
		super(Interestellar.class, pare, clau, valor);
	}
	public Supercúmul(Supercúmul déu, String nom) {
		super(déu, nom);
	}
	public Supercúmul(Supercúmul déu, String nom, ViaLàctia clau, Andròmeda valor) {
		super(Interestellar.class, déu, nom, clau, valor);
	}

	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
	}
	@Override
	public void run() {
		super.run();
	}
	@Override
	public int compareTo(Anyell<Andròmeda, ViaLàctia> o) {
		return 0;
	}
}