package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Interestellar extends Dona<Andròmeda, ViaLàctia> {

	private static final long serialVersionUID = 1778472751644972454L;

	@Override
	@XmlElement
	public Andròmeda getKey() {
		return obtenirClau();
	}
	@Override
	public Andròmeda setKey(Andròmeda key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public ViaLàctia getValue() {
		return obtenirValor();
	}
	@Override
	public ViaLàctia setValue(ViaLàctia value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Interestellar getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Interestellar) obtenirPassat();
	}

	public Interestellar() {
		super();
	}
	public Interestellar(String nom) {
		super(nom);
	}
	public Interestellar(String nom, Andròmeda clau, ViaLàctia valor) {
		super(Supercúmul.class, nom, clau, valor);
	}
	public Interestellar(Interestellar pare) {
		super(pare);
	}
	public Interestellar(Interestellar pare, Andròmeda clau, ViaLàctia valor) {
		super(Supercúmul.class, pare, clau, valor);
	}
	public Interestellar(Interestellar déu, String nom) {
		super(déu, nom);
	}
	public Interestellar(Interestellar déu,	String nom, Andròmeda clau, ViaLàctia valor) {
		super(Supercúmul.class, déu, nom, clau, valor);
	}


	@Override
	public int compareTo(Anyell<ViaLàctia, Andròmeda> o) {
		// TODO Auto-generated method stub
		return 0;
	}
}