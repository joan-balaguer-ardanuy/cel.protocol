package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class AlfaCentauri extends Dona<Mar, Terra> {

	private static final long serialVersionUID = -8847168674216359054L;
	
	@Override
	@XmlElement
	public Mar getKey() {
		return obtenirClau();
	}
	@Override
	public Mar setKey(Mar key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Terra getValue() {
		return obtenirValor();
	}
	@Override
	public Terra setValue(Terra value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public AlfaCentauri getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (AlfaCentauri) obtenirPassat();
	}

	public AlfaCentauri() {
		super();
	}
	public AlfaCentauri(String nom) {
		super(nom);
	}
	public AlfaCentauri(String nom, Mar clau, Terra valor) {
		super(Sol.class, nom, clau, valor);
	}
	public AlfaCentauri(AlfaCentauri pare) {
		super(pare);
	}
	public AlfaCentauri(AlfaCentauri pare, Mar clau, Terra valor) {
		super(Sol.class, pare, clau, valor);
	}
	public AlfaCentauri(AlfaCentauri déu, String nom) {
		super(déu, nom);
	}
	public AlfaCentauri(AlfaCentauri déu, String nom, Mar clau, Terra valor) {
		super(Sol.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<Terra, Mar> o) {
		return 0;
	}
}