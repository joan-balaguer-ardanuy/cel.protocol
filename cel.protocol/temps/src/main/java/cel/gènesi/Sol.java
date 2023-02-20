package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Sol extends Home<Terra,Mar> {

	private static final long serialVersionUID = 7129534749982938093L;
	
	@Override
	@XmlElement
	public Terra getKey() {
		return obtenirClau();
	}
	@Override
	public Terra setKey(Terra key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Mar getValue() {
		return obtenirValor();
	}
	@Override
	public Mar setValue(Mar value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Sol getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Sol) obtenirPassat();
	}

	public Sol() {
		super();
	}
	public Sol(String nom) {
		super(nom);
	}
	public Sol(String nom, Terra clau, Mar valor) {
		super(AlfaCentauri.class, nom, clau, valor);
	}
	public Sol(Sol pare) {
		super(pare);
	}
	public Sol(Sol pare, Terra clau, Mar valor) {
		super(AlfaCentauri.class, pare, clau, valor);
	}
	public Sol(Sol déu, String nom) {
		super(déu, nom);
	}
	public Sol(Sol déu, String nom, Terra clau, Mar valor) {
		super(AlfaCentauri.class, déu, nom, clau, valor);
	}
	
	@Override
	public void esdeveniment(Ordre manament) {
		// TODO Auto-generated method stub
		super.esdeveniment(manament);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	@Override
	public int compareTo(Anyell<Mar, Terra> o) {
		// TODO Auto-generated method stub
		return 0;
	}
}