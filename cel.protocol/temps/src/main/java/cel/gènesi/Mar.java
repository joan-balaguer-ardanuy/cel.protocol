package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Mar extends Dona<Poliploide,Operó> {

	private static final long serialVersionUID = -4777160976356802960L;

	@Override
	@XmlElement
	public Poliploide getKey() {
		return obtenirClau();
	}
	@Override
	public Poliploide setKey(Poliploide key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Operó getValue() {
		return obtenirValor();
	}
	@Override
	public Operó setValue(Operó value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Mar getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Mar) obtenirPassat();
	}

	public Mar() {
		super();
	}
	public Mar(String nom) {
		super(nom);
	}
	public Mar(String nom, Poliploide clau, Operó valor) {
		super(Terra.class, nom, clau, valor);
	}
	public Mar(Mar pare) {
		super(pare);
	}
	public Mar(Mar pare, Poliploide clau, Operó valor) {
		super(Terra.class, pare, clau, valor);
	}
	public Mar(Mar déu, String nom) {
		super(déu, nom);
	}
	public Mar(Mar déu, String nom, Poliploide clau, Operó valor) {
		super(Terra.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<Operó, Poliploide> o) {
		return 0;
	}
}