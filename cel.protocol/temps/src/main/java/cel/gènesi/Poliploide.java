package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Poliploide extends Dona<Tetraploide,Ribosoma> {

	private static final long serialVersionUID = -8176742109161023223L;

	@Override
	@XmlElement
	public Tetraploide getKey() {
		return obtenirClau();
	}
	@Override
	public Tetraploide setKey(Tetraploide key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Ribosoma getValue() {
		return obtenirValor();
	}
	@Override
	public Ribosoma setValue(Ribosoma value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Poliploide getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Poliploide) obtenirPassat();
	}

	public Poliploide() {
		super();
	}
	public Poliploide(String nom) {
		super(nom);
	}
	public Poliploide(String nom, Tetraploide clau, Ribosoma valor) {
		super(Operó.class, nom, clau, valor);
	}
	public Poliploide(Poliploide pare) {
		super(pare);
	}
	public Poliploide(Poliploide pare, Tetraploide clau, Ribosoma valor) {
		super(Operó.class, pare, clau, valor);
	}
	public Poliploide(Poliploide déu, String nom) {
		super(déu, nom);
	}
	public Poliploide(Poliploide déu, String nom, Tetraploide clau, Ribosoma valor) {
		super(Operó.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<Ribosoma, Tetraploide> o) {
		return 0;
	}
}