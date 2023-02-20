package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class ViaLàctia extends Home<Sol, AlfaCentauri> {

	private static final long serialVersionUID = -1257304010498648715L;

	@Override
	@XmlElement
	public Sol getKey() {
		return obtenirClau();
	}
	@Override
	public Sol setKey(Sol key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public AlfaCentauri getValue() {
		return obtenirValor();
	}
	@Override
	public AlfaCentauri setValue(AlfaCentauri value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public ViaLàctia getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (ViaLàctia) obtenirPassat();
	}

	public ViaLàctia() {
		super();
	}
	public ViaLàctia(String nom) {
		super(nom);
	}
	public ViaLàctia(String nom, Sol clau, AlfaCentauri valor) {
		super(Andròmeda.class, nom, clau, valor);
	}
	public ViaLàctia(ViaLàctia pare) {
		super(pare);
	}
	public ViaLàctia(ViaLàctia pare, Sol clau, AlfaCentauri valor) {
		super(Andròmeda.class, pare, clau, valor);
	}
	public ViaLàctia(ViaLàctia déu, String nom) {
		super(déu, nom);
	}
	public ViaLàctia(ViaLàctia déu, String nom, Sol clau, AlfaCentauri valor) {
		super(Andròmeda.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<AlfaCentauri, Sol> o) {
		return 0;
	}
}