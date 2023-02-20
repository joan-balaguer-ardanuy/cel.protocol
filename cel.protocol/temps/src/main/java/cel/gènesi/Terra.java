package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Terra extends Home<Operó,Poliploide> {

	private static final long serialVersionUID = -5835390333613517553L;

	@Override
	@XmlElement
	public Operó getKey() {
		return obtenirClau();
	}
	@Override
	public Operó setKey(Operó key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Poliploide getValue() {
		return obtenirValor();
	}
	@Override
	public Poliploide setValue(Poliploide value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Terra getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Terra) obtenirPassat();
	}
	
	public Terra() {
		super();
	}
	public Terra(String nom) {
		super(nom);
	}
	public Terra(String nom, Operó clau, Poliploide valor) {
		super(Mar.class, nom, clau, valor);
	}
	public Terra(Terra pare) {
		super(pare);
	}
	public Terra(Terra pare, Operó clau, Poliploide valor) {
		super(Mar.class, pare, clau, valor);
	}
	public Terra(Terra déu, String nom) {
		super(déu, nom);
	}
	public Terra(Terra déu, String nom, Operó clau, Poliploide valor) {
		super(Mar.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<Poliploide, Operó> o) {
		return 0;
	}

}