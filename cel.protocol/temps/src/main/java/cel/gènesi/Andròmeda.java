package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Document;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Andròmeda extends Dona<AlfaCentauri,Sol> {

	private static final long serialVersionUID = -7857749006423635285L;
	
	@Override
	@XmlElement
	public AlfaCentauri getKey() {
		return obtenirClau();
	}
	@Override
	public AlfaCentauri setKey(AlfaCentauri key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Sol getValue() {
		return obtenirValor();
	}
	@Override
	public Sol setValue(Sol value) {
		return establirValor(value);
	}
	@XmlElement
	@Override
	public Andròmeda getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Andròmeda) obtenirPassat();
	}

	public Andròmeda() {
		super();
	}
	public Andròmeda(String nom) {
		super(nom);
	}
	public Andròmeda(String nom, AlfaCentauri clau, Sol valor) {
		super(ViaLàctia.class, nom, clau, valor);
	}
	public Andròmeda(Document<AlfaCentauri, Sol> pare) {
		super(pare);
	}
	public Andròmeda(Andròmeda pare, AlfaCentauri clau, Sol valor) {
		super(ViaLàctia.class, pare, clau, valor);
	}
	public Andròmeda(Andròmeda déu, String nom) {
		super(déu, nom);
	}
	public Andròmeda(Andròmeda déu,	String nom, AlfaCentauri clau, Sol valor) {
		super(ViaLàctia.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<Sol, AlfaCentauri> o) {
		return 0;
	}

}
